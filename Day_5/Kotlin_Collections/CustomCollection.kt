fun main() {
    val numList = StrictListOf (1, 2, 3, 4, 3)
    println(numList.numbers)
    numList.add(5)
    numList.add(6)
    println(numList.numbers)
    numList.remove(2)
    println(numList.numbers)
}

class StrictListOf (vararg nums: Int) {
    var numbers =  nums.toMutableSet().toList()

    fun add (num: Int): List<Int> {
        if (num in numbers){
            return numbers
        }else {
            numbers = numbers + num
            return numbers
        }
    }

    fun remove(num: Int): List<Int> {
        numbers = (numbers - num)
        return numbers
    }
}