// Auto-generated by GenerateInRangeExpressionTestData. Do not edit!
// WITH_STDLIB



val range0 = 1L downTo 3L
val range1 = 3L downTo 1L

val element0 = -1L
val element1 = 0L
val element2 = 1L
val element3 = 2L
val element4 = 3L
val element5 = 4L

fun box(): String {
    testR0xE0()
    testR0xE1()
    testR0xE2()
    testR0xE3()
    testR0xE4()
    testR0xE5()
    testR1xE0()
    testR1xE1()
    testR1xE2()
    testR1xE3()
    testR1xE4()
    testR1xE5()
    return "OK"
}

fun testR0xE0() {
    // with possible local optimizations
    if (-1L in 1L downTo 3L != range0.contains(-1L)) throw AssertionError()
    if (-1L !in 1L downTo 3L != !range0.contains(-1L)) throw AssertionError()
    if (!(-1L in 1L downTo 3L) != !range0.contains(-1L)) throw AssertionError()
    if (!(-1L !in 1L downTo 3L) != range0.contains(-1L)) throw AssertionError()
    // no local optimizations
    if (element0 in 1L downTo 3L != range0.contains(element0)) throw AssertionError()
    if (element0 !in 1L downTo 3L != !range0.contains(element0)) throw AssertionError()
    if (!(element0 in 1L downTo 3L) != !range0.contains(element0)) throw AssertionError()
    if (!(element0 !in 1L downTo 3L) != range0.contains(element0)) throw AssertionError()
}

fun testR0xE1() {
    // with possible local optimizations
    if (0L in 1L downTo 3L != range0.contains(0L)) throw AssertionError()
    if (0L !in 1L downTo 3L != !range0.contains(0L)) throw AssertionError()
    if (!(0L in 1L downTo 3L) != !range0.contains(0L)) throw AssertionError()
    if (!(0L !in 1L downTo 3L) != range0.contains(0L)) throw AssertionError()
    // no local optimizations
    if (element1 in 1L downTo 3L != range0.contains(element1)) throw AssertionError()
    if (element1 !in 1L downTo 3L != !range0.contains(element1)) throw AssertionError()
    if (!(element1 in 1L downTo 3L) != !range0.contains(element1)) throw AssertionError()
    if (!(element1 !in 1L downTo 3L) != range0.contains(element1)) throw AssertionError()
}

fun testR0xE2() {
    // with possible local optimizations
    if (1L in 1L downTo 3L != range0.contains(1L)) throw AssertionError()
    if (1L !in 1L downTo 3L != !range0.contains(1L)) throw AssertionError()
    if (!(1L in 1L downTo 3L) != !range0.contains(1L)) throw AssertionError()
    if (!(1L !in 1L downTo 3L) != range0.contains(1L)) throw AssertionError()
    // no local optimizations
    if (element2 in 1L downTo 3L != range0.contains(element2)) throw AssertionError()
    if (element2 !in 1L downTo 3L != !range0.contains(element2)) throw AssertionError()
    if (!(element2 in 1L downTo 3L) != !range0.contains(element2)) throw AssertionError()
    if (!(element2 !in 1L downTo 3L) != range0.contains(element2)) throw AssertionError()
}

fun testR0xE3() {
    // with possible local optimizations
    if (2L in 1L downTo 3L != range0.contains(2L)) throw AssertionError()
    if (2L !in 1L downTo 3L != !range0.contains(2L)) throw AssertionError()
    if (!(2L in 1L downTo 3L) != !range0.contains(2L)) throw AssertionError()
    if (!(2L !in 1L downTo 3L) != range0.contains(2L)) throw AssertionError()
    // no local optimizations
    if (element3 in 1L downTo 3L != range0.contains(element3)) throw AssertionError()
    if (element3 !in 1L downTo 3L != !range0.contains(element3)) throw AssertionError()
    if (!(element3 in 1L downTo 3L) != !range0.contains(element3)) throw AssertionError()
    if (!(element3 !in 1L downTo 3L) != range0.contains(element3)) throw AssertionError()
}

fun testR0xE4() {
    // with possible local optimizations
    if (3L in 1L downTo 3L != range0.contains(3L)) throw AssertionError()
    if (3L !in 1L downTo 3L != !range0.contains(3L)) throw AssertionError()
    if (!(3L in 1L downTo 3L) != !range0.contains(3L)) throw AssertionError()
    if (!(3L !in 1L downTo 3L) != range0.contains(3L)) throw AssertionError()
    // no local optimizations
    if (element4 in 1L downTo 3L != range0.contains(element4)) throw AssertionError()
    if (element4 !in 1L downTo 3L != !range0.contains(element4)) throw AssertionError()
    if (!(element4 in 1L downTo 3L) != !range0.contains(element4)) throw AssertionError()
    if (!(element4 !in 1L downTo 3L) != range0.contains(element4)) throw AssertionError()
}

fun testR0xE5() {
    // with possible local optimizations
    if (4L in 1L downTo 3L != range0.contains(4L)) throw AssertionError()
    if (4L !in 1L downTo 3L != !range0.contains(4L)) throw AssertionError()
    if (!(4L in 1L downTo 3L) != !range0.contains(4L)) throw AssertionError()
    if (!(4L !in 1L downTo 3L) != range0.contains(4L)) throw AssertionError()
    // no local optimizations
    if (element5 in 1L downTo 3L != range0.contains(element5)) throw AssertionError()
    if (element5 !in 1L downTo 3L != !range0.contains(element5)) throw AssertionError()
    if (!(element5 in 1L downTo 3L) != !range0.contains(element5)) throw AssertionError()
    if (!(element5 !in 1L downTo 3L) != range0.contains(element5)) throw AssertionError()
}

