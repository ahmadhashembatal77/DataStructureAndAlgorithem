package linkedList

/*Second way Reversed*/
/* ______________________________ */
/* __________________________________________________________________________ */
fun <T> LinkedList<T>.printInReverseM() {
    this.nodeAt(0)?.printInReverse()
}

fun <T> Node<T>.printInReverse() {
    this.next?.printInReverse()
    if (this.next != null) {
        print(" -> ")
    }
    print(this.value.toString())
}

/*Get Middle*/
/* ______________________________ */
/* __________________________________________________________________________ */

fun <T> LinkedList<T>.getMiddle(): T? {
    var slow = this.nodeAt(0)
    var fast = this.nodeAt(0)

    while (fast != null) {
        fast = fast.next
        if (fast != null) {
            fast = fast.next
            slow = slow?.next
        }
    }
    return slow?.value
}

/* Third way Reversed */
/* ______________________________ */
/* __________________________________________________________________________ */
fun <T> LinkedList<T>.reversedExtension(): LinkedList<T> {
    val result = LinkedList<T>()
    val head = this.nodeAt(0)
    if (head != null)
        addInReverse(result, head)
    return result
}

private fun <T> addInReverse(list: LinkedList<T>, node: Node<T>) {
    val next = node.next
    if (next != null)
        addInReverse(list, next)
    list.append(node.value)
}

/* Merging tow List */
/* ______________________________ */
/* __________________________________________________________________________ */
fun <T : Comparable<T>> LinkedList<T>.mergeSorted(
    otherList: LinkedList<T>
): LinkedList<T> {

    val result = LinkedList<T>()
    var left = nodeAt(0)
    var right = otherList.nodeAt(0)

    if (this.isEmpty()) return otherList
    if (otherList.isEmpty()) return this

    while (left != null && right != null){
        if(left.value < right.value)
            left = append(result, left)
        else right = append(result, right)
    }

    while (left != null)
        left = append(result, left)

    while (right != null)
        right = append(result, right)

    return result
}

private fun <T : Comparable<T>> append(
    result: LinkedList<T>,
    node: Node<T>
): Node<T>? {
    result.append(node.value)
    return node.next
}

























