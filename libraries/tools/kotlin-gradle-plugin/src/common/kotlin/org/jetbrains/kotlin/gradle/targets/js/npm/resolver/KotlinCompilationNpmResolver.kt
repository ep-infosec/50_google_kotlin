/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.targets.js.npm.resolver

import org.gradle.api.artifacts.Configuration
import org.gradle.api.artifacts.FileCollectionDependency
import org.gradle.api.artifacts.ResolvedArtifact
import org.gradle.api.artifacts.ResolvedDependency
import org.gradle.api.artifacts.component.ProjectComponentIdentifier
import org.gradle.api.attributes.Category
import org.gradle.api.attributes.Usage
import org.gradle.api.initialization.IncludedBuild
import org.gradle.api.internal.artifacts.DefaultProjectComponentIdentifier
import org.gradle.api.tasks.*
import org.gradle.api.tasks.bundling.Zip
import org.gradle.configurationcache.extensions.serviceOf
import org.gradle.work.NormalizeLineEndings
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.categoryByName
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinJsCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinUsages
import org.jetbrains.kotlin.gradle.plugin.mpp.disambiguateName
import org.jetbrains.kotlin.gradle.plugin.mpp.isMain
import org.jetbrains.kotlin.gradle.plugin.sources.KotlinDependencyScope
import org.jetbrains.kotlin.gradle.plugin.sources.compilationDependencyConfigurationByScope
import org.jetbrains.kotlin.gradle.plugin.sources.sourceSetDependencyConfigurationByScope
import org.jetbrains.kotlin.gradle.plugin.usesPlatformOf
import org.jetbrains.kotlin.gradle.targets.js.ir.KotlinJsIrTarget
import org.jetbrains.kotlin.gradle.targets.js.npm.*
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmProject.Companion.PACKAGE_JSON
import org.jetbrains.kotlin.gradle.targets.js.npm.resolved.KotlinCompilationNpmResolution
import org.jetbrains.kotlin.gradle.targets.js.npm.tasks.KotlinPackageJsonTask
import org.jetbrains.kotlin.gradle.tasks.registerTask
import org.jetbrains.kotlin.gradle.utils.CompositeProjectComponentArtifactMetadata
import org.jetbrains.kotlin.gradle.utils.`is`
import org.jetbrains.kotlin.gradle.utils.topRealPath
import org.jetbrains.kotlin.gradle.utils.unavailableValueError
import java.io.File
import java.io.Serializable

/**
 * See [KotlinNpmResolutionManager] for details about resolution process.
 */
