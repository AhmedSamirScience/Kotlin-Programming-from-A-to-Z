/**
 * This file demonstrates the concept of anonymous objects in Kotlin.
 *
 * Anonymous objects are created at the point of use and do not have a name.
 * They cannot be referenced elsewhere in the program but can have all the features of a named object.
 * These features include member properties, member functions, `init` blocks, and a `toString()` method.
 * Anonymous objects do not explicitly add a new type to the type system.
 */

fun main() {
    // Defines a new anonymous object
    val obj = object {
        var x: Int = 0
        val y: Int = 42
        val MAX: Int

        // Initialization block
        init {
            MAX = 100
        }

        // Member function
        fun printMe() {
            println("Print Me")
        }

        // Override toString method
        override fun toString(): String {
            return "Anonymous Object with x=$x, y=$y, MAX=$MAX"
        }
    }

    // Use the single instance of the anonymous object
    println(obj) // Calls the overridden toString() method
    println("MAX: ${obj.MAX}")
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
    obj.x = 50
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
    obj.printMe()
}

/*
 * Output:
 * Anonymous Object with x=0, y=42, MAX=100
 * MAX: 100
 * obj.x = 0, obj.y = 42
 * obj.x = 50, obj.y = 42
 * Print Me
 */

/**
 * In this example:
 *
 * - An anonymous object is created and assigned to the `val obj`.
 * - The object has three properties: `x`, `y`, and `MAX`. The `MAX` property is initialized within an `init` block.
 * - The object also has a `printMe()` function and an overridden `toString()` method.
 * - The object's properties and functions are accessed using the `obj` reference.
 *
 * Since it's an anonymous object, the reference to the object (`obj`) can only be used within the scope where it was created.
 */

/**
 * Explanation:
 * Anonymous Object:
 * The object is defined inline with the object keyword and assigned to val obj.
 * It has properties (x, y, and MAX), an initialization block (init), a method (printMe()), and an overridden toString() method.
 * Usage:
 * The properties and methods of the anonymous object are accessed through obj.
 * Since it's anonymous, obj can only be used within the same scope where the object was created.
 * Output:
 * The program prints out the results of calling toString() on the anonymous object, as well as the values of its properties and the result of calling printMe().
 * This class.kt file represents a complete example of how to define and use an anonymous object in Kotlin, along with detailed explanations in comments.
 */
