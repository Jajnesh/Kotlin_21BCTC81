fun main() {
    val number = 20
    val result = factorial(number)
    println("Factorial of $number is $result")
}

tailrec fun factorial(num: Int,fact: Long = 1): Long {
    return if (num <= 1) fact else factorial(num - 1, num * fact)
}
