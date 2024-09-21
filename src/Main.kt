/**
 * Extending Behavior Using super in Kotlin
 * In Kotlin, it is possible not only to override a method completely, but also to extend the behavior of a method by calling the parent class's version using the super keyword. This allows the subclass to add additional functionality while still leveraging the behavior of the superclass.
 *
 * Key Points:
 * super Keyword: Used to invoke the parent class's implementation of a function.
 * Extending Behavior: Instead of completely replacing the parent class’s functionality, you can extend it by calling the parent's function and adding your own behavior before or after.
 * Example: Extending Behavior with super
 */

/**
 * This example demonstrates how to extend the behavior of a parent class's method using the `super` keyword in Kotlin.
 * The `Derived` class adds additional functionality to the `print()` method while still calling the `Base` class's implementation.
 */

// Base class with an open function that can be overridden
open class Base {
    open fun print(): Unit = println("Base")
}

// Derived class that extends the behavior of the print function
class Derived : Base() {
    override fun print(): Unit {
        println("Derived before")
        // Call the parent class's print function
        super.print()
        println("Derived after")
    }
}

fun main() {
    // Creating an instance of Derived and calling the print function
    val derived = Derived()
    derived.print()
}

/*
 * Output:
 * Derived before
 * Base
 * Derived after
 */

/**
 * Explanation:
 *
 * - The `Base` class defines an open `print()` method that prints "Base".
 * - The `Derived` class overrides the `print()` method, but it uses `super.print()` to call the parent class's `print()` method.
 * - The `Derived` class's `print()` method prints "Derived before" and "Derived after" in addition to the parent class's print output ("Base").
 * - The `super` keyword tells Kotlin to look for the method implementation in the superclass (`Base`).
 */

/**
 * Summary:
 * Extending Behavior: The Derived class extends the behavior of the print() method by adding its own logic before and after the call to super.print(). This allows the subclass to augment the functionality provided by the superclass.
 *
 * Using super: The super keyword is used to invoke the parent class’s version of a function. This is particularly useful when you want to retain some functionality from the parent class while adding your own behavior in the subclass.
 *
 * Dynamic Dispatch: When derived.print() is called, the Derived class’s print() method is executed, but it also calls super.print() to run the Base class’s print() method, showing both outputs.
 *
 * This example demonstrates how you can use super in Kotlin to extend the behavior of an overridden method in a subclass while still leveraging the functionality of the superclass.
 */

