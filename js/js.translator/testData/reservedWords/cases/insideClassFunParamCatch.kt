package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

class TestClass {
    fun foo(catch: String) {
    assertEquals("123", catch)
    testRenamed("catch", { catch })
}

    fun test() {
        foo("123")
    }
}

fun box(): String {
    TestClass().test()

    return "OK"
}