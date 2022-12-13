/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */


package test.generated.minmax

//
// NOTE: THIS FILE IS AUTO-GENERATED by the MinMaxTestGenerator.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.math.pow
import kotlin.test.*
import test.*

class MinMaxCharArrayTest {

    
    private fun expectMinMax(min: Char, max: Char, elements: CharArray) {
        assertEquals(min, elements.minOrNull())
        assertEquals(max, elements.maxOrNull())
        assertEquals(min, elements.min())
        assertEquals(max, elements.max())
    }

    @Test
    fun minMax() {
        expectMinMax('a', 'a', charArrayOf('a'))
        expectMinMax('a', 'b', charArrayOf('a', 'b'))
        expectMinMax('a', Char.MAX_VALUE, charArrayOf('a', 'b', Char.MAX_VALUE))
                    
    }

    @Test
    fun minMaxEmpty() {
        val empty = charArrayOf()
        assertNull(empty.minOrNull())
        assertNull(empty.maxOrNull())
        assertFailsWith<NoSuchElementException> { empty.min() }
        assertFailsWith<NoSuchElementException> { empty.max() }
    }



    private fun expectMinMaxWith(min: Char, max: Char, elements: CharArray, comparator: Comparator<Char>) {
        assertEquals(min, elements.minWithOrNull(comparator))
        assertEquals(max, elements.maxWithOrNull(comparator))
        assertEquals(min, elements.minWith(comparator))
        assertEquals(max, elements.maxWith(comparator))
    }

    @Test
    fun minMaxWith() {
        expectMinMaxWith('a', 'a', charArrayOf('a'), naturalOrder())
        expectMinMaxWith('a', 'b', charArrayOf('a', 'b'), naturalOrder())
        expectMinMaxWith('a', Char.MAX_VALUE, charArrayOf('a', 'b', Char.MAX_VALUE), naturalOrder())

    }

    @Test
    fun minMaxWithEmpty() {
        val empty = charArrayOf()
        assertNull(empty.minWithOrNull(naturalOrder()))
        assertNull(empty.maxWithOrNull(naturalOrder()))
        assertFailsWith<NoSuchElementException> { empty.minWith(naturalOrder()) }
        assertFailsWith<NoSuchElementException> { empty.maxWith(naturalOrder()) }
    }


    private inline fun <K : Comparable<K>> expectMinMaxBy(min: Char, max: Char, elements: CharArray, selector: (Char) -> K) {
        assertEquals(min, elements.minBy(selector))
        assertEquals(min, elements.minByOrNull(selector))
        assertEquals(max, elements.maxBy(selector))
        assertEquals(max, elements.maxByOrNull(selector))
    }

    @Test
    fun minMaxBy() {
        expectMinMaxBy('a', 'a', charArrayOf('a'), { it })
        expectMinMaxBy('a', 'b', charArrayOf('a', 'b'), { it })
        expectMinMaxBy('a', Char.MAX_VALUE, charArrayOf('a', 'b', Char.MAX_VALUE), { it })

    }

    @Test
    fun minMaxByEmpty() {
        val empty = charArrayOf()
        assertNull(empty.minByOrNull { it.toString() })
        assertNull(empty.maxByOrNull { it.toString() })
        assertFailsWith<NoSuchElementException> { empty.minBy { it.toString() } }
        assertFailsWith<NoSuchElementException> { empty.maxBy { it.toString() } }                       
    }

    @Test 
    fun minBySelectorEvaluateOnce() {
        val source = charArrayOf('a', 'b', Char.MAX_VALUE)
        var c = 0
        source.minBy { c++ }
        assertEquals(3, c)
        c = 0
        source.minByOrNull { c++ }
        assertEquals(3, c)
    }

    @Test 
    fun maxBySelectorEvaluateOnce() {
        val source = charArrayOf('a', 'b', Char.MAX_VALUE)
        var c = 0
        source.maxBy { c++ }
        assertEquals(3, c)
        c = 0
        source.maxByOrNull { c++ }
        assertEquals(3, c)
    }
    
    
    private inline fun <R : Comparable<R>> expectMinMaxOf(min: R, max: R, elements: CharArray, selector: (Char) -> R) {
        assertEquals(min, elements.minOf(selector))
        assertEquals(min, elements.minOfOrNull(selector))
        assertEquals(max, elements.maxOf(selector))
        assertEquals(max, elements.maxOfOrNull(selector))
    }
    
    @Test
    fun minMaxOf() {
        expectMinMaxOf("_" + 'a', "_" + 'a', charArrayOf('a'), { "_$it" })
        expectMinMaxOf("_" + 'a', "_" + 'b', charArrayOf('a', 'b'), { "_$it" })
        expectMinMaxOf("_" + 'a', "_" + Char.MAX_VALUE, charArrayOf('a', 'b', Char.MAX_VALUE), { "_$it" })

    }
    
