/*
 * Copyright 2010-2022 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

import Kt

private func testCustomComponentMethodsAreAccessible() throws {
    let d = DataClassWithExplicitComponentMethod(x: 1, y: 2)
    try assertEquals(actual: d.component1(arg: 3), expected: 4)
}

private func testDataClassWithInheritedComponentAreAccessible() throws {
    let d = DataClassWithInheritedComponentMethod(x: 1)
    try assertEquals(actual: d.component1(), expected: 1)
}

// Absence of deprecation attributes is checked by comparing "lazy header".
private func testRegularComponentMethodsAreAccessible() throws {
    let r = RegularClassWithComponentMethods()
    try assertEquals(actual: r.component1(), expected: 3)
    try assertEquals(actual: r.component3(), expected: 4)
}

private func testTopLevelComponentMethodsAreAccessible() throws {
    try assertEquals(actual: DataClassComponentMethodsKt.component1(), expected: 5)
    try assertEquals(actual: DataClassComponentMethodsKt.component4(), expected: 6)
}

class DataClassComponentMethodsTests : SimpleTestProvider {
    override init() {
        super.init()
        test("testDataClassWithInheritedComponentAreAccessible", testDataClassWithInheritedComponentAreAccessible)
        test("testCustomComponentMethodsAreAccessible", testCustomComponentMethodsAreAccessible)
        test("testRegularComponentMethodsAreAccessible", testRegularComponentMethodsAreAccessible)
        test("testTopLevelComponentMethodsAreAccessible", testTopLevelComponentMethodsAreAccessible)
    }
}