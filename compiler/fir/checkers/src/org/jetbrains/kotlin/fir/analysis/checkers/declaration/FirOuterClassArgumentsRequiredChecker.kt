/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.analysis.checkers.declaration

import org.jetbrains.kotlin.diagnostics.DiagnosticReporter
import org.jetbrains.kotlin.diagnostics.reportOn
import org.jetbrains.kotlin.fir.analysis.checkers.context.CheckerContext
import org.jetbrains.kotlin.fir.analysis.checkers.extractArgumentsTypeRefAndSource
import org.jetbrains.kotlin.fir.analysis.diagnostics.FirErrors
import org.jetbrains.kotlin.fir.declarations.FirRegularClass
import org.jetbrains.kotlin.fir.declarations.utils.classId
import org.jetbrains.kotlin.fir.render
import org.jetbrains.kotlin.fir.resolve.isValidTypeParameterFromOuterDeclaration
import org.jetbrains.kotlin.fir.resolve.toSymbol
import org.jetbrains.kotlin.fir.resolve.toTypeProjections
import org.jetbrains.kotlin.fir.symbols.impl.FirRegularClassSymbol
import org.jetbrains.kotlin.fir.types.*

object FirOuterClassArgumentsRequiredChecker : FirRegularClassChecker() {
    override fun check(declaration: FirRegularClass, context: CheckerContext, reporter: DiagnosticReporter) {
        // Checking the rest super types that weren't resolved on the first OUTER_CLASS_ARGUMENTS_REQUIRED check in FirTypeResolver
        val oldResolvePhase = declaration.resolvePhase
        val oldList = declaration.superTypeRefs.toList()

        try {
            for (superTypeRef in declaration.superTypeRefs) {
                checkOuterClassArgumentsRequired(superTypeRef, declaration, context, reporter)
            }
        } catch (e: ConcurrentModificationException) {
            val newResolvePhase = declaration.resolvePhase
            val newList = declaration.superTypeRefs.toList()

            throw IllegalStateException(
                """
                CME while traversing superTypeRefs of declaration=${declaration.render()}:
                classId: ${declaration.classId},
                oldPhase: $oldResolvePhase, oldList: ${oldList.joinToString { it.render() }},
                newPhase: $newResolvePhase, newList: ${newList.joinToString { it.render() }}
                """.trimIndent(), e
            )
        }
    }

    private fun checkOuterClassArgumentsRequired(
        typeRef: FirTypeRef,
        declaration: FirRegularClass?,
        context: CheckerContext,
        reporter: DiagnosticReporter
    ) {
        if (typeRef !is FirResolvedTypeRef || typeRef is FirErrorTypeRef) {
            return
        }

        val type: ConeKotlinType = typeRef.type
        val delegatedTypeRef = typeRef.delegatedTypeRef

        if (delegatedTypeRef is FirUserTypeRef && type is ConeClassLikeType) {
            val symbol = type.lookupTag.toSymbol(context.session)

            if (symbol is FirRegularClassSymbol) {
                val typeArguments = delegatedTypeRef.qualifier.toTypeProjections()
                val typeParameters = symbol.typeParameterSymbols

                for (index in typeArguments.size until typeParameters.size) {
                    val typeParameter = typeParameters[index]
                    if (!isValidTypeParameterFromOuterDeclaration(typeParameter, declaration, context.session)) {
                        val outerClass = typeParameter.containingDeclarationSymbol as? FirRegularClassSymbol ?: break
                        reporter.reportOn(typeRef.source, FirErrors.OUTER_CLASS_ARGUMENTS_REQUIRED, outerClass, context)
                        break
                    }
                }
            }
        }

        val typeRefAndSourcesForArguments = extractArgumentsTypeRefAndSource(typeRef) ?: return
        for (firTypeRefSource in typeRefAndSourcesForArguments) {
            firTypeRefSource.typeRef?.let { checkOuterClassArgumentsRequired(it, declaration, context, reporter) }
        }
    }
}