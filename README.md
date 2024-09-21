<body>

<h1>Kotlin Anonymous Objects and Inheritance Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates two key concepts:</p>

<ul>
    <li>How anonymous objects can inherit from an open class in Kotlin.</li>
    <li>How every class in Kotlin implicitly inherits from the <code>Any</code> class, the root of the Kotlin class hierarchy.</li>
</ul>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates:
 * 1. How anonymous objects can inherit from an open class in Kotlin.
 * 2. How every class in Kotlin implicitly inherits from the `Any` class, the root of the Kotlin class hierarchy.
 */

// Open class that can be inherited
open class LogIt {
    fun log() = println("log")
}

fun main() {
    // Anonymous object extending the `LogIt` class
    val obj = object : LogIt() {
        var x: Int = 0
        val y: Int = 42
    }

    // Accessing properties of the anonymous object
    println("Anonymous object properties -> obj.x = ${obj.x}, obj.y = ${obj.y}")

    // Calling the inherited `log()` function from the `LogIt` class
    obj.log()

    // Demonstrating class inheritance from Any
    val user = User("John", 30)

    // Methods inherited from Any
    println("\nClass User implicitly inherits from Any")
    println("User's toString: ${user.toString()}")
    println("User's hashCode: ${user.hashCode()}")
    println("Comparing user object to itself using equals: ${user.equals(user)}")
}

/**
 * A simple class representing a User, with implicit inheritance from Any.
 * 
 * Every class in Kotlin that does not explicitly inherit from another class
 * automatically inherits from the `Any` class, which is the root class.
 */
class User(val name: String, val age: Int)
// The above class implicitly extends Any, which is equivalent to:
// class User(val name: String, val age: Int) : Any()

/*
 * Output:
 * 
 * Anonymous object properties -> obj.x = 0, obj.y = 42
 * log
 * 
 * Class User implicitly inherits from Any
 * User's toString: User@3ac3fd8b  // toString prints class name and hashCode by default
 * User's hashCode: 984847019  // Example of hashCode output
 * Comparing user object to itself using equals: true
 */

/**
 * Explanation:
 * 
 * 1. **Anonymous Objects and Inheritance**:
 *    - The anonymous object in `main()` extends the `LogIt` class and inherits the `log()` method.
 *    - The object defines its own properties `x` and `y`.
 *    - The anonymous object uses both its own properties and the inherited `log()` method from `LogIt`.
 * 
 * 2. **Class `Any` and Inheritance**:
 *    - The `User` class does not explicitly specify a superclass, so it implicitly extends `Any`, the root class in Kotlin.
 *    - Every class in Kotlin inherits methods from `Any`, such as `toString()`, `hashCode()`, and `equals()`.
 *    - The `Any` class provides basic functionality that is available to all Kotlin classes.
 */
</code>
</pre>

<h3>Anonymous Objects and Inheritance in Kotlin</h3>

<ul>
    <li><strong>Anonymous Objects:</strong> In Kotlin, anonymous objects can inherit from open classes, allowing them to use methods and properties from the superclass while defining their own properties.</li>
    <li><strong>Implicit Inheritance from <code>Any</code>:</strong> Every class in Kotlin, including user-defined classes like <code>User</code>, implicitly inherits from the <code>Any</code> class, the root class of all Kotlin classes. The <code>Any</code> class provides default implementations of basic methods like <code>toString()</code>, <code>hashCode()</code>, and <code>equals()</code>.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of an example demonstrating how anonymous objects can extend open classes and how Kotlin classes inherit from the <code>Any</code> class.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
