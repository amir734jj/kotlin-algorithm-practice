package algorithms
import tests.algorithms.TreeNode
import java.util.*

interface IBfsTraverse<T> : Iterator<T>

class BfsTraverse<T>(root: TreeNode<T>) : IBfsTraverse<T> {
    private var _queue: Queue<TreeNode<T>> = LinkedList()
    private var _root: TreeNode<T> = root
    var currentValue = _root.value

    init {
        _queue.add(root)
    }

    override fun next(): T {
        val element = _queue.poll()
        currentValue = element.value

        if (element.left != null) {
            _queue.add(element.left)
        }

        if (element.right != null) {
            _queue.add(element.right)
        }

        return currentValue
    }

    override fun hasNext(): Boolean {
        return _queue.size != 0
    }
}