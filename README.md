<body>

<h1>Kotlin Returning Functions Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates how to return functions from other functions. This allows for selecting from different options or creating new functions based on parameters.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Returning Functions in Kotlin
 * In Kotlin, you can return functions from other functions, allowing you to select from different options or create new functions based on parameters.
 */

fun main() {

    //region Returning a Lambda Function
    /**
     * Here's an example that creates a lambda function to check if a number is even, positive, negative, or returns true for any other input:
     */
    fun makeChecker(s: String): (Int) -> Boolean =
        when (s) {
            "even" -> { n: Int -> n % 2 == 0 }
            "positive" -> { n: Int -> n >= 0 }
            "negative" -> { n: Int -> n < 0 }
            else -> { n: Int -> true }
        }
    /**
     * This function returns a lambda function based on the input string.
     * The when expression defines the function body and the else clause handles any other input.
     */

    /**
     * Using the Lambda Function
     * Here's how you can use the makeChecker function to create specific checkers:
     */
    val isEven = makeChecker("even")
    val isPositive = makeChecker("positive")
    val isNegative = makeChecker("negative")
    val isInteger = makeChecker("")

    println("isEven(3): ${isEven(3)}")
    println("isPositive(3): ${isPositive(3)}")
    println("isNegative(3): ${isNegative(3)}")
    println("isInteger(3): ${isInteger(3)}")
    /**
     * Output:
     * isEven(3): false
     * isPositive(3): true
     * isNegative(3): false
     * isInteger(3): true
     *
     */
    //endregion

    //region Returning Anonymous Functions
    /**
     * You can also return anonymous functions:
     */
    fun makeAnonFunction(): (Int, Int) -> Int {
        return fun(x: Int, y: Int) = x + y
    }
    val func1 = makeAnonFunction()
    println("func1(3, 2): ${func1(3, 2)}")
    println("func1(3, 3): ${func1(3, 3)}")
    println("func1(3, 1): ${func1(3, 1)}")
    println("-------------")
    /**
     * Output:
     * func1(3, 2): 5
     * func1(3, 3): 6
     * func1(3, 1): 4
     */
    //endregion

    //region Returning Named Functions
    /**
     * Returning named functions involves using the box operator (::):
     */
    fun makeNamedFunction(): (Int, Int) -> Int {
        fun adder(x: Int, y: Int): Int {
            return x + y
        }
        return ::adder
    }
    val func2 = makeNamedFunction()
    println("func2(3, 2): ${func2(3, 2)}")
    println("func2(3, 3): ${func2(3, 3)}")
    println("func2(3, 1): ${func2(3, 1)}")
    /**
     * Output:
     * func2(3, 2): 5
     * func2(3, 3): 6
     * func2(3, 1): 4
     */
    //endregion

}
</code>
</pre>

<h3>Returning Functions in Kotlin</h3>

<p>In Kotlin, you can return functions from other functions, allowing you to create flexible and reusable code. This can be done with lambda functions, anonymous functions, or named functions. The examples in the code above demonstrate these concepts.</p>

<h3>Examples of Returning Functions</h3>

<ul>
    <li><strong>Returning a Lambda Function:</strong> The <code>makeChecker</code> function returns a lambda function based on the input string.
        <pre><code>
fun makeChecker(s: String): (Int) -> Boolean =
    when (s) {
        "even" -> { n: Int -> n % 2 == 0 }
        "positive" -> { n: Int -> n >= 0 }
        "negative" -> { n: Int -> n < 0 }
        else -> { n: Int -> true }
    }
        </code></pre>
    </li>
    <li><strong>Using the Lambda Function:</strong> The <code>makeChecker</code> function is used to create specific checkers.
        <pre><code>
val isEven = makeChecker("even")
val isPositive = makeChecker("positive")
val isNegative = makeChecker("negative")
val isInteger = makeChecker("")

println("isEven(3): ${isEven(3)}")
println("isPositive(3): ${isPositive(3)}")
println("isNegative(3): ${isNegative(3)}")
println("isInteger(3): ${isInteger(3)}")
        </code></pre>
    </li>
    <li><strong>Returning Anonymous Functions:</strong> The <code>makeAnonFunction</code> function returns an anonymous function.
        <pre><code>
fun makeAnonFunction(): (Int, Int) -> Int {
    return fun(x: Int, y: Int) = x + y
}
val func1 = makeAnonFunction()
println("func1(3, 2): ${func1(3, 2)}")
println("func1(3, 3): ${func1(3, 3)}")
println("func1(3, 1): ${func1(3, 1)}")
        </code></pre>
    </li>
    <li><strong>Returning Named Functions:</strong> The <code>makeNamedFunction</code> function returns a named function using the box operator (::).
        <pre><code>
fun makeNamedFunction(): (Int, Int) -> Int {
    fun adder(x: Int, y: Int): Int {
        return x + y
    }
    return ::adder
}
val func2 = makeNamedFunction()
println("func2(3, 2): ${func2(3, 2)}")
println("func2(3, 3): ${func2(3, 3)}")
println("func2(3, 1): ${func2(3, 1)}")
        </code></pre>
    </li>
</ul>

<h3>Benefits of Returning Functions</h3>

<p>Using functions as return types provides several benefits:</p>

<ul>
    <li><strong>Reusability:</strong> You can create reusable functions that can be customized based on the parameters.</li>
    <li><strong>Flexibility:</strong> Returning functions allows for dynamic and flexible code, where the exact behavior can be determined at runtime.</li>
    <li><strong>Conciseness:</strong> Using lambda expressions and anonymous functions can lead to more concise and readable code.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the function examples.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
isEven(3): false
isPositive(3): true
isNegative(3): false
isInteger(3): true
func1(3, 2): 5
func1(3, 3): 6
func1(3, 1): 4
-------------
func2(3, 2): 5
func2(3, 3): 6
func2(3, 1): 4
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
