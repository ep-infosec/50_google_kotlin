/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.contracts.model.functors

import org.jetbrains.kotlin.contracts.model.*
import org.jetbrains.kotlin.contracts.model.structure.*
import org.jetbrains.kotlin.contracts.model.visitors.Reducer
import org.jetbrains.kotlin.contracts.model.visitors.Substitutor
import org.jetbrains.kotlin.descriptors.ClassKind
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.ReceiverParameterDescriptor
import org.jetbrains.kotlin.descriptors.ValueDescriptor
import org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitClassReceiver
import org.jetbrains.kotlin.utils.addIfNotNull

class SubstitutingFunctor(
    private val basicEffects: List<ESEffect>,
    private val ownerFunction: FunctionDescriptor
) : AbstractFunctor() {
    override fun doInvocation(arguments: List<Computation>, typeSubstitution: ESTypeSubstitution, reducer: Reducer): List<ESEffect> {
        if (basicEffects.isEmpty()) return emptyList()

        val parameters = computeParameters(arguments)

        val substitutions = parameters.zip(arguments).toMap()
        val substitutor = Substitutor(substitutions, typeSubstitution, reducer)
        val substitutedClauses = mutableListOf<ESEffect>()

        effectsLoop@ for (effect in basicEffects) {
            when (effect) {
                is ConditionalEffect -> effect.condition.accept(substitutor)?.effects?.forEach {
                    substitutedClauses.addIfNotNull(combine(effect.simpleEffect, it))
                }

                is ESCalls -> {
                    val substitutionForCallable = substitutions[effect.callable] as? ESValue ?: continue@effectsLoop
                    substitutedClauses += ESCalls(substitutionForCallable, effect.kind)
                }

                else -> substitutedClauses += effect
            }
        }

        return substitutedClauses
    }

    private fun computeParameters(arguments: List<Computation>): List<ESVariable> {
        val dispatchReceiver = ownerFunction.dispatchReceiverParameter?.toESVariable()
        val extensionReceiver = ownerFunction.extensionReceiverParameter?.toESVariable()
        val receivers = listOfNotNull(dispatchReceiver, extensionReceiver)
        val valueParameters = ownerFunction.valueParameters.map { it.toESVariable() }
        val parameters = receivers + valueParameters

        if (parameters.size == arguments.size) {
            return parameters
        }

        fun fail(): Nothing {
            error("Arguments and parameters size mismatch: arguments.size = ${arguments.size}, parameters.size = ${parameters.size}")
        }

        val dispatchParameterDescriptor = dispatchReceiver?.descriptor ?: fail()
        if (dispatchParameterDescriptor is ReceiverParameterDescriptor) {
            val classDescriptor = (dispatchParameterDescriptor.value as? ImplicitClassReceiver)?.classDescriptor ?: fail()
            if (classDescriptor.kind == ClassKind.OBJECT) {
                val parametersWithoutDispatch = buildList {
                    extensionReceiver?.let { add(it) }
                    addAll(valueParameters)
                }
                if (parametersWithoutDispatch.size != arguments.size) {
                    fail()
                }
                return parametersWithoutDispatch
            }
        }
        fail()
    }

    private fun combine(effect: SimpleEffect, substitutedCondition: ESEffect): ESEffect? {
        if (substitutedCondition !is ConditionalEffect) return null

        val effectFromCondition = substitutedCondition.simpleEffect
        if (effectFromCondition !is ESReturns || effectFromCondition.value.isWildcard) return substitutedCondition

        if (!effectFromCondition.value.isTrue) return null

        return ConditionalEffect(substitutedCondition.condition, effect)
    }

    private fun ValueDescriptor.toESVariable(): ESVariable = ESVariable(this)
}
