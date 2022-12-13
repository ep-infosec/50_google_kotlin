// !LANGUAGE: +SuspendConversion
// WITH_STDLIB
// WITH_COROUTINES

import helpers.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

fun runSuspend(c: suspend () -> Unit) {
    c.startCoroutine(EmptyContinuation)
}

var test = "failed"

fun foo() { test = "OK" }

inline suspend fun invokeSuspend(crossinline fn: suspend () -> Unit) = suspend { fn() }

fun box(): String {
    runSuspend {
        invokeSuspend(::foo)()
    }
    return test
}