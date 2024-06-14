import kotlin.math.max
import kotlin.math.min

fun main() {
    val numList1 = listOf(1,4,9,8,4)
    val numList2 = listOf(7,2,4)

    println("Original List-1: $numList1")
    println("Original List-2: $numList2")

    val mergedList = processList(numList1,numList2)
    println("Merged List: $mergedList")
}

fun processList (numList1: List<Int>, numList2: List<Int>): List<Int> {
    var processedList = mutableListOf<Int>()

    val min = min(numList1.size, numList2.size)
    val max = max(numList1.size, numList2.size)

    for (i in 0..< min) {
        processedList = (processedList + numList1[i]).toMutableList()
        processedList = (processedList + numList2[i]).toMutableList()
    }

    val maxList = if (numList1.size == max) numList1 else numList2

    for (i in min..< max) {
        processedList = (processedList + maxList[i]).toMutableList()
    }

    return processedList
}