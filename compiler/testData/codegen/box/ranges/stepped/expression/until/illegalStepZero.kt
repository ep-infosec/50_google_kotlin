// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_STDLIB
import kotlin.test.*

fun box(): String {
    assertFailsWith<IllegalArgumentException> {
        val intProgression = 1 until 8
        for (i in intProgression step 0) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        val longProgression = 1L until 8L
        for (i in longProgression step 0L) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        val charProgression = 'a' until 'h'
        for (i in charProgression step 0) {
        }
    }

    return "OK"
}