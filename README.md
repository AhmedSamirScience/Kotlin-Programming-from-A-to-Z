<body>

<h1>Kotlin Higher-Order Functions Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the concept of higher-order functions, which are functions that can take other functions as parameters or return functions as results. Higher-order functions are a key concept in functional programming.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Higher Order Function Concepts:
 * Since we can assign a function reference to a `val` or `var`, we can also pass a function reference as an argument to another function.
 * Functions that do this are called Higher-Order Functions, a key concept in Functional Programming.
 *
 * In Kotlin, Higher-Order Functions (Higher-Order Functions are functions that do at least one of the following (and may do both)):
 * - Take one or more functions as a parameter.
 * - Return a function as a result.
 *
 * All other functions are Higher-order functions.
 * Many functions in the Kotlin libraries are higher-order functions, and once you recognize this pattern, you'll see it frequently in various libraries.
 */

fun main() {

    //region Higher Order Function Example
    /**
     * For example, we can define a function to increment a value by 1 or a function to multiply an integer by itself and use these functions with processor():
     */
    // Anonymous function
    val increment = fun(i: Int) = i + 1
    println(processor(5, increment))

    // Lambda function
    val mult: (Int) -> Int = { x -> x * x }
    println(processor(5, mult))

    /**
     * In this example, we use both an anonymous function and a lambda function as parameters to processor().
     *
     * The output from this program is:
     * 6
     * 25
     */
    //endregion

    println("-----------")

    //region Higher Order Functions and Lambdas (Inline Lambda and Trailing Lambda Syntax)
    /**
     * It's common to define the lambda function for a Higher-Order Function at the point of invocation. Here's an example:
     */
    // Lambda declared inline
    println(processor(5, { x -> x - 1 }))
    /**
     * This generates the output:
     * 4
     */

    /**
     * This pattern is so common in Kotlin that it provides a special syntax called Trailing Lambda Syntax.
     * This allows the lambda to be defined after the function parameters, as long as the lambda is the last parameter in the Higher-Order Function's parameter list. This is the preferred Kotlin style:
     */
    // Idiomatic Kotlin form
    println(processor(5) { x -> x - 1 })

    /**
     * Kotlin also allows for an even shorter form using an implicit it parameter, if there is just one parameter specified:
     */
    // Short hand form - only available if just one parameter
    println(processor(5) { it - 1 })
    /**
     * This is a concise and idiomatic way to define lambdas in Kotlin.
     */
    //endregion
}

/**
 * Consider the higher-order function processor(). This function takes an integer and another function as parameters.
 * Within processor(), the function passed in as a parameter is applied to the integer parameter, and the result is returned:
 */
// Takes a function and an int
fun processor(x: Int, func: (Int) -> Int): Int {
    return func(x)
}
/**
 * The processor function is higher-order because its behavior and result depend on the function passed into it.
 */
</code>
</pre>

<h3>Higher-Order Functions in Kotlin</h3>

<p>Higher-order functions are functions that can take other functions as parameters or return functions as results. This is a fundamental concept in functional programming. In the example above:</p>

<ul>
    <li><strong>Function Reference:</strong> The <code>increment</code> variable is an anonymous function that increments an integer by 1.
        <pre><code>val increment = fun(i: Int) = i + 1</code></pre>
        It is passed to the <code>processor</code> function, which applies it to the integer 5.
    </li>
    <li><strong>Lambda Function:</strong> The <code>mult</code> variable is a lambda function that multiplies an integer by itself.
        <pre><code>val mult: (Int) -> Int = { x -> x * x }</code></pre>
        It is also passed to the <code>processor</code> function.
    </li>
    <li><strong>Inline Lambda:</strong> A lambda function can be defined inline when calling a higher-order function.
        <pre><code>println(processor(5, { x -> x - 1 }))</code></pre>
    </li>
    <li><strong>Trailing Lambda Syntax:</strong> Kotlin allows trailing lambda syntax for higher-order functions, where the lambda is defined after the function parameters.
        <pre><code>println(processor(5) { x -> x - 1 })</code></pre>
    </li>
    <li><strong>Short Hand Form:</strong> If the lambda has only one parameter, Kotlin allows the use of an implicit <code>it</code> parameter.
        <pre><code>println(processor(5) { it - 1 })</code></pre>
    </li>
</ul>

<h3>Benefits of Higher-Order Functions</h3>

<p>Using higher-order functions provides several benefits:</p>

<ul>
    <li><strong>Reusability:</strong> Higher-order functions enable you to create reusable and composable code blocks.</li>
    <li><strong>Flexibility:</strong> You can pass different functions to higher-order functions, making your code more flexible and adaptable.</li>
    <li><strong>Conciseness:</strong> Using lambdas and higher-order functions can lead to more concise and readable code.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the higher-order function examples.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
6
25
-----------
4
4
4
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
