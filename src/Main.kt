/**
 * This file demonstrates:
 * 1. How anonymous objects can inherit from an open class in Kotlin.
 * 2. How every class in Kotlin implicitly inherits from the `Any` class, the root of the Kotlin class hierarchy.
 */

// Open class that can be inherited
open class LogIt {
    fun log() = println("log")
}

fun main() {
    // Anonymous object extending the `LogIt` class
    val obj = object : LogIt() {
        var x: Int = 0
        val y: Int = 42
    }

    // Accessing properties of the anonymous object
    println("Anonymous object properties -> obj.x = ${obj.x}, obj.y = ${obj.y}")

    // Calling the inherited `log()` function from the `LogIt` class
    obj.log()

    // Demonstrating class inheritance from Any
    val user = User("John", 30)

    // Methods inherited from Any
    println("\nClass User implicitly inherits from Any")
    println("User's toString: ${user.toString()}")
    println("User's hashCode: ${user.hashCode()}")
    println("Comparing user object to itself using equals: ${user.equals(user)}")
}

/**
 * A simple class representing a User, with implicit inheritance from Any.
 *
 * Every class in Kotlin that does not explicitly inherit from another class
 * automatically inherits from the `Any` class, which is the root class.
 */
class User(val name: String, val age: Int)
// The above class implicitly extends Any, which is equivalent to:
// class User(val name: String, val age: Int) : Any()

/*
 * Output:
 *
 * Anonymous object properties -> obj.x = 0, obj.y = 42
 * log
 *
 * Class User implicitly inherits from Any
 * User's toString: User@3ac3fd8b  // toString prints class name and hashCode by default
 * User's hashCode: 984847019  // Example of hashCode output
 * Comparing user object to itself using equals: true
 */

/**
 * Explanation:
 *
 * 1. **Anonymous Objects and Inheritance**:
 *    - The anonymous object in `main()` extends the `LogIt` class and inherits the `log()` method.
 *    - The object defines its own properties `x` and `y`.
 *    - The anonymous object uses both its own properties and the inherited `log()` method from `LogIt`.
 *
 * 2. **Class `Any` and Inheritance**:
 *    - The `User` class does not explicitly specify a superclass, so it implicitly extends `Any`, the root class in Kotlin.
 *    - Every class in Kotlin inherits methods from `Any`, such as `toString()`, `hashCode()`, and `equals()`.
 *    - The `Any` class provides basic functionality that is available to all Kotlin classes.
 */
