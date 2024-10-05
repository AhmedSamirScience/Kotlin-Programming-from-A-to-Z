<!DOCTYPE html>
<html lang="en">

<body>

<h1>Kotlin Multiple Interface Conflicts Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates how to handle multiple interfaces with the same concrete member functions. In Kotlin, a class or object can implement multiple interfaces, and interfaces can have concrete member functions. If two or more interfaces contain concrete member functions with the same signature, the implementing class must provide its own implementation of the conflicting function using the <code>override</code> keyword.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates how to handle multiple interfaces with the same concrete member functions in Kotlin.
 *
 * A class or object can implement multiple interfaces, and interfaces can have concrete member functions.
 * If two or more interfaces contain concrete member functions with the same signature, the implementing class must
 * provide its own implementation of the conflicting function. This is done using the `override` keyword.
 *
 * The `super<InterfaceName>.functionName()` syntax can be used to call the specific function from a particular interface.
 */

// Define the Speaker interface with an abstract function and a concrete function
interface Speaker {
    fun saySomething()

    // Concrete member function
    fun sayHello() {
        println("Speaker - Hello World")
    }
}

// Define the Translator interface with a concrete function that conflicts with Speaker
interface Translator {
    fun sayHello() {
        println("Translator - Bonjour")
    }
}

// Define a class Employee that implements both Speaker and Translator interfaces
class Employee : Speaker, Translator {

    // Implement the abstract function from Speaker
    override fun saySomething() {
        println("Employee - Say Something")
    }

    // Override the conflicting sayHello() function to resolve ambiguity
    override fun sayHello() {
        // Call the sayHello() function from the Speaker interface
        super<Speaker>.sayHello()
    }
}

fun main() {
    // Create an instance of Employee and call its functions
    val e = Employee()
    e.sayHello()        // Calls Speaker's sayHello()
    e.saySomething()    // Calls Employee's saySomething()
}

/*
 * Output:
 * Speaker - Hello World
 * Employee - Say Something
 */
</code>
</pre>

<h3>Explanation</h3>

<ul>
    <li>The <code>Speaker</code> interface defines an abstract function <code>saySomething()</code> and a concrete function <code>sayHello()</code> with a default implementation.</li>
    <li>The <code>Translator</code> interface also defines a concrete <code>sayHello()</code> function with the same signature as in <code>Speaker</code>.</li>
    <li>The <code>Employee</code> class implements both <code>Speaker</code> and <code>Translator</code>. Since both interfaces have a concrete <code>sayHello()</code> function, the <code>Employee</code> class must override <code>sayHello()</code> to resolve the conflict.</li>
    <li>The overridden <code>sayHello()</code> in <code>Employee</code> calls the <code>sayHello()</code> function from the <code>Speaker</code> interface using <code>super&lt;Speaker&gt;.sayHello()</code>.</li>
    <li>The <code>main()</code> function demonstrates calling the overridden <code>sayHello()</code> and <code>saySomething()</code> functions in <code>Employee</code>.</li>
</ul>

<h3>Handling Multiple Interfaces with Conflicting Functions</h3>

<p>
- The <strong>Multiple Interfaces</strong>: The <code>Speaker</code> and <code>Translator</code> interfaces both define a concrete function <code>sayHello()</code> with the same signature but different behavior.
</p>
<p>
- The <strong>Implementing Class (Employee)</strong>: The <code>Employee</code> class implements both <code>Speaker</code> and <code>Translator</code> interfaces. The compiler requires <code>Employee</code> to override the conflicting <code>sayHello()</code> function to resolve ambiguity.
</p>
<p>
- The <strong>Overridden Function</strong>: In the overridden <code>sayHello()</code> function, the implementation from <code>Speaker</code> is called using the <code>super&lt;Speaker&gt;.sayHello()</code> syntax.
</p>
<p>
- The <strong>Output</strong>: The <code>main()</code> function creates an instance of <code>Employee</code> and calls <code>sayHello()</code> (which invokes <code>Speaker</code>'s <code>sayHello()</code>) and <code>saySomething()</code> (defined in <code>Employee</code>).
</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating the resolution of conflicting concrete member functions in multiple interfaces in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
