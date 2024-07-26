/**
 * You may wonder why Kotlin has both anonymous functions and lambda functions since they seem similar.
 * The short answer is that anonymous functions are more flexible and can have multiple return statements, unlike lambdas.
 */

/**
 * Anonymous functions are more flexible because:
 *
 * They can have complex bodies, while lambdas have a single expression body.
 * They can have multiple return statements, whereas lambdas have a single implied return value.
 * You can explicitly specify the return type of an anonymous function, while the compiler determines the return type for a lambda.
 */
fun main() {

    /**
     * Multiple Return Statements
     * The ability to have multiple return statements means that within a single function, you can return from the function at multiple points based on different conditions.
     * This is often useful for complex logic where the function needs to terminate early or return different values based on various conditions.
     *
     *
     * Example in Kotlin
     * Lambda Function
     * Lambda functions are concise but have limitations. They cannot have multiple explicit return points.
     * In a lambda, the return keyword returns from the nearest enclosing function, not just from the lambda itself. Here's an example of a lambda function:
     */
    val checkNumberLambda: (Int) -> String = { number ->
        if (number > 0) {
            "Positive"
        } else {
            "Non-positive"
        }
    }

    // Using the lambda function
    println(checkNumberLambda(5))  // Output: Positive
    println(checkNumberLambda(-3)) // Output: Non-positive


    /**
     * Anonymous Function
     * Anonymous functions allow you to use multiple return statements, providing more control over the flow of execution.
     * Here's how you can use an anonymous function to achieve this:
     */
    val checkNumberAnonymous: (Int) -> String = fun(number: Int): String {
        if (number > 0) {
            return "Positive"
        } else if (number < 0) {
            return "Negative"
        }
        return "Zero"
    }

    // Using the anonymous function
    println(checkNumberAnonymous(5))  // Output: Positive
    println(checkNumberAnonymous(-3)) // Output: Negative
    println(checkNumberAnonymous(0))  // Output: Zero

    /**
     * Explanation
     * Lambda Function:
     *
     * The lambda function uses an implicit return. It evaluates the condition and returns the result based on that condition.
     * There is only one implicit return point, and the function must be written in a way that doesn't need multiple explicit returns.
     * Anonymous Function:
     *
     * The anonymous function uses explicit return statements. It can return different values at multiple points based on various conditions.
     * This provides more flexibility, as you can handle more complex logic and exit the function early if needed.
     */


}