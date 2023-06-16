package sorting.selection_sort

import sorting.utils.swapAt

fun <T : Comparable<T>> MutableList<T>.selectionSort() {
    if (this.size < 2) return

    for (current in 0 until (this.size - 1)) {
        var lowest = current
        for (other in (current + 1) until this.size) {
            if (this[lowest] > this[other]) {
                lowest = other
            }
        }
        if (lowest != current) { this.swapAt(lowest, current) }
    }
    println(this)
}