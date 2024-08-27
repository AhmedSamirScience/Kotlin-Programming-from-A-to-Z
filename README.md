
<body>

<h1>Kotlin Explicit Backing Field Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates the use of an explicit backing field. An explicit backing field allows developers to manage the storage of a property's value manually, providing more control over how the property's value is stored and accessed. This approach is useful when you need to implement custom logic around property access or initialization.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This class demonstrates the use of an explicit backing field in Kotlin.
 *
 * An explicit backing field allows the developer to manage the storage of a property's value manually.
 * The backing field is typically a private property with a name that is distinct from the public property it supports.
 *
 * In Kotlin, you can define your own backing field for a property instead of relying on the compiler-generated implicit backing field.
 * This approach allows you to have more control over how the property's value is stored and accessed.
 * When using an explicit backing field, it is common practice to name the backing field with a prefix (e.g., _) to distinguish it from the public property.
 */

class GameObject {

    // Explicit backing field for the 'background' property
    private var _background: String? = null

    // Public property with a custom getter and setter that uses the explicit backing field
    var background: String?
        get() {
            // Initialize the background to "blue" if it hasn't been set
            if (_background == null) {
                _background = "blue"
            }
            return _background
        }
        set(value) {
            _background = value
        }
}

fun main() {
    val obj = GameObject()

    // Accessing the 'background' property before it has been explicitly set
    println("Initial background: ${obj.background}")  // Should print "blue"

    // Setting the 'background' property to a new value
    obj.background = "red"
    println("Updated background: ${obj.background}")  // Should print "red"

    // Resetting the 'background' property to null
    obj.background = null
    println("After reset, background: ${obj.background}")  // Should print "blue" again due to lazy initialization
}

/*
 * Output:
 * Initial background: blue
 * Updated background: red
 * After reset, background: blue
 */

/**
 * Explanation:
 *
 * - The `_background` property is a private backing field that holds the actual value of the `background` property.
 * - The `background` property uses custom getter and setter methods to control access to `_background`.
 * - The getter checks if `_background` is `null`. If it is, the getter initializes it to "blue" before returning the value.
 * - The setter simply assigns the provided value to `_background`.
 *
 * Benefits of Using an Explicit Backing Field:
 *
 * 1. **Control Over Initialization**: The getter can control how and when the property is initialized (e.g., lazy initialization).
 * 2. **Custom Logic**: You can implement custom logic for how the property is accessed and modified.
 * 3. **Encapsulation**: The backing field is private and only accessible through the property's getter and setter, enforcing encapsulation.
 */

/**
 * Summary:
 * Explicit Backing Field: The _background property serves as an explicit backing field for the background property. This private property is managed manually by the custom getter and setter.
 *
 * Lazy Initialization: The getter for background checks if _background is null. If so, it initializes _background to "blue" before returning the value.
 *
 * Custom Logic: The setter allows external code to modify the value of background, which is stored in _background. The getter provides custom logic to ensure a default value is applied if the property is accessed before being explicitly set.
 *
 * Encapsulation: The explicit backing field _background is private, ensuring that it cannot be accessed directly from outside the class. This encapsulation enforces controlled access through the background property.
 *
 * This class.kt file provides a comprehensive example of how to use explicit backing fields in Kotlin, demonstrating how to manage a property's value manually while maintaining control over its initialization and access.
 */
</code>
</pre>

<h3>Explicit Backing Field in Kotlin</h3>

<ul>
    <li><strong>Explicit Backing Field:</strong> The <code>_background</code> property serves as an explicit backing field for the <code>background</code> property. This private property is managed manually by the custom getter and setter.</li>
    <li><strong>Lazy Initialization:</strong> The getter for <code>background</code> checks if <code>_background</code> is <code>null</code>. If so, it initializes <code>_background</code> to "blue" before returning the value.</li>
    <li><strong>Custom Logic:</strong> The setter allows external code to modify the value of <code>background</code>, which is stored in <code>_background</code>. The getter provides custom logic to ensure a default value is applied if the property is accessed before being explicitly set.</li>
    <li><strong>Encapsulation:</strong> The explicit backing field <code>_background</code> is private, ensuring that it cannot be accessed directly from outside the class. This encapsulation enforces controlled access through the <code>background</code> property.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different examples demonstrating the use of explicit backing fields with custom getters and setters.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
