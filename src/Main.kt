/**
 * This file demonstrates the use of concrete member functions in interfaces in Kotlin.
 *
 * An interface in Kotlin can contain both abstract and concrete member functions.
 * - Abstract member functions must be implemented by any class or object that implements the interface.
 * - Concrete member functions are inherited by the implementing class or object and can be used as-is or overridden if needed.
 */

// Define the Speaker interface with one abstract and one concrete member function
interface Speaker {
    // Abstract member function
    fun saySomething()

    // Concrete member function with a default implementation
    fun sayHello() {
        println("Speaker - Hello World")
    }
}

// Define a class Person that implements the Speaker interface
class Person : Speaker {

    // Provide an implementation for the abstract saySomething() function
    override fun saySomething() {
        println("Person - Howdy")
    }
}

fun main() {
    // Create an instance of Person
    val p = Person()

    // Call the inherited concrete function from Speaker
    p.sayHello()

    // Call the overridden abstract function from Speaker
    p.saySomething()
}

/*
 * Output:
 * Speaker - Hello World
 * Person - Howdy
 */

/**
 * Explanation:
 *
 * - The `Speaker` interface defines an abstract member function `saySomething()` and a concrete member function `sayHello()`.
 * - The `Person` class implements the `Speaker` interface, inheriting the concrete `sayHello()` function and providing an implementation for the abstract `saySomething()` function.
 * - The `main()` function demonstrates creating an instance of `Person` and calling both functions.
 */

/**
 * Explanation:
 * Concrete and Abstract Functions in Interfaces:
 *
 * The Speaker interface defines one abstract member function saySomething() and one concrete member function sayHello(). Any class implementing this interface must provide an implementation for the abstract function but can use the concrete function as-is.
 * Class Implementation (Person):
 *
 * The Person class implements the Speaker interface. It provides an implementation for saySomething() and inherits the concrete sayHello() function without needing to redefine it.
 * Output:
 *
 * The program creates an instance of Person, calls the inherited sayHello() function, and then calls the overridden saySomething() function, printing out "Speaker - Hello World" and "Person - Howdy" respectively.
 * This class.kt file provides a complete example of how to define interfaces with both concrete and abstract member functions in Kotlin, along with detailed comments and explanations.
 */