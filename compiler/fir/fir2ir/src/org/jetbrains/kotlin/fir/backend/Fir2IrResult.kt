/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.backend

import org.jetbrains.kotlin.ir.declarations.IrModuleFragment
import org.jetbrains.kotlin.ir.util.SymbolTable

data class Fir2IrResult(val irModuleFragment: IrModuleFragment, val components: Fir2IrComponents)
