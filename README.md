
<body>

<h1>Kotlin Abstract Subclass Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates how to define abstract subclasses in Kotlin. A subclass of an abstract class may itself be abstract if it does not implement one or more of the abstract members inherited from the parent class. An abstract subclass must be marked as <code>abstract</code>.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates how to define abstract subclasses in Kotlin.
 *
 * A subclass of an abstract class may itself be abstract. This happens when:
 * - The subclass defines one or more abstract members (properties or functions), or
 * - The subclass does not implement one or more of the abstract members inherited from the parent class.
 *
 * An abstract subclass must be marked as `abstract`.
 */

// Abstract class CommercialVehicle with an abstract property and an abstract function
abstract class CommercialVehicle {

    // Abstract property that must be implemented by subclasses
    abstract val owner: String

    // Abstract member function that must be implemented by subclasses
    abstract fun load(contents: String)
}

// Abstract subclass Van that inherits from CommercialVehicle
// This class is abstract because it does not implement the load() function
abstract class Van(override val owner: String) : CommercialVehicle() {
    // Van doesn't provide an implementation for load(), so the class must remain abstract
}

// Concrete subclass Truck that provides an implementation for all abstract members
class Truck(override val owner: String) : Van(owner) {

    // Implements the abstract load() function from CommercialVehicle
    override fun load(contents: String) {
        println("Truck loading $contents")
    }
}

fun main() {
    // Create an instance of Truck and call its load() function
    val truck = Truck("Logistics Co.")
    truck.load("Cargo")
}

/*
 * Output:
 * Truck loading Cargo
 */
</code>
</pre>

<h3>Explanation</h3>

<ul>
    <li>The <code>CommercialVehicle</code> class is abstract and defines an abstract <code>owner</code> property and an abstract <code>load()</code> function.</li>
    <li>The <code>Van</code> class is an abstract subclass of <code>CommercialVehicle</code> because it doesn't implement the <code>load()</code> function, so it must remain abstract.</li>
    <li>The <code>Truck</code> class is a concrete subclass of <code>Van</code> and provides an implementation for the <code>load()</code> function, making it a concrete class that can be instantiated.</li>
    <li>The <code>main()</code> function demonstrates creating an instance of <code>Truck</code> and using its functionality.</li>
</ul>

<h3>Abstract Subclass vs Concrete Subclass</h3>

<p>
- The <strong>Abstract Subclass (Van)</strong>: The <code>Van</code> class is an abstract subclass of <code>CommercialVehicle</code> because it does not implement the abstract <code>load()</code> function. Since <code>Van</code> is abstract, it must be marked as abstract.
</p>
<p>
- The <strong>Concrete Subclass (Truck)</strong>: The <code>Truck</code> class extends <code>Van</code> and provides an implementation for the <code>load()</code> function, making it a concrete class that can be instantiated.
</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating the use of abstract subclasses in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
