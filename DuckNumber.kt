fun main() {
    val num: String = "01203" //need to use string to consider leading 0s
    var index = 0
    var isDuck = false

    // ignore leading 0s
    while (index < (num.length)) {
        if (num[index] == '0')
            index++
        else
            break
    }

    while (index < (num.length - 1)) {
        if (num[index] == '0') {
            isDuck = true
            break
        }
        index++
    }

    if (isDuck) println("$num is duck number.") else println("$num is not duck number.")
}