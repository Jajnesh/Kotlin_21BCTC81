fun main() {
    val numList1 = listOf(1,3,5,7,9)
    val numList2 = listOf(2,4,6,8,10)
    val numList3 = listOf(11,12,13,14,15)

    val numList = listOf(numList1,numList2,numList3)
    println(flattenNestedList(numList))
}

fun flattenNestedList (num: List<List<Int>>): List<Int> {
    val newList = mutableListOf<Int>()
    for (numList in num){
        for (it in numList){
            if (it in newList) continue else newList.add(it)
        }
    }
    return newList
}