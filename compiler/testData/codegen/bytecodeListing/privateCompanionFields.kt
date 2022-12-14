// WITH_STDLIB
class TestClass {

    private companion object {
        @JvmField
        var test: String = "1"

        @JvmField
        @java.lang.Deprecated
        var test2: String = "2"

        @JvmField
        val test3: String = "3"

        const val testConst = 1
    }
}

class TestClass2 {

    private companion object {
        val testPublic: String = "1"
        private val testPrivate: String = "2"
        const val testPublicConst: String = "3"
    }
}

interface TestConst {

    private companion object {
        const val testConst = 1
    }
}

interface TestJvmField {

    private companion object {
        @JvmField
        val test3: String = "3"
    }
}
