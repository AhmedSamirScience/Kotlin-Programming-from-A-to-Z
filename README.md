<body>

<h1>Kotlin Singleton Objects Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates the concept of singleton objects using the <code>object</code> keyword. Singleton objects in Kotlin allow you to create a single instance of a class with global access. They are particularly useful for utility classes and managing shared state.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates the concept of singleton objects in Kotlin using the `object` keyword.
 *
 * A singleton object can have:
 * - One or more `init` blocks.
 * - Zero or more member functions.
 * - Zero or more member properties.
 * - Its own override of `toString()`.
 *
 * Note: A singleton object cannot have a constructor.
 */

object MathsUtils {

    // Public member properties
    val ZERO: Int = 0
    val MIN: Int = -100
    val MAX: Int

    // Initialization block
    init {
        MAX = 1000
    }

    // Member functions
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun isLessThanMax(value: Int): Boolean {
        return value < MAX
    }

    // Override toString
    override fun toString(): String {
        return "MathsUtils(ZERO=$ZERO, MIN=$MIN, MAX=$MAX)"
    }
}

object Session {

    // Public member property
    val id: String = "session-12345"

    // Override toString
    override fun toString(): String {
        return "Session(id=$id)"
    }
}

fun main() {
    // Accessing the singleton's properties and functions in MathsUtils
    println("MathsUtils.ZERO: ${MathsUtils.ZERO}")
    println("MathsUtils.MIN: ${MathsUtils.MIN}")
    println("MathsUtils.MAX: ${MathsUtils.MAX}")

    println("Add 10 + 20: ${MathsUtils.add(10, 20)}")
    println("Subtract 30 - 15: ${MathsUtils.subtract(30, 15)}")
    println("Is 500 less than MAX: ${MathsUtils.isLessThanMax(500)}")

    // Output the toString() of MathsUtils
    println(MathsUtils)

    // Demonstrating the use of the Session singleton
    println(Session)

    // Assign the Session object to a val
    val s: Session = Session

    // Print the alias
    println(s)
}

/*
 * Output:
 * MathsUtils.ZERO: 0
 * MathsUtils.MIN: -100
 * MathsUtils.MAX: 1000
 * Add 10 + 20: 30
 * Subtract 30 - 15: 15
 * Is 500 less than MAX: true
 * MathsUtils(ZERO=0, MIN=-100, MAX=1000)
 * Session(id=session-12345)
 * Session(id=session-12345)
 */
</code>
</pre>

<h3>Singleton Objects in Kotlin</h3>

<p>In Kotlin, the <code>object</code> keyword is used to create a singleton object. A singleton object can have:</p>

<ul>
    <li>One or more <code>init</code> blocks.</li>
    <li>Zero or more member functions.</li>
    <li>Zero or more member properties.</li>
    <li>Its own override of <code>toString()</code>.</li>
</ul>

<p>Note: A singleton object cannot have a constructor.</p>

<h3>Example: MathsUtils Singleton</h3>

<p>The <code>MathsUtils</code> object is a singleton that provides some mathematical utilities:</p>

<pre><code>
object MathsUtils {

    // Public member properties
    val ZERO: Int = 0
    val MIN: Int = -100
    val MAX: Int

    // Initialization block
    init {
        MAX = 1000
    }

    // Member functions
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun isLessThanMax(value: Int): Boolean {
        return value < MAX
    }

    // Override toString
    override fun toString(): String {
        return "MathsUtils(ZERO=$ZERO, MIN=$MIN, MAX=$MAX)"
    }
}
</code></pre>

<p>The <code>MathsUtils</code> object has public properties <code>ZERO</code>, <code>MIN</code>, and <code>MAX</code>, an <code>init</code> block to initialize <code>MAX</code>, and several utility functions. It also overrides <code>toString()</code> to provide a custom string representation.</p>

<h3>Example: Session Singleton</h3>

<p>The <code>Session</code> object is a simple singleton representing a session:</p>

<pre><code>
object Session {

    // Public member property
    val id: String = "session-12345"

    // Override toString
    override fun toString(): String {
        return "Session(id=$id)"
    }
}
</code></pre>

<p>The <code>Session</code> object has a single property <code>id</code> and overrides <code>toString()</code> to provide a custom string representation.</p>

<h3>Using Singleton Objects</h3>

<p>In the <code>main</code> function, we demonstrate how to access the properties and functions of the <code>MathsUtils</code> and <code>Session</code> singletons:</p>

<pre><code>
fun main() {
    // Accessing the singleton's properties and functions in MathsUtils
    println("MathsUtils.ZERO: ${MathsUtils.ZERO}")
    println("MathsUtils.MIN: ${MathsUtils.MIN}")
    println("MathsUtils.MAX: ${MathsUtils.MAX}")

    println("Add 10 + 20: ${MathsUtils.add(10, 20)}")
    println("Subtract 30 - 15: ${MathsUtils.subtract(30, 15)}")
    println("Is 500 less than MAX: ${MathsUtils.isLessThanMax(500)}")

    // Output the toString() of MathsUtils
    println(MathsUtils)

    // Demonstrating the use of the Session singleton
    println(Session)

    // Assign the Session object to a val
    val s: Session = Session

    // Print the alias
    println(s)
}
</code></pre>

<h3>Expected Output</h3>

<pre>
<code>
MathsUtils.ZERO: 0
MathsUtils.MIN: -100
MathsUtils.MAX: 1000
Add 10 + 20: 30
Subtract 30 - 15: 15
Is 500 less than MAX: true
MathsUtils(ZERO=0, MIN=-100, MAX=1000)
Session(id=session-12345)
Session(id=session-12345)
</code>
</pre>

<h3>Summary</h3>

<p>Singleton objects in Kotlin are powerful tools for managing global state or providing utility functions without needing to instantiate a class. The <code>object</code> keyword makes it easy to define these singletons, complete with properties, functions, and initialization blocks.</p>

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
