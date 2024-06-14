fun main() {
    val numList = listOf(1, 3, 2, 1, 3, 6, 4, 2, 5)
    val fMap = frequencyMap(numList)
    println(fMap)
}

fun frequencyMap(numList: List<Int>): Map <Int, Int> {
    val map = mutableMapOf<Int, Int>()
    for (element in numList) {
        if (element in map) map[element] = map[element]!! + 1 else map[element] = 1
    }
    return map
}
