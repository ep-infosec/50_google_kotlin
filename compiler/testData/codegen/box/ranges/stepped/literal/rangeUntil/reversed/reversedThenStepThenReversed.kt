// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_STDLIB
// DONT_TARGET_EXACT_BACKEND: JVM
// !LANGUAGE: +RangeUntilOperator
@file:OptIn(ExperimentalStdlibApi::class)
import kotlin.test.*

fun box(): String {
    val intList = mutableListOf<Int>()
    for (i in ((1..<9).reversed() step 2).reversed()) {
        intList += i
    }
    assertEquals(listOf(2, 4, 6, 8), intList)

    val longList = mutableListOf<Long>()
    for (i in ((1L..<9L).reversed() step 2L).reversed()) {
        longList += i
    }
    assertEquals(listOf(2L, 4L, 6L, 8L), longList)

    val charList = mutableListOf<Char>()
    for (i in (('a'..<'i').reversed() step 2).reversed()) {
        charList += i
    }
    assertEquals(listOf('b', 'd', 'f', 'h'), charList)

    return "OK"
}