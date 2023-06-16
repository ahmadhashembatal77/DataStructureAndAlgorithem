package sorting.insertion_sort

import sorting.utils.swapAt

fun <T : Comparable<T>> MutableList<T>.insertionSort() {
    if (this.size < 2) return

    /* 10, 8, 11, 6, 9 */
    for (current in 1 until this.size) {
        for (shifting in (1..current).reversed()) {
            println(this)
            if (this[shifting] < this[shifting - 1]) {
                this.swapAt(shifting, shifting-1)
            }else break
        }
        println("------------------------")
    }
}