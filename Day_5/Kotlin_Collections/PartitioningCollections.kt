fun main() {
    val numList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Original list: $numList")

    val nestList = partionList(numList)

    println("Even list: ${nestList[0]}")
    println("Odd list: ${nestList[1]}")
}

fun partionList(numList: List<Int>): List<List<Int>> {
    val evenList = numList.filter { it % 2 == 0 }
    val oddList = numList.filter { it % 2 != 0 }
    val tempList = listOf(evenList, oddList)

    return tempList
}