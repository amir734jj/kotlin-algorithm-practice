package tests

import algorithms.LongestCommonSubstring
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class LongestCommonSubstringTest {
    @Test
    fun `test basic logic`() {
        // Arrange
        val str1 = "Hello world!"
        val str2 = "world"

        // Act
        val result = LongestCommonSubstring.resolve(str1, str2)

        // Assert
        assertEquals("world", result)
    }
}