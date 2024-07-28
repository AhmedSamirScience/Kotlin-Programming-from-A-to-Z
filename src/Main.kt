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
