<body>

<h1>Kotlin Closures Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the concept of closures. Closures allow functions to "capture" variables from their surrounding environment and access them later, even if those variables are no longer in scope. This feature is fundamental in functional programming, enabling the creation of flexible and reusable functions.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Closure in Kotlin: A Detailed Explanation
 * Closures are an important concept in functional programming, allowing functions to "capture" variables from their surrounding environment and access them later, even if those variables are no longer in scope.
 * Let's delve deeper into what closures are, how they work, and see some detailed examples in Kotlin.
 *
 * What is a Closure?
 * A closure (or lexical closure) is a combination of a function and its referencing environment.
 * This environment contains any local variables that were in scope at the time the function was created.
 * The closure "captures" these variables, allowing the function to continue to access them even after they have gone out of scope.
 *
 * Why Closures Matter
 * Closures are crucial because they enable the creation of flexible and reusable functions.
 * They allow functions to be defined with specific contexts and used in different parts of a program without losing access to those contexts.
 * This is particularly useful in scenarios where you want to pass around small pieces of functionality (like callbacks or event handlers) that need to maintain state.
 *
 */

fun main() {

    //region Example 1: Simple Closure
    //Consider the following Kotlin code:
    var more = 100
    val increase: (Int) -> Int = { i -> i + more }
    println(increase(10))
    more = 50
    println(increase(10))

    /**
     * Output:
     * 110
     * 60
     */

    /**
     * Explanation
     * Variable Declaration: A variable more is declared and initialized to 100.
     * Closure Definition: A lambda function increase is defined that takes an integer i and returns i + more.
     * First Invocation: When increase(10) is called, it adds 10 to the current value of more (which is 100), resulting in 110.
     * Variable Update: The value of more is updated to 50.
     * Second Invocation: When increase(10) is called again, it adds 10 to the updated value of more (which is now 50), resulting in 60.
     * This demonstrates how the lambda function increase retains access to the variable more even after its value has changed.
     */
    //endregion

    //region Example 2: Closure with Local Variables
    //Now consider a more complex example where a closure references a local variable from a different function:
    println(increment(5)) // Output: 6
    resetFunc()
    println(increment(5)) // Output: 55

    /**
     * Explanation
     * Initial Function Definition: increment is initially a lambda function that adds 1 to its input.
     * First Invocation in Main: increment(5) is called in main, returning 6 (5 + 1).
     * Reset Function Invocation: resetFunc is called, which defines a local variable addition with a value of 50.
     * It then reassigns increment to a new lambda function that adds addition to its input.
     * Closure Capture: The new lambda function captures the addition variable from resetFunc.
     * Second Invocation in Main: increment(5) is called again in main, now using the new lambda function that adds 50 to its input, returning 55 (5 + 50).
     * Despite addition being local to resetFunc and resetFunc having finished execution, the lambda function assigned to increment retains access to addition because it has closed over that variable.
     */
    //endregion

    //region Practical Example: Function Factories
    /**
     * Why Closures are Powerful
     * Closures enable several powerful programming patterns:
     *
     * Function Factories: Functions that generate and return other functions with specific behaviors.
     * Callbacks: Functions that can be passed around and invoked at a later time, retaining access to their original scope.
     * Encapsulation: Functions that maintain private state, inaccessible from the outside, enhancing modularity and security.
     *
     * Here's a practical example of using closures to create function factories:
     */
    val double = multiplier(2)
    val triple = multiplier(3)

    println(double(5)) // Output: 10
    println(triple(5)) // Output: 15
    /**
     * Explanation
     * Function Factory: multiplier is a function that takes an integer factor and returns a lambda function that multiplies its input by factor.
     * Creating Closures: double and triple are created using multiplier(2) and multiplier(3), respectively.
     * Using Closures: double(5) and triple(5) invoke the lambda functions, producing outputs 10 and 15.
     * In this example, the lambda functions returned by multiplier capture the factor parameter from their defining environment, allowing them to multiply any input by that factor.
     */

    /**
     * Conclusion:
     * Closures are a fundamental concept in Kotlin and other functional programming languages, providing powerful ways to create flexible, reusable functions that maintain their defining context.
     * By capturing variables from their environment, closures enable sophisticated programming techniques that enhance code modularity, encapsulation, and expressiveness.
     */
    //endregion
}

//region Example 2: Closure with Local Variables
var increment: (Int) -> Int = { x -> x + 1 }
fun resetFunc() {
    val addition = 50
    increment = { a -> a + addition }
}
//endregion

//region Practical Example: Function Factories
fun multiplier(factor: Int): (Int) -> Int {
    return { number -> number * factor }
}
//endregion
</code>
</pre>

<h3>What is a Closure?</h3>

<p>A closure (or lexical closure) is a combination of a function and its referencing environment. This environment contains any local variables that were in scope at the time the function was created. The closure "captures" these variables, allowing the function to continue to access them even after they have gone out of scope.</p>

<h3>Why Closures Matter</h3>

