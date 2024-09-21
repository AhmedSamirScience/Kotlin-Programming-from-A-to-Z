
<body>

<h1>Kotlin Extending Behavior with Super Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates how to extend the behavior of a method from a parent class by calling the parent class's method using the <code>super</code> keyword. This allows subclasses to augment the functionality provided by the superclass while still preserving the superclass's implementation.</p>

<h2>Key Concepts</h2>

<ul>
    <li><strong>super Keyword:</strong> Used to invoke the parent class's implementation of a function.</li>
    <li><strong>Extending Behavior:</strong> Instead of completely replacing the parent class’s functionality, you can extend it by calling the parent's function and adding your own behavior before or after.</li>
</ul>

<h2>Code Overview</h2>

<pre>
<code>
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
</code>
</pre>

<h3>Extending Behavior with Super in Kotlin</h3>

<ul>
    <li><strong>Extending Behavior:</strong> The <code>Derived</code> class extends the behavior of the <code>print()</code> method by adding its own logic before and after calling <code>super.print()</code>. This allows the subclass to augment the functionality provided by the superclass.</li>
    <li><strong>Using super:</strong> The <code>super</code> keyword is used to invoke the parent class’s version of a function. This is useful when you want to retain some functionality from the parent class while adding your own behavior in the subclass.</li>
    <li><strong>Dynamic Dispatch:</strong> When <code>derived.print()</code> is called, the <code>Derived</code> class’s <code>print()</code> method is executed, but it also calls <code>super.print()</code> to run the <code>Base</code> class’s <code>print()</code> method, showing both outputs.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating how to extend a method using <code>super</code> in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
