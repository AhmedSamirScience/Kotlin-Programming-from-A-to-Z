/**
 * Checking the Type in Kotlin
 * In Kotlin, you can use the is and !is operators to check the type of a variable at runtime. This is useful when dealing with variables that can hold different types, such as those declared as Any. The when expression is often used in conjunction with these operators to handle different types dynamically.
 *
 * Key Points:
 * is Operator: Used to check if a variable is of a specific type.
 * !is Operator: Used to check if a variable is not of a specific type.
 * Smart Casting: When the is check passes, Kotlin smart casts the variable to the checked type within the block, allowing access to its properties and methods.
 * Example: Checking the Type Using is and !is
 */

/**
 * This example demonstrates how to check the type of a variable using `is` and `!is` in Kotlin.
 * The `when` expression is used to handle different types based on runtime checks.
 */

fun main() {
    // Initializing a variable of type Any
    var any: Any = "Hello"

    // Using when expression with is and !is to check the type of the variable
    when (any) {
        // If the variable is a String
        is String -> {
            println("any contains a String")
            // Smart cast: any is treated as a String within this block
            println(any.length)
        }
        // If the variable is not a String
        !is String -> {
            println("any does not contain a String")
            // Printing the actual type of the variable
            println(any::class.simpleName)
        }
    }

    // Changing the value of any to a Double
    any = 43.5

    // Re-checking the type with the new value
    when (any) {
        is String -> {
            println("any contains a String")
            println(any.length)
        }
        !is String -> {
            println("any does not contain a String")
            println(any::class.simpleName)
        }
    }
}

/*
 * Output (with "Hello" as the initial value):
 * any contains a String
 * 5
 *
 * Output (with 43.5 as the new value):
 * any does not contain a String
 * Double
 */

/**
 * Explanation:
 *
 * - The variable `any` is of type `Any`, which can hold references to any Kotlin object.
 * - The `when` expression is used to check the type of `any` using the `is` operator.
 * - When `any` is a `String`, the `is` check passes, and the variable is smart cast to `String`, allowing access to its properties (like `length`).
 * - When `any` is not a `String`, the `!is` operator catches this, and the program prints the actual type using `any::class.simpleName`.
 * - When the value of `any` is changed to a `Double`, the `when` expression correctly identifies it as not a `String` and prints the type as `Double`.
 */


/**
 * Explanation:
 * Variable Declaration: The variable any is declared as Any, which means it can hold any Kotlin object.
 *
 * Type Checking with is:
 *
 * The when expression checks if any is a String. If the check passes, the compiler automatically smart casts any to String, allowing access to String-specific properties like length.
 * Type Checking with !is:
 *
 * The when expression also contains a block for !is String, which checks if any is not a String. When this check passes, it prints the actual type of any using any::class.simpleName.
 * Dynamic Type:
 *
 * After changing the value of any to 43.5 (a Double), the when expression correctly detects that any is no longer a String and prints its type as Double.
 * Summary:
 * is and !is Operators: These operators allow you to dynamically check the type of a variable and handle it accordingly. If the type matches the check, Kotlin smart casts the variable to that type within the block.
 *
 * Smart Casting: When a type check succeeds, the variable is automatically cast to the specific type within the scope of the when block, allowing you to safely access type-specific properties without an explicit cast.
 *
 * Handling Multiple Types: The when expression combined with is checks makes it easy to handle variables that can be of different types at runtime, ensuring type safety and reducing errors.
 *
 * This approach ensures that your Kotlin code can safely handle variables of multiple types, leveraging Kotlin's type system and smart casting for clean and efficient code.
 */