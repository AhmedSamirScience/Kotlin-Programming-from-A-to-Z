<body>

<h1>Kotlin Shorthand Function Syntax Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the shorthand syntax for functions with a single expression as the body. This shorthand works for both named and anonymous functions, making the code more concise and readable.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Kotlin provides shorthand syntax for functions with a single expression as the body. This shorthand works for both named and anonymous functions.
 *
 * For a named function:
 * fun name(parameter list) = single expression
 *
 * For an anonymous function:
 * fun(parameter list) = single expression
 *
 * In both cases, the compiler automatically figures out the return type from the single expression in the function body.
 */
fun main() {

    /**
     * The return type is automatically inferred by the compiler from the single expression in the function body. For example, the shorthand function:
     */
    fun incrementer(x: Int) = x + 1

    /**
     * Here, the return type is Int, inferred from the expression x + 1. Explicitly defining the return type can be good practice for clarity, like this:
     */
    fun incrementerButWeDefinedReturnType(x: Int): Int = x * 3

    /**
     * An example of using this shorthand function definition for an anonymous function below.
     * The return type is inferred from adding one to the integer i. You can use this function normally.
     */
    val adder = fun(i: Int) = i + 1

    println(incrementer(5))
    println(incrementerButWeDefinedReturnType(5))
    println(adder(5))

}
</code>
</pre>

<h3>Shorthand Function Syntax in Kotlin</h3>

<p>Kotlin provides a shorthand syntax for functions with a single expression as the body. This shorthand can be applied to both named and anonymous functions:</p>

<ul>
    <li><strong>Named Function:</strong> <code>fun name(parameter list) = single expression</code></li>
    <li><strong>Anonymous Function:</strong> <code>fun(parameter list) = single expression</code></li>
</ul>

<p>In both cases, the compiler automatically infers the return type from the single expression in the function body.</p>

<h3>Examples of Shorthand Function Syntax</h3>

<ul>
    <li><strong>Named Function with Inferred Return Type:</strong> The `incrementer` function returns an `Int` inferred from the expression `x + 1`.
        <pre><code>fun incrementer(x: Int) = x + 1</code></pre>
    </li>
    <li><strong>Named Function with Explicit Return Type:</strong> The `incrementerButWeDefinedReturnType` function explicitly defines the return type `Int` for clarity.
        <pre><code>fun incrementerButWeDefinedReturnType(x: Int): Int = x * 3</code></pre>
    </li>
    <li><strong>Anonymous Function with Inferred Return Type:</strong> The `adder` function is an anonymous function that returns an `Int` inferred from the expression `i + 1`.
        <pre><code>val adder = fun(i: Int) = i + 1</code></pre>
    </li>
</ul>

<h3>Benefits of Shorthand Syntax</h3>

<p>Using shorthand syntax for functions provides several benefits:</p>

<ul>
    <li><strong>Conciseness:</strong> The code is more concise and easier to read, reducing boilerplate.</li>
    <li><strong>Readability:</strong> The intent of the function is clear from a single expression, improving readability.</li>
    <li><strong>Automatic Type Inference:</strong> The compiler automatically infers the return type, reducing the need for explicit type declarations.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the shorthand function syntax examples.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
6
15
6
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
