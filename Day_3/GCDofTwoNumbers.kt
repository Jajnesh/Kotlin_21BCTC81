fun main() {
    val num1 = 20
    val num2 = 12

    var firstNum = num1
    var secondNum = num2
    var temp = 0

    // iterative formula -> num1 = num2 * quotient + remainder
    // keep changing num1 & num2 to get num2 as 0 and num1 as gcd at final iteration
    while (secondNum != 0){
        temp = firstNum
        firstNum = secondNum
        secondNum = temp % secondNum
    }

    print("GCD of $num1 and $num2 is $firstNum")
}