fun testR1xE0() {
    // with possible local optimizations
    if (-1L in 3L downTo 1L != range1.contains(-1L)) throw AssertionError()
    if (-1L !in 3L downTo 1L != !range1.contains(-1L)) throw AssertionError()
    if (!(-1L in 3L downTo 1L) != !range1.contains(-1L)) throw AssertionError()
    if (!(-1L !in 3L downTo 1L) != range1.contains(-1L)) throw AssertionError()
    // no local optimizations
    if (element0 in 3L downTo 1L != range1.contains(element0)) throw AssertionError()
    if (element0 !in 3L downTo 1L != !range1.contains(element0)) throw AssertionError()
    if (!(element0 in 3L downTo 1L) != !range1.contains(element0)) throw AssertionError()
    if (!(element0 !in 3L downTo 1L) != range1.contains(element0)) throw AssertionError()
}

fun testR1xE1() {
    // with possible local optimizations
    if (0L in 3L downTo 1L != range1.contains(0L)) throw AssertionError()
    if (0L !in 3L downTo 1L != !range1.contains(0L)) throw AssertionError()
    if (!(0L in 3L downTo 1L) != !range1.contains(0L)) throw AssertionError()
    if (!(0L !in 3L downTo 1L) != range1.contains(0L)) throw AssertionError()
    // no local optimizations
    if (element1 in 3L downTo 1L != range1.contains(element1)) throw AssertionError()
    if (element1 !in 3L downTo 1L != !range1.contains(element1)) throw AssertionError()
    if (!(element1 in 3L downTo 1L) != !range1.contains(element1)) throw AssertionError()
    if (!(element1 !in 3L downTo 1L) != range1.contains(element1)) throw AssertionError()
}

fun testR1xE2() {
    // with possible local optimizations
    if (1L in 3L downTo 1L != range1.contains(1L)) throw AssertionError()
    if (1L !in 3L downTo 1L != !range1.contains(1L)) throw AssertionError()
    if (!(1L in 3L downTo 1L) != !range1.contains(1L)) throw AssertionError()
    if (!(1L !in 3L downTo 1L) != range1.contains(1L)) throw AssertionError()
    // no local optimizations
    if (element2 in 3L downTo 1L != range1.contains(element2)) throw AssertionError()
    if (element2 !in 3L downTo 1L != !range1.contains(element2)) throw AssertionError()
    if (!(element2 in 3L downTo 1L) != !range1.contains(element2)) throw AssertionError()
    if (!(element2 !in 3L downTo 1L) != range1.contains(element2)) throw AssertionError()
}

fun testR1xE3() {
    // with possible local optimizations
    if (2L in 3L downTo 1L != range1.contains(2L)) throw AssertionError()
    if (2L !in 3L downTo 1L != !range1.contains(2L)) throw AssertionError()
    if (!(2L in 3L downTo 1L) != !range1.contains(2L)) throw AssertionError()
    if (!(2L !in 3L downTo 1L) != range1.contains(2L)) throw AssertionError()
    // no local optimizations
    if (element3 in 3L downTo 1L != range1.contains(element3)) throw AssertionError()
    if (element3 !in 3L downTo 1L != !range1.contains(element3)) throw AssertionError()
    if (!(element3 in 3L downTo 1L) != !range1.contains(element3)) throw AssertionError()
    if (!(element3 !in 3L downTo 1L) != range1.contains(element3)) throw AssertionError()
}

fun testR1xE4() {
    // with possible local optimizations
    if (3L in 3L downTo 1L != range1.contains(3L)) throw AssertionError()
    if (3L !in 3L downTo 1L != !range1.contains(3L)) throw AssertionError()
    if (!(3L in 3L downTo 1L) != !range1.contains(3L)) throw AssertionError()
    if (!(3L !in 3L downTo 1L) != range1.contains(3L)) throw AssertionError()
    // no local optimizations
    if (element4 in 3L downTo 1L != range1.contains(element4)) throw AssertionError()
    if (element4 !in 3L downTo 1L != !range1.contains(element4)) throw AssertionError()
    if (!(element4 in 3L downTo 1L) != !range1.contains(element4)) throw AssertionError()
    if (!(element4 !in 3L downTo 1L) != range1.contains(element4)) throw AssertionError()
}

fun testR1xE5() {
    // with possible local optimizations
    if (4L in 3L downTo 1L != range1.contains(4L)) throw AssertionError()
    if (4L !in 3L downTo 1L != !range1.contains(4L)) throw AssertionError()
    if (!(4L in 3L downTo 1L) != !range1.contains(4L)) throw AssertionError()
    if (!(4L !in 3L downTo 1L) != range1.contains(4L)) throw AssertionError()
    // no local optimizations
    if (element5 in 3L downTo 1L != range1.contains(element5)) throw AssertionError()
    if (element5 !in 3L downTo 1L != !range1.contains(element5)) throw AssertionError()
    if (!(element5 in 3L downTo 1L) != !range1.contains(element5)) throw AssertionError()
    if (!(element5 !in 3L downTo 1L) != range1.contains(element5)) throw AssertionError()
}

