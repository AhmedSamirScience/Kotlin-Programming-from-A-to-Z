/**
 * This class demonstrates property visibility in Kotlin.
 *
 * - The `id` property is a private constructor property, meaning it is only accessible within the class.
 * - The `name` property is a public constructor property, accessible outside the class.
 * - The `desk` property is a private member level property, meaning it is only accessible within the class.
 */
class Person(private val id: String, val name: String) {

    // Member level property with private visibility
    private var desk: String = "at home"

    // Function to access the private properties within the class
    fun describe(): String {
        return "Person(id=$id, name=$name, desk=$desk)"
    }

    // Function to change the desk location
    fun changeDeskLocation(newLocation: String) {
        desk = newLocation
    }
}

fun main() {
    // Creating an instance of Person
    val person = Person("123ABC", "John Doe")

    // Accessing the public property 'name'
    println("Person's Name: ${person.name}")

    // Attempting to access private properties will result in a compile-time error
    // println(person.id) // Error: Cannot access 'id': it is private in 'Person'
    // println(person.desk) // Error: Cannot access 'desk': it is private in 'Person'

    // Using public methods to interact with private properties
    println(person.describe())
    person.changeDeskLocation("in the office")
    println(person.describe())
}

/*
 * Output:
 * Person's Name: John Doe
 * Person(id=123ABC, name=John Doe, desk=at home)
 * Person(id=123ABC, name=John Doe, desk=in the office)
 */

/**
 * Explanation:
 *
 * - `id` is a private constructor property, so it must be provided when the `Person` class is instantiated, but it cannot be accessed from outside the class.
 * - `name` is a public constructor property, making it accessible from outside the class.
 * - `desk` is a private member level property, so it can only be accessed within the `Person` class.
 * - The `describe()` function provides a way to access and display private properties.
 * - The `changeDeskLocation()` function allows modification of the `desk` property within the class.
 *
 * Note: Private properties can be either `val` (read-only) or `var` (read-write).
 */
