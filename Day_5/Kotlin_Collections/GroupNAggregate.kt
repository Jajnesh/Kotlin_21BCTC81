fun main() {
    val textList = listOf("Apple", "Mango", "Orange", "Apricot", "Avocado", "Mulberry")

    val groupedMap = textList.groupBy { it.first() }
    println(groupedMap)

    val groupedMapCount = textList.groupingBy { it.first() }.eachCount()
    println(groupedMapCount)
}
