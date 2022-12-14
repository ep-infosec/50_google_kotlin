// NO_CHECK_LAMBDA_INLINING
// FILE: 1.kt

inline fun foo(f: () -> Unit) {
    f()
}

// FILE: 2.kt

fun test(): String = fun (): String {
    foo { return "OK" }
    return "fail"
}.let { it() }

fun test2(): String = (l@ fun (): String {
    foo { return@l "OK" }
    return "fail"
}).let { it() }

fun box(): String {
    if (test() != "OK") return "fail 1: ${test()}"

    if (test2() != "OK") return "fail 2: ${test2()}"

    return "OK"
}
