package tests

import algorithms.SieveOfEratosthenes
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SieveOfEratosthenesTest {
    @Test
    fun `test basic logic`() {
        // Arrange, Act
        val result: Array<Int> = SieveOfEratosthenes.resolve(5)

        // Assert
        assertTrue { result.count() == 2 && result.contains(2) && result.contains(3) }
    }
}