fun main() {
    val length = 6.toDouble()
    val breadth = 5.toDouble()
    val rectangleArea = calculateArea(length,breadth)
    println("Area of rectangle (l = $length, b = $breadth) = $rectangleArea")

    val radius = 4.toDouble()
    val circleArea = calculateArea(radius)
    println("Area of circle (r = $radius) = $circleArea")
}

fun calculateArea (length: Double,breadth: Double): Double = length * breadth

fun calculateArea (radius: Double): Double = 3.14 * radius * radius