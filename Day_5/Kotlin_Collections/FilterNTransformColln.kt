fun main() {
    val numList = listOf(1,2,3,4,5,6,7,8,9,10)

    // filter out odds and double the evens
    val customList = numList.filter { it % 2 == 0 }.map { it * 2 }
    println(customList)
}