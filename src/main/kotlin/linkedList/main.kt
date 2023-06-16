package linkedList

fun main() {

    val read = readln()
    val x = read.toInt()

    val list = LinkedList<Int>()
    list.add(0)
    list.add(2)
    list.add(4)
    list.add(6)
    list.add(8)
    list.add(10)


    val listForMerge1 = LinkedList<Int>()
    listForMerge1.add(1)
    listForMerge1.add(2)
    listForMerge1.add(4)
    listForMerge1.add(6)
    listForMerge1.add(8)
    listForMerge1.add(10)

    val listForMerge2 = LinkedList<Int>()
    listForMerge2.add(1)
    listForMerge2.add(3)
    listForMerge2.add(5)
    listForMerge2.add(7)
    listForMerge2.add(9)
    listForMerge2.add(11)


    val listPushAndPop = LinkedList<String>()
    listPushAndPop.push("A")
    listPushAndPop.push("B")
    listPushAndPop.push("C")
    listPushAndPop.push("D")
    listPushAndPop.push("E")
    listPushAndPop.push("C")
    listPushAndPop.pop()

    val listAddAll = LinkedList<Int>()
    listAddAll.addAll(list)


        when (x) {
            /* Merge two LinkedList */
            10 -> {
                println(listForMerge1.mergeSorted(otherList = listForMerge2))
            }
            /* Push And Pop */
            11 ->{
                println(listPushAndPop)
            }
            /* Clear */
            12 ->{
                println(listPushAndPop.clear())
            }
            /* Add All Elements List */
            13 -> {
                println(listAddAll)
            }
            /*  you can continue if you want  */
        }









//    println(list2.reversedExtension())
//
//    println(list2)
    // if you want to print the list
    // you will use

    /*
    for(i in 0..10)
    {
        list[i]
    }
    */

    // but there is an easy way to do this

    /*
    for(item in list){
        println(item)
    }
    */

    // I know you know there is an easy way, but you can't use without [iterator]
}