    @Test
    fun minMaxOfDouble() {
        val middle = 'b'
        val items = charArrayOf('a', 'b', Char.MAX_VALUE).apply { shuffle() }
        assertTrue(items.minOf { it.compareTo(middle).toDouble().pow(0.5) }.isNaN())
        assertTrue(items.minOfOrNull { it.compareTo(middle).toDouble().pow(0.5) }!!.isNaN())
        assertTrue(items.maxOf { it.compareTo(middle).toDouble().pow(0.5) }.isNaN())
        assertTrue(items.maxOfOrNull { it.compareTo(middle).toDouble().pow(0.5) }!!.isNaN())
        
        assertIsNegativeZero(items.minOf { it.compareTo(middle) * 0.0 })
        assertIsNegativeZero(items.minOfOrNull { it.compareTo(middle) * 0.0 }!!)
        assertIsPositiveZero(items.maxOf { it.compareTo(middle) * 0.0 })
        assertIsPositiveZero(items.maxOfOrNull { it.compareTo(middle) * 0.0 }!!)
    }
    
    @Test
    fun minMaxOfFloat() {
        val middle = 'b'
        val items = charArrayOf('a', 'b', Char.MAX_VALUE).apply { shuffle() }
        assertTrue(items.minOf { it.compareTo(middle).toFloat().pow(0.5F) }.isNaN())
        assertTrue(items.minOfOrNull { it.compareTo(middle).toFloat().pow(0.5F) }!!.isNaN())
        assertTrue(items.maxOf { it.compareTo(middle).toFloat().pow(0.5F) }.isNaN())
        assertTrue(items.maxOfOrNull { it.compareTo(middle).toFloat().pow(0.5F) }!!.isNaN())
        
        assertIsNegativeZero(items.minOf { it.compareTo(middle) * 0.0F }.toDouble())
        assertIsNegativeZero(items.minOfOrNull { it.compareTo(middle) * 0.0F }!!.toDouble())
        assertIsPositiveZero(items.maxOf { it.compareTo(middle) * 0.0F }.toDouble())
        assertIsPositiveZero(items.maxOfOrNull { it.compareTo(middle) * 0.0F }!!.toDouble())
    }
    
    @Test
    fun minMaxOfEmpty() {
        val empty = charArrayOf()

        assertNull(empty.minOfOrNull { it.toString() })
        assertNull(empty.maxOfOrNull { it.toString() })
        assertFailsWith<NoSuchElementException> { empty.minOf { it.toString() } }
        assertFailsWith<NoSuchElementException> { empty.maxOf { it.toString() } }                       


        assertNull(empty.minOfOrNull { 0.0 })
        assertNull(empty.maxOfOrNull { 0.0 })
        assertFailsWith<NoSuchElementException> { empty.minOf { 0.0 } }
        assertFailsWith<NoSuchElementException> { empty.maxOf { 0.0 } }                       


        assertNull(empty.minOfOrNull { 0.0F })
        assertNull(empty.maxOfOrNull { 0.0F })
        assertFailsWith<NoSuchElementException> { empty.minOf { 0.0F } }
        assertFailsWith<NoSuchElementException> { empty.maxOf { 0.0F } }                       


    }
    
    
    private inline fun <R> expectMinMaxOfWith(min: R, max: R, elements: CharArray, comparator: Comparator<R>, selector: (Char) -> R) {
        assertEquals(min, elements.minOfWith(comparator, selector))
        assertEquals(min, elements.minOfWithOrNull(comparator, selector))
        assertEquals(max, elements.maxOfWith(comparator, selector))
        assertEquals(max, elements.maxOfWithOrNull(comparator, selector))
    }
    
    @Test
    fun minMaxOfWith() {
        expectMinMaxOfWith("_" + 'a', "_" + 'a', charArrayOf('a'), reverseOrder(), { "_$it" })
        expectMinMaxOfWith("_" + 'b', "_" + 'a', charArrayOf('a', 'b'), reverseOrder(), { "_$it" })
        expectMinMaxOfWith("_" + Char.MAX_VALUE, "_" + 'a', charArrayOf('a', 'b', Char.MAX_VALUE), reverseOrder(), { "_$it" })

    }
    
    @Test
    fun minMaxOfWithEmpty() {
        val empty = charArrayOf()
        assertNull(empty.minOfWithOrNull(naturalOrder()) { it.toString() })
        assertNull(empty.maxOfWithOrNull(naturalOrder()) { it.toString() })
        assertFailsWith<NoSuchElementException> { empty.minOfWith(naturalOrder()) { it.toString() } }
        assertFailsWith<NoSuchElementException> { empty.maxOfWith(naturalOrder()) { it.toString() } }
    }

}