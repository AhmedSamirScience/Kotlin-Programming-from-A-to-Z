/**
 * This class demonstrates how to modify the visibility of a setter in Kotlin.
 *
 * The `location` property is publicly accessible and its value can be read by external code.
 * However, the setter is private, meaning that the property can only be modified within the class.
 *
 *
 * In Kotlin, while the visibility of the getter function for a property is always the same as the visibility of the property itself, you can modify the visibility of the setter function independently. This allows you to create properties that appear read-only (like val) to external code but are writable within the class or module.
 *
 *
 */

class Location {
    // Example class for demonstration purposes
    var name: String = "Unknown"
}

class GameObject {

    // Public property with a private setter
    var location: Location = Location()
        private set  // Setter is private, so it cannot be modified externally
}

fun main() {
    val obj = GameObject()

    // Accessing the public property
    println("Initial location: ${obj.location.name}")

    // Attempting to modify the property externally (this would cause a compile-time error)
    // obj.location = Location()  // Error: Cannot assign to 'location': the setter is private

    // The location property appears as a read-only property to external code
    // However, it can still be modified internally within the GameObject class
    obj.location.name = "New Location"
    println("Modified location internally: ${obj.location.name}")
}

/*
 * Output:
 * Initial location: Unknown
 * Modified location internally: New Location
 */

/**
 * Explanation:
 *
 * - The `location` property in the `GameObject` class is publicly accessible for reading, but its setter is private.
 * - This makes the property appear as a `val` (read-only) to external code, while still being modifiable within the class.
 * - Attempting to set a new value for `location` from outside the class will result in a compile-time error.
 * - Internally, the property can still be modified, as shown by updating the `name` of the `Location` object.
 *
 * Use Cases:
 *
 * 1. **Encapsulation**: Control over who can modify the property, ensuring that only the class itself can change its value.
 * 2. **Immutable API**: Expose a property as immutable (read-only) to external code while allowing internal modifications.
 * 3. **Safety**: Prevent external code from making unintended modifications to critical properties.
 */


/**
 * Summary:
 * Modified Setter Visibility: The location property in the GameObject class has a public getter but a private setter. This makes the property appear read-only (val) to external code while allowing internal modifications within the class.
 *
 * Encapsulation: By restricting the setter's visibility, you can control who can modify the property's value, ensuring that only the class itself or specific code can change it.
 *
 * Use Cases:
 *
 * Immutable API: Expose properties as immutable to external clients while allowing internal modifications.
 * Safety: Prevent external code from making unintended or unauthorized changes to the property's value.
 * Encapsulation: Maintain internal control over the property's state, ensuring that it can only be modified under certain conditions or by certain methods.
 * This class.kt file provides a clear example of how to modify the visibility of a setter in Kotlin, demonstrating its practical use cases and benefits in creating robust, encapsulated code.
 */