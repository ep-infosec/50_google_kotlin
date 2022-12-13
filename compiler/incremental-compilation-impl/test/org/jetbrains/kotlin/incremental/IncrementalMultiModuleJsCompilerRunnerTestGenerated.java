/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.incremental;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IncrementalMultiModuleJsCompilerRunnerTestGenerated extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInCommon() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common"), Pattern.compile("^([^\\.]+)$"), null, true);
    }

    @TestMetadata("classAdded")
    public void testClassAdded() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/classAdded/");
    }

    @TestMetadata("classRemoved")
    public void testClassRemoved() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/classRemoved/");
    }

    @TestMetadata("constantValueChanged")
    public void testConstantValueChanged() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/constantValueChanged/");
    }

    @TestMetadata("copyFileToAnotherModule")
    public void testCopyFileToAnotherModule() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/copyFileToAnotherModule/");
    }

    @TestMetadata("defaultArgumentInConstructorRemoved")
    public void testDefaultArgumentInConstructorRemoved() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/defaultArgumentInConstructorRemoved/");
    }

    @TestMetadata("defaultParameterAdded")
    public void testDefaultParameterAdded() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/defaultParameterAdded/");
    }

    @TestMetadata("defaultParameterAddedForTopLevelFun")
    public void testDefaultParameterAddedForTopLevelFun() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/defaultParameterAddedForTopLevelFun/");
    }

    @TestMetadata("defaultParameterRemoved")
    public void testDefaultParameterRemoved() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/defaultParameterRemoved/");
    }

    @TestMetadata("defaultParameterRemovedForTopLevelFun")
    public void testDefaultParameterRemovedForTopLevelFun() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/defaultParameterRemovedForTopLevelFun/");
    }

    @TestMetadata("defaultValueInConstructorRemoved")
    public void testDefaultValueInConstructorRemoved() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/defaultValueInConstructorRemoved/");
    }

    @TestMetadata("duplicatedClass")
    public void testDuplicatedClass() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/duplicatedClass/");
    }

    @TestMetadata("exportedDependency")
    public void testExportedDependency() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/exportedDependency/");
    }

    @TestMetadata("functionFromDifferentPackageChanged")
    public void testFunctionFromDifferentPackageChanged() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/functionFromDifferentPackageChanged/");
    }

    @TestMetadata("inlineFunctionInlined")
    public void testInlineFunctionInlined() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/inlineFunctionInlined/");
    }

    @TestMetadata("inlineFunctionTwoPackageParts")
    public void testInlineFunctionTwoPackageParts() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/inlineFunctionTwoPackageParts/");
    }

    @TestMetadata("moveFileToAnotherModule")
    public void testMoveFileToAnotherModule() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/moveFileToAnotherModule/");
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/simple/");
    }

    @TestMetadata("simpleDependency")
    public void testSimpleDependency() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/simpleDependency/");
    }

    @TestMetadata("simpleDependencyErrorOnAccessToInternal1")
    public void testSimpleDependencyErrorOnAccessToInternal1() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/simpleDependencyErrorOnAccessToInternal1/");
    }

    @TestMetadata("simpleDependencyErrorOnAccessToInternal2")
    public void testSimpleDependencyErrorOnAccessToInternal2() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/simpleDependencyErrorOnAccessToInternal2/");
    }

    @TestMetadata("simpleDependencyUnchanged")
    public void testSimpleDependencyUnchanged() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/simpleDependencyUnchanged/");
    }

    @TestMetadata("transitiveDependency")
    public void testTransitiveDependency() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/transitiveDependency/");
    }

    @TestMetadata("transitiveInlining")
    public void testTransitiveInlining() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/transitiveInlining/");
    }

    @TestMetadata("twoDependants")
    public void testTwoDependants() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/multiModule/common/twoDependants/");
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/classAdded")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ClassAdded extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInClassAdded() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/classAdded"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/classRemoved")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ClassRemoved extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInClassRemoved() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/classRemoved"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/constantValueChanged")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ConstantValueChanged extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInConstantValueChanged() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/constantValueChanged"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/copyFileToAnotherModule")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CopyFileToAnotherModule extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInCopyFileToAnotherModule() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/copyFileToAnotherModule"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/defaultArgumentInConstructorRemoved")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DefaultArgumentInConstructorRemoved extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInDefaultArgumentInConstructorRemoved() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/defaultArgumentInConstructorRemoved"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/defaultParameterAdded")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DefaultParameterAdded extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInDefaultParameterAdded() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/defaultParameterAdded"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/defaultParameterAddedForTopLevelFun")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DefaultParameterAddedForTopLevelFun extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInDefaultParameterAddedForTopLevelFun() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/defaultParameterAddedForTopLevelFun"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/defaultParameterRemoved")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DefaultParameterRemoved extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInDefaultParameterRemoved() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/defaultParameterRemoved"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/defaultParameterRemovedForTopLevelFun")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DefaultParameterRemovedForTopLevelFun extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInDefaultParameterRemovedForTopLevelFun() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/defaultParameterRemovedForTopLevelFun"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/defaultValueInConstructorRemoved")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DefaultValueInConstructorRemoved extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInDefaultValueInConstructorRemoved() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/defaultValueInConstructorRemoved"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/duplicatedClass")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DuplicatedClass extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInDuplicatedClass() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/duplicatedClass"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/exportedDependency")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ExportedDependency extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInExportedDependency() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/exportedDependency"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/functionFromDifferentPackageChanged")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class FunctionFromDifferentPackageChanged extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInFunctionFromDifferentPackageChanged() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/functionFromDifferentPackageChanged"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/inlineFunctionInlined")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class InlineFunctionInlined extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInInlineFunctionInlined() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/inlineFunctionInlined"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/inlineFunctionTwoPackageParts")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class InlineFunctionTwoPackageParts extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInInlineFunctionTwoPackageParts() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/inlineFunctionTwoPackageParts"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/moveFileToAnotherModule")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MoveFileToAnotherModule extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInMoveFileToAnotherModule() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/moveFileToAnotherModule"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/simple")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Simple extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInSimple() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/simple"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/simpleDependency")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SimpleDependency extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInSimpleDependency() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/simpleDependency"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/simpleDependencyErrorOnAccessToInternal1")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SimpleDependencyErrorOnAccessToInternal1 extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInSimpleDependencyErrorOnAccessToInternal1() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/simpleDependencyErrorOnAccessToInternal1"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/simpleDependencyErrorOnAccessToInternal2")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SimpleDependencyErrorOnAccessToInternal2 extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInSimpleDependencyErrorOnAccessToInternal2() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/simpleDependencyErrorOnAccessToInternal2"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/simpleDependencyUnchanged")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SimpleDependencyUnchanged extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInSimpleDependencyUnchanged() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/simpleDependencyUnchanged"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/transitiveDependency")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TransitiveDependency extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInTransitiveDependency() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/transitiveDependency"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/transitiveInlining")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TransitiveInlining extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInTransitiveInlining() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/transitiveInlining"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/multiModule/common/twoDependants")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TwoDependants extends AbstractIncrementalMultiModuleJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInTwoDependants() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/multiModule/common/twoDependants"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }
}