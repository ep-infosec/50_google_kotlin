/*
 * Copyright 2000-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.extensions

import org.jetbrains.kotlin.config.CompilerConfiguration

interface CompilerConfigurationExtension {

    companion object : ProjectExtensionDescriptor<CompilerConfigurationExtension>(
        "org.jetbrains.kotlin.compilerConfigurationExtension",
        CompilerConfigurationExtension::class.java
    )

    fun updateConfiguration(configuration: CompilerConfiguration)

    fun updateFileRegistry() {}
}
