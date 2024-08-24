/**
 * This file demonstrates the use of custom property getters and setters in Kotlin.
 *
 * Properties in Kotlin can have custom logic for their getters and setters, allowing you to control
 * how property values are accessed and modified. This example showcases how to define custom
 * getters and setters for both read-only (`val`) and read-write (`var`) properties.
 */

class GameObject {

    // Read-only property with a custom getter
    val y: Int
        get() {
            // Custom logic to calculate the current y location
            println("Getting y location...")
            return (0..100).random()  // Just a random example
        }

    // Read-only property with a custom getter
    val x: Int
        get() {
            // Custom logic to calculate the current x location
            println("Getting x location...")
            return (0..100).random()  // Just a random example
        }

    // Read-write property with custom getter and setter
    var name: String = "Unknown"
        get() {
            // Custom logic to get the name
            println("Getting name...")
            return field.uppercase()  // Return the name in uppercase
        }
        set(value) {
            // Custom logic to set the name
            println("Setting name...")
            field = value.trim()  // Set the name after trimming whitespace
        }
}

fun main() {
    val gameObject = GameObject()

    // Accessing the custom getter for y
    println("y: ${gameObject.y}")

    // Accessing the custom getter for x
    println("x: ${gameObject.x}")

    // Accessing and modifying the custom getter and setter for name
    println("Initial name: ${gameObject.name}")
    gameObject.name = "  NewName  "
    println("Updated name: ${gameObject.name}")
}

/*
 * Output:
 * Getting y location...
 * y: 57
 * Getting x location...
 * x: 23
 * Getting name...
 * Initial name: UNKNOWN
 * Setting name...
 * Getting name...
 * Updated name: NEWNAME
 */

/**
 * Explanation:
 *
 * - `y` and `x` are read-only properties with custom getters. The getters simulate calculating the current location by generating a random value.
 * - `name` is a read-write property with custom getter and setter. The getter returns the name in uppercase, while the setter trims any leading or trailing whitespace before storing the value.
 *
 * - `field` is a special identifier used in custom setters to refer to the underlying property value.
 * - Custom getters and setters allow you to control how property values are accessed and modified, providing a powerful tool for encapsulating logic.
 */

/**
 * Summary:
 *
 * - **Custom Getters**: Define custom logic for retrieving a property's value using the `get()` function.
 * - **Custom Setters**: For `var` properties, define custom logic for modifying a property's value using the `set(value)` function.
 * - **Use Case**: Custom getters and setters provide a way to encapsulate logic, ensuring that any access or modification of properties adheres to the rules and behaviors you define.
 */


/**
 * Explanation:
 * Custom Getters and Setters: The GameObject class demonstrates how to define custom getters for val properties (y, x) and both getters and setters for var properties (name).
 *
 * Property y and x: These are read-only properties with custom logic in their getters that simulate retrieving the current location by generating a random value.
 *
 * Property name: This is a read-write property with custom getter and setter logic. The getter returns the name in uppercase, and the setter trims any leading or trailing whitespace before assigning the value to the property.
 *
 * field Keyword: In the setter, field refers to the backing field of the property, which is used to store the actual value.
 *
 * Runtime Output: The output shows how the custom logic is executed when accessing or modifying the properties.
 *
 * This class.kt file provides a comprehensive example of how to create and use custom getters and setters for properties in Kotlin, with explanations and code that illustrate the concept effectively.
 */