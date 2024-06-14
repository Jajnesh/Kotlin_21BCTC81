fun main() {
    val textList = listOf("you", "your", "yourself", "yours", "youth")

    val processedList = processList(textList)
    println(processedList)
}

fun processList(textList: List<String>): List<String> {
    val processList = textList.filter {
        it.contains("rs")
    }
    return processList
}
