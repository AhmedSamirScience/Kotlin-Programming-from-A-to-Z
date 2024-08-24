<body>

<h1>Kotlin `const` and `val` Properties Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates the use of the <code>const</code> keyword with <code>val</code> properties. The <code>const</code> keyword is used for defining properties that are compile-time constants, which are useful for values that remain constant throughout the program and can be inlined by the compiler.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates the use of `const` with `val` properties in Kotlin.
 * 
 * The `const` keyword is applied to properties that are compile-time constants.
 * These properties are useful for defining values that are constant throughout the program and can be inlined by the compiler.
 */

object MathUtils {
    // Specifying useful compile-time constant properties
    const val ZERO = 0
    const val MIN: Int = -100
    const val MAX = 100
}

fun main() {
    // Accessing the const properties in MathUtils
    println("ZERO: ${MathUtils.ZERO}")
    println("MIN: ${MathUtils.MIN}")
    println("MAX: ${MathUtils.MAX}")

    // Using the const properties in calculations
    val range = MathUtils.MAX - MathUtils.MIN
    println("Range from MIN to MAX: $range")
}

/*
 * Output:
 * ZERO: 0
 * MIN: -100
 * MAX: 100
 * Range from MIN to MAX: 200
 */

/**
 * Explanation:
 * 
 * - `MathUtils` is an object that contains compile-time constant properties `ZERO`, `MIN`, and `MAX`.
 * - These properties are marked with `const`, indicating they are constants determined at compile time.
 * - The properties can be accessed and used directly in calculations, as shown in the `main` function.
 * 
 * Benefits of Using `const`:
 * 
 * 1. **Explicit Declaration**: It is clear to the compiler and developers that these values are constants.
 * 2. **Compiler Optimizations**: The compiler can optimize the code by inlining these constant values directly where they are used.
 * 3. **Improved Code Semantics**: It helps other developers understand that these values are meant to be compile-time constants.
 */

/**
 * Summary:
 * 
 * - **Usage of `const`**: The `const` keyword is used to mark `val` properties as compile-time constants, meaning their values are fixed at compile time and cannot be changed.
 * 
 * - **Constraints**: `const` can only be applied to `val` properties that are initialized with values derivable at compile time and are of basic types like `Int`, `Boolean`, or `String`.
 * 
 * - **Benefits**: 
 *   - Makes it explicit to the compiler and other developers that the value is a compile-time constant.
 *   - Allows the compiler to perform optimizations, such as inlining the value directly in the code.
 *   - Enhances the readability and maintainability of the code by clearly indicating that the value is immutable and constant.
 */
</code>
</pre>

<h3>Usage of `const` in Kotlin</h3>

<ul>
    <li><strong>Explicit Declaration:</strong> The <code>const</code> keyword is used to mark <code>val</code> properties as compile-time constants, ensuring their values are fixed and immutable.</li>
    <li><strong>Compiler Optimizations:</strong> The compiler can optimize code by inlining these constant values directly where they are used.</li>
    <li><strong>Improved Code Semantics:</strong> The use of <code>const</code> clearly indicates to developers that these values are intended to be compile-time constants.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different examples demonstrating the use of <code>const</code> properties.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
