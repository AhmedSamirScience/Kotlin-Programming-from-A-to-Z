/**
 * Inheritance and Properties in Kotlin
 * In Kotlin, properties (both constructor properties and member properties) can be overridden in subclasses, similar to member functions. To allow a property to be overridden, it must be marked as open in the superclass. The overriding property in the subclass must be marked with override.
 *
 * Key Points:
 * open Keyword: Used to mark a property in a superclass that can be overridden by a subclass.
 * override Keyword: Required in the subclass to indicate that the property is overriding a property from the superclass.
 * Constructor Properties: Constructor properties can also be overridden in subclasses.
 */


//region Example 1: Overriding Properties
/*
/**
 * This example demonstrates how to override properties in Kotlin.
 * Both member properties and constructor properties can be overridden.
 */

open class Base {
    // Open property that can be overridden
    open val label: String = "Base"

    // Open function that can be overridden
    open fun print(): Unit = println("Base print")
}

class Derived : Base() {
    // Overriding the label property
    override val label: String = "Derived"

    // Overriding the print() function
    override fun print(): Unit = println("Derived print")
}

fun main() {
    // Creating an instance of Base
    val base = Base()
    println(base.label)  // Output: Base
    base.print()  // Output: Base print

    println("----------")

    // Creating an instance of Derived
    val derived = Derived()
    println(derived.label)  // Output: Derived
    derived.print()  // Output: Derived print
}

/*
 * Output:
 * Base
 * Base print
 * ----------
 * Derived
 * Derived print
 */

/**
 * Explanation:
 *
 * - The `Base` class defines an open property `label` and an open member function `print()`.
 * - The `Derived` class overrides both the `label` property and the `print()` function.
 * - When creating instances of `Base` and `Derived`, the correct version of the property and function are used based on the type of the object.
 */

 */
//endregion


//region Example 2: Overriding Constructor and Member Properties
/*
/**
 * This example demonstrates overriding both constructor properties and member properties.
 * The `Cat` class defines properties that are overridden in the `Tiger` subclass.
 */

open class Cat {
    // Open member property
    open val dangerous = false

    // Open member property
    open val name: String = "Sammy"

    // Override the toString method
    override fun toString(): String = "$name is " + (if (dangerous) "dangerous" else "timid")
}

class Tiger(override val name: String) : Cat() {
    // Override the dangerous property
    override val dangerous = true
}

fun main() {
    // Creating an instance of Cat
    val cat = Cat()
    println(cat)  // Output: Sammy is timid

    // Creating an instance of Tiger
    val tiger = Tiger("Tigger")
    println(tiger)  // Output: Tigger is dangerous
}

/*
 * Output:
 * Sammy is timid
 * Tigger is dangerous
 */

/**
 * Explanation:
 *
 * - The `Cat` class defines two open properties: `dangerous` and `name`.
 * - The `Tiger` class overrides the `name` property in the constructor and the `dangerous` property as a member property.
 * - The overridden properties are used when the `toString()` method is called on instances of `Cat` and `Tiger`.
 */

 */
//endregion


//region Example 3: Overriding Properties in a Class Hierarchy
/*
/**
 * This example demonstrates overriding properties in a class hierarchy.
 * Properties that are marked as open in a root class can be overridden in any subclass.
 */

open class Trade(val tradeId: String, open val stock: String = "IBM", open var quantity: Int = 0)

open class EquityTrade(id: String, override val stock: String = "MSoft", qty: Int) : Trade(id, quantity = qty)

class ShortEquityTrade(id: String, override val stock: String = "Short", qty: Int) : EquityTrade(id, qty = qty)

fun main() {
    // Creating an instance of Trade
    val trade = Trade("T123", quantity = 100)
    println("Trade: ${trade.tradeId}, ${trade.stock}, ${trade.quantity}")  // Output: Trade: T123, IBM, 100

    // Creating an instance of EquityTrade
    val equityTrade = EquityTrade("T456", qty = 200)
    println("EquityTrade: ${equityTrade.tradeId}, ${equityTrade.stock}, ${equityTrade.quantity}")  // Output: EquityTrade: T456, MSoft, 200

    // Creating an instance of ShortEquityTrade
    val shortTrade = ShortEquityTrade("T789", qty = 300)
    println("ShortEquityTrade: ${shortTrade.tradeId}, ${shortTrade.stock}, ${shortTrade.quantity}")  // Output: ShortEquityTrade: T789, Short, 300
}

/*
 * Output:
 * Trade: T123, IBM, 100
 * EquityTrade: T456, MSoft, 200
 * ShortEquityTrade: T789, Short, 300
 */

/**
 * Explanation:
 *
 * - The `Trade` class defines open properties `stock` and `quantity`.
 * - The `EquityTrade` class overrides the `stock` property in the constructor, and the `ShortEquityTrade` class overrides it again.
 * - The property overrides are propagated through the class hierarchy, allowing each subclass to customize the `stock` value.
 */

 */
//endregion

/**
 * Summary:
 * Overriding Properties: Both constructor and member properties can be overridden in Kotlin. Properties must be marked open in the superclass and override in the subclass.
 *
 * Constructor Property Overriding: Constructor properties in the superclass can be overridden by constructor properties or member properties in the subclass.
 *
 * Class Hierarchy: Once a property is marked as open in a root class, it remains open for all subclasses in the hierarchy, allowing further overrides.
 *
 * These examples demonstrate how to use property overriding in Kotlin, showing how both member and constructor properties can be customized in subclasses.
 */