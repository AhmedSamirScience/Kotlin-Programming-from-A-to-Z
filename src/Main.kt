/**
 * This class demonstrates the use of an implicit backing field in Kotlin.
 *
 * The `x` and `y` properties have custom getters and setters that interact with an implicitly generated
 * backing field. The backing field is represented by the `field` keyword and is automatically created
 * by the Kotlin compiler.
 */

class GameObject {
    var x: Int = 0
        // Custom getter using the implicit backing field
        get() = field
        // Custom setter with validation, using the implicit backing field
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Invalid value for x: $value (must be >= 0)")
            }
        }

    var y: Int = 0
        // Custom getter using the implicit backing field
        get() = field
        // Custom setter with validation, using the implicit backing field
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Invalid value for y: $value (must be >= 0)")
            }
        }
}

fun main() {
    val obj = GameObject()

    // Display initial values of x and y
    println("initial obj.x: ${obj.x}, obj.y: ${obj.y}")

    // Set new values for x and y
    obj.x = 10
    obj.y = 10
    println("updated obj.x: ${obj.x}, obj.y: ${obj.y}")

    // Attempt to set invalid values
    obj.x = -5
    obj.y = -5
    println("after invalid update obj.x: ${obj.x}, obj.y: ${obj.y}")
}

/*
 * Output:
 * initial obj.x: 0, obj.y: 0
 * updated obj.x: 10, obj.y: 10
 * Invalid value for x: -5 (must be >= 0)
 * Invalid value for y: -5 (must be >= 0)
 * after invalid update obj.x: 10, obj.y: 10
 */

/**
 * Explanation:
 *
 * - The `x` and `y` properties have custom getters and setters that use the implicit backing field (`field`).
 * - The custom setters validate the incoming value to ensure it is non-negative. If the value is valid, it is stored in the backing field.
 * - If an invalid value (negative) is provided, the setter prints an error message, and the backing field is not updated.
 * - The initial values for `x` and `y` are both `0`, as set during their declaration.
 * - After setting valid values, the properties are updated accordingly.
 * - When invalid values are attempted, the properties remain unchanged, demonstrating the validation logic in the setters.
 */

/**
 * Summary:
 * Implicit Backing Field: The field keyword represents the underlying storage of a property. It is automatically generated by the Kotlin compiler when custom getters and setters are defined.
 * Custom Getters and Setters: Custom logic can be applied within the getters and setters. In this example, the setters validate that the incoming values for x and y are non-negative before updating the backing field.
 * Error Handling: If an invalid value is provided (e.g., a negative number), the setter prints an error message, and the property is not updated. This ensures that the property maintains valid data.
 * This class.kt file provides a complete example of how to use implicit backing fields with custom getters and setters in Kotlin, with detailed explanations and code demonstrating the functionality and benefits of this approach.
 */
