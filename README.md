<body>

<h1>Kotlin Initialization Blocks Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the concept of initialization blocks. Initialization blocks in Kotlin allow you to define behavior that runs when an instance of a class is created. These blocks are executed after the primary constructor but before any auxiliary constructors.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Initialization Blocks in Kotlin
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
</code>
</pre>

<h3>Initialization Blocks in Kotlin</h3>

<p>In Kotlin, to define behavior that runs when an instance of a class is created, you use initialization blocks. These blocks are executed after the instance is created, after the primary constructor runs, but before any auxiliary constructors. Initialization blocks ensure that the initialization behavior is executed before any client code can access the instance.</p>

<h3>Syntax</h3>

<p>An initialization block is defined using the <code>init</code> keyword followed by a block of code:</p>

<pre><code>
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
</code></pre>

<h3>Multiple Initialization Blocks</h3>

<p>You can have multiple <code>init</code> blocks in a class. If there are multiple <code>init</code> blocks, they run in the order they are defined:</p>

<pre><code>
class Person5MultipleInitializationBlocks(val name: String = "", var age: Int = 0) {
    init {
        println("In Init")
    }
    init {
        println("In Init 2")
    }
    init {
        println("In Init 3")
    }
}
</code></pre>

<p>When an instance of <code>Person5</code> is created, the output is:</p>

<pre><code>
Creating instance
In Init
In Init 2
In Init 3
Person5@1b28cdfa
Done
</code></pre>

<h3>Reasons for Multiple Initialization Blocks</h3>

<ul>
    <li><strong>Modularization:</strong> Each block can initialize a specific part of the class, separating different initialization concerns.</li>
    <li><strong>Stepped Initialization:</strong> Properties can be initialized in steps, where one init block's behavior depends on the result of a previous block.</li>
</ul>

<h3>Example: Stepped Initialization</h3>

<p>Consider the following example:</p>

<pre><code>
class Foo {
    val x = Bar.getValue()
    init {
        // check the validity of x and abort if invalid
        if (!isValid(x)) throw IllegalArgumentException("Invalid value for x")
    }
    val y = Bar.getDerivedValue(x) // requires x to be valid
    init {
        // Check validity of y and continue with initialization if all ok
        if (!isValid(y)) throw IllegalArgumentException("Invalid value for y")
    }

    // Dummy validation methods for illustration
    fun isValid(value: Any): Boolean {
        // Implement your validation logic here
        return true
    }
}

object Bar {
    fun getValue(): Int {
        return 42 // Replace with actual logic to get value
    }

    fun getDerivedValue(input: Int): Int {
        return input + 1 // Replace with actual logic to derive value
    }
}
</code></pre>

<p>In this example:</p>

<ul>
    <li>The first <code>init</code> block checks if <code>x</code> is valid and throws an exception if it's not.</li>
    <li>If <code>x</code> is valid, <code>y</code> is set based on <code>x</code>.</li>
    <li>The second <code>init</code> block checks if <code>y</code> is valid and completes the initialization process.</li>
</ul>

<p>This ensures that the initialization process can be broken down into manageable steps, each responsible for a part of the initialization logic.</p>

<h3>Using the Initialization Blocks</h3>

<p>When an instance of <code>Person5</code> is created, the <code>init</code> block will be executed, printing "In Init":</p>

<pre><code>
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
</code></pre>

<h3>Summary</h3>

<p>Initialization blocks in Kotlin provide a way to run code during the creation of an instance. They ensure that the necessary setup is completed before any other code can access the object. Multiple <code>init</code> blocks can be used to modularize and step through complex initialization processes, improving the organization and readability of your code.</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the initialization block example.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
Creating instance
In Init
Person5@1b28cdfa
Done
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
