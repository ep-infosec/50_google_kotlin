fun box(): String {
    fun Int.is42With(that: Int) = this + 2 * that == 42
    return if ((Int::is42With).let { it(16, 13) }) "OK" else "Fail"
}
