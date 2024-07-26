<body>

<h1>Kotlin Do-While Loop Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the use of the `do-while` loop in Kotlin. The main function shows how to use the `do-while` loop to execute a block of statements at least once.</p>

<h2>Code Overview</h2>

<pre>
<code>
fun main() {
    /**
     * In some cases, we want to execute the body of statements at least once; you can
     * accomplish this with the do loop construct
     */

    var count = 0
    println("Starting")
    do {
        print("$count, ")
        count++
    } while (count < 10)
    println()
    println("Done")
}
</code>
</pre>

<h3>Do-While Loop in Kotlin</h3>

<p>The `do-while` loop is used when you want to ensure that the loop body is executed at least once, regardless of the condition. In the example above:</p>

<ul>
    <li><strong>Initialization:</strong> A variable <code>count</code> is initialized to 0.</li>
    <li><strong>Starting Message:</strong> Prints "Starting" to indicate the beginning of the loop execution.</li>
    <li><strong>Loop Execution:</strong> The `do` block prints the value of <code>count</code> and increments it by 1.</li>
    <li><strong>Condition Check:</strong> The `while` condition checks if <code>count</code> is less than 10. If true, the loop continues; otherwise, it stops.</li>
    <li><strong>Ending Message:</strong> Prints "Done" to indicate the end of the loop execution.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the `do-while` loop example.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
