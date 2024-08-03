/**
 * Auxiliary Constructors in Kotlin
 * In Kotlin, every class has a primary constructor, but you can also define one or more auxiliary constructors.
 * These auxiliary constructors are useful for providing additional ways to instantiate a class.
 * Let's go through the details and see an example.
 *
 * Key Points of Auxiliary Constructors
 * Defined within the Body: Auxiliary constructors are defined inside the class body.
 * Constructor Keyword: They are declared using the constructor keyword.
 * No Explicit Name: Unlike methods, constructors do not have explicit names.
 * Must Call Another Constructor: An auxiliary constructor must call another constructor, either another auxiliary constructor or the primary constructor.
 * This ensures that the primary constructor is the sole entry point to the class.
 * Syntax
 * The auxiliary constructor syntax involves the constructor keyword followed by the parameter list.
 * It must call another constructor using this(), followed by the appropriate parameter list.
 *
 * class Person4(val name: String, var age: Int) {
 *     // Auxiliary constructor
 *     constructor(age: Int) : this("unnamed", age) {
 *         println("In auxiliary constructor")
 *     }
 * }
 *
 */

fun main() {

    /**
     * Using the Auxiliary Constructor
     * Now you can create a Person4 instance using the auxiliary constructor:
     */
    val person = Person4(25)
    println("Name: ${person.name}, Age: ${person.age}")

    /**
     * Output:
     * Name: unnamed, Age: 25
     */

    /**
     * Summary
     * Auxiliary constructors in Kotlin provide flexibility in class instantiation by allowing additional ways to create objects.
     * They must always delegate to another constructor, ensuring the primary constructor remains the main entry point.
     * This pattern is commonly used to provide default values for some parameters while requiring others.
     *
     * By using auxiliary constructors, you can simplify object creation and make your classes more flexible and user-friendly.
     */
}


/**
 * Example: Person Class with Auxiliary Constructor
 * Consider a Person4 class where we want to allow instantiation with just an age, defaulting the name to "unnamed" if not provided.
 *
 * Primary Constructor
 * The primary constructor takes two parameters, name and age:
 */
//class Person4(val name: String, var age: Int)


/**
 * Auxiliary Constructor
 * The auxiliary constructor allows creating a Person4 instance with only an age:
 */
class Person4(val name: String, var age: Int) {
    // Auxiliary constructor
    constructor(age: Int) : this("unnamed", age) {
        println("In auxiliary constructor")
    }
}

/**
 * Here:
 *
 * The constructor(age: Int) defines an auxiliary constructor that takes an integer age.
 * It calls the primary constructor this("unnamed", age) with "unnamed" as the default name.
 * You can simplify the class by omitting the constructor body if it does nothing extra:
 */
//class Person4(val name: String, var age: Int) {
//    // Auxiliary constructor
//    constructor(age: Int) : this("unnamed", age)
//}
