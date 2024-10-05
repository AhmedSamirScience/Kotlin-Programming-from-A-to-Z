/**
 * This file demonstrates how a class or object can extend another class and implement one or more interfaces in Kotlin.
 *
 * A class or object can inherit behavior from a superclass and also implement abstract members in multiple interfaces.
 * - The superclass (if any) and interfaces are specified after the colon (:) separated by commas.
 * - The order of the superclass and interfaces in the list does not matter.
 * - A class specifies which constructor should be run, whereas interfaces do not have constructors.
 */

// Define an interface Writer with a single abstract function
interface Writer {
    fun writeSomething()
}

// Define an interface Speaker with a single abstract function
interface Speaker {
    fun saySomething()
}

// Open class Author with a constructor parameter `name`
open class Author(val name: String) {
    fun printAuthorName() {
        println("Author name: $name")
    }
}

// Class TechnicalAuthor extends Author and implements Writer and Speaker interfaces
class TechnicalAuthor(name: String) : Author(name), Writer, Speaker {

    // Implementation of the saySomething() function from the Speaker interface
    override fun saySomething() {
        println("Hello, I am a technical author.")
    }

    // Implementation of the writeSomething() function from the Writer interface
    override fun writeSomething() {
        println("Writer's block!")
    }
}

fun main() {
    // Create an instance of TechnicalAuthor
    val technicalAuthor = TechnicalAuthor("John Doe")

    // Call functions from the superclass and implemented interfaces
    technicalAuthor.printAuthorName()    // From the Author class
    technicalAuthor.saySomething()       // From the Speaker interface
    technicalAuthor.writeSomething()     // From the Writer interface
}

/*
 * Output:
 * Author name: John Doe
 * Hello, I am a technical author.
 * Writer's block!
 */

/**
 * Explanation:
 *
 * - The `Writer` and `Speaker` interfaces each define a single abstract function.
 * - The `Author` class is an open class with a constructor parameter `name`.
 * - The `TechnicalAuthor` class extends `Author` and implements the `Writer` and `Speaker` interfaces.
 * - The `TechnicalAuthor` class provides implementations for all abstract functions and uses the superclass constructor.
 * - The `main()` function demonstrates creating an instance of `TechnicalAuthor` and calling its functions.
 */


/**
 * Explanation:
 * Interface Definition: The Writer and Speaker interfaces each define a single abstract function that must be implemented by any class that inherits them.
 *
 * Superclass (Author): The Author class is an open class with a constructor parameter name and a concrete function printAuthorName().
 *
 * Subclass with Multiple Interfaces (TechnicalAuthor): The TechnicalAuthor class extends the Author class and implements the Writer and Speaker interfaces. It provides implementations for the abstract writeSomething() and saySomething() functions and uses the constructor of the superclass Author.
 *
 * Output: The main() function creates an instance of TechnicalAuthor, prints the author’s name using a function from the superclass, and demonstrates the use of the implemented functions from the Writer and Speaker interfaces.
 *
 * This class.kt file provides a clear example of how to extend a class and implement multiple interfaces in Kotlin, along with detailed comments and explanations.
 */