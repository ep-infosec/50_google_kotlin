// STRICT

class Foo(private val string: String) {
    val bar = Bar("bar")

    class Bar(val string: String) {
        class Bar(val nested: String)

        val bars: ArrayList<Bar> = ArrayList()
    }
}

// EXPECTED_ERROR: (other:-1:-1) Can't generate a stub for 'Foo$Bar$Bar'.
