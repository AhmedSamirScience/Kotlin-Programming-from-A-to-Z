/**
 * This file demonstrates how to subclass an abstract class in Kotlin.
 *
 * When subclassing an abstract class, we use the `:` symbol to represent inheritance and
 * must provide concrete implementations for any abstract member functions in the parent class.
 * The `override` keyword is used to implement abstract functions from the parent class.
 */

// Abstract class Conveyance with abstract functions
abstract class Conveyance {

    protected var fuel = 5.0

    // Abstract function to be implemented by subclasses
    abstract fun consumeFuel()

    // Abstract function to be implemented by subclasses
    abstract fun drive(distance: Int): Boolean

    // Concrete function available to all subclasses
    fun startup() {
        while (fuel > 0) {
            consumeFuel()
        }
    }
}

// Concrete class Car that extends the abstract class Conveyance
class Car : Conveyance() {

    // Override and implement the consumeFuel() function
    override fun consumeFuel() {
        fuel -= 1.0
        println("consuming, remaining fuel: $fuel")
    }

    // Override and implement the drive() function
    override fun drive(distance: Int): Boolean {
        println("Driven $distance miles")
        return true
    }
}

fun main() {
    // Create an instance of Car and treat it as a Conveyance
    val c: Conveyance = Car()

    // Start the car and consume fuel
    c.startup()

    // Drive the car for a distance of 10 miles
    val result = c.drive(10)
    println(result)
}

/*
 * Output:
 * consuming, remaining fuel: 4.0
 * consuming, remaining fuel: 3.0
 * consuming, remaining fuel: 2.0
 * consuming, remaining fuel: 1.0
 * consuming, remaining fuel: 0.0
 * Driven 10 miles
 * true
 */

/**
 * Explanation:
 *
 * - The `Conveyance` class is an abstract class with two abstract functions: `consumeFuel()` and `drive(Int): Boolean`.
 * - The `Car` class subclasses `Conveyance` and provides concrete implementations for the abstract functions.
 * - The `consumeFuel()` function decreases the `fuel` property, and the `drive()` function simulates driving a given distance.
 * - The `main()` function demonstrates creating an instance of `Car`, invoking `startup()` to consume fuel, and then calling the `drive()` function.
 */

/**
 * Explanation:
 * Abstract Class: The Conveyance class defines two abstract functions: consumeFuel() and drive(Int): Boolean. Subclasses must provide implementations for these functions.
 *
 * Concrete Subclass (Car): The Car class extends Conveyance and provides concrete implementations for the abstract functions. It overrides the consumeFuel() function to decrease fuel and the drive() function to simulate driving a specific distance.
 *
 * Output: The program demonstrates starting up the car, consuming fuel, and driving a specified distance, printing out the fuel status along the way.
 *
 * This class.kt file provides a clear example of how to subclass an abstract class in Kotlin, including how to override and implement abstract member functions. The comments explain the key concepts and behavior.
 */