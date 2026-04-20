object DatabseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) {
            UserProfile("TestUser", "test@test.com")
        } else {
            null
        }
    }
}

fun runMockUnitTest(){
    println("\n=== Running Unit Test ===")
    val testUser = DatabseMock.findUser(1)

    val initial = testUser!!.name.substring(0, 1)

    check(initial == "T") { "Test failed: Expected initial is wrong" }
    println("Test passed: Initial is T")
}