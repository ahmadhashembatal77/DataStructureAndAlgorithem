package sorting.bubble_sort

import sorting.utils.swapAt

/* 10 8 11 6 9 */
/*

1.1 : end = 4 , current = 0 current+1 = 1 list[0] = 10 list[1] = 8
  [8 10] 11 6 9

1.2 : end = 4 , current = 1 current+1 = 2 list[1] = 10 list[2] = 11
  8 [10 11] 6 9

1.3 : end = 4 , current = 2 current+1 = 3 list[2] = 11 list[3] = 6
 8 10 [6 11] 9

1.4 : end = 4 , current = 3 current+1 = 4 list[3] = 9 list[4] = 11
 8 10 6 [9 11]

.............................
2.1 : end = 4 , current = 0 current+1 = 1 list[0] = 10 list[1] = 8
 8 10 6 9 11


 will take in worst case O(n^2) so bad,making it one of the least appealing sorts
*/

fun <T : Comparable<T>>MutableList<T>.bubbleSort() {
    /*    ^ I don't understand how Comparable work in kotlin */
    if (this.size < 2) return
    for (end in (1 until this.size).reversed()) {
        var swapped = false
        for (current in 0 until end) {
            if (this[current] > this[current + 1]) {
                this.swapAt(current, current + 1)
                swapped = true
            }
        }
        println(this)
        if (!swapped) return
    }
}