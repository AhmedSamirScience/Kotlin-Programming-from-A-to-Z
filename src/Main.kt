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



