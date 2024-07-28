<body>

<h1>Kotlin Currying Function Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the concept of currying functions. Currying allows new functions to be created from existing functions by binding one or more parameters to a specific value. This technique is useful for reusing functionality in different situations.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Introduction to Currying Function
 * Currying is a technique that allows new functions to be created from existing functions by binding one or more parameters to a specific value.
 * This enables reuse of functions in Kotlin, allowing functionality to be written once and reused in multiple situations.
 *
 * The technique is named after Haskell Curry, for whom the Haskell programming language is also named.
 *
 * This chapter introduces the core ideas behind currying and explores how currying can be implemented in Kotlin.
 * It also introduces the concept of closures and their impact on curried functions.
 */

fun main() {

    //region concept of Currying Function
    /**
     * Currying Concepts
     * Consider a function that takes two parameters, x and y, and multiplies them:
     */
    fun operation(x: Int, y: Int) = x * y

    /**
     * You can use this function as follows:
     */
    val total1 = operation(2, 5) // Result: 10
    val total2 = operation(2, 10) // Result: 20

    /**
     * To double a number, you can reuse the operation function multiple times:
     */
    operation(2, 5)
    operation(2, 10)
    operation(2, 6)
    operation(2, 151)

    /**
     * All of the above calls double the second number by using 2 as the first parameter.
     * However, you have to remember to provide 2 each time.
     * What if we could fix the first parameter to always be 2, creating a new function that only takes one parameter (the number to double)?
     */

    /**
     * In pseudo-code, this could look like:
     * val double = operation(2, *)
     * Here, * acts as a wildcard for the missing parameter. You could then write:
     * double(5)
     * double(151)
     * Essentially, double() is an alias for operation(), but it automatically provides the value 2 for the first parameter, leaving the second parameter to be filled in during future invocations.
     * ((((Note: The above is an imaginary syntax; it is not part of Kotlin.)))
     */
    //endregion

    //region Currying in Kotlin
    /**
     * A curried function in Kotlin is a function where one or more of its parameters have been applied or bound to a value, resulting in a new function with fewer parameters than the original.
     * Let's explore how to create and use curried functions in Kotlin.
     */

     /**
     * Example: Multiplication Function
     * First, we create a general function that multiplies two numbers together:
     */
    fun multiply(x: Int, y: Int) = x * y

    //You can invoke this function normally:
    println("multiply(2, 5): ${multiply(2, 5)}")
    /**
     * Output:
     * multiply(2, 5): 10
     */

    /**
     * Creating a Curried Function
     * Next, we define a function that takes another function and a number, returning a new function with one less parameter:
     */
    fun multBy(num: Int, func: (Int, Int) -> Int): (Int) -> Int {
        return fun(y: Int) = func(num, y)
    }
    /**
     * This multBy function binds the first parameter to a value and returns a new function that takes one parameter.
     */

    /**
     * Using the Curried Function
     * You can use multBy to bind the first parameter of multiply:
     */
    val double = multBy(2, ::multiply)
    val triple = multBy(3, ::multiply)

    //Now you can call these new functions:
    println("double(5): ${double(5)}")
    println("triple(5): ${triple(5)}")

    /**
     * Output:
     * double(5): 10
     * triple(5): 15
     */

    /**
     * Using Anonymous Functions or Lambdas
     * You can also use anonymous functions or lambdas with the multBy function:
     */
    val doubler = multBy(2) { i, j -> i * j }
    val tripler = multBy(3) { i, j -> i * j }
    println("doubler(5): ${doubler(5)}")
    println("tripler(5): ${tripler(5)}")
    /**
     * Output:
     * doubler(5): 10
     * tripler(5): 15
     */
    //endregion

    /**
     * Conclusion
     * Curried functions are useful for creating new functions from existing ones by binding one or more parameters to specific values.
     * This technique enables code reuse and flexibility in functional programming.
     */

}
</code>
</pre>

<h3>Introduction to Currying Functions</h3>

<p>Currying is a technique that allows new functions to be created from existing functions by binding one or more parameters to a specific value. This enables reuse of functions in Kotlin, allowing functionality to be written once and reused in multiple situations. The technique is named after Haskell Curry, for whom the Haskell programming language is also named.</p>

<h3>Currying Concepts</h3>

<p>Consider a function that takes two parameters, <code>x</code> and <code>y</code>, and multiplies them:</p>

<pre><code>
fun operation(x: Int, y: Int) = x * y
</code></pre>

<p>You can use this function as follows:</p>

<pre><code>
val total1 = operation(2, 5) // Result: 10
val total2 = operation(2, 10) // Result: 20
</code></pre>

<p>To double a number, you can reuse the <code>operation</code> function multiple times:</p>

<pre><code>
operation(2, 5)
operation(2, 10)
operation(2, 6)
operation(2, 151)
</code></pre>

<p>All of the above calls double the second number by using 2 as the first parameter. However, you have to remember to provide 2 each time. What if we could fix the first parameter to always be 2, creating a new function that only takes one parameter (the number to double)?</p>

<h3>Currying in Kotlin</h3>

<p>A curried function in Kotlin is a function where one or more of its parameters have been applied or bound to a value, resulting in a new function with fewer parameters than the original. Let's explore how to create and use curried functions in Kotlin.</p>

<p>Example: Multiplication Function</p>

<p>First, we create a general function that multiplies two numbers together:</p>

<pre><code>
fun multiply(x: Int, y: Int) = x * y
</code></pre>

<p>You can invoke this function normally:</p>

<pre><code>
println("multiply(2, 5): ${multiply(2, 5)}") // Output: multiply(2, 5): 10
</code></pre>

<p>Creating a Curried Function</p>

<p>Next, we define a function that takes another function and a number, returning a new function with one less parameter:</p>

<pre><code>
fun multBy(num: Int, func: (Int, Int) -> Int): (Int) -> Int {
    return fun(y: Int) = func(num, y)
}
</code></pre>

<p>This <code>multBy</code> function binds the first parameter to a value and returns a new function that takes one parameter.</p>

<p>Using the Curried Function</p>

<p>You can use <code>multBy</code> to bind the first parameter of <code>multiply</code>:</p>

<pre><code>
val double = multBy(2, ::multiply)
val triple = multBy(3, ::multiply)

println("double(5): ${double(5)}") // Output: double(5): 10
println("triple(5): ${triple(5)}") // Output: triple(5): 15
</code></pre>

<p>Using Anonymous Functions or Lambdas</p>

<p>You can also use anonymous functions or lambdas with the <code>multBy</code> function:</p>

<pre><code>
val doubler = multBy(2) { i, j -> i * j }
val tripler = multBy(3) { i, j -> i * j }

println("doubler(5): ${doubler(5)}") // Output: doubler(5): 10
println("tripler(5): ${tripler(5)}") // Output: tripler(5): 15
</code></pre>

<h3>Conclusion</h3>

<p>Curried functions are useful for creating new functions from existing ones by
