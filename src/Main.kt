/**
 * This file demonstrates how to close properties in Kotlin using the `final` keyword.
 *
 * In Kotlin, properties (both member properties and constructor properties) can be marked as `final`.
 * This prevents subclasses from overriding the property. The `final` keyword is used alongside `override` to
 * close the property in a subclass, making it impossible for further subclasses to override it.
 */

open class Food(open val type: String = "generic")

open class Cake(
    /**
     * Overrides the `type` property from Food but marks it as final,
     * preventing any further overriding in subclasses of Cake.
     */
    final override val type: String = "Sponge"
) : Food()

open class Biscuit(
    /**
     * Overrides the `type` property from Food, but keeps it open for further overriding
     * in subclasses of Biscuit.
     */
    override val type: String = "Sweet"
) : Food()

fun main() {
    // Demonstrating the behavior of the `type` property in different subclasses
    val cake = Cake()
    val biscuit = Biscuit()

    println("Cake type: ${cake.type}")    // Output: Sponge
    println("Biscuit type: ${biscuit.type}") // Output: Sweet
}

/*
 * Output:
 * Cake type: Sponge
 * Biscuit type: Sweet
 */

/**
 * Explanation:
 *
 * - The `Food` class defines an open property `type`, allowing subclasses to override it.
 * - The `Cake` class overrides the `type` property and marks it as `final`, preventing further overrides in subclasses of `Cake`.
 * - The `Biscuit` class overrides the `type` property but does not mark it as `final`, meaning that subclasses of `Biscuit` can still override the `type` property.
 */

/**
 * Explanation:
 * Open Property: The Food class has an open property type, allowing subclasses to override it.
 *
 * Final Override in Cake: In the Cake class, the type property is overridden and marked as final, meaning that any subclass of Cake cannot further override this property.
 *
 * Still Open in Biscuit: In contrast, the Biscuit class overrides the type property but does not mark it as final, allowing further subclasses to override it if needed.
 *
 * This class.kt file provides a complete and clear example of how to control property overriding in Kotlin using the final keyword, with detailed explanations in the comments.
 */