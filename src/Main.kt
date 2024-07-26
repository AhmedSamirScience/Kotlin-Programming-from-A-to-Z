/**
 * Kotlin supports anonymous functions, which are unnamed functions defined as:
 *
 * fun(parameter list): return-type { func body }
 *
 * The return-type is optional but required if the function returns a value.
 * Anonymous functions are useful for defining behavior on the fly without adding extra names to your program.
 * They can only be invoked at the point of declaration unless stored in a variable.
 */
fun main() {

    val func = fun(i: Int): Int { return i + 1 }

    /**
     * When the val func, along with the round brackets () is used above, it accesses
     * the anonymous function and executes it. So, this causes the value 5 to be passed into the
     * anonymous function and to have its value incremented by one.
     */
    println(func(5))

}