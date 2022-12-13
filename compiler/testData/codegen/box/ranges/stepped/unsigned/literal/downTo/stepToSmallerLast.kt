// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_STDLIB
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 8u downTo 1u step 2) {
        uintList += i
    }
    assertEquals(listOf(8u, 6u, 4u, 2u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in 8uL downTo 1uL step 2L) {
        ulongList += i
    }
    assertEquals(listOf(8uL, 6uL, 4uL, 2uL), ulongList)

    return "OK"
}