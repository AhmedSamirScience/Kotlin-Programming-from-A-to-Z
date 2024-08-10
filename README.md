<body>

<h1>Kotlin Top-Level Properties Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates the use of top-level properties. Top-level properties are declared outside of any class, object, or function, making them accessible throughout the same file.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates the use of top-level properties in Kotlin.
 *
 * Top-level properties are properties that are declared outside of any class, object, or function.
 * These properties can be accessed directly anywhere within the same file.
 */

// Top-level properties
val MIN = 1
val MAX = 100
val calculator = Calculator()
var count = 0

class Calculator {
    // A simple class with basic functionality
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    override fun toString(): String {
        return "Calculator Instance"
    }
}

fun main() {
    // Accessing top-level properties
    println("MIN: $MIN")
    println("MAX: $MAX")
    println("Initial count: $count")

    // Modifying the top-level variable 'count'
    count++
    println("Updated count: $count")

    // Using the top-level 'calculator' property
    println("Calculator instance: $calculator")
    println("Adding 10 + 20 using calculator: ${calculator.add(10, 20)}")
}

/*
 * Output:
 * MIN: 1
 * MAX: 100
 * Initial count: 0
 * Updated count: 1
 * Calculator instance: Calculator Instance
 * Adding 10 + 20 using calculator: 30
 */

/**
 * Explanation:
 *
 * - `MIN`, `MAX`, `calculator`, and `count` are top-level properties in this file.
 * - `MIN` and `MAX` are immutable values (declared with `val`), meaning they cannot be changed after initialization.
 * - `count` is a mutable variable (declared with `var`), so its value can be modified.
 * - The `calculator` property is an instance of the `Calculator` class.
 * - The `main` function demonstrates how these top-level properties can be accessed and used directly within the same file.
 */


/**
 * Summary:
 * Top-Level Properties: MIN, MAX, calculator, and count are defined at the top level of the file, making them accessible throughout the file.
 * Immutability and Mutability: MIN and MAX are immutable (val), while count is mutable (var), allowing it to be modified.
 * Calculator Class: The Calculator class provides basic functionality, and an instance of this class is used as a top-level property.
 * Access: The main function shows how to access and use these top-level properties within the file.
 */
</code>
</pre>

<h3>Top-Level Properties in Kotlin</h3>

<ul>
    <li><strong>Top-Level Properties:</strong> <code>MIN</code>, <code>MAX</code>, <code>calculator</code>, and <code>count</code> are defined at the top level of the file, making them accessible throughout the file.</li>
    <li><strong>Immutability and Mutability:</strong> <code>MIN</code> and <code>MAX</code> are immutable (declared with <code>val</code>), while <code>count</code> is mutable (declared with <code>var</code>), allowing it to be modified.</li>
    <li><strong>Calculator Class:</strong> The <code>Calculator</code> class provides basic functionality, and an instance of this class is used as a top-level property.</li>
    <li><strong>Access:</strong> The <code>main</code> function shows how to access and use these top-level properties within the file.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different examples demonstrating the use of top-level properties.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
