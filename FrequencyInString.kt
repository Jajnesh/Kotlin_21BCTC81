fun main() {
    // in this program I haven't taken care of letter casing
    val text = "silicon"
    var count = 0

    for (i in text){
        count = 0
        for (j in text.indices){
            if (i == text[j]){
                count++
            }
        }
        println("Frequency of $i is $count")
    }
}