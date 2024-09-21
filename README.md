
<body>

<h1>Kotlin Type Checking and Smart Casting Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates how to check the type of a variable at runtime using the <code>is</code> and <code>!is</code> operators, along with smart casting. Kotlin's smart casting allows the compiler to automatically cast variables to the correct type after a type check, ensuring type safety without requiring manual casting.</p>

<h2>Key Concepts</h2>

<ul>
    <li><strong>is Operator:</strong> Used to check if a variable is of a specific type.</li>
    <li><strong>!is Operator:</strong> Used to check if a variable is not of a specific type.</li>
    <li><strong>Smart Casting:</strong> When the <code>is</code> check passes, Kotlin smart casts the variable to the checked type within the block, allowing access to its properties and methods.</li>
</ul>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This example demonstrates how to check the type of a variable using `is` and `!is` in Kotlin.
 * The `when` expression is used to handle different types based on runtime checks.
 */

fun main() {
    // Initializing a variable of type Any
    var any: Any = "Hello"

    // Using when expression with is and !is to check the type of the variable
    when (any) {
        // If the variable is a String
        is String -> {
            println("any contains a String")
            // Smart cast: any is treated as a String within this block
            println(any.length)
        }
        // If the variable is not a String
        !is String -> {
            println("any does not contain a String")
            // Printing the actual type of the variable
            println(any::class.simpleName)
        }
    }

    // Changing the value of any to a Double
    any = 43.5

    // Re-checking the type with the new value
    when (any) {
        is String -> {
            println("any contains a String")
            println(any.length)
        }
        !is String -> {
            println("any does not contain a String")
            println(any::class.simpleName)
        }
    }
}

/*
 * Output (with "Hello" as the initial value):
 * any contains a String
 * 5
 *
 * Output (with 43.5 as the new value):
 * any does not contain a String
 * Double
 */

/**
 * Explanation:
 *
 * - The variable `any` is of type `Any`, which can hold references to any Kotlin object.
 * - The `when` expression is used to check the type of `any` using the `is` operator.
 * - When `any` is a `String`, the `is` check passes, and the variable is smart cast to `String`, allowing access to its properties (like `length`).
 * - When `any` is not a `String`, the `!is` operator catches this, and the program prints the actual type using `any::class.simpleName`.
 * - When the value of `any` is changed to a `Double`, the `when` expression correctly identifies it as not a `String` and prints the type as `Double`.
 */
</code>
</pre>

<h3>Smart Casting and Type Checking in Kotlin</h3>

<ul>
    <li><strong>Smart Casting:</strong> Kotlin automatically casts variables to the correct type when it can guarantee the type based on preceding code or <code>is</code> checks. This makes the code safer and eliminates the need for explicit type casts in many cases.</li>
    <li><strong>Type Safety:</strong> If the Kotlin compiler cannot guarantee a valid cast, it generates a compile-time error, preventing runtime <code>ClassCastException</code>.</li>
    <li><strong>Handling Multiple Types:</strong> The <code>when</code> expression combined with <code>is</code> checks makes it easy to handle variables that can be of different types at runtime, ensuring type safety and reducing errors.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating type checking and smart casting in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
