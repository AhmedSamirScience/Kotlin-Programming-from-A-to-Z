
<body>

<h1>Kotlin Abstract Properties Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates the use of abstract properties in Kotlin. In Kotlin, abstract classes can have abstract properties in addition to abstract functions. Concrete subclasses must provide an implementation for both abstract member functions and abstract properties.</p>

<h2>Code Overview</h2>

<pre>
<code>
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
</code>
</pre>

<h3>Explanation</h3>

<ul>
    <li>The <code>CommercialVehicle</code> abstract class defines an abstract <code>val owner</code> and an abstract function <code>load()</code>.</li>
    <li>The <code>Lorry</code> class provides a concrete implementation for the <code>owner</code> property by marking it as a constructor property and using <code>override</code>.</li>
    <li>The <code>load()</code> function is also implemented in <code>Lorry</code>, providing specific behavior.</li>
    <li>The <code>main()</code> function demonstrates creating an instance of <code>Lorry</code> and using its functionality.</li>
</ul>

<h3>Abstract Properties and Functions</h3>

<p>
- The <strong>Abstract Properties</strong>: The <code>CommercialVehicle</code> class defines an abstract property <code>owner</code> and an abstract member function <code>load()</code>. Any subclass of <code>CommercialVehicle</code> must provide concrete implementations for these.
</p>
<p>
- The <strong>Concrete Subclass (Lorry)</strong>: The <code>Lorry</code> class provides an implementation for the <code>owner</code> property by making it a constructor property and implements the <code>load()</code> function to simulate loading contents.
</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating the use of abstract properties in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
