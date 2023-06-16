package sorting

import sorting.bubble_sort.bubbleSort
import sorting.insertion_sort.insertionSort
import sorting.merg_sort.mergeSort
import sorting.selection_sort.selectionSort

fun main() {

    /* bubble sort */
    val list = arrayListOf(10, 8, 11, 6, 9)
    list.bubbleSort()

    /* selection sort */
//    val list2 = arrayListOf(10, 8, 11, 6, 9)
//    println(list2.mergeSort())

//    val list = mutableListOf(1,6,7,4,8,2,9)
//    println(list.sorted())
}