fun main() {
    val numList1 = listOf(1,3,5,7,4,9,8,4)
    val numList2 = listOf(7,2,4,6,8,10)

    val intersectList = intersectionOfLists(numList1, numList2)
    println("Intersection of lists: $intersectList")

    val unionList = unionOfLists(numList1, numList2)
    println("Union of lists: $unionList")
}

fun intersectionOfLists (numList1: List<Int>, numList2: List<Int>): List<Int> {
    return numList2.intersect(numList1).distinct().sorted()
}

fun unionOfLists (numList1: List<Int>, numList2: List<Int>): List<Int> {
    return numList2.union(numList1).distinct().sorted()
}