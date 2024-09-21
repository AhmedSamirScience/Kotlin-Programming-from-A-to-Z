/**
 * Declaring Member Functions as Open in Kotlin
 * In Kotlin, member functions are final by default, meaning they cannot be overridden. To allow a member function to be overridden in a subclass, the function must be marked with the open keyword. The subclass can then override this function using the override keyword.
 *
 * Key Points:
 * open Keyword: Used to mark a member function that can be overridden by subclasses.
 * override Keyword: Required in the subclass to override an open member function.
 * Final by Default: If a function is not marked as open, it is implicitly final and cannot be overridden.
 * Example: Declaring and Overriding Open Member Functions
 */

/**
 * This example demonstrates how to declare and override member functions in Kotlin using the `open` and `override` keywords.
 */

// Base class with an open member function
open class Base {
    // Open function that can be overridden in subclasses
    open fun print(): Unit = println("Base print")
}

// Subclass that overrides the open function
class Derived : Base() {
    // Override the print() function from Base
    override fun print(): Unit = println("Derived print")
}

fun main() {
    // Creating an instance of Base and calling the print() function
    val base = Base()
    base.print()  // Output: Base print

    println("----------")

    // Creating an instance of Derived and calling the overridden print() function
    val derived = Derived()
    derived.print()  // Output: Derived print
}

/*
 * Output:
 * Base print
 * ----------
 * Derived print
 */

/**
 * Explanation:
 *
 * 1. **Open and Override**:
 *    - The `Base` class defines an open member function `print()` which can be overridden by subclasses.
 *    - The `Derived` class extends `Base` and overrides the `print()` function to provide its own implementation.
 *
 * 2. **Dynamic Dispatch**:
 *    - When `print()` is called on an instance of `Base`, the `Base` version of the function is executed.
 *    - When `print()` is called on an instance of `Derived`, the overridden version in `Derived` is executed.
 *
 * 3. **Default Final Behavior**:
 *    - By default, member functions in Kotlin are `final` and cannot be overridden unless they are explicitly marked as `open`.
 */

/**
 * Summary:
 * Declaring Open Functions: The Base class marks its print() function as open, allowing it to be overridden in subclasses like Derived.
 *
 * Overriding Functions: The Derived class overrides the print() function, providing its own implementation. The override keyword is mandatory for overriding functions.
 *
 * Dynamic Dispatch: The function call is dynamically dispatched based on the runtime type of the object. When called on an instance of Base, the base class implementation is used. When called on an instance of Derived, the derived class implementation is used.
 *
 * This example demonstrates how to declare and override member functions in Kotlin, showing how the open and override keywords work to allow polymorphism and dynamic method dispatch.
 */