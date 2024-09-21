/**
 * This file demonstrates how to define abstract subclasses in Kotlin.
 *
 * A subclass of an abstract class may itself be abstract. This happens when:
 * - The subclass defines one or more abstract members (properties or functions), or
 * - The subclass does not implement one or more of the abstract members inherited from the parent class.
 *
 * An abstract subclass must be marked as `abstract`.
 */

// Abstract class CommercialVehicle with an abstract property and an abstract function
abstract class CommercialVehicle {

    // Abstract property that must be implemented by subclasses
    abstract val owner: String

    // Abstract member function that must be implemented by subclasses
    abstract fun load(contents: String)
}

// Abstract subclass Van that inherits from CommercialVehicle
// This class is abstract because it does not implement the load() function
abstract class Van(override val owner: String) : CommercialVehicle() {
    // Van doesn't provide an implementation for load(), so the class must remain abstract
}

// Concrete subclass Truck that provides an implementation for all abstract members
class Truck(override val owner: String) : Van(owner) {

    // Implements the abstract load() function from CommercialVehicle
    override fun load(contents: String) {
        println("Truck loading $contents")
    }
}

fun main() {
    // Create an instance of Truck and call its load() function
    val truck = Truck("Logistics Co.")
    truck.load("Cargo")
}

/*
 * Output:
 * Truck loading Cargo
 */

/**
 * Explanation:
 *
 * - The `CommercialVehicle` class is abstract and defines an abstract `owner` property and an abstract `load()` function.
 * - The `Van` class is an abstract subclass of `CommercialVehicle` because it doesn't implement the `load()` function.
 * - The `Truck` class is a concrete subclass of `Van` and provides an implementation for the `load()` function.
 * - The `main()` function demonstrates creating an instance of `Truck` and using its functionality.
 */


/**
 * Explanation:
 * Abstract Subclass (Van): The Van class is an abstract subclass of CommercialVehicle because it does not implement the abstract load() function. Since Van is abstract, it must be marked as abstract.
 *
 * Concrete Subclass (Truck): The Truck class extends Van and provides an implementation for the load() function, making it a concrete class that can be instantiated.
 *
 * Output: The program creates an instance of Truck and demonstrates loading contents, printing out "Truck loading Cargo."
 *
 * This class.kt file provides a clear example of how to define abstract subclasses in Kotlin, along with explanations in the comments.
 */