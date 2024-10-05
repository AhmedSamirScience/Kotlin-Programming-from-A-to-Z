<!DOCTYPE html>
<html lang="en">
 
<body>

<h1>Kotlin Interface Implementation Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates how objects and classes can implement interfaces in Kotlin. An object can implement one or more interfaces, but it must provide concrete implementations for all the abstract members of the interface, as an object cannot be marked as abstract. A class or object can also implement multiple interfaces.</p>

<h2>Code Overview</h2>

<pre>
<code>
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
</code>
</pre>

<h3>Explanation</h3>

<ul>
    <li>The <code>Organizer</code> interface defines an abstract property <code>owner</code> and three abstract member functions: <code>add()</code>, <code>get()</code>, and <code>remove()</code>.</li>
    <li>The <code>Diary</code> object implements the <code>Organizer</code> interface, providing concrete implementations for the property and functions.</li>
    <li>The <code>Printer</code> and <code>Speaker</code> interfaces each define a single abstract member function.</li>
    <li>The <code>Application</code> class implements <code>Organizer</code>, <code>Printer</code>, and <code>Speaker</code>, providing implementations for all abstract members.</li>
    <li>The <code>MyObject</code> object also implements multiple interfaces: <code>Organizer</code>, <code>Printer</code>, and <code>Speaker</code>.</li>
    <li>The <code>main()</code> function demonstrates creating an instance of <code>Application</code> and using the <code>Diary</code> and <code>MyObject</code> objects.</li>
</ul>

<h3>Multiple Interface Implementation</h3>

<p>
- The <strong>Interface Implementation</strong>: The <code>Organizer</code> interface is implemented by both the <code>Diary</code> object and the <code>Application</code> class. This interface specifies the contract that must be fulfilled by any implementing class or object.
</p>
<p>
- The <strong>Multiple Interfaces</strong>: The <code>Application</code> class and the <code>MyObject</code> object both implement multiple interfaces (<code>Organizer</code>, <code>Printer</code>, and <code>Speaker</code>). This demonstrates how a single class or object can adhere to multiple contracts.
</p>
<p>
- The <strong>Concrete Implementations</strong>: All abstract members of the interfaces are implemented in the respective classes and objects.
</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating the implementation of interfaces in objects and classes in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
