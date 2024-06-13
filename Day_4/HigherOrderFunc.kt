fun main() {
    val num1 = 2
    val num2 =4
    val result = operation(::add, num1, num2)     //higher-order function call
    println("Sum of $num1 and $num2 = $result")
}

fun add (num1: Int, num2: Int): Int = num1 + num2  //normal function

//higher-order function that accepts a function add and 2 integers and returns sum
fun operation (add: (Int, Int) -> Int, num1: Int, num2: Int): Int {
    val sum = add(num1, num2)
    return sum
}