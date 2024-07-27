<body>

<h1>Kotlin Function References Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the use of function references in Kotlin. The main function shows how to reference named functions, anonymous functions, and lambda functions.</p>

<h2>Code Overview</h2>

<pre>
<code>
fun main() {

    /**
     * Including round brackets () after val or var func executes the anonymous or lambda or named function.
     * If the brackets are omitted (left out), it references the function itself rather than executing it.
     * Using the :: operator allows referencing a function by name, as shown in:
     */
    val message2 = ::getMessage

    /**
     * The output function getMessage (Kotlin reflection is not available) indicates message2 is a reference to the getMessage function, not its result.
     * This means message2 acts as an alias for getMessage().
     */
    println(message2)

    /**
     * Running either getMessage() or message2() executes the function by accessing its memory location and running the code.
     */
    println(getMessage())
    println(message2())

    /**
     * These have two implications:
     * 1- We can create aliases for functions.
     * 2- We can pass function references around.
     *
     * For example, using a lambda function:
     * Here, func is a lambda function taking no parameters and returning Unit.
     * Assigning func to val func1 makes both references to the same lambda function and of the same type.
     */
    val func: () -> Unit = { println("Hello World") }
    val func1 = func
    func()
    func1()

}

fun getMessage(): String {
    return "Hello Kotlin World!"
}
</code>
</pre>

<h3>Function References in Kotlin</h3>

<p>Kotlin allows you to reference functions by name using the <code>::</code> operator. This can be useful for creating aliases for functions or passing functions as arguments to other functions. In the example above:</p>

<ul>
    <li><strong>Named Function Reference:</strong> The <code>message2</code> variable is assigned a reference to the <code>getMessage</code> function using the <code>::</code> operator.
        <pre><code>val message2 = ::getMessage</code></pre>
    </li>
    <li><strong>Function Execution:</strong> Both <code>getMessage()</code> and <code>message2()</code> can be called to execute the function, producing the same result.
        <pre><code>
println(getMessage())
println(message2())
        </code></pre>
    </li>
    <li><strong>Lambda Function:</strong> A lambda function is assigned to the <code>func</code> variable, and <code>func1</code> is created as an alias for <code>func</code>.
        <pre><code>
val func: () -> Unit = { println("Hello World") }
val func1 = func
        </code></pre>
    </li>
</ul>

<h3>Benefits of Function References</h3>

<p>Using function references provides several benefits:</p>

<ul>
    <li><strong>Aliases:</strong> You can create aliases for functions, making it easier to reference them in different contexts.</li>
    <li><strong>Passing Functions:</strong> Function references can be passed as arguments to other functions, enabling more flexible and reusable code.</li>
    <li><strong>Code Clarity:</strong> Referencing functions by name can make code more readable and easier to understand.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the function references and lambda functions.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
fun getMessage(): String
Hello Kotlin World!
Hello Kotlin World!
Hello World
Hello World
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
