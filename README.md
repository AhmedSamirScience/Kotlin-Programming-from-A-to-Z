<body>

<h1>Kotlin Repeat Loop Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the use of the `repeat` loop in Kotlin. The main function shows how to use the `repeat` loop to execute a block of statements a specified number of times without needing an explicit loop variable.</p>

<h2>Code Overview</h2>

<pre>
<code>
fun main() {

   /**
    * Kotlin includes another loop statement called the repeat statement. This is similar
    * to a for loop in that it is a counted loop. That is the number of times the loop will
    * be repeated is known at the start. However, it differs from a for loop in that the loop
    * variable is not made explicit. This is useful in situations where you know you want
    * to loop a certain number of times, but you do not need to reference the loop index.
    * The repeat loop has the following syntax
    */
    repeat(3) {
        print("Hello, ")
    }
    println()

}
</code>
</pre>

<h3>Repeat Loop in Kotlin</h3>

<p>The `repeat` loop is used when you want to execute a block of code a specific number of times without needing to reference the loop index. In the example above:</p>

<ul>
    <li><strong>Repeat Loop:</strong> The `repeat(3)` statement executes the block of code three times, printing "Hello, " each time.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the `repeat` loop example.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
