/**
 * Referencing Member Functions
 * You can create a callable reference to a member function using the box operator (::).
 * This allows you to reference a member function at one point in your program and invoke it at another.
 * The callable reference can be for a class (e.g., String) or a specific instance (e.g., the string "42").
 *
 * Here’s an example of a callable reference to the toInt() member function of the String class:
 * // A callable reference to a method on class String
 * val func3: (String) -> Int = String::toInt
 *
 * You can use this by calling func3() and passing in a string:
 * println("func3('3'): ${func3("3")}")
 *
 * For a specific string, you can use a bound callable reference:
 * // A bound callable reference
 * val func4: () -> Int = "4"::toInt
 *
 * Invoke this by calling the function without any parameters:
 * println("func4(): ${func4()}")
 *
 */

fun main() {


}