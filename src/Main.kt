/**
 * This file demonstrates how to close member functions in Kotlin using the `final` keyword.
 *
 * In Kotlin, a member function marked as `open` in a root class is open for overriding in all subclasses.
 * However, you may want to prevent further overriding in a specific subclass.
 * This can be done by marking the overridden member function as `final`.
 */

open class Food {
    /**
     * An open function that can be overridden in subclasses.
     */
    open fun eatMe() = println("Food - eatMe()")
}

open class Cake : Food() {
    /**
     * Overrides the eatMe() function but marks it as final,
     * preventing further overriding in subclasses of Cake.
     */
    final override fun eatMe() = println("Cake - eatMe()")
}

open class Biscuit : Food() {
    /**
     * Overrides the eatMe() function but leaves it open for further overriding
     * in subclasses of Biscuit.
     */
    override fun eatMe() = println("Biscuit - eatMe()")
}

fun main() {
    // Demonstrating the behavior of eatMe() in different subclasses
    val food: Food = Food()
    val cake: Food = Cake()
    val biscuit: Food = Biscuit()

    food.eatMe()      // Output: Food - eatMe()
    cake.eatMe()      // Output: Cake - eatMe()
    biscuit.eatMe()   // Output: Biscuit - eatMe()
}

/*
 * Output:
 * Food - eatMe()
 * Cake - eatMe()
 * Biscuit - eatMe()
 */

/**
 * Explanation:
 *
 * - The `Food` class has an open `eatMe()` function that can be overridden in subclasses.
 * - The `Cake` class overrides `eatMe()` and marks it as `final`, preventing any further overrides in subclasses of `Cake`.
 * - The `Biscuit` class overrides `eatMe()` but keeps it open, meaning subclasses of `Biscuit` can still override it.
 */

/**
 * Explanation:
 * Open Function: The Food class defines the eatMe() function as open, allowing it to be overridden in its subclasses.
 *
 * Final Override in Cake: In the Cake class, the eatMe() function is overridden and marked as final, preventing any further overrides in subclasses of Cake.
 *
 * Still Open in Biscuit: In contrast, the Biscuit class overrides the eatMe() function but does not mark it as final, allowing subclasses of Biscuit to override it further.
 *
 * This class.kt file provides a clear example of how to manage and control the ability to override functions in Kotlin, along with detailed explanations in comments.
 */