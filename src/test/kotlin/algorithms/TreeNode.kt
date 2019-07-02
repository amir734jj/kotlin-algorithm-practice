package tests.algorithms

class TreeNode<T>(var value: T) {

    constructor(left: TreeNode<T>?, value: T, right: TreeNode<T>?) : this(value) {
        this.left = left
        this.right = right
    }

    var left: TreeNode<T>? = null
    var right: TreeNode<T>? = null
}