internal class KotlinCompilationNpmResolver(
    @Transient
    val projectResolver: KotlinProjectNpmResolver,
    @Transient
    val compilation: KotlinJsCompilation
) : Serializable {
    @Transient
    var rootResolver = projectResolver.resolver

    val npmProject = compilation.npmProject

    val compilationDisambiguatedName = compilation.disambiguatedName

    val npmVersion by lazy {
        project.version.toString()
    }

    val nodeJs get() = rootResolver.nodeJs
    private val nodeJs_ get() = nodeJs ?: unavailableValueError("nodeJs")

    val target get() = compilation.target

    val project get() = target.project

    val projectPath = project.path

    @Transient
    val packageJsonTaskHolder: TaskProvider<KotlinPackageJsonTask>? =
        KotlinPackageJsonTask.create(compilation)

    @Transient
    val publicPackageJsonTaskHolder: TaskProvider<PublicPackageJsonTask> =
        project.registerTask<PublicPackageJsonTask>(
            npmProject.publicPackageJsonTaskName,
            listOf(compilation)
        ) {
            it.dependsOn(packageJsonTaskHolder)
        }.also { packageJsonTask ->
            if (compilation.isMain()) {
                project.tasks
                    .withType(Zip::class.java)
                    .named(npmProject.target.artifactsTaskName)
                    .configure {
                        it.dependsOn(packageJsonTask)
                    }
            }
        }

    override fun toString(): String = "KotlinCompilationNpmResolver(${npmProject.name})"

    @delegate:Transient
    private val aggregatedConfiguration: Configuration by lazy {
        createAggregatedConfiguration()
    }

    private val packageJsonProducer_: PackageJsonProducer by lazy {
        val visitor = ConfigurationVisitor()
        visitor.visit(aggregatedConfiguration)
        visitor.toPackageJsonProducer().also { it.compilationResolver = this }
    }

    val packageJsonProducer: PackageJsonProducer
        get() {
            val packageJsonProducer = packageJsonProducer_
            packageJsonProducer.compilationResolver = this
            return packageJsonProducer
        }

    private var closed = false
    private var resolution: KotlinCompilationNpmResolution? = null

    @Synchronized
    fun resolve(skipWriting: Boolean = false): KotlinCompilationNpmResolution {
        check(!closed) { "$this already closed" }
        check(resolution == null) { "$this already resolved" }

        return packageJsonProducer.createPackageJson(skipWriting).also {
            resolution = it
        }
    }

    @Synchronized
    fun getResolutionOrResolveIfForced(): KotlinCompilationNpmResolution? {
        if (resolution != null) return resolution
        if (rootResolver.mayBeUpToDateTasksRegistry.get().shouldResolveNpmDependenciesFor(npmProject.packageJsonTaskPath)) {
            // when we need to resolve the compilation but the task is UP-TO-DATE, so we don't have ready resolution yet
            return resolve(skipWriting = true)
        }
        if (rootResolver.forceFullResolve) {
            // need to force all NPM tasks to be configured in IDEA import
            rootResolver.gradleNodeModules.fileHasher = project.serviceOf()
            rootResolver.compositeNodeModules.fileHasher = project.serviceOf()
            project.tasks.implementing(RequiresNpmDependencies::class).all {}
            return resolve()
        }
        return null // we don't need to resolve NPM dependencies for the compilation
    }

    @Synchronized
    fun close(): KotlinCompilationNpmResolution? {
        check(!closed) { "$this already closed" }
        val resolution = getResolutionOrResolveIfForced()
        closed = true
        return resolution
    }

    private fun createAggregatedConfiguration(): Configuration {
        val all = project.configurations.create(compilation.disambiguateName("npm"))

        all.usesPlatformOf(target)
        all.attributes.attribute(Usage.USAGE_ATTRIBUTE, KotlinUsages.consumerRuntimeUsage(target))
        all.attributes.attribute(Category.CATEGORY_ATTRIBUTE, project.categoryByName(Category.LIBRARY))
        all.isVisible = false
        all.isCanBeConsumed = false
        all.isCanBeResolved = true
        all.description = "NPM configuration for $compilation."

        KotlinDependencyScope.values().forEach { scope ->
            val compilationConfiguration = project.compilationDependencyConfigurationByScope(
                compilation,
                scope
            )
            all.extendsFrom(compilationConfiguration)
            compilation.allKotlinSourceSets.forEach { sourceSet ->
                val sourceSetConfiguration = project.configurations.sourceSetDependencyConfigurationByScope(sourceSet, scope)
                all.extendsFrom(sourceSetConfiguration)
            }
        }

        // We don't have `kotlin-js-test-runner` in NPM yet
        all.dependencies.add(nodeJs_.versions.kotlinJsTestRunner.createDependency(project))

        return all
    }

    data class ExternalGradleDependency(
        val dependency: ResolvedDependency,
        val artifact: ResolvedArtifact
    ) : Serializable

    data class FileCollectionExternalGradleDependency(
        val files: Collection<File>,
        val dependencyVersion: String?
    ) : Serializable

    data class FileExternalGradleDependency(
        val dependencyName: String,
        val dependencyVersion: String,
        val file: File
    ) : Serializable

    data class CompositeDependency(
        val dependencyName: String,
        val dependencyVersion: String,
        val includedBuildDir: File,
        @Transient
        val includedBuild: IncludedBuild?
    ) : Serializable

    data class InternalDependency(
        val projectPath: String,
        val compilationName: String,
        val projectName: String
    ) : Serializable

    inner class ConfigurationVisitor {
        private val internalDependencies = mutableSetOf<InternalDependency>()
        private val internalCompositeDependencies = mutableSetOf<CompositeDependency>()
        private val externalGradleDependencies = mutableSetOf<ExternalGradleDependency>()
        private val externalNpmDependencies = mutableSetOf<NpmDependency>()
        private val fileCollectionDependencies = mutableSetOf<FileCollectionExternalGradleDependency>()

        private val visitedDependencies = mutableSetOf<ResolvedDependency>()

        fun visit(configuration: Configuration) {
            configuration.resolvedConfiguration.firstLevelModuleDependencies.forEach {
                visitDependency(it)
            }

            configuration.allDependencies.forEach { dependency ->
                when (dependency) {
                    is NpmDependency -> externalNpmDependencies.add(dependency)
                    is FileCollectionDependency -> fileCollectionDependencies.add(
                        FileCollectionExternalGradleDependency(
                            dependency.files.files,
                            dependency.version
                        )
                    )
                }
            }

            //TODO: rewrite when we get general way to have inter compilation dependencies
            if (compilation.name == KotlinCompilation.TEST_COMPILATION_NAME) {
                val main = compilation.target.compilations.findByName(KotlinCompilation.MAIN_COMPILATION_NAME) as KotlinJsCompilation
                internalDependencies.add(
                    InternalDependency(
                        projectResolver.project.path,
                        main.disambiguatedName,
                        projectResolver[main].npmProject.name
                    )
                )
            }

            val hasPublicNpmDependencies = externalNpmDependencies.isNotEmpty()

            if (compilation.isMain() && hasPublicNpmDependencies) {
                project.tasks
                    .withType(Zip::class.java)
                    .named(npmProject.target.artifactsTaskName)
                    .configure { task ->
                        task.from(publicPackageJsonTaskHolder)
                    }
            }
        }

        private fun visitDependency(dependency: ResolvedDependency) {
            if (dependency in visitedDependencies) return
            visitedDependencies.add(dependency)
            visitArtifacts(dependency, dependency.moduleArtifacts)

            dependency.children.forEach {
                visitDependency(it)
            }
        }

        private fun visitArtifacts(
            dependency: ResolvedDependency,
            artifacts: MutableSet<ResolvedArtifact>
        ) {
            artifacts.forEach { visitArtifact(dependency, it) }
        }

        private fun visitArtifact(
            dependency: ResolvedDependency,
            artifact: ResolvedArtifact
        ) {
            val artifactId = artifact.id
            val componentIdentifier = artifactId.componentIdentifier

            if (artifactId `is` CompositeProjectComponentArtifactMetadata) {
                visitCompositeProjectDependency(dependency, componentIdentifier as ProjectComponentIdentifier)
                return
            }

            if (componentIdentifier is ProjectComponentIdentifier) {
                visitProjectDependency(componentIdentifier)
                return
            }

            externalGradleDependencies.add(ExternalGradleDependency(dependency, artifact))
        }

        private fun visitCompositeProjectDependency(
            dependency: ResolvedDependency,
            componentIdentifier: ProjectComponentIdentifier
        ) {
            check(target is KotlinJsIrTarget) {
                """
                Composite builds for Kotlin/JS are supported only for IR compiler.
                Use kotlin.js.compiler=ir in gradle.properties or
                js(IR) {
                ...
                }
                """.trimIndent()
            }

            (componentIdentifier as DefaultProjectComponentIdentifier).let { identifier ->
                val includedBuild = project.gradle.includedBuild(identifier.identityPath.topRealPath().name!!)
                internalCompositeDependencies.add(
                    CompositeDependency(dependency.moduleName, dependency.moduleVersion, includedBuild.projectDir, includedBuild)
                )
            }
        }

        private fun visitProjectDependency(
            componentIdentifier: ProjectComponentIdentifier
        ) {
            val dependentProject = project.findProject(componentIdentifier.projectPath)
                ?: error("Cannot find project ${componentIdentifier.projectPath}")

            rootResolver.findDependentResolver(project, dependentProject)
                ?.forEach { dependentResolver ->
                    internalDependencies.add(
                        InternalDependency(
                            dependentResolver.projectPath,
                            dependentResolver.compilationDisambiguatedName,
                            dependentResolver.npmProject.name
                        )
                    )
                }
        }

        fun toPackageJsonProducer() = PackageJsonProducer(
            internalDependencies,
            internalCompositeDependencies,
            externalGradleDependencies.map {
                FileExternalGradleDependency(
                    it.dependency.moduleName,
                    it.dependency.moduleVersion,
                    it.artifact.file
                )
            },
            externalNpmDependencies.map { it.toDeclaration() },
            fileCollectionDependencies,
            projectPath
        )
    }

    @Suppress("unused")
    class PackageJsonProducerInputs(
        @get:Input
        val internalDependencies: Collection<String>,

        @get:PathSensitive(PathSensitivity.ABSOLUTE)
        @get:IgnoreEmptyDirectories
        @get:NormalizeLineEndings
        @get:InputFiles
        val internalCompositeDependencies: Collection<File>,

        @get:PathSensitive(PathSensitivity.ABSOLUTE)
        @get:IgnoreEmptyDirectories
        @get:NormalizeLineEndings
        @get:InputFiles
        val externalGradleDependencies: Collection<File>,

        @get:Input
        val externalDependencies: Collection<String>,

        @get:Input
        val fileCollectionDependencies: Collection<File>
    )

    @Suppress("MemberVisibilityCanBePrivate")
    class PackageJsonProducer(
        var internalDependencies: Collection<InternalDependency>,
        var internalCompositeDependencies: Collection<CompositeDependency>,
        var externalGradleDependencies: Collection<FileExternalGradleDependency>,
        var externalNpmDependencies: Collection<NpmDependencyDeclaration>,
        var fileCollectionDependencies: Collection<FileCollectionExternalGradleDependency>,
        val projectPath: String
    ) : Serializable {
        private val projectPackagesDir by lazy { compilationResolver.nodeJs_.projectPackagesDir }
        private val rootDir by lazy { compilationResolver.nodeJs_.rootProject.rootDir }

        @Transient
        internal lateinit var compilationResolver: KotlinCompilationNpmResolver

        val inputs: PackageJsonProducerInputs
            get() = PackageJsonProducerInputs(
                internalDependencies.map { it.projectName },
                internalCompositeDependencies.flatMap { it.getPackages() },
                externalGradleDependencies.map { it.file },
                externalNpmDependencies.map { it.uniqueRepresentation() },
                fileCollectionDependencies.flatMap { it.files }
            )

        fun createPackageJson(skipWriting: Boolean): KotlinCompilationNpmResolution {
            internalDependencies.map {
                compilationResolver.rootResolver[it.projectPath][it.compilationName].getResolutionOrResolveIfForced()
                    ?: error("Unresolved dependent npm package: ${compilationResolver} -> $it")
            }
            val importedExternalGradleDependencies = externalGradleDependencies.mapNotNull {
                compilationResolver.rootResolver.gradleNodeModules.get(it.dependencyName, it.dependencyVersion, it.file)
            } + fileCollectionDependencies.flatMap { dependency ->
                dependency.files
                    // Gradle can hash with FileHasher only files and only existed files
                    .filter { it.isFile }
                    .map { file ->
                        compilationResolver.rootResolver.gradleNodeModules.get(
                            file.name,
                            dependency.dependencyVersion ?: "0.0.1",
                            file
                        )
                    }
            }.filterNotNull()
            val transitiveNpmDependencies = importedExternalGradleDependencies.flatMap {
                it.dependencies
            }.filter { it.scope != NpmDependency.Scope.DEV }

            val compositeDependencies = internalCompositeDependencies.flatMap { dependency ->
                dependency.getPackages()
                    .map { file ->
                        compilationResolver.rootResolver.compositeNodeModules.get(
                            dependency.dependencyName,
                            dependency.dependencyVersion,
                            file
                        )
                    }
            }.filterNotNull()

            val toolsNpmDependencies = compilationResolver.rootResolver.taskRequirements
                .getCompilationNpmRequirements(projectPath, compilationResolver.compilationDisambiguatedName)

            val otherNpmDependencies = toolsNpmDependencies + transitiveNpmDependencies
            val allNpmDependencies = disambiguateDependencies(externalNpmDependencies, otherNpmDependencies)
            val packageJsonHandlers = if (compilationResolver.compilation != null) {
                compilationResolver.compilation.packageJsonHandlers
            } else {
                compilationResolver.rootResolver.getPackageJsonHandlers(projectPath, compilationResolver.compilationDisambiguatedName)
            }

            val packageJson = packageJson(
                compilationResolver.npmProject.name,
                compilationResolver.npmVersion,
                compilationResolver.npmProject.main,
                allNpmDependencies,
                packageJsonHandlers
            )

            compositeDependencies.forEach {
                packageJson.dependencies[it.name] = it.version
            }

            packageJsonHandlers.forEach {
                it(packageJson)
            }

            if (!skipWriting) {
                packageJson.saveTo(compilationResolver.npmProject.packageJsonFile)
            }

            return KotlinCompilationNpmResolution(
                @Suppress("SENSELESS_COMPARISON")
                if (compilationResolver.compilation != null) compilationResolver.project else null,
                compilationResolver.npmProject,
                compositeDependencies,
                importedExternalGradleDependencies,
                allNpmDependencies,
                packageJson
            )
        }

        private fun disambiguateDependencies(
            direct: Collection<NpmDependencyDeclaration>,
            others: Collection<NpmDependencyDeclaration>,
        ): Collection<NpmDependencyDeclaration> {
            val unique = others.groupBy(NpmDependencyDeclaration::name)
                .filterKeys { k -> direct.none { it.name == k } }
                .mapNotNull { (name, dependencies) ->
                    dependencies.maxByOrNull { dep ->
                        SemVer.from(dep.version, true)
                    }?.also { selected ->
                        if (dependencies.size > 1) {
                            compilationResolver.project.logger.warn(
                                """
                                Transitive npm dependency version clash for compilation "${compilationResolver.compilation.name}"
                                    Candidates:
                                ${dependencies.joinToString("\n") { "\t\t" + it.name + "@" + it.version }}
                                    Selected:
                                        ${selected.name}@${selected.version}
                                """.trimIndent()
                            )
                        }
                    }
                }
            return direct + unique
        }

        private fun CompositeDependency.getPackages(): List<File> {
            val packages = includedBuildDir.resolve(projectPackagesDir.relativeTo(rootDir))
            return packages
                .list()
                ?.map { packages.resolve(it) }
                ?.map { it.resolve(PACKAGE_JSON) }
                ?: emptyList()
        }
    }
}