/**
 * This file demonstrates explicit casting in Kotlin using the `as` operator.
 *
 * Sometimes the Kotlin compiler cannot automatically determine the actual type of a value.
 * In such cases, explicit casting is required to access specific properties or methods of the expected type.
 * The `as` operator is used to cast a value to a specific type.
 */

fun getData(): Any {
    // This function returns an object of type Any, which could be anything
    return "Hello"
}

fun main() {
    // The value returned by getData() is stored in 'any', which has type Any
    val any: Any = getData()

    // Trying to access the 'length' property of 'any' without casting will cause a compilation error
    // println(any.length) // This will not compile

    // Explicit casting is required to tell the compiler that 'any' is actually a String
    val message: String = any as String

    // Now we can access the 'length' property since 'message' is explicitly cast to String
    println("Message length: ${message.length}")
}

/*
 * Output:
 * Message length: 5
 */

/**
 * Explanation:
 *
 * - The function `getData()` returns a value of type `Any`, which could be any type.
 * - The compiler does not automatically know that `any` is a String, so accessing `length` directly would cause a compile-time error.
 * - Using the `as` operator, we cast `any` to a `String`, allowing us to access `length`.
 * - The casted value is stored in the `message` variable, and we can then safely access its properties.
 */

/**
 * Explanation:
 * Smart Cast Limitation: Sometimes the Kotlin compiler cannot automatically determine the type of a value, especially when it comes from a function that returns Any or an external source.
 *
 * Casting with as: When the type is unclear or the compiler cannot infer it, you can use the as operator to explicitly cast the value to the correct type.
 *
 * Example: In the example, the function getData() returns a value of type Any, and the compiler doesn't know that it’s actually a String. By using any as String, we inform the compiler that the value is indeed a String, allowing us to safely access the length property.
 *
 * This class.kt file includes a complete example of how to use explicit casting in Kotlin using the as operator, along with explanations in comments.
 */