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

package org.jetbrains.kotlin.js.testOld.optimizer

import org.jetbrains.kotlin.js.backend.ast.JsStatement
import org.jetbrains.kotlin.js.inline.clean.LabeledBlockToDoWhileTransformation
import org.junit.Test

class LabeledBlockToDoWhileTransformationTest : BasicOptimizerTest("labeled-block-to-do-while") {
    @Test fun simple() = box()

    override fun process(statement: JsStatement) {
        LabeledBlockToDoWhileTransformation.apply(statement)
    }
}