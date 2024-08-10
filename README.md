<body>

<h1>Kotlin Member Level Properties Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates the use of member level properties. Member level properties are properties defined within the body of a class but not initialized directly in the constructor. The examples showcase two different approaches: initialization in the <code>init</code> block and initialization directly at the point of declaration.</p>

<h2>Code Overview</h2>

<pre>
<code>
//region Example 1
class GamePlayer(
    firstName: String,   // constructor parameter
    surname: String,     // constructor parameter
    var age: Int,        // read-write property
    val id: String,      // read-only property
    private val message: String = "Happy Birthday" // private property
) {
    // Member level properties
    val fullname: String  // read-only member property
    var favouriteGame: String  // read-write member property

    init {
        // Initializing member properties in the init block
        fullname = "$firstName $surname"
        favouriteGame = ""
    }
}

fun main() {
    // Creating an instance of GamePlayer
    val player = GamePlayer("John", "Hunt", 36, "123AA")

    // Accessing the member properties
    println("Fullname: ${player.fullname}")
    println("Favourite Game: ${player.favouriteGame}")

    // Modifying the mutable property 'favouriteGame'
    player.favouriteGame = "Chess"
    println("Updated Favourite Game: ${player.favouriteGame}")
}

/*
 * Output:
 * Fullname: John Hunt
 * Favourite Game:
 * Updated Favourite Game: Chess
 */

/**
 * In this example:
 *
 * - `fullname` is a read-only property initialized in the `init` block using the constructor parameters.
 * - `favouriteGame` is a mutable property initialized as an empty string in the `init` block.
 * - Both properties are member level properties, meaning they are part of the class but not defined directly in the constructor.
 */
//endregion

//region Example 2
class GamePlayerAlternative(
    firstName: String,   // constructor parameter
    surname: String,     // constructor parameter
    var age: Int,        // read-write property
    val id: String,      // read-only property
    private val message: String = "Happy Birthday" // private property
) {
    // Member level properties initialized at declaration
    val fullname: String = "$firstName $surname"  // read-only member property
    var favouriteGame: String = ""  // read-write member property
}

fun main() {
    // Creating an instance of GamePlayerAlternative
    val player = GamePlayerAlternative("John", "Hunt", 36, "123AA")

    // Accessing the member properties
    println("Fullname: ${player.fullname}")
    println("Favourite Game: ${player.favouriteGame}")

    // Modifying the mutable property 'favouriteGame'
    player.favouriteGame = "Soccer"
    println("Updated Favourite Game: ${player.favouriteGame}")
}

/*
 * Output:
 * Fullname: John Hunt
 * Favourite Game:
 * Updated Favourite Game: Soccer
 */

/**
 * In this example:
 *
 * - `fullname` is a read-only property initialized directly at its declaration using the constructor parameters.
 * - `favouriteGame` is a mutable property initialized as an empty string at its declaration.
 * - Both properties are part of the class, initialized during the instance creation process.
 */
//endregion

//region Summary
/**
 * This file demonstrates two different approaches to initializing member level properties in Kotlin:
 * 1. Initialization in the `init` block.
 * 2. Initialization directly at the point of declaration.
 */

// Example 1: Initialization in `init` Block
class GamePlayer(
    firstName: String,   // constructor parameter
    surname: String,     // constructor parameter
    var age: Int,        // read-write property
    val id: String,      // read-only property
    private val message: String = "Happy Birthday" // private property
) {
    // Member level properties
    val fullname: String  // read-only member property
    var favouriteGame: String  // read-write member property

    init {
        // Initializing member properties in the init block
        fullname = "$firstName $surname"
        favouriteGame = ""
    }
}

// Example 2: Initialization at Declaration
class GamePlayerAlternative(
    firstName: String,   // constructor parameter
    surname: String,     // constructor parameter
    var age: Int,        // read-write property
    val id: String,      // read-only property
    private val message: String = "Happy Birthday" // private property
) {
    // Member level properties initialized at declaration
    val fullname: String = "$firstName $surname"  // read-only member property
    var favouriteGame: String = ""  // read-write member property
}

fun main() {
    // Using Example 1: GamePlayer with initialization in `init` block
    val player1 = GamePlayer("John", "Hunt", 36, "123AA")
    println("Example 1 - Fullname: ${player1.fullname}")
    println("Example 1 - Favourite Game: ${player1.favouriteGame}")
    player1.favouriteGame = "Chess"
    println("Example 1 - Updated Favourite Game: ${player1.favouriteGame}")

    // Using Example 2: GamePlayerAlternative with initialization at declaration
    val player2 = GamePlayerAlternative("Jane", "Doe", 28, "456BB")
    println("Example 2 - Fullname: ${player2.fullname}")
    println("Example 2 - Favourite Game: ${player2.favouriteGame}")
    player2.favouriteGame = "Soccer"
    println("Example 2 - Updated Favourite Game: ${player2.favouriteGame}")
}

/*
 * Output:
 * Example 1 - Fullname: John Hunt
 * Example 1 - Favourite Game:
 * Example 1 - Updated Favourite Game: Chess
 * Example 2 - Fullname: Jane Doe
 * Example 2 - Favourite Game:
 * Example 2 - Updated Favourite Game: Soccer
 */

/**
 * Summary of Differences:
 *
 * 1. **Location of Initialization**:
 *    - Example 1: Initializes member properties within the `init` block.
 *    - Example 2: Initializes member properties directly at the point of declaration.
 *
 * 2. **Flexibility**:
 *    - Example 1: More flexible, allowing for complex initialization logic that can involve multiple steps or conditions.
 *    - Example 2: More straightforward and concise, best for simple initialization that doesn't require additional logic.
 *
 * 3. **Code Structure**:
 *    - Example 1: Separates the declaration of properties from their initialization, making it easier to handle more complex scenarios.
 *    - Example 2: Combines declaration and initialization, which can be cleaner and easier to read when the initialization logic is simple.
 *
 * **When to Use Each Approach**:
 * - Use the `init` Block when you need to perform complex initialization logic that depends on constructor parameters or requires multiple steps.
 * - Use Initialization at Declaration when the initialization is simple and straightforward, making the code more concise and easier to read.
 */
//endregion
</code>
</pre>

<h3>Member Level Properties in Kotlin</h3>

<ul>
    <li><strong>Example 1:</strong> Demonstrates initialization of member properties in the <code>init</code> block.</li>
    <li><strong>Example 2:</strong> Demonstrates initialization of member properties directly at the point of declaration.</li>
    <li><strong>Summary:</strong> The summary section provides a comparison of both approaches, highlighting their use cases and benefits.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different examples demonstrating the use of member level properties.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
