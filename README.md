<!DOCTYPE html>
<html lang="en">
<body>

<h1>Kotlin Concrete Member Functions in Interfaces Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates the use of concrete member functions in interfaces. An interface in Kotlin can contain both abstract and concrete member functions. Abstract member functions must be implemented by any class or object that implements the interface, while concrete member functions are inherited by the implementing class or object and can be used as-is or overridden if needed.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates the use of concrete member functions in interfaces in Kotlin.
 *
 * An interface in Kotlin can contain both abstract and concrete member functions.
 * - Abstract member functions must be implemented by any class or object that implements the interface.
 * - Concrete member functions are inherited by the implementing class or object and can be used as-is or overridden if needed.
 */

// Define the Speaker interface with one abstract and one concrete member function
interface Speaker {
    // Abstract member function
    fun saySomething()

    // Concrete member function with a default implementation
    fun sayHello() {
        println("Speaker - Hello World")
    }
}

// Define a class Person that implements the Speaker interface
class Person : Speaker {

    // Provide an implementation for the abstract saySomething() function
    override fun saySomething() {
        println("Person - Howdy")
    }
}

fun main() {
    // Create an instance of Person
    val p = Person()

    // Call the inherited concrete function from Speaker
    p.sayHello()

    // Call the overridden abstract function from Speaker
    p.saySomething()
}

/*
 * Output:
 * Speaker - Hello World
 * Person - Howdy
 */
</code>
</pre>

<h3>Explanation</h3>

<ul>
    <li>The <code>Speaker</code> interface defines an abstract member function <code>saySomething()</code> and a concrete member function <code>sayHello()</code> with a default implementation.</li>
    <li>The <code>Person</code> class implements the <code>Speaker</code> interface, inheriting the concrete <code>sayHello()</code> function and providing an implementation for the abstract <code>saySomething()</code> function.</li>
    <li>The <code>main()</code> function demonstrates creating an instance of <code>Person</code> and calling both functions.</li>
</ul>

<h3>Concrete and Abstract Functions in Interfaces</h3>

<p>
- The <strong>Concrete and Abstract Functions</strong>: The <code>Speaker</code> interface defines one abstract member function, <code>saySomething()</code>, and one concrete member function, <code>sayHello()</code>. Any class implementing this interface must provide an implementation for the abstract function but can use the concrete function as-is.
</p>
<p>
- The <strong>Class Implementation (Person)</strong>: The <code>Person</code> class implements the <code>Speaker</code> interface. It provides an implementation for <code>saySomething()</code> and inherits the concrete <code>sayHello()</code> function without needing to redefine it.
</p>
<p>
- The <strong>Output</strong>: The program creates an instance of <code>Person</code>, calls the inherited <code>sayHello()</code> function, and then calls the overridden <code>saySomething()</code> function, printing out <code>"Speaker - Hello World"</code> and <code>"Person - Howdy"</code> respectively.
</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating the use of concrete member functions in interfaces in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
