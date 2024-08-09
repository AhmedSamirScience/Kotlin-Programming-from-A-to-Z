/**
 * This class demonstrates initialization behavior in Kotlin using `init` blocks.
 *
 * In Kotlin, initialization blocks (`init`) allow you to define code that runs when an instance of a class is created.
 * These blocks execute after the primary constructor but before any auxiliary constructors.
 *
 * Multiple `init` blocks are executed in the order they appear in the class.
 */
class Person5(val name: String = "", var age: Int = 0) {

    /**
     * This `init` block runs immediately after the class is instantiated.
     */
    init {
        println("In Init 1")
    }

    /**
     * Another `init` block. This runs after the first `init` block.
     */
    init {
        println("In Init 2")
    }

    /**
     * A third `init` block, demonstrating multiple initialization steps.
     */
    init {
        println("In Init 3")
    }
}

/**
 * The `main` function demonstrates creating an instance of `Person5`
 * and shows the order in which `init` blocks are executed.
 */
fun main() {
    println("Creating instance")
    val p1 = Person5("Jasmine", 23)
    println(p1)
    println("Done")
}

/*
 * Output:
 * Creating instance
 * In Init 1
 * In Init 2
 * In Init 3
 * Person5@1b28cdfa
 * Done
 *
 * Justifications for Multiple `init` Blocks:
 * - Modularization: Separate different initialization tasks.
 * - Stepped Initialization: One `init` block can set up a property for another.
 *
 * Example of Stepped Initialization:
 */
class Bar {
    companion object {
        fun getValue(): Int {
            return 10
        }

        fun getDerivedValue(x: Int): Int {
            return x * 2
        }
    }
}

fun isValid(value: Int): Boolean {
    return value > 0
}

class Foo {

    val x = Bar.getValue()

    init {
        // Validate `x` and abort if invalid
        if (!isValid(x)) {
            throw IllegalArgumentException("Invalid value for x")
        }
    }

    val y = Bar.getDerivedValue(x) // `y` depends on `x` being valid

    init {
        // Validate `y` and continue with initialization if all is okay
        if (!isValid(y)) {
            throw IllegalArgumentException("Invalid value for y")
        }
    }
}

/*
 * In this example, the first `init` block checks the validity of `x`.
 * If `x` is valid, the second `init` block initializes `y` based on `x`.
 * If any validation fails, the initialization process is halted by throwing an exception.
 */
