/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.analysis.jvm.checkers.declaration

import org.jetbrains.kotlin.fir.analysis.checkers.declaration.FirInlinePropertyChecker

object FirJvmInlinePropertyChecker : FirInlinePropertyChecker() {
    override val inlineDeclarationChecker get() = FirJvmInlineDeclarationChecker
}