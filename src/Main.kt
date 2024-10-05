/**
 * This file demonstrates how to handle multiple interfaces with the same concrete member functions in Kotlin.
 *
 * A class or object can implement multiple interfaces, and interfaces can have concrete member functions.
 * If two or more interfaces contain concrete member functions with the same signature, the implementing class must
 * provide its own implementation of the conflicting function. This is done using the `override` keyword.
 *
 * The `super<InterfaceName>.functionName()` syntax can be used to call the specific function from a particular interface.
 */

// Define the Speaker interface with an abstract function and a concrete function
interface Speaker {
    fun saySomething()

    // Concrete member function
    fun sayHello() {
        println("Speaker - Hello World")
    }
}

// Define the Translator interface with a concrete function that conflicts with Speaker
interface Translator {
    fun sayHello() {
        println("Translator - Bonjour")
    }
}

// Define a class Employee that implements both Speaker and Translator interfaces
class Employee : Speaker, Translator {

    // Implement the abstract function from Speaker
    override fun saySomething() {
        println("Employee - Say Something")
    }

    // Override the conflicting sayHello() function to resolve ambiguity
    override fun sayHello() {
        // Call the sayHello() function from the Speaker interface
        super<Speaker>.sayHello()
    }
}

fun main() {
    // Create an instance of Employee and call its functions
    val e = Employee()
    e.sayHello()        // Calls Speaker's sayHello()
    e.saySomething()    // Calls Employee's saySomething()
}

/*
 * Output:
 * Speaker - Hello World
 * Employee - Say Something
 */

/**
 * Explanation:
 *
 * - The `Speaker` interface defines an abstract function `saySomething()` and a concrete function `sayHello()`.
 * - The `Translator` interface also defines a concrete function `sayHello()` with the same signature as in `Speaker`.
 * - The `Employee` class implements both `Speaker` and `Translator`. Since both interfaces have a concrete `sayHello()` function,
 *   the `Employee` class must override `sayHello()` to resolve the conflict.
 * - The overridden `sayHello()` in `Employee` calls the `sayHello()` function from the `Speaker` interface using `super<Speaker>.sayHello()`.
 * - The `main()` function demonstrates calling the overridden `sayHello()` and `saySomething()` functions in `Employee`.
 */

/**
 * Explanation:
 * Multiple Interfaces with Conflicting Functions:
 *
 * The Speaker and Translator interfaces both define a concrete function sayHello() with the same signature but different behavior.
 * Implementing Class (Employee):
 *
 * The Employee class implements both Speaker and Translator interfaces.
 * The compiler requires Employee to override the conflicting sayHello() function to resolve ambiguity.
 * In the overridden sayHello() function, the implementation from Speaker is called using the super<Speaker>.sayHello() syntax.
 * Output:
 *
 * The main() function creates an instance of Employee and calls sayHello() (which invokes Speaker's sayHello()) and saySomething() (defined in Employee).
 * This class.kt file provides a clear example of how to handle multiple interfaces with conflicting concrete member functions in Kotlin, with explanations on how to use the super<InterfaceName>.functionName() syntax to specify the desired implementation.
 */