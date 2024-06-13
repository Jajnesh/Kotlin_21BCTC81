fun main() {
    val text = "Malayalam"
    println("$text is a palindrome. -> ${text.isPalindrome()}")
}

// An extension function, isPalindrome, of class String
fun String.isPalindrome(): Boolean {
    return this.lowercase() == this.lowercase().reversed()
}