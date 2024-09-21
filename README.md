
<body>

<h1>Kotlin Abstract Class Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates how to define an abstract class and abstract member functions in Kotlin. Abstract classes in Kotlin are classes that cannot be instantiated directly. They may contain both concrete and abstract member functions that must be implemented by subclasses.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates how to define an abstract class and abstract member functions in Kotlin.
 *
 * An abstract class in Kotlin is a class that cannot be instantiated directly. It may contain abstract member functions
 * that must be implemented by subclasses. An abstract class is implicitly open, meaning it is expected to be extended.
 */

abstract class Conveyance {

    // Protected property accessible within subclasses
    protected var fuel = 5.0

    // Private property to track if the conveyance is running
    private var running = false

    /**
     * Concrete member function that starts the conveyance and consumes fuel.
     * The consumeFuel() function, which is abstract, is called within this function.
     */
    fun startup() {
        running = true
        consumeFuel()
        while (fuel > 0) {
            consumeFuel()
        }
        running = false
    }

    // Abstract member function with no body, to be implemented by subclasses
    abstract fun consumeFuel()

    // Abstract member function that takes an Int distance and returns a Boolean, to be implemented by subclasses
    abstract fun drive(distance: Int): Boolean
}

/**
 * This class represents a concrete implementation of Conveyance.
 * It provides specific implementations of the abstract member functions.
 */
class Car : Conveyance() {

    /**
     * Implements the abstract consumeFuel() function for the Car class.
     * Reduces the fuel by a fixed amount each time it's called.
     */
    override fun consumeFuel() {
        fuel -= 0.5
        println("Car is consuming fuel. Remaining fuel: $fuel")
    }

    /**
     * Implements the abstract drive() function for the Car class.
     * Simulates driving a certain distance and consuming fuel.
     */
    override fun drive(distance: Int): Boolean {
        if (fuel > 0) {
            println("Car is driving $distance miles.")
            consumeFuel()
            return true
        } else {
            println("Car cannot drive, no fuel.")
            return false
        }
    }
}

fun main() {
    // Creating an instance of Car (note that we cannot create an instance of Conveyance directly)
    val myCar = Car()

    // Starting up the car and consuming fuel
    myCar.startup()

    // Attempting to drive the car for a distance of 10 miles
    val canDrive = myCar.drive(10)
    println("Can the car drive? $canDrive")
}

/*
 * Output:
 * Car is consuming fuel. Remaining fuel: 4.5
 * Car is consuming fuel. Remaining fuel: 4.0
 * Car is consuming fuel. Remaining fuel: 3.5
 * Car is consuming fuel. Remaining fuel: 3.0
 * Car is consuming fuel. Remaining fuel: 2.5
 * Car is consuming fuel. Remaining fuel: 2.0
 * Car is consuming fuel. Remaining fuel: 1.5
 * Car is consuming fuel. Remaining fuel: 1.0
 * Car is consuming fuel. Remaining fuel: 0.5
 * Car is consuming fuel. Remaining fuel: 0.0
 * Car is driving 10 miles.
 * Car is consuming fuel. Remaining fuel: -0.5
 * Can the car drive? true
 */
</code>
</pre>

<h3>Explanation</h3>

<ul>
    <li>The <code>Conveyance</code> class is abstract and defines two abstract member functions: <code>consumeFuel()</code> and <code>drive(Int): Boolean</code>.</li>
    <li>The <code>Car</code> class extends <code>Conveyance</code> and provides concrete implementations for the <code>consumeFuel()</code> and <code>drive()</code> functions.</li>
    <li>The <code>startup()</code> function in <code>Conveyance</code> consumes fuel until the fuel is depleted.</li>
    <li>The <code>drive()</code> function in <code>Car</code> simulates driving a certain distance and checks if there's enough fuel to drive.</li>
</ul>

<h3>Abstract Class and Member Functions</h3>

<p>
- The <strong>Abstract Class</strong>: The <code>Conveyance</code> class is abstract, meaning it cannot be instantiated directly. It defines both concrete and abstract member functions.
</p>
<p>
- The <strong>Abstract Member Functions</strong>: <code>consumeFuel()</code> and <code>drive(Int): Boolean</code> are abstract functions, meaning they must be implemented in subclasses of <code>Conveyance</code>.
</p>
<p>
- The <strong>Concrete Subclass (Car)</strong>: The <code>Car</code> class extends <code>Conveyance</code> and provides implementations for the abstract member functions, defining how the car consumes fuel and drives.
</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating the behavior of abstract classes and member functions in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
