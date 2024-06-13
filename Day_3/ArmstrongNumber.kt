import kotlin.math.pow

fun main() {
    val number = 153
    var temp = number
    var sum = 0

    while (temp > 0) {
        sum += (temp % 10).toDouble().pow(3.0).toInt()
        temp /= 10
    }

    if (sum == number) println("$number is an armstrong number.") else println("$number is not an armstrong number.")
}