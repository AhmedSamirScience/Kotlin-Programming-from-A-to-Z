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