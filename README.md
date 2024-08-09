<h1>Kotlin Initialization Blocks Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates the use of <code>init</code> blocks in class initialization. The <code>init</code> blocks in Kotlin allow you to define code that runs when an instance of a class is created. These blocks execute after the primary constructor but before any auxiliary constructors.</p>

<h2>Code Overview</h2>

<pre>
<code>
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
</code>
</pre>

<h3>Initialization Blocks in Kotlin</h3>

<p>In Kotlin, initialization blocks (<code>init</code>) allow you to define code that runs when an instance of a class is created. These blocks are executed after the primary constructor but before any auxiliary constructors. Multiple <code>init</code> blocks can be used, and they are executed in the order they appear in the class.</p>

<h3>Example: Person5 Class</h3>

<p>The <code>Person5</code> class demonstrates the use of multiple <code>init</code> blocks:</p>

<pre><code>
class Person5(val name: String = "", var age: Int = 0) {

    init {
        println("In Init 1")
    }

    init {
        println("In Init 2")
    }

    init {
        println("In Init 3")
    }
}
</code></pre>

<p>When an instance of <code>Person5</code> is created, the <code>init</code> blocks are executed in the order they appear:</p>

<pre><code>
fun main() {
    println("Creating instance")
    val p1 = Person5("Jasmine", 23)
    println(p1)
    println("Done")
}
</code></pre>

<h3>Output</h3>

<pre>
<code>
Creating instance
In Init 1
In Init 2
In Init 3
Person5@1b28cdfa
Done
</code>
</pre>

<h3>Stepped Initialization</h3>

<p>In some cases, you might want to use multiple <code>init</code> blocks to perform stepped initialization. This can be useful when one block needs to validate or set up properties that another block will use:</p>

<pre><code>
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
        if (!isValid(x)) {
            throw IllegalArgumentException("Invalid value for x")
        }
    }

    val y = Bar.getDerivedValue(x)

    init {
        if (!isValid(y)) {
            throw IllegalArgumentException("Invalid value for y")
        }
    }
}
</code></pre>

<p>In this example, the first <code>init</code> block checks the validity of <code>x</code>. If <code>x</code> is valid, the second <code>init</code> block initializes <code>y</code> based on <code>x</code>. If any validation fails, the initialization process is halted by throwing an exception.</p>

<h3>Summary</h3>

<p>Initialization blocks in Kotlin provide a flexible way to define initialization behavior in classes. By using multiple <code>init</code> blocks, you can modularize initialization logic and ensure that properties are set up correctly in a step-by-step manner.</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
