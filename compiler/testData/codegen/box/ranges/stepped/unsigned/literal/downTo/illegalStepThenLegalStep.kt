// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_STDLIB
import kotlin.test.*

fun box(): String {
    assertFailsWith<IllegalArgumentException> {
        for (i in 7u downTo 1u step 0 step 2) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        for (i in 7uL downTo 1uL step 0L step 2L) {
        }
    }

    return "OK"
}