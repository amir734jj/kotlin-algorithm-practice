package tests

import algorithms.DfsTraverse
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import tests.algorithms.TreeNode

class DfsTraverseTest {
    @Test
    fun `test basic logic`() {
        // Arrange
        val root = TreeNode(
                TreeNode(
                        TreeNode(1),
                        5,
                        TreeNode(2)
                ),
                7,
                TreeNode(
                        TreeNode(3),
                        6,
                        TreeNode(4)
                )
        )

        // Act
        val result = DfsTraverse(root).asSequence().toList()

        // Assert
        assertEquals(listOf(1, 2, 3, 4, 5, 6, 7), result)
    }
}