


fun main() {

    /**
     * Including round brackets () after val or var func executes the anonymous or lambda or named function.
     * If the brackets are omitted (left out), it references the function itself rather than executing it.
     * Using the :: operator allows referencing a function by name, as shown in:
     */
    val message2 = ::getMessage

    /**
     * The output function getMessage (Kotlin reflection is not available) indicates message2 is a reference to the getMessage function, not its result.
     * This means message2 acts as an alias for getMessage().
     */
    println(message2)


    /**
     * Running either getMessage() or message2() executes the function by accessing its memory location and running the code.
     */


    /**
     * These have two implications:
     * 1- We can create aliases for functions.
     * 2- We can pass function references around.
     *
     * For example, using a lambda function:
     * Here, func is a lambda function taking no parameters and returning Unit.
     * Assigning func to val func1 makes both references to the same lambda function and of the same type.
     */
    val func: () -> Unit = { println("Hello World") }
    val func1 = func
    func()
    func1()

}

fun getMessage(): String {
    return "Hello Kotlin World!"
}