// FILE: 1.kt

package test

interface  A {
    fun run()
}

inline fun testNested(crossinline f: (String) -> Unit) {
    object : A {
        override fun run() {
            f("OK")
        }
    }.run()
}

fun test(f: (String) -> Unit) {
    testNested { it ->  { f(it) }.let { it() } }
}

// FILE: 2.kt

import test.*

fun box(): String {
    var result = "fail"
    test { it -> result = it }
    return result
}
