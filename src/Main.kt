
fun main() {

    /**
     * The box operator (::) can be used to obtain a reference to a named function.
     * By default, when you access a named function, it must be invoked.
     * It is not possible to simply reference the function, as shown below:
     */
    println(increase(5))
    /**
     * Attempting this will result in a compilation error: Function invocation 'increase(...)' expected.
     */
    //val inc = increase


    /**
     * However, using the box operator (::), you can reference a named function without invoking it. The modified program is as follows:
     */
    val inc = ::increase // obtain reference to function
    println(inc)
    println(inc(5))
    /**
     * In this program, we obtain a callable reference to the increase() function and store it in val inc.
     * This means that both increase and inc reference the same function.
     * Calling either increase(5) or inc(5) will execute the same block of code and produce the same result, 6.
     *
     *
     * The output from this program is:
     * 6
     * fun increase(kotlin.Int): kotlin.Int
     * 6
     *
     *
     * The reference held in inc points to the increase function, which takes an Int and returns an Int.
     * Thus, the type of val inc is (Int) -> Int.
     *
     */
}

fun increase(i: Int) = i + 1