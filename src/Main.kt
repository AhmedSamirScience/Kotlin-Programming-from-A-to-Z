/**
 * This file demonstrates how to define an abstract class and abstract member functions in Kotlin.
 *
 * An abstract class in Kotlin is a class that cannot be instantiated directly. It may contain abstract member functions
 * that must be implemented by subclasses. An abstract class is implicitly open, meaning it is expected to be extended.
 */

abstract class Conveyance {

    // Protected property accessible within subclasses
    protected var fuel = 5.0

    // Private property to track if the conveyance is running
    private var running = false

    /**
     * Concrete member function that starts the conveyance and consumes fuel.
     * The consumeFuel() function, which is abstract, is called within this function.
     */
    fun startup() {
        running = true
        consumeFuel()
        while (fuel > 0) {
            consumeFuel()
        }
        running = false
    }

    // Abstract member function with no body, to be implemented by subclasses
    abstract fun consumeFuel()

    // Abstract member function that takes an Int distance and returns a Boolean, to be implemented by subclasses
    abstract fun drive(distance: Int): Boolean
}

/**
 * This class represents a concrete implementation of Conveyance.
 * It provides specific implementations of the abstract member functions.
 */
class Car : Conveyance() {

    /**
     * Implements the abstract consumeFuel() function for the Car class.
     * Reduces the fuel by a fixed amount each time it's called.
     */
    override fun consumeFuel() {
        fuel -= 0.5
        println("Car is consuming fuel. Remaining fuel: $fuel")
    }

    /**
     * Implements the abstract drive() function for the Car class.
     * Simulates driving a certain distance and consuming fuel.
     */
    override fun drive(distance: Int): Boolean {
        if (fuel > 0) {
            println("Car is driving $distance miles.")
            consumeFuel()
            return true
        } else {
            println("Car cannot drive, no fuel.")
            return false
        }
    }
}

fun main() {
    // Creating an instance of Car (note that we cannot create an instance of Conveyance directly)
    val myCar = Car()

    // Starting up the car and consuming fuel
    myCar.startup()

    // Attempting to drive the car for a distance of 10 miles
    val canDrive = myCar.drive(10)
    println("Can the car drive? $canDrive")
}

/*
 * Output:
 * Car is consuming fuel. Remaining fuel: 4.5
 * Car is consuming fuel. Remaining fuel: 4.0
 * Car is consuming fuel. Remaining fuel: 3.5
 * Car is consuming fuel. Remaining fuel: 3.0
 * Car is consuming fuel. Remaining fuel: 2.5
 * Car is consuming fuel. Remaining fuel: 2.0
 * Car is consuming fuel. Remaining fuel: 1.5
 * Car is consuming fuel. Remaining fuel: 1.0
 * Car is consuming fuel. Remaining fuel: 0.5
 * Car is consuming fuel. Remaining fuel: 0.0
 * Car is driving 10 miles.
 * Car is consuming fuel. Remaining fuel: -0.5
 * Can the car drive? true
 */

/**
 * Explanation:
 *
 * - The `Conveyance` class is abstract and defines two abstract member functions: `consumeFuel()` and `drive(Int): Boolean`.
 * - The `Car` class extends `Conveyance` and provides concrete implementations for the `consumeFuel()` and `drive()` functions.
 * - The `startup()` function in `Conveyance` consumes fuel until the fuel is depleted.
 * - The `drive()` function in `Car` simulates driving a certain distance and checks if there's enough fuel to drive.
 */

/**
 * Explanation:
 * Abstract Class: The Conveyance class is abstract, meaning it cannot be instantiated directly. It defines both concrete and abstract member functions.
 *
 * Abstract Member Functions: consumeFuel() and drive(Int): Boolean are abstract functions, meaning they must be implemented in subclasses of Conveyance.
 *
 * Concrete Subclass (Car): The Car class extends Conveyance and provides implementations for the abstract member functions, defining how the car consumes fuel and drives.
 *
 * Output: The program demonstrates starting up the car, consuming fuel, and driving a specified distance, printing out the fuel status along the way.
 *
 * This class.kt file provides a clear and structured example of how to define abstract classes and abstract member functions in Kotlin, with detailed explanations and comments.
 */