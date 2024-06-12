fun main() {
    val maxRow = 10
    //pyramid
    for (i in 1..maxRow/2){
        for (j in 1..maxRow/2 - i) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
    //inverted pyramid
    for (i in maxRow/2 downTo 1) {
        for (j in 1..maxRow/2 - i) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
}