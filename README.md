<body>

<h1>Kotlin Custom Property Getters and Setters Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates the use of custom property getters and setters. In Kotlin, properties can have custom logic for their getters and setters, allowing you to control how property values are accessed and modified. This example showcases how to define custom getters and setters for both read-only (<code>val</code>) and read-write (<code>var</code>) properties.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates the use of custom property getters and setters in Kotlin.
 *
 * Properties in Kotlin can have custom logic for their getters and setters, allowing you to control
 * how property values are accessed and modified. This example showcases how to define custom
 * getters and setters for both read-only (`val`) and read-write (`var`) properties.
 */

class GameObject {

    // Read-only property with a custom getter
    val y: Int
        get() {
            // Custom logic to calculate the current y location
            println("Getting y location...")
            return (0..100).random()  // Just a random example
        }

    // Read-only property with a custom getter
    val x: Int
        get() {
            // Custom logic to calculate the current x location
            println("Getting x location...")
            return (0..100).random()  // Just a random example
        }

    // Read-write property with custom getter and setter
    var name: String = "Unknown"
        get() {
            // Custom logic to get the name
            println("Getting name...")
            return field.uppercase()  // Return the name in uppercase
        }
        set(value) {
            // Custom logic to set the name
            println("Setting name...")
            field = value.trim()  // Set the name after trimming whitespace
        }
}

fun main() {
    val gameObject = GameObject()

    // Accessing the custom getter for y
    println("y: ${gameObject.y}")

    // Accessing the custom getter for x
    println("x: ${gameObject.x}")

    // Accessing and modifying the custom getter and setter for name
    println("Initial name: ${gameObject.name}")
    gameObject.name = "  NewName  "
    println("Updated name: ${gameObject.name}")
}

/*
 * Output:
 * Getting y location...
 * y: 57
 * Getting x location...
 * x: 23
 * Getting name...
 * Initial name: UNKNOWN
 * Setting name...
 * Getting name...
 * Updated name: NEWNAME
 */

/**
 * Explanation:
 *
 * - `y` and `x` are read-only properties with custom getters. The getters simulate calculating the current location by generating a random value.
 * - `name` is a read-write property with custom getter and setter. The getter returns the name in uppercase, while the setter trims any leading or trailing whitespace before storing the value.
 *
 * - `field` is a special identifier used in custom setters to refer to the underlying property value.
 * - Custom getters and setters allow you to control how property values are accessed and modified, providing a powerful tool for encapsulating logic.
 */

/**
 * Summary:
 *
 * - **Custom Getters**: Define custom logic for retrieving a property's value using the `get()` function.
 * - **Custom Setters**: For `var` properties, define custom logic for modifying a property's value using the `set(value)` function.
 * - **Use Case**: Custom getters and setters provide a way to encapsulate logic, ensuring that any access or modification of properties adheres to the rules and behaviors you define.
 */
</code>
</pre>

<h3>Custom Property Getters and Setters in Kotlin</h3>

<ul>
    <li><strong>Custom Getters:</strong> Define custom logic for retrieving a property's value using the <code>get()</code> function.</li>
    <li><strong>Custom Setters:</strong> For <code>var</code> properties, define custom logic for modifying a property's value using the <code>set(value)</code> function.</li>
    <li><strong>Use Case:</strong> Custom getters and setters provide a way to encapsulate logic, ensuring that any access or modification of properties adheres to the rules and behaviors you define.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different examples demonstrating the use of custom property getters and setters.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
