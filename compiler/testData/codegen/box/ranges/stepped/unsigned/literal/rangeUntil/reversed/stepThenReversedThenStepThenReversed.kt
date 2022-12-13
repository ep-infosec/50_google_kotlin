// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_STDLIB
// DONT_TARGET_EXACT_BACKEND: JVM
// !LANGUAGE: +RangeUntilOperator
@file:OptIn(ExperimentalStdlibApi::class)
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in ((1u..<11u step 2).reversed() step 3).reversed()) {
        uintList += i
    }
    assertEquals(listOf(3u, 6u, 9u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in ((1uL..<11uL step 2L).reversed() step 3L).reversed()) {
        ulongList += i
    }
    assertEquals(listOf(3uL, 6uL, 9uL), ulongList)

    return "OK"
}