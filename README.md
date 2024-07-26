<body>

<h1>Kotlin Lambda Expressions Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the use of lambda expressions in Kotlin. Lambdas are a simpler form of function literals compared to anonymous functions, offering a more concise syntax for defining functions.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * A lambda expression is a simpler function literal compared to an anonymous function.
 * While anonymous functions can specify return types and have complex bodies with multiple return statements, lambdas are typically single expressions and use a more concise syntax.
 *
 * Lambdas don't declare an explicit return type; it is inferred by the Kotlin compiler.
 * They are surrounded by curly brackets and can be assigned to a val, var, or passed as a parameter. The syntax for a lambda is:
 *
 * kotlin Code Example
 * { (parameter list) -> expression }
 *
 * Lambdas can have any number of arguments but only one expression in their body, which returns a value when executed.
 */
fun main() {

    //region 1
    /**
     * Lambdas can have any number of arguments but only one expression as their body.
     * When executed, the expression returns a value as the result of the function.
     *
     * Examples Below:
     */

    val increment: (Int) -> Int = { x -> x + 1 }
    val increase = { x: Int -> x + 1 }

    /**
     * In these examples, the lambda takes one parameter and is stored in a val.
     *
     * The first example explicitly states the type of the val as (Int) -> Int, indicating a function that takes an Int and returns an Int.
     * The second example allows the Kotlin compiler to infer the type of increase, but we must specify the type of x because it cannot be inferred otherwise.
     */
    println(increment(5))
    println(increase(5))
    //endregion


    //region 2
    /**
     * Other examples of lambda functions show that a lambda can take any number of arguments, from zero upwards:
     *
     * func0 is a lambda with no arguments, printing "no args".
     * func1 is similar but lets the compiler infer the type.
     * func2 takes two Int arguments and returns their product.
     * func3 is similar to func2, with type inference for the parameters.
     *
     */
    val func0: () -> Unit = { println("no args") }
    val func1 = { print("no args") }
    val func2: (Int, Int) -> Int = { x, y -> x * y }
    val func3 = { x: Int, y: Int -> x * y}

    func0()
    func1()
    println(func2(3, 4))
    println(func3(2, 3))
    //endregion

}
</code>
</pre>

<h3>Lambda Expressions in Kotlin</h3>

<p>Kotlin supports lambda expressions, which are a simpler and more concise way to define function literals compared to anonymous functions. A lambda expression in Kotlin has the following syntax:</p>

<pre><code>{ (parameter list) -> expression }</code></pre>

<p>Lambdas can have any number of arguments but only one expression in their body, which returns a value when executed. The return type is inferred by the Kotlin compiler.</p>

<h3>Examples of Lambda Expressions</h3>

<ul>
    <li><strong>Single Argument Lambda:</strong> The `increment` and `increase` lambdas take one parameter and return the incremented value.
        <pre><code>val increment: (Int) -> Int = { x -> x + 1 }
val increase = { x: Int -> x + 1 }</code></pre>
    </li>
    <li><strong>No Argument Lambda:</strong> The `func0` and `func1` lambdas take no parameters and print a message.
        <pre><code>val func0: () -> Unit = { println("no args") }
val func1 = { print("no args") }</code></pre>
    </li>
    <li><strong>Multiple Arguments Lambda:</strong> The `func2` and `func3` lambdas take two parameters and return their product.
        <pre><code>val func2: (Int, Int) -> Int = { x, y -> x * y }
val func3 = { x: Int, y: Int -> x * y }</code></pre>
    </li>
</ul>

<h3>Benefits of Lambda Expressions</h3>

<p>Using lambda expressions provides several benefits:</p>

<ul>
    <li><strong>Conciseness:</strong> Lambdas reduce boilerplate code, making the code more concise and easier to read.</li>
    <li><strong>Readability:</strong> The intent of the function is clear from a single expression, improving readability.</li>
    <li><strong>Flexibility:</strong> Lambdas can be stored in variables, passed as arguments to functions, and returned from functions, providing greater flexibility in defining behavior on the fly.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the lambda expression examples.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
6
6
no args
no args
12
6
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
