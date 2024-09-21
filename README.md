
<body>

<h1>Kotlin Abstract Class Subclassing Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates how to subclass an abstract class in Kotlin. When subclassing an abstract class, concrete implementations for any abstract member functions in the parent class must be provided. The <code>override</code> keyword is used to implement these abstract functions.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates how to subclass an abstract class in Kotlin.
 *
 * When subclassing an abstract class, we use the `:` symbol to represent inheritance and
 * must provide concrete implementations for any abstract member functions in the parent class.
 * The `override` keyword is used to implement abstract functions from the parent class.
 */

// Abstract class Conveyance with abstract functions
abstract class Conveyance {

    protected var fuel = 5.0

    // Abstract function to be implemented by subclasses
    abstract fun consumeFuel()

    // Abstract function to be implemented by subclasses
    abstract fun drive(distance: Int): Boolean

    // Concrete function available to all subclasses
    fun startup() {
        while (fuel > 0) {
            consumeFuel()
        }
    }
}

// Concrete class Car that extends the abstract class Conveyance
class Car : Conveyance() {

    // Override and implement the consumeFuel() function
    override fun consumeFuel() {
        fuel -= 1.0
        println("consuming, remaining fuel: $fuel")
    }

    // Override and implement the drive() function
    override fun drive(distance: Int): Boolean {
        println("Driven $distance miles")
        return true
    }
}

fun main() {
    // Create an instance of Car and treat it as a Conveyance
    val c: Conveyance = Car()

    // Start the car and consume fuel
    c.startup()

    // Drive the car for a distance of 10 miles
    val result = c.drive(10)
    println(result)
}

/*
 * Output:
 * consuming, remaining fuel: 4.0
 * consuming, remaining fuel: 3.0
 * consuming, remaining fuel: 2.0
 * consuming, remaining fuel: 1.0
 * consuming, remaining fuel: 0.0
 * Driven 10 miles
 * true
 */
</code>
</pre>

<h3>Explanation</h3>

<ul>
    <li>The <code>Conveyance</code> class is an abstract class with two abstract functions: <code>consumeFuel()</code> and <code>drive(Int): Boolean</code>.</li>
    <li>The <code>Car</code> class subclasses <code>Conveyance</code> and provides concrete implementations for the abstract functions.</li>
    <li>The <code>consumeFuel()</code> function decreases the <code>fuel</code> property, and the <code>drive()</code> function simulates driving a given distance.</li>
    <li>The <code>main()</code> function demonstrates creating an instance of <code>Car</code>, invoking <code>startup()</code> to consume fuel, and then calling the <code>drive()</code> function.</li>
</ul>

<h3>Subclassing an Abstract Class</h3>

<p>
- The <strong>Abstract Class</strong>: The <code>Conveyance</code> class defines two abstract functions: <code>consumeFuel()</code> and <code>drive(Int): Boolean</code>. Subclasses must provide implementations for these functions.
</p>
<p>
- The <strong>Concrete Subclass (Car)</strong>: The <code>Car</code> class extends <code>Conveyance</code> and provides concrete implementations for the abstract functions. It overrides the <code>consumeFuel()</code> function to decrease fuel and the <code>drive()</code> function to simulate driving a specific distance.
</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating subclassing an abstract class and overriding abstract functions in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
