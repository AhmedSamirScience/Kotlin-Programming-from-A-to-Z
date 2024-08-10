/**
 * This file demonstrates the use of constructor parameters and properties in Kotlin.
 *
 * In Kotlin, you can define both constructor parameters and properties within the constructor.
 * - Constructor parameters are only available within the `init` block and do not have the `val` or `var` keyword.
 * - Constructor properties are defined with `val` or `var`, making them accessible throughout the class.
 */

class GamePlayer(
    firstName: String,  // constructor parameter
    surname: String,    // constructor parameter
    var age: Int,       // read-write property
    val id: String,     // read-only property
    private val message: String = "Happy Birthday" // private property
) {
    // Read-only property initialized in the init block
    val fullname: String

    init {
        // firstName and surname are only visible in the init block
        fullname = "$firstName $surname"
    }

    // Override toString method to provide a custom string representation
    override fun toString(): String {
        return "GamePlayer[$id, $fullname, $age]"
    }

    // Member function to handle a player's birthday
    fun birthday() {
        val oldAge = age
        age++
        println("$message $fullname, you were $oldAge, you are now $age")
    }
}

fun main() {
    // Creating an instance of GamePlayer
    val player = GamePlayer("John", "Hunt", 36, "123AA")

    // Accessing and modifying the read-write property 'age'
    println("Initial age: ${player.age}")
    player.age = player.age + 1
    println("Updated age: ${player.age}")

    // Accessing the read-only property 'id'
    println("Player ID: ${player.id}")

    // Accessing the read-only property 'fullname'
    println("Player Fullname: ${player.fullname}")

    // Invoking the birthday member function
    player.birthday()
}

/*
 * Output:
 * Initial age: 36
 * Updated age: 37
 * Player ID: 123AA
 * Player Fullname: John Hunt
 * Happy Birthday John Hunt, you were 37, you are now 38
 */

/**
 * Explanation:
 *
 * - `firstName` and `surname` are constructor parameters, so they are only accessible within the `init` block.
 * - `age`, `id`, and `message` are constructor properties accessible throughout the class.
 * - `fullname` is a read-only property initialized within the `init` block using the constructor parameters.
 * - The `birthday` function demonstrates how to modify and access the class properties.
 *
 * When an instance of `GamePlayer` is created, all constructor parameters must be provided.
 * After instantiation, only the public properties (`age`, `id`, and `fullname`) are accessible externally.
 */

/**
 * Summary:
 * Constructor Parameters: firstName and surname are examples of constructor parameters that are only accessible within the init block.
 * Constructor Properties: age, id, and message are properties that are accessible throughout the class, with age being mutable and id being immutable.
 * Initialization Block: The init block is used to initialize properties like fullname using the constructor parameters.
 * Class Usage: The main function demonstrates creating an instance of GamePlayer, accessing its properties, and invoking its methods.
 * This class.kt file provides a complete and structured example of how to use constructor parameters and properties in Kotlin, with comments and explanations to clarify each part of the class.
 */