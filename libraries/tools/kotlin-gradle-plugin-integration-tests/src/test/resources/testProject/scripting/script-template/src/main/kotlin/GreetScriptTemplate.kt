/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test

import kotlin.script.experimental.annotations.*
import kotlin.script.experimental.api.ScriptCompilationConfiguration
import kotlin.script.experimental.api.isStandalone

@KotlinScript(fileExtension = "greet.kts", compilationConfiguration = GreetScriptDefinition::class)
abstract class GreetScriptTemplate {
    fun greet(subject: String) {
        println("Hello, $subject!")
    }
}

object GreetScriptDefinition : ScriptCompilationConfiguration(
    {
        isStandalone(false)
    }
)
