
<body>

<h1>Kotlin Open and Override Member Functions Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates how to declare and override member functions in Kotlin using the <code>open</code> and <code>override</code> keywords. In Kotlin, member functions are final by default, meaning they cannot be overridden unless explicitly marked with <code>open</code>. Subclasses can then provide their own implementation by using the <code>override</code> keyword.</p>

<h2>Key Concepts</h2>

<ul>
    <li><strong>open Keyword:</strong> Used to mark a member function that can be overridden by subclasses.</li>
    <li><strong>override Keyword:</strong> Required in the subclass to override an open member function.</li>
    <li><strong>Final by Default:</strong> If a function is not marked as <code>open</code>, it is implicitly final and cannot be overridden.</li>
</ul>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Declaring Member Functions as Open in Kotlin
 * In Kotlin, member functions are final by default, meaning they cannot be overridden. To allow a member function to be overridden in a subclass, the function must be marked with the open keyword. The subclass can then override this function using the override keyword.
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
 */
</code>
</pre>

<h3>Open and Override in Kotlin</h3>

<ul>
    <li><strong>Open Functions:</strong> The <code>Base</code> class defines an open function <code>print()</code>, allowing it to be overridden in the subclass.</li>
    <li><strong>Override Functions:</strong> The <code>Derived</code> class overrides the <code>print()</code> function and provides its own implementation using the <code>override</code> keyword.</li>
    <li><strong>Dynamic Dispatch:</strong> The function call is dispatched based on the runtime type of the object. Calling <code>print()</code> on <code>Base</code> executes the base implementation, while calling it on <code>Derived</code> executes the derived implementation.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating how open and override member functions work in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
