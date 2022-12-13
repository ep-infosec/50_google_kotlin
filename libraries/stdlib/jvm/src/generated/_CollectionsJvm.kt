/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

@file:kotlin.jvm.JvmMultifileClass
@file:kotlin.jvm.JvmName("CollectionsKt")

package kotlin.collections

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.ranges.contains
import kotlin.ranges.reversed

/**
 * Returns a list containing all elements that are instances of specified class.
 * 
 * @sample samples.collections.Collections.Filtering.filterIsInstanceJVM
 */
public fun <R> Iterable<*>.filterIsInstance(klass: Class<R>): List<R> {
    return filterIsInstanceTo(ArrayList<R>(), klass)
}

/**
 * Appends all elements that are instances of specified class to the given [destination].
 * 
 * @sample samples.collections.Collections.Filtering.filterIsInstanceToJVM
 */
public fun <C : MutableCollection<in R>, R> Iterable<*>.filterIsInstanceTo(destination: C, klass: Class<R>): C {
    @Suppress("UNCHECKED_CAST")
    for (element in this) if (klass.isInstance(element)) destination.add(element as R)
    return destination
}

/**
 * Reverses elements in the list in-place.
 */
public actual fun <T> MutableList<T>.reverse(): Unit {
    java.util.Collections.reverse(this)
}

/**
 * Returns a new [SortedSet][java.util.SortedSet] of all elements.
 */
public fun <T : Comparable<T>> Iterable<T>.toSortedSet(): java.util.SortedSet<T> {
    return toCollection(java.util.TreeSet<T>())
}

/**
 * Returns a new [SortedSet][java.util.SortedSet] of all elements.
 * 
 * Elements in the set returned are sorted according to the given [comparator].
 */
public fun <T> Iterable<T>.toSortedSet(comparator: Comparator<in T>): java.util.SortedSet<T> {
    return toCollection(java.util.TreeSet<T>(comparator))
}

@Deprecated("Use maxOrNull instead.", ReplaceWith("this.maxOrNull()"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@SinceKotlin("1.1")
@Suppress("CONFLICTING_OVERLOADS")
public fun Iterable<Double>.max(): Double? {
    return maxOrNull()
}

@Deprecated("Use maxOrNull instead.", ReplaceWith("this.maxOrNull()"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@SinceKotlin("1.1")
@Suppress("CONFLICTING_OVERLOADS")
public fun Iterable<Float>.max(): Float? {
    return maxOrNull()
}

@Deprecated("Use maxOrNull instead.", ReplaceWith("this.maxOrNull()"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@Suppress("CONFLICTING_OVERLOADS")
public fun <T : Comparable<T>> Iterable<T>.max(): T? {
    return maxOrNull()
}

@Deprecated("Use maxByOrNull instead.", ReplaceWith("this.maxByOrNull(selector)"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@Suppress("CONFLICTING_OVERLOADS")
public inline fun <T, R : Comparable<R>> Iterable<T>.maxBy(selector: (T) -> R): T? {
    return maxByOrNull(selector)
}

@Deprecated("Use maxWithOrNull instead.", ReplaceWith("this.maxWithOrNull(comparator)"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@Suppress("CONFLICTING_OVERLOADS")
public fun <T> Iterable<T>.maxWith(comparator: Comparator<in T>): T? {
    return maxWithOrNull(comparator)
}

@Deprecated("Use minOrNull instead.", ReplaceWith("this.minOrNull()"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@SinceKotlin("1.1")
@Suppress("CONFLICTING_OVERLOADS")
public fun Iterable<Double>.min(): Double? {
    return minOrNull()
}

@Deprecated("Use minOrNull instead.", ReplaceWith("this.minOrNull()"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@SinceKotlin("1.1")
@Suppress("CONFLICTING_OVERLOADS")
public fun Iterable<Float>.min(): Float? {
    return minOrNull()
}

@Deprecated("Use minOrNull instead.", ReplaceWith("this.minOrNull()"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@Suppress("CONFLICTING_OVERLOADS")
public fun <T : Comparable<T>> Iterable<T>.min(): T? {
    return minOrNull()
}

@Deprecated("Use minByOrNull instead.", ReplaceWith("this.minByOrNull(selector)"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@Suppress("CONFLICTING_OVERLOADS")
public inline fun <T, R : Comparable<R>> Iterable<T>.minBy(selector: (T) -> R): T? {
    return minByOrNull(selector)
}

@Deprecated("Use minWithOrNull instead.", ReplaceWith("this.minWithOrNull(comparator)"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@Suppress("CONFLICTING_OVERLOADS")
public fun <T> Iterable<T>.minWith(comparator: Comparator<in T>): T? {
    return minWithOrNull(comparator)
}

/**
 * Returns the sum of all values produced by [selector] function applied to each element in the collection.
 */
@SinceKotlin("1.4")
@OptIn(kotlin.experimental.ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
@kotlin.jvm.JvmName("sumOfBigDecimal")
@kotlin.internal.InlineOnly
public inline fun <T> Iterable<T>.sumOf(selector: (T) -> java.math.BigDecimal): java.math.BigDecimal {
    var sum: java.math.BigDecimal = 0.toBigDecimal()
    for (element in this) {
        sum += selector(element)
    }
    return sum
}

/**
 * Returns the sum of all values produced by [selector] function applied to each element in the collection.
 */
@SinceKotlin("1.4")
@OptIn(kotlin.experimental.ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
@kotlin.jvm.JvmName("sumOfBigInteger")
@kotlin.internal.InlineOnly
public inline fun <T> Iterable<T>.sumOf(selector: (T) -> java.math.BigInteger): java.math.BigInteger {
    var sum: java.math.BigInteger = 0.toBigInteger()
    for (element in this) {
        sum += selector(element)
    }
    return sum
}
