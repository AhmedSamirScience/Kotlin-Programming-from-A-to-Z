/**
 * This file demonstrates the concept of singleton objects in Kotlin using the `object` keyword.
 *
 * A singleton object can have:
 * - One or more `init` blocks.
 * - Zero or more member functions.
 * - Zero or more member properties.
 * - Its own override of `toString()`.
 *
 * Note: A singleton object cannot have a constructor.
 */

object MathsUtils {

    // Public member properties
    val ZERO: Int = 0
    val MIN: Int = -100
    val MAX: Int

    // Initialization block
    init {
        MAX = 1000
    }

    // Member functions
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun isLessThanMax(value: Int): Boolean {
        return value < MAX
    }

    // Override toString
    override fun toString(): String {
        return "MathsUtils(ZERO=$ZERO, MIN=$MIN, MAX=$MAX)"
    }
}

object Session {

    // Public member property
    val id: String = "session-12345"

    // Override toString
    override fun toString(): String {
        return "Session(id=$id)"
    }
}

fun main() {
    // Accessing the singleton's properties and functions in MathsUtils
    println("MathsUtils.ZERO: ${MathsUtils.ZERO}")
    println("MathsUtils.MIN: ${MathsUtils.MIN}")
    println("MathsUtils.MAX: ${MathsUtils.MAX}")

    println("Add 10 + 20: ${MathsUtils.add(10, 20)}")
    println("Subtract 30 - 15: ${MathsUtils.subtract(30, 15)}")
    println("Is 500 less than MAX: ${MathsUtils.isLessThanMax(500)}")

    // Output the toString() of MathsUtils
    println(MathsUtils)

    // Demonstrating the use of the Session singleton
    println(Session)

    // Assign the Session object to a val
    val s: Session = Session

    // Print the alias
    println(s)
}

/*
 * Output:
 * MathsUtils.ZERO: 0
 * MathsUtils.MIN: -100
 * MathsUtils.MAX: 1000
 * Add 10 + 20: 30
 * Subtract 30 - 15: 15
 * Is 500 less than MAX: true
 * MathsUtils(ZERO=0, MIN=-100, MAX=1000)
 * Session(id=session-12345)
 * Session(id=session-12345)
 */
