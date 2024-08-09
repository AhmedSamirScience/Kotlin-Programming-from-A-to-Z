/**
 * In Kotlin, you can provide default values for constructor parameters, making them optional.
 * To do this, add an assignment operator (=) followed by the default value in the parameter list.
 * Here’s an example with the Person2 class:
 */
class Person2(val name: String = "", val age: Int = 0)

/**
 * In Person2, both name and age are optional parameters, with name defaulting to "" and age to 0.
 *
 * If all parameters have default values, the compiler generates a zero-parameter constructor, which is useful for Java interoperability.
 *
 * Given the Person2 class definition, you can create instances in the following ways:
 */
fun main() {

    /**
     * p1 is an instance of Person2 with name as "John" and age as 36.
     * p2 is an instance with name as "Denise" and age using the default value 0.
     * p3 is an instance with both name and age using their default values, "" and 0, respectively.
     */
    val p1 = Person2("John", 36)
    val p2 = Person2("Denise")
    val p3 = Person2()
}