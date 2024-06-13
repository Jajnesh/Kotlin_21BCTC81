fun main() {
    val instance = User.create()                               //uses default name & age
    println("Name: ${instance.name}, Age: ${instance.age}")
    val instance1 = User.create(name = "Jajnesh")              //uses default age
    println("Name: ${instance1.name}, Age: ${instance1.age}")
    val instance2 = User.create(age = 21)                      //uses default name
    println("Name: ${instance2.name}, Age: ${instance2.age}")
    val instance3 = User.create(name = "Jajnesh", age = 21)    //uses specified value
    println("Name: ${instance3.name}, Age: ${instance3.age}")
}

class User(val name: String, val age: Int) {
    companion object {
        fun create(name: String = "Unknown", age: Int = 18): User {
            return User(name,age)
        }
    }
}