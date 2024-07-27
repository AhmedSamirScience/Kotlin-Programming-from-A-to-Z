
<body>

<h1>Kotlin Function References with Box Operator Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the use of the box operator (<code>::</code>) to obtain references to named functions. The main function shows how to reference and invoke named functions using the <code>::</code> operator.</p>

<h2>Code Overview</h2>

<pre>
<code>
fun main() {

    /**
     * The box operator (::) can be used to obtain a reference to a named function.
     * By default, when you access a named function, it must be invoked.
     * It is not possible to simply reference the function, as shown below:
     */
    println(increase(5))
    /**
     * Attempting this will result in a compilation error: Function invocation 'increase(...)' expected.
     */
    //val inc = increase


    /**
     * However, using the box operator (::), you can reference a named function without invoking it. The modified program is as follows:
     */
    val inc = ::increase // obtain reference to function
    println(inc)
    println(inc(5))
    /**
     * In this program, we obtain a callable reference to the increase() function and store it in val inc.
     * This means that both increase and inc reference the same function.
     * Calling either increase(5) or inc(5) will execute the same block of code and produce the same result, 6.
     *
     *
     * The output from this program is:
     * 6
     * fun increase(kotlin.Int): kotlin.Int
     * 6
     *
     *
     * The reference held in inc points to the increase function, which takes an Int and returns an Int.
     * Thus, the type of val inc is (Int) -> Int.
     *
     */
}

fun increase(i: Int) = i + 1
</code>
</pre>

<h3>Function References with Box Operator in Kotlin</h3>

<p>The box operator (<code>::</code>) in Kotlin allows you to obtain a reference to a named function without invoking it. This can be useful for creating aliases for functions or passing functions as arguments. In the example above:</p>

<ul>
    <li><strong>Direct Invocation:</strong> The <code>increase</code> function is invoked directly with an argument:
        <pre><code>println(increase(5))</code></pre>
        This prints the result of the function, which is 6.
    </li>
    <li><strong>Function Reference:</strong> The <code>increase</code> function is referenced using the box operator and assigned to the variable <code>inc</code>:
        <pre><code>val inc = ::increase</code></pre>
        This allows <code>inc</code> to be used as a reference to the <code>increase</code> function.
    </li>
    <li><strong>Calling the Reference:</strong> The function reference <code>inc</code> can be invoked with an argument:
        <pre><code>
println(inc)
println(inc(5))
        </code></pre>
        This prints the function reference itself and the result of invoking the function through the reference.
    </li>
</ul>

<h3>Benefits of Using the Box Operator</h3>

<p>Using the box operator provides several benefits:</p>

<ul>
    <li><strong>Function Aliases:</strong> You can create aliases for functions, making it easier to reference them in different contexts.</li>
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
6
fun increase(kotlin.Int): kotlin.Int
6
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
