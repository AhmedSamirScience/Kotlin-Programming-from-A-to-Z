/**
 * Providing KDoc
 * KDoc is used to document classes, properties, and member functions in Kotlin, explaining their purpose and any important points. KDoc comments start with /** and end with */, with each line optionally beginning with an asterisk.
 *
 * By convention, the first paragraph is a summary description, and the following text is a detailed description. IntelliJ can use this summary to provide a popup with more information.
 *
 * Block tags start on a new line with the @ character. Here's an example for the Person class:
 */

/**
 * This is a simple class representing information
 * about a person.
 *
 * @property name the name of this person.
 * @property age the age of this person.
 * @constructor Creates a new person.
 *
 * @author John Hunt
 * @since 1.0
 */
class Person(val name: String = "", var age: Int = 0) {
    override fun toString() = "Person($name, $age)"
}

/**
 * This KDoc provides a clear and structured way to document the Person class and its properties.
 */

fun main() {

}