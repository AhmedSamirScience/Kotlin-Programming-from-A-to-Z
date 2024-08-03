
//region Initialization Blocks
/**
 * Initialization Behavior in Kotlin
 * In Kotlin, to define behavior that runs when an instance of a class is created, you use initialization blocks.
 * These blocks are executed after the instance is created, after the primary constructor runs, but before any auxiliary constructors.
 * Initialization blocks ensure that the initialization behavior is executed before any client code can access the instance.
 *
 * Initialization Blocks
 * An initialization block is defined using the init keyword followed by a block of code:
 */
class Person5(val name: String = "", var age: Int = 0) {
    /**
     * Defines initialization behavior that runs just
     * after the class is instantiated.
     * Has access to all constructor parameters whether they
     * are properties or not.
     */
    init {
        println("In Init")
    }
}
//endregion

//region Multiple Initialization Blocks
/**
 * You can have multiple init blocks in a class. If there are multiple init blocks, they run in the order they are defined:
 *
 * class Person5MultipleInitializationBlocks(val name: String = "", var age: Int = 0) {
 *     init {
 *         println("In Init")
 *     }
 *     init {
 *         println("In Init 2")
 *     }
 *     init {
 *         println("In Init 3")
 *     }
 * }
 *
 * When an instance of Person5 is created, the output is:
 * Creating instance
 * In Init
 * In Init 2
 * In Init 3
 * Person5@1b28cdfa
 * Done
 *
 * Reasons for Multiple Initialization Blocks
 * Modularization: Each block can initialize a specific part of the class, separating different initialization concerns.
 * Stepped Initialization: Properties can be initialized in steps, where one init block's behavior depends on the result of a previous block.
 * Example: Stepped Initialization
 * Consider the following example:
 *
 * class Foo {
 *     val x = Bar.getValue()
 *     init {
 *         // check the validity of x and abort if invalid
 *         if (!isValid(x)) throw IllegalArgumentException("Invalid value for x")
 *     }
 *     val y = Bar.getDerivedValue(x) // requires x to be valid
 *     init {
 *         // Check validity of y and continue with initialization if all ok
 *         if (!isValid(y)) throw IllegalArgumentException("Invalid value for y")
 *     }
 *
 *     // Dummy validation methods for illustration
 *     fun isValid(value: Any): Boolean {
 *         // Implement your validation logic here
 *         return true
 *     }
 * }
 *
 * object Bar {
 *     fun getValue(): Int {
 *         return 42 // Replace with actual logic to get value
 *     }
 *
 *     fun getDerivedValue(input: Int): Int {
 *         return input + 1 // Replace with actual logic to derive value
 *     }
 * }
 *
 * In this example:
 *
 * The first init block checks if x is valid and throws an exception if it's not.
 * If x is valid, y is set based on x.
 * The second init block checks if y is valid and completes the initialization process.
 * This ensures that the initialization process can be broken down into manageable steps, each responsible for a part of the initialization logic.
 */

//endregion

fun main() {
    //region Initialization Blocks
    /**
     * When an instance of Person5 is created, the init block will be executed, printing "In Init":
     */
    println("Creating instance")
    val p1 = Person5("Jasmine", 23)
    println(p1)
    println("Done")
    /**
     * Output:
     * Creating instance
     * In Init
     * Person5@1b28cdfa
     * Done
     */
    //endregion
}

/**
 * Summary
 * Initialization blocks in Kotlin provide a way to run code during the creation of an instance.
 * They ensure that the necessary setup is completed before any other code can access the object.
 * Multiple init blocks can be used to modularize and step through complex initialization processes, improving the organization and readability of your code.
 */