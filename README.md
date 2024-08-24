<body>

<h1>Kotlin `lateinit` with `var` Properties Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates the use of the <code>lateinit</code> modifier with <code>var</code> properties. The <code>lateinit</code> modifier allows a property to be initialized later, after its declaration, offering flexibility in scenarios where immediate initialization is not possible or necessary.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates the use of `lateinit` with `var` properties in Kotlin.
 *
 * The `lateinit` modifier allows a `var` property to be initialized later, rather than at the time of declaration or within an `init` block.
 * The developer is responsible for ensuring that the property is initialized before it is accessed; otherwise, a runtime error will occur.
 */

object MyUtils {
    // Lateinit allows the value to be provided later on
    lateinit var title: String

    // Function that uses the lateinit property
    fun printTitle() {
        println("Title length: ${title.length}")
        println("Title: $title")
    }
}

fun main() {
    // Proper initialization before use
    MyUtils.title = "KVaders"
    MyUtils.printTitle()

    // Uncommenting the following line without initializing the title will cause a runtime error
    // MyUtils.printTitle()  // This will throw UninitializedPropertyAccessException
}

/*
 * Output (when properly initialized):
 * Title length: 7
 * Title: KVaders
 */

/*
 * If the title property is not initialized before usage, the following runtime error occurs:
 * Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property
 * title has not been initialized
 * at MyUtils.printTitle(MyUtils.kt:10)
 * at MyUtilsKt.main(MyUtils.kt:19)
 * at MyUtilsKt.main(MyUtils.kt)
 */

/**
 * Explanation:
 *
 * - The `title` property in `MyUtils` is marked with `lateinit`, indicating that it will be initialized later.
 * - The `printTitle` function accesses the `title` property, printing its length and value.
 * - If `title` is not initialized before `printTitle` is called, a `UninitializedPropertyAccessException` will be thrown at runtime.
 *
 * Restrictions on `lateinit`:
 *
 * 1. Can only be used with `var` (read–write) properties.
 * 2. Cannot be used with nullable properties.
 * 3. Cannot be used with basic or fundamental types such as `Int`, `Boolean`, `Double`, etc.
 */

/**
 * Summary:
 *
 * - **`lateinit` Usage**: The `lateinit` keyword allows you to delay the initialization of a `var` property. It provides flexibility in situations where the property cannot be immediately initialized but will be set before use.
 *
 * - **Important Considerations**:
 *   - Ensure that the `lateinit` property is initialized before any access; otherwise, a `UninitializedPropertyAccessException` will occur at runtime.
 *   - `lateinit` is limited to non-nullable reference types and cannot be applied to basic types or nullable properties.
 *
 * - **Example**:
 *   - The `MyUtils` object demonstrates how to declare a `lateinit` property (`title`), set it later, and then access it safely. If the property is accessed without initialization, a runtime error is triggered.
 *
 * Explanation:
 * MyUtils Object: The object contains a lateinit var property title, which is intended to be initialized later in the program.
 * printTitle Function: This function accesses the title property and prints its length and value. It relies on title being initialized before it is called.
 * Runtime Safety: If the title property is not initialized before use, Kotlin throws an UninitializedPropertyAccessException at runtime, alerting the developer to the issue.
 * Restrictions: lateinit can only be used with var properties that are non-nullable reference types, not with basic data types or nullable types.
 * This class.kt file provides a complete and structured example of how to use lateinit with var properties in Kotlin, with detailed comments explaining the correct usage, potential pitfalls, and runtime safety considerations.
 */
</code>
</pre>

<h3>Usage of `lateinit` in Kotlin</h3>

<ul>
    <li><strong>`lateinit` Usage:</strong> The <code>lateinit</code> keyword allows you to delay the initialization of a <code>var</code> property. It provides flexibility in situations where the property cannot be immediately initialized but will be set before use.</li>
    <li><strong>Runtime Safety:</strong> Ensure that the <code>lateinit</code> property is initialized before any access; otherwise, a <code>UninitializedPropertyAccessException</code> will occur at runtime.</li>
    <li><strong>Restrictions:</strong> <code>lateinit</code> can only be used with non-nullable reference types and cannot be applied to basic types or nullable properties.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different examples demonstrating the use of <code>lateinit</code> properties.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
