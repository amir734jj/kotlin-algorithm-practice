package algorithms
import tests.algorithms.TreeNode
import java.util.Stack

interface IDfsTraverse<T> : Iterator<T>

class DfsTraverse<T>(root: TreeNode<T>) : IDfsTraverse<T> {
    private var _stack: Stack<TreeNode<T>> = Stack()
    private var _root: TreeNode<T> = root
    var currentValue = _root.value

    init {
        _stack.add(root)
    }

    override fun next(): T {
        val element = _stack.pop()
        currentValue = element.value

        if (element.right != null) {
            _stack.push(element.right)
        }

        if (element.left != null) {
            _stack.push(element.left)
        }

        return currentValue
    }

    override fun hasNext(): Boolean {
        return _stack.size != 0
    }
}