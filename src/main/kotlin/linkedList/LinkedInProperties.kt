package linkedList

interface LinkedInProperties<T> {

//    fun isEmpty(): Boolean

    fun push(value:T) : LinkedList<T>

    fun append(value :T)

    fun insert(value: T, afterNode: Node<T>): Node<T>

    fun nodeAt(index: Int): Node<T>?

    fun get(index: Int): Any?

    fun pop(): T?

    fun removeLast(): T?

    fun removeLast2(): T?

    fun removeAfter(node: Node<T>): T?

    fun reverse(): Node<T>?
}