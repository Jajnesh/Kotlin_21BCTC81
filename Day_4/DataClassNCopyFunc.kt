fun main() {
    val person1 = Person("Jajnesh",21,"India")
    val person2 = person1.copy(name = "Space" , age = 25, address = "Indonesia")

    println(person1)
    println(person2)
}

data class Person (val name: String, val age: Int, val address: String)