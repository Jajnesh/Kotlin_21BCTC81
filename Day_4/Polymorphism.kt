fun main() {
    val rectangle = Rectangle(6,7)
    println("Area of rectangle is ${rectangle.area()}")
    println("Perimeter of rectangle is ${rectangle.perimeter()}")

    val circle = Circle(6)
    println("Area of circle is ${circle.area()}")
    println("Perimeter of circle is ${circle.perimeter()}")
}

abstract class Shape {
    abstract fun area (): Double
}

class Rectangle (var length: Int, var breadth: Int): Shape() {
    override fun area (): Double {
        return (length * breadth).toDouble()
    }

    fun perimeter (): Int {
        return (length + breadth) * 2
    }
}

class Circle (var radius: Int): Shape() {
    override fun area (): Double {
        return (3.14 * radius * radius)
    }

    fun perimeter (): Double {
        return 2 * 3.14 * radius
    }
}