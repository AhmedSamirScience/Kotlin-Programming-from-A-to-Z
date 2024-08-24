/**
 * This file demonstrates the use of lazy initialization with `val` properties in Kotlin.
 *
 * Lazy initialization allows a `val` property to be initialized only when it is accessed for the first time,
 * rather than when the object containing it is first referenced. This can improve performance, especially
 * for properties that are expensive to initialize.
 */

object Utils {
    // Standard initialization: property is initialized as soon as the object is referenced
    val myString: String = "Hello"

    // Lazy initialization: property is initialized only when it is accessed for the first time
    val myLazyString: String by lazy {
        println("Initializing myLazyString...")
        "Hello"
    }
}

fun main() {
    println("Program started")

    // Accessing the standard initialized property
    println("myString: ${Utils.myString}")

    // Accessing the lazy initialized property for the first time (this triggers the initialization)
    println("myLazyString: ${Utils.myLazyString}")

    // Accessing the lazy initialized property again (uses the cached value)
    println("myLazyString again: ${Utils.myLazyString}")
}

/*
 * Output:
 * Program started
 * myString: Hello
 * Initializing myLazyString...
 * myLazyString: Hello
 * myLazyString again: Hello
 */

/**
 * Explanation:
 *
 * - `myString` is initialized immediately when the `Utils` object is referenced.
 * - `myLazyString` is initialized lazily using the `by lazy` delegate. The initialization block is executed only the first time `myLazyString` is accessed.
 * - Once `myLazyString` is initialized, subsequent accesses return the cached value without re-running the initialization logic.
 *
 * **Benefits of Lazy Initialization**:
 *
 * 1. **Performance Improvement**: Lazy initialization can improve performance by deferring the initialization of properties that are expensive to create and may not be needed immediately.
 * 2. **Deferred Execution**: The property is initialized only when it is actually required, potentially reducing unnecessary work during object creation.
 * 3. **Thread Safety**: The `lazy` delegate is thread-safe by default, ensuring that the property is initialized only once, even in multi-threaded environments.
 */
