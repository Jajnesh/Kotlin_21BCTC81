fun main() {
    val square = Square(5.0)
    square.draw()
    square.resize(1.5)

    val triangle = Triangle(3.0,4.0)
    triangle.draw()
    triangle.resize(2.0)
}

interface Drawable {
    fun draw ()
    fun resize(resizeBy: Double)
}

class Square (var length: Double): Drawable {
    override fun draw() {
        println("Drawing a square with side = $length units.")
    }

    override fun resize(resizeBy: Double) {
        length *= resizeBy
        println("Resized sides of square to $length")
    }
}

class Triangle (var base: Double, var height: Double): Drawable {
    override fun draw() {
        println("Drawing a triangle with base = $base and height = $height.")
    }

    override fun resize(resizeBy: Double) {
        base *= resizeBy
        height *= resizeBy
        println("Resized base & height of triangle to $base units & $height units respectively.")
    }
}