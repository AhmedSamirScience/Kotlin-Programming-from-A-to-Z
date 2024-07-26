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