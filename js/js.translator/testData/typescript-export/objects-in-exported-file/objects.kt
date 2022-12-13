/** This file is generated by {@link :js:js.test:generateJsExportOnFileTestFilesForTS} task. DO NOT MODIFY MANUALLY */

// CHECK_TYPESCRIPT_DECLARATIONS
// RUN_PLAIN_BOX_FUNCTION
// SKIP_MINIFICATION
// SKIP_NODE_JS
// INFER_MAIN_MODULE
// MODULE: JS_TESTS
// FILE: objects.kt

@file:JsExport

package foo


object O0


object O {
    val x = 10
    fun foo() = 20
}


fun takesO(o: O): Int =
    O.x + O.foo()


object WithSimpleObjectInside {
   val value: String = "WithSimpleObjectInside"
    object SimpleObject {
        val value: String = "SimpleObject"
    }
}


object Parent {
    object Nested1 {
        val value: String = "Nested1"
        class Nested2 {
            companion object {
                class Nested3
            }
        }
    }
}


fun getParent(): Parent {
    return Parent
}


fun createNested1(): Parent.Nested1 {
    return Parent.Nested1
}


fun createNested2(): Parent.Nested1.Nested2 {
    return Parent.Nested1.Nested2()
}


fun createNested3(): Parent.Nested1.Nested2.Companion.Nested3 {
    return Parent.Nested1.Nested2.Companion.Nested3()
}