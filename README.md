<body>

<h1>Kotlin Companion Objects Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates the appropriate use of companion objects. Companion objects are used to define behavior that is shared across all instances of a class. They are best suited for utility functions, instance management, answering class-related queries, providing examples, testing, and supporting application entry points.</p>

<h2>Code Overview</h2>

<pre>
<code>
object HelloWorldApp {
    /**
     * Entry point for a Kotlin application.
     * The @JvmStatic annotation ensures that the compiler generates bytecode compatible with Java's static member function.
     */
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello World!")
    }
}

class MyClass private constructor() {

    companion object {
        private var instanceCount = 0

        /**
         * Provides the number of MyClass instances that have been created.
         */
        fun getInstanceCount(): Int {
            return instanceCount
        }

        /**
         * Factory method to create a new MyClass instance.
         */
        fun create(): MyClass {
            instanceCount++
            return MyClass()
        }
    }
}

class DatabaseConnection private constructor() {

    companion object {
        private const val MAX_CONNECTIONS = 10
        private var connectionsCreated = 0

        /**
         * Factory method to create a new DatabaseConnection instance, limiting the number of connections.
         */
        fun create(): DatabaseConnection? {
            return if (connectionsCreated < MAX_CONNECTIONS) {
                connectionsCreated++
                DatabaseConnection()
            } else {
                null // Or throw an exception if desired
            }
        }
    }
}

class ExampleClass {

    companion object {
        /**
         * Provides an example usage of ExampleClass.
         */
        fun exampleUsage() {
            val instance = ExampleClass()
            println("This is how you create an instance: $instance")
        }
    }
}

class Calculator {

    companion object {
        /**
         * Tests the add function of the Calculator class.
         */
        fun testAddition(): Boolean {
            val calc = Calculator()
            return calc.add(2, 3) == 5
        }
    }

    /**
     * Adds two integers and returns the result.
     */
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}

fun main() {
    // Demonstrating the use of HelloWorldApp as the entry point
    HelloWorldApp.main(arrayOf())

    // Demonstrating instance management with MyClass
    val instance1 = MyClass.create()
    val instance2 = MyClass.create()
    println("MyClass instances created: ${MyClass.getInstanceCount()}")

    // Demonstrating limited instance creation with DatabaseConnection
    val connection1 = DatabaseConnection.create()
    val connection2 = DatabaseConnection.create()
    println("DatabaseConnection 1: $connection1")
    println("DatabaseConnection 2: $connection2")

    // Demonstrating example usage of ExampleClass
    ExampleClass.exampleUsage()

    // Demonstrating a simple test with Calculator
    val isAdditionCorrect = Calculator.testAddition()
    println("Is the Calculator addition correct? $isAdditionCorrect")
}

/*
 * Output:
 * Hello World!
 * MyClass instances created: 2
 * DatabaseConnection 1: DatabaseConnection@1b6d3586
 * DatabaseConnection 2: DatabaseConnection@4554617c
 * This is how you create an instance: ExampleClass@74a14482
 * Is the Calculator addition correct? true
 */

/**
 * Explanation:
 *
 * - `HelloWorldApp` serves as an application entry point using a companion object.
 * - `MyClass` uses a companion object to count and manage instances of the class.
 * - `DatabaseConnection` uses a companion object to limit the number of instances created.
 * - `ExampleClass` provides a usage example through a companion object method.
 * - `Calculator` uses a companion object for a simple test of its functionality.
 */
</code>
</pre>

<h3>Companion Objects in Kotlin</h3>

<ul>
    <li><strong>HelloWorldApp:</strong> Serves as an application entry point using a companion object.</li>
    <li><strong>MyClass:</strong> Uses a companion object to count and manage instances of the class.</li>
    <li><strong>DatabaseConnection:</strong> Uses a companion object to limit the number of instances created.</li>
    <li><strong>ExampleClass:</strong> Provides a usage example through a companion object method.</li>
    <li><strong>Calculator:</strong> Uses a companion object for a simple test of its functionality.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different examples demonstrating the use of companion objects.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
