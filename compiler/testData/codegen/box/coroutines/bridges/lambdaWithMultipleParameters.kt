// WITH_STDLIB
// WITH_COROUTINES
// CHECK_BYTECODE_LISTING
// FIR_IDENTICAL

import helpers.*
import kotlin.coroutines.*

fun builder(c: suspend() -> Unit) {
    c.startCoroutine(EmptyContinuation)
}

suspend fun call(c: suspend(String, Long, Long, Long, Long, Long) -> String): String {
    return c("OK", 1, 2, 3, 4, 5)
}

fun box(): String {
    var res = ""
    builder {
        res = call { a, b, c, d, e, f ->
            "$a$b$c$d$e$f"
        }
    }
    if (res != "OK12345") return res
    return "OK"
}
