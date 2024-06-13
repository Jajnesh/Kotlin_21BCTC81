# Day-4 
## Function :-
> Block of code to perform a specific task.

Default return type is Unit.

### Default Argument :-
> A default value assigned to an argument which is used when no value is passed to function.
fun printNum(num1: Int = 3)

### Named Argument :-
> Name of parameter is used while passing value to function.
printNum(num1 = 5)
It allows to pass arguments in any order
It increases readability of code

### varargs parameters :-
> Function can accept any number of arguments.
fun add(vararg number: Int)

### Single expression fuctions :-
> Can be used when only single expression or one return statement is present
fun add(num1: Int, num2: Int): Int = a + b

## Object :-
> Any real-world object.
val obj = Classname(args)

## Class :-
> Blueprint of an object.
class Classname (properties) { methods }

### Properties :-
> specifications of the object.
(var name: String)
Always use var as we need to initialize the properties.

### Methods :-
> functionalities of the object.
func add()

### Constructors :-
> Primary constructors - field of properties.
It is used to initialise objects.
Default values can be assigned.

> Secondary constructors - defined inside class itself.
constructor (name: String): this(name) {}
Any number of secondary constructors can defined.
Always need to use primary constructor to define a secondary constructor.

> Class with no constructor - All initialisation done inside class

### Inheritance :-
> Inheriting properties and methods of parent class to child class.
All classes in kotlin are final by default.
In order to inherit from a class we need to use 'open' keyword to both class and its methods.
open class Classname (properties) {}
Methods in parent class can be overridden in child classes.
Kotlin does not support multiple inheritance.

### Abstract classes :-
> Class with abstract properties and methods.
It cannot be instantiated.
These properties & methods cannot be initialised in abstract class itself.
When inheriting from an abstact class we need to implement all the abstract methods in child class.

### Interface :-
> An interface can contain both abstract methods and normal methods.
It lets achieve multiple inheritance in kotlin.

### Data Class & Copy Function :-
> Data class helps to hold data throughout the whole operation of application.(Ex - User data)
data class Classname (properties)
Implementation in API model.

> in-built methods - copy(), toString(), equals(), hashCode(), etc.

> Copy function helps to copy data from one object to another.
person2 = person1.copy(properties)

### Companion Object & Factory Method :-
> An object made with 'object' keyword is singleton.
> Campanion object is a singleton object that shares instance of the class it is defined in.
> Factory methods are object creation methods. (fun create())
class Classname() {
    companion object {
        factory methods
    }
}

### Getters & Setters :-
> Getters are used to fetch the values of properties of a class in a controlled manner.
main() {
    val c = Circle (5.0)
    println(${c.circum})
}
class Circle (radius) {
    val circum: Double
        get() = 2 * 3.14 * radius
}
(Here whenever object is created or value of radius is changed, the get function assigns appropriate value to circum.)

> Setters are used to set appropriate values of properties.
'value' - used to accept value for property
'field' - denotes the current setting value of the property
var age:Int = 0
    set (value) {
        if (value > 0) field = value else "reject message"
    }