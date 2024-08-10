<body>

<h1>Kotlin Anonymous Objects Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates the concept of anonymous objects in Kotlin. Anonymous objects are created at the point of use and do not have a name. They are useful for scenarios where you need a one-off object with specific properties and methods.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates the concept of anonymous objects in Kotlin.
 *
 * Anonymous objects are created at the point of use and do not have a name.
 * They cannot be referenced elsewhere in the program but can have all the features of a named object.
 * These features include member properties, member functions, `init` blocks, and a `toString()` method.
 * Anonymous objects do not explicitly add a new type to the type system.
 */

fun main() {
    // Defines a new anonymous object
    val obj = object {
        var x: Int = 0
        val y: Int = 42
        val MAX: Int

        // Initialization block
        init {
            MAX = 100
        }

        // Member function
        fun printMe() {
            println("Print Me")
        }

        // Override toString method
        override fun toString(): String {
            return "Anonymous Object with x=$x, y=$y, MAX=$MAX"
        }
    }

    // Use the single instance of the anonymous object
    println(obj) // Calls the overridden toString() method
    println("MAX: ${obj.MAX}")
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
    obj.x = 50
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
    obj.printMe()
}

/*
 * Output:
 * Anonymous Object with x=0, y=42, MAX=100
 * MAX: 100
 * obj.x = 0, obj.y = 42
 * obj.x = 50, obj.y = 42
 * Print Me
 */

/**
 * In this example:
 *
 * - An anonymous object is created and assigned to the `val obj`.
 * - The object has three properties: `x`, `y`, and `MAX`. The `MAX` property is initialized within an `init` block.
 * - The object also has a `printMe()` function and an overridden `toString()` method.
 * - The object's properties and functions are accessed using the `obj` reference.
 *
 * Since it's an anonymous object, the reference to the object (`obj`) can only be used within the scope where it was created.
 */

/**
 * Explanation:
 * Anonymous Object:
 * The object is defined inline with the object keyword and assigned to val obj.
 * It has properties (x, y, and MAX), an initialization block (init), a method (printMe()), and an overridden toString() method.
 * Usage:
 * The properties and methods of the anonymous object are accessed through obj.
 * Since it's anonymous, obj can only be used within the same scope where the object was created.
 * Output:
 * The program prints out the results of calling toString() on the anonymous object, as well as the values of its properties and the result of calling printMe().
 * This class.kt file represents a complete example of how to define and use an anonymous object in Kotlin, along with detailed explanations in comments.
 */
</code>
</pre>

<h3>Anonymous Objects in Kotlin</h3>

<p>In Kotlin, anonymous objects are created using the <code>object</code> keyword without assigning a name to the object. These objects are intended for one-time use and are typically used when a simple, temporary object is required.</p>

<h3>Example: Anonymous Object</h3>

<p>The following example demonstrates the creation and use of an anonymous object:</p>

<pre><code>
fun main() {
    // Defines a new anonymous object
    val obj = object {
        var x: Int = 0
        val y: Int = 42
        val MAX: Int

        // Initialization block
        init {
            MAX = 100
        }

        // Member function
        fun printMe() {
            println("Print Me")
        }

        // Override toString method
        override fun toString(): String {
            return "Anonymous Object with x=$x, y=$y, MAX=$MAX"
        }
    }

    // Use the single instance of the anonymous object
    println(obj) // Calls the overridden toString() method
    println("MAX: ${obj.MAX}")
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
    obj.x = 50
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
    obj.printMe()
}
</code></pre>

<h3>Output</h3>

<pre>
<code>
Anonymous Object with x=0, y=42, MAX=100
MAX: 100
obj.x = 0, obj.y = 42
obj.x = 50, obj.y = 42
Print Me
</code>
</pre>

<h3>Explanation</h3>

<ul>
    <li><strong>Anonymous Object:</strong> The object is defined inline with the <code>object</code> keyword and assigned to <code>val obj</code>. It has properties (<code>x</code>, <code>y</code>, and <code>MAX</code>), an initialization block (<code>init</code>), a method (<code>printMe()</code>), and an overridden <code>toString()</code> method.</li>
    <li><strong>Usage:</strong> The properties and methods of the anonymous object are accessed through <code>obj</code>. Since it's anonymous, <code>obj</code> can only be used within the same scope where the object was created.</li>
    <li><strong>Output:</strong> The program prints out the results of calling <code>toString()</code> on the anonymous object, as well as the values of its properties and the result of calling <code>printMe()</code>.</li>
</ul>

<h3>Summary</h3>

<p>Anonymous objects in Kotlin are useful when you need to define a temporary, one-off object with specific properties and methods. They are typically used in scenarios where the object will not be referenced elsewhere in the program.</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
