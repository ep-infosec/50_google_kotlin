// WITH_REFLECT
// IGNORE_BACKEND: ANDROID
class A

fun box(): String {
    val klass = A::class
    return if (klass.toString() == "class A") "OK" else "Fail: $klass"
}
