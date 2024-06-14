fun main() {
    val p1 = Persona("Shiuli", 27)
    val p2 = Persona("Jajnesh", 21)
    val p3 = Persona("Pinwi", 27)
    val p4 = Persona("Doden", 25)

    var personList = listOf(p1,p2,p3,p4)

    // sortedWith takes a comparator
    // compareBy take parameters based on which sorting can be done
    // these parameters are evaluated sequentially
    personList = personList.sortedWith(compareBy({it.age},{it.name}))
    println(personList)
}

data class Persona (var name: String,var age: Int)