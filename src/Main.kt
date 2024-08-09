/**
 * Class Definitions in Kotlin
 *
 * In Kotlin, a class definition follows this general format:
 * class NameOfClass constructor(<constructor parameters>) {
 *     init {
 *         // Initialization block
 *     }
 *     // Member properties
 *     // Member functions
 * }
 * You can mix the order of init blocks, properties, and member functions within a class as needed.
 *
 * Here's an example of a class definition:
 */

class Person constructor(val name: String, var age: Int) { }

/**
 * Key Points About This Class Definition:
 *
 * Class Name: It defines a public class called Person.
 *
 * Properties: The class has two properties, name and age.
 * name is a public read-only property (val).
 * age is a public read-write property (var).
 *
 * Constructor: The class defines a constructor with two parameters:
 * name of type String to initialize the name property.
 * age of type Int to initialize the age property.
 *
 * Keyword constructor: It is optional but used here to explicitly define the primary constructor.
 *
 * Class Body: The {} for the class body is optional if there are no additional members.
 * 
 * Naming Convention:
 * While not mandatory, it's common practice to define a class in a file named after the class. For example, the Person class would typically be stored in a file called Person.kt.
 * This convention helps in easily locating the class code, as shown in the IntelliJ IDE.
 */

fun main() {


}