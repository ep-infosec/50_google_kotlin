// FIR_IDENTICAL
// WITH_STDLIB
// TARGET_BACKEND: JVM_IR
// WORKS_WHEN_VALUE_CLASS
// LANGUAGE: +ValueClasses

OPTIONAL_JVM_INLINE_ANNOTATION
value class Empty<T><!VALUE_CLASS_EMPTY_CONSTRUCTOR!>()<!>


OPTIONAL_JVM_INLINE_ANNOTATION
value class Foo<T>(val x: T, val y: T)

OPTIONAL_JVM_INLINE_ANNOTATION
value class FooNullable<T>(val x: T?, val y: T?)


OPTIONAL_JVM_INLINE_ANNOTATION
value class FooGenericArray<T>(val x: Array<T>, val y: Array<T>)

OPTIONAL_JVM_INLINE_ANNOTATION
value class FooGenericArray2<T>(val x: Array<Array<T>>, val y: Array<Array<T>>)


OPTIONAL_JVM_INLINE_ANNOTATION
value class FooStarProjectedArray(val x: Array<*>, val y: Array<*>)

OPTIONAL_JVM_INLINE_ANNOTATION
value class FooStarProjectedArray2(val x: Array<Array<*>>, val y: Array<Array<*>>)


OPTIONAL_JVM_INLINE_ANNOTATION
value class Bar(val u: <!VALUE_CLASS_HAS_INAPPLICABLE_PARAMETER_TYPE!>Unit<!>, val y: <!VALUE_CLASS_HAS_INAPPLICABLE_PARAMETER_TYPE!>Unit<!>)

OPTIONAL_JVM_INLINE_ANNOTATION
value class BarNullable(val u: Unit?, val y: Unit?)


OPTIONAL_JVM_INLINE_ANNOTATION
value class Baz(val u: <!VALUE_CLASS_HAS_INAPPLICABLE_PARAMETER_TYPE!>Nothing<!>, val y: <!VALUE_CLASS_HAS_INAPPLICABLE_PARAMETER_TYPE!>Nothing<!>)

OPTIONAL_JVM_INLINE_ANNOTATION
value class Baz1(val u: <!VALUE_CLASS_HAS_INAPPLICABLE_PARAMETER_TYPE!>Nothing<!>, val y: Int)

OPTIONAL_JVM_INLINE_ANNOTATION
value class Baz2(val u: Int, val y: <!VALUE_CLASS_HAS_INAPPLICABLE_PARAMETER_TYPE!>Nothing<!>)

OPTIONAL_JVM_INLINE_ANNOTATION
value class BazNullable(val u: Nothing?, val y: Nothing?)
