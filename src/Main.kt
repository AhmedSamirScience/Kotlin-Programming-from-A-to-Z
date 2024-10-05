/**
 * This file demonstrates how objects can implement interfaces in Kotlin.
 *
 * An object can implement one or more interfaces in Kotlin, but it must provide concrete implementations for
 * all the abstract members of the interface, as an object cannot be marked as abstract.
 * An object can also implement multiple interfaces just like a class.
 */

// Interface Organizer with abstract properties and member functions
interface Organizer {
    val owner: String
    fun add(appointment: String, date: String)
    fun get(date: String): String?
    fun remove(date: String): Boolean
}

// Example of an object implementing the Organizer interface
object Diary : Organizer {
    override val owner: String = "John"

    override fun add(appointment: String, date: String) {
        println("add $appointment - $date")
    }

    override fun get(date: String): String? {
        return null
    }

    override fun remove(date: String): Boolean {
        return false
    }
}

// Another interface Printer with a single member function
interface Printer {
    fun prettyPrint()
}

// Another interface Speaker with a single member function
interface Speaker {
    fun saySomething()
}

// Concrete class Application implementing multiple interfaces: Organizer, Printer, and Speaker
class Application(override val owner: String) : Organizer, Printer, Speaker {

    // Speaker member function implementation
    override fun saySomething() {
        println("Application says: Hello!")
    }

    // Printer member function implementation
    override fun prettyPrint() {
        println("Application print: Pretty printed content.")
    }

    // Organizer member function implementations
    override fun add(appointment: String, date: String) {
        println("Added appointment: $appointment on $date")
    }

    override fun get(date: String): String? {
        return "Appointment on $date"
    }

    override fun remove(date: String): Boolean {
        println("Removed appointment on $date")
        return true
    }
}

// Another example of an object implementing multiple interfaces: Organizer, Printer, and Speaker
object MyObject : Organizer, Printer, Speaker {
    override val owner: String = "John"

    // Speaker member function implementation
    override fun saySomething() {
        println("MyObject says: Welcome!")
    }

    // Printer member function implementation
    override fun prettyPrint() {
        println("MyObject print: Neatly formatted.")
    }

    // Organizer member function implementations
    override fun add(appointment: String, date: String) {
        println("MyObject added appointment: $appointment on $date")
    }

    override fun get(date: String): String? {
        return "MyObject appointment on $date"
    }

    override fun remove(date: String): Boolean {
        println("MyObject removed appointment on $date")
        return true
    }
}

fun main() {
    // Create an instance of Application and use its member functions
    val app = Application("Company Ltd.")
    app.add("Team Meeting", "Monday")
    app.saySomething()
    app.prettyPrint()
    app.remove("Monday")

    // Use Diary object to access Organizer functions
    Diary.add("Opticians", "Wednesday")
    val diary: Organizer = Diary
    diary.add("Doctors", "Thursday")

    // Use MyObject to demonstrate multiple interface implementation
    MyObject.add("Project Review", "Friday")
    MyObject.saySomething()
    MyObject.prettyPrint()
}

/*
 * Output:
 * Added appointment: Team Meeting on Monday
 * Application says: Hello!
 * Application print: Pretty printed content.
 * Removed appointment on Monday
 * add Opticians - Wednesday
 * add Doctors - Thursday
 * MyObject added appointment: Project Review on Friday
 * MyObject says: Welcome!
 * MyObject print: Neatly formatted.
 */

/**
 * Explanation:
 *
 * - The `Organizer` interface defines an abstract property `owner` and three abstract member functions: `add()`, `get()`, and `remove()`.
 * - The `Diary` object implements the `Organizer` interface, providing concrete implementations for the property and functions.
 * - The `Printer` and `Speaker` interfaces each define a single abstract member function.
 * - The `Application` class implements `Organizer`, `Printer`, and `Speaker`, providing implementations for all abstract members.
 * - The `MyObject` object also implements multiple interfaces: `Organizer`, `Printer`, and `Speaker`.
 * - The `main()` function demonstrates creating an instance of `Application` and using the `Diary` and `MyObject` objects.
 */


/**
 * Explanation:
 * Interface Implementation: The Organizer interface is implemented by both the Diary object and the Application class. This interface specifies the contract that must be fulfilled by any implementing class or object.
 *
 * Multiple Interfaces: The Application class and the MyObject object both implement multiple interfaces (Organizer, Printer, and Speaker). This demonstrates how a single class or object can adhere to multiple contracts.
 *
 * Concrete Implementations: All abstract members of the interfaces are implemented in the respective classes and objects.
 *
 * Output: The program demonstrates adding and removing appointments, as well as using the saySomething() and prettyPrint() functions from the Printer and Speaker interfaces.
 *
 * This class.kt file provides a clear example of how objects can implement interfaces in Kotlin, including multiple interface implementations, along with detailed explanations in the comments.
 */