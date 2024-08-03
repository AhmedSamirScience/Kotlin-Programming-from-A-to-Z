/**
 * Equality Between Instances
 * In Kotlin, equality between instances is represented by the operators == and === (and their not versions != and !==).
 * They have different meanings:
 *
 * == represents structural or value equality. For example, two instances of the type Person are considered equal if their data is the same (e.g., "John" aged 32 is equal to another "John" aged 32).
 * != is the inverse of ==.
 * === represents referential equality, meaning the instances are literally the same (i.e., the same object in memory).
 * !== is the inverse of ===.
 * Here's an example using the Person class that overrides the equals() function:
 */
class Person(val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        return when (other) {
            null -> false
            is Person -> (other.name == name) && (other.age == age)
            else -> false
        }
    }
}

fun main() {

    val p1 = Person("John", 21)
    val p2 = Person("John", 21)
    val p3 = p1

    // checks for reference equality
    println("p1 === p2: ${p1 === p2}")
    // checks for structural equality
    println("p1 == p2: ${p1 == p2}")
    // again structural equality
    println("p1.equals(p2): ${p1.equals(p2)}")
    println("p1 !== p2: ${p1 !== p2}")
    println("p1 === p3: ${p1 === p3}")
    println("p1 !== p3: ${p1 !== p3}")

    /**
     * Output
     * p1 === p2: false
     * p1 == p2: true
     * p1.equals(p2): true
     * p1 !== p2: true
     * p1 === p3: true
     * p1 !== p3: false
     *
     */
}