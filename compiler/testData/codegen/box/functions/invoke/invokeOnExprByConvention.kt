//KT-3217 Invoke convention after function invocation doesn't work
//KT-2728 Can't compile A()()

class A {
    operator fun invoke() = "##"
    operator fun invoke(i: Int) = "#${i}"
}

fun foo() = A()

fun box(): String {
    if (A()() != "##") return "fail1"
    if (A()(1) != "#1") return "fail2"
    if (foo()() != "##") return "fail3"
    if (foo()(42) != "#42") return "fail4"
    if ((foo())(42) != "#42") return "fail5"
    if ({ -> A()}.let { it() }() != "##") return "fail6"
    if ({ -> A()}.let { it() }(37) != "#37") return "fail7"
    return "OK"
}