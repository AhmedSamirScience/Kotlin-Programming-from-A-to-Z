/**
 * Kotlin allows passing an arbitrary number of arguments into a function using the `vararg` keyword to define a parameter list of arbitrary length.
 */

fun main() {

    /**
     * The `vararg` keyword can only be applied to one parameter in a function.
     * If it's not the last parameter, subsequent parameters must use the named argument syntax.
     */

    greeter4("John")
    greeter4("John", "Denise")
    greeter4("John", "Denise", "Phoebe", "Adam")
    greeter4("John", "Denise", "Phoebe", "Adam", "Jasmine", "Gryff")

    greeter4WithInt("ahmed", "Samir", number = 1)
}


fun greeter4(vararg params: String) {
    params.forEach { print("$it , ") }
    println()
}

fun greeter4WithInt(vararg params: String, number: Int ) {
    params.forEach { print("$it , ") }
    println()
}