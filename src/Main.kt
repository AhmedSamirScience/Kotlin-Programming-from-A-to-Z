/**
 * This file demonstrates the use of `const` with `val` properties in Kotlin.
 *
 * The `const` keyword is applied to properties that are compile-time constants.
 * These properties are useful for defining values that are constant throughout the program and can be inlined by the compiler.
 */

object MathUtils {
    // Specifying useful compile-time constant properties
    const val ZERO = 0
    const val MIN: Int = -100
    const val MAX = 100
}

fun main() {
    // Accessing the const properties in MathUtils
    println("ZERO: ${MathUtils.ZERO}")
    println("MIN: ${MathUtils.MIN}")
    println("MAX: ${MathUtils.MAX}")

    // Using the const properties in calculations
    val range = MathUtils.MAX - MathUtils.MIN
    println("Range from MIN to MAX: $range")
}

/*
 * Output:
 * ZERO: 0
 * MIN: -100
 * MAX: 100
 * Range from MIN to MAX: 200
 */

/**
 * Explanation:
 *
 * - `MathUtils` is an object that contains compile-time constant properties `ZERO`, `MIN`, and `MAX`.
 * - These properties are marked with `const`, indicating they are constants determined at compile time.
 * - The properties can be accessed and used directly in calculations, as shown in the `main` function.
 *
 * Benefits of Using `const`:
 *
 * 1. **Explicit Declaration**: It is clear to the compiler and developers that these values are constants.
 * 2. **Compiler Optimizations**: The compiler can optimize the code by inlining these constant values directly where they are used.
 * 3. **Improved Code Semantics**: It helps other developers understand that these values are meant to be compile-time constants.
 */

/**
 * Summary:
 *
 * - **Usage of `const`**: The `const` keyword is used to mark `val` properties as compile-time constants, meaning their values are fixed at compile time and cannot be changed.
 *
 * - **Constraints**: `const` can only be applied to `val` properties that are initialized with values derivable at compile time and are of basic types like `Int`, `Boolean`, or `String`.
 *
 * - **Benefits**:
 *   - Makes it explicit to the compiler and other developers that the value is a compile-time constant.
 *   - Allows the compiler to perform optimizations, such as inlining the value directly in the code.
 *   - Enhances the readability and maintainability of the code by clearly indicating that the value is immutable and constant.
 */
