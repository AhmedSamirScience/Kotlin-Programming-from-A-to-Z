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