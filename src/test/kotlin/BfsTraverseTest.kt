package tests

import algorithms.BfsTraverse
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import tests.algorithms.TreeNode

class BfsTraverseTest {
    @Test
    fun `test basic logic`() {
        // Arrange
        val root = TreeNode(
                TreeNode(
                        TreeNode(4),
                        2,
                        TreeNode(5)
                ),
                1,
                TreeNode(
                        TreeNode(6),
                        3,
                        TreeNode(7)
                )
        )

        // Act
        val result = BfsTraverse(root).asSequence().toList()

        // Assert
        assertEquals(listOf(1, 2, 3, 4, 5, 6, 7), result)
    }
}