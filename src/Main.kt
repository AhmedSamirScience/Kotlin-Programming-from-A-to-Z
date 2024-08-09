/**
 * Private Properties
 * In Kotlin, you can define a constructor property as private. This property:
 *
 * Requires a value when an instance is created.
 * Is accessible within the class itself.
 * Is not accessible from outside the class.
 * Here’s an example using the Person3 class:
 */
class Person3(private val id: String,
              val name: String = "",
              val age: Int = 0) {
}

/**
 * In this example:
 *
 * The id property is private, so it must be provided when creating an instance, but it can't be accessed from outside the class.
 * The name and age properties are public and read-only (val), and they are optional parameters with default values.
 * When creating an instance of Person3, you must provide an id, but you can choose whether to provide values for name and age.
 * Here’s a simple application demonstrating this:
 */
fun main() {

    val p1 = Person3("id1", "John", 50)
    println("${p1.name} is ${p1.age}")
    // compile-time error: id is a private property
    // println("${p1.id}")

    /**
     * Output:
     * John is 50
     */

}