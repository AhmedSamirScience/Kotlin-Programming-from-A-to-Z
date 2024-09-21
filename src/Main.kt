/**
 * This file demonstrates the use of abstract properties in Kotlin.
 *
 * In Kotlin, abstract classes can also have abstract properties, not just abstract functions.
 * Abstract properties:
 * - Can be constructor or member-level properties.
 * - Can be `val` or `var`.
 * - Must be prefixed with the keyword `abstract`.
 *
 * Concrete subclasses must provide an implementation for both abstract member functions and abstract properties.
 */

// Abstract class CommercialVehicle with an abstract property and an abstract function
abstract class CommercialVehicle {

    // Abstract property that must be implemented by subclasses
    abstract val owner: String

    // Abstract member function that must be implemented by subclasses
    abstract fun load(contents: String)
}

// Concrete class Lorry that provides implementations for the abstract property and function
class Lorry(override val owner: String) : CommercialVehicle() {

    // Override the abstract load() function
    override fun load(contents: String) {
        println("loading $contents")
    }
}

fun main() {
    // Create an instance of Lorry and call its load() function
    val lorry = Lorry("Smith and Co.")
    lorry.load("Hay")
}

/*
 * Output:
 * loading Hay
 */

/**
 * Explanation:
 *
 * - The `CommercialVehicle` abstract class defines an abstract `val owner` and an abstract function `load()`.
 * - The `Lorry` class provides a concrete implementation for the `owner` property by marking it as a constructor property and using `override`.
 * - The `load()` function is also implemented in `Lorry`, providing specific behavior.
 * - The `main()` function demonstrates creating an instance of `Lorry` and using its functionality.
 */

/**
 * Explanation:
 * Abstract Properties: The CommercialVehicle class defines an abstract property owner and an abstract member function load(). Any subclass of CommercialVehicle must provide concrete implementations for these.
 *
 * Concrete Subclass (Lorry): The Lorry class provides an implementation for the owner property by making it a constructor property, and it implements the load() function to simulate loading contents.
 *
 * Output: The program creates an instance of Lorry and demonstrates the loading operation, printing out "loading Hay."
 *
 * This class.kt file provides a clear example of how to use abstract properties in Kotlin, along with explanations in the comments.
 */