<p>Closures are crucial because they enable the creation of flexible and reusable functions. They allow functions to be defined with specific contexts and used in different parts of a program without losing access to those contexts. This is particularly useful in scenarios where you want to pass around small pieces of functionality (like callbacks or event handlers) that need to maintain state.</p>

<h3>Example 1: Simple Closure</h3>

<p>Consider the following Kotlin code:</p>

<pre><code>
var more = 100
val increase: (Int) -> Int = { i -> i + more }
println(increase(10))
more = 50
println(increase(10))

/**
 * Output:
 * 110
 * 60
 */
</code></pre>

<p>Explanation:</p>

<ul>
    <li><strong>Variable Declaration:</strong> A variable <code>more</code> is declared and initialized to 100.</li>
    <li><strong>Closure Definition:</strong> A lambda function <code>increase</code> is defined that takes an integer <code>i</code> and returns <code>i + more</code>.</li>
    <li><strong>First Invocation:</strong> When <code>increase(10)</code> is called, it adds 10 to the current value of <code>more</code> (which is 100), resulting in 110.</li>
    <li><strong>Variable Update:</strong> The value of <code>more</code> is updated to 50.</li>
    <li><strong>Second Invocation:</strong> When <code>increase(10)</code> is called again, it adds 10 to the updated value of <code>more</code> (which is now 50), resulting in 60.</li>
</ul>

<p>This demonstrates how the lambda function <code>increase</code> retains access to the variable <code>more</code> even after its value has changed.</p>

<h3>Example 2: Closure with Local Variables</h3>

<p>Now consider a more complex example where a closure references a local variable from a different function:</p>

<pre><code>
var increment: (Int) -> Int = { x -> x + 1 }
fun resetFunc() {
    val addition = 50
    increment = { a -> a + addition }
}

println(increment(5)) // Output: 6
resetFunc()
println(increment(5)) // Output: 55
</code></pre>

<p>Explanation:</p>

<ul>
    <li><strong>Initial Function Definition:</strong> <code>increment</code> is initially a lambda function that adds 1 to its input.</li>
    <li><strong>First Invocation in Main:</strong> <code>increment(5)</code> is called in <code>main</code>, returning 6 (5 + 1).</li>
    <li><strong>Reset Function Invocation:</strong> <code>resetFunc</code> is called, which defines a local variable <code>addition</code> with a value of 50. It then reassigns <code>increment</code> to a new lambda function that adds <code>addition</code> to its input.</li>
    <li><strong>Closure Capture:</strong> The new lambda function captures the <code>addition</code> variable from <code>resetFunc</code>.</li>
    <li><strong>Second Invocation in Main:</strong> <code>increment(5)</code> is called again in <code>main</code>, now using the new lambda function that adds 50 to its input, returning 55 (5 + 50).</li>
</ul>

<p>Despite <code>addition</code> being local to <code>resetFunc</code> and <code>resetFunc</code> having finished execution, the lambda function assigned to <code>increment</code> retains access to <code>addition</code> because it has closed over that variable.</p>

<h3>Practical Example: Function Factories</h3>

<p>Closures enable several powerful programming patterns:</p>

<ul>
    <li><strong>Function Factories:</strong> Functions that generate and return other functions with specific behaviors.</li>
    <li><strong>Callbacks:</strong> Functions that can be passed around and invoked at a later time, retaining access to their original scope.</li>
    <li><strong>Encapsulation:</strong> Functions that maintain private state, inaccessible from the outside, enhancing modularity and security.</li>
</ul>

<p>Here's a practical example of using closures to create function factories:</p>

<pre><code>
fun multiplier(factor: Int): (Int) -> Int {
    return { number -> number * factor }
}

val double = multiplier(2)
val triple = multiplier(3)

println(double(5)) // Output: 10
println(triple(5)) // Output: 15
</code></pre>

<p>Explanation:</p>

<ul>
    <li><strong>Function Factory:</strong> <code>multiplier</code> is a function that takes an integer <code>factor</code> and returns a lambda function that multiplies its input by <code>factor</code>.</li>
    <li><strong>Creating Closures:</strong> <code>double</code> and <code>triple</code> are created using <code>multiplier(2)</code> and <code>multiplier(3)</code>, respectively.</li>
    <li><strong>Using Closures:</strong> <code>double(5)</code> and <code>triple(5)</code> invoke the lambda functions, producing outputs 10 and 15.</li>
</ul>

<p>In this example, the lambda functions returned by <code>multiplier</code> capture the <code>factor</code> parameter from their defining environment, allowing them to multiply any input by that factor.</p>

<h3>Conclusion</h3>

<p>Closures are a fundamental concept in Kotlin and other functional programming languages, providing powerful ways to create flexible, reusable functions that maintain their defining context. By capturing variables from their environment, closures enable sophisticated programming techniques that enhance code modularity, encapsulation, and expressiveness.</p>

</code>
</pre>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the closure examples.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
110
60
6
55
10
15
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
