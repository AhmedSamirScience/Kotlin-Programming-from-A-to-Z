<body>

<h1>Kotlin For Loop Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates various usages of the `for` loop in Kotlin. The main function shows different ways to iterate over a range with various conditions and increments.</p>

<h2>Code Overview</h2>

<pre>
<code>
fun main() {

    //region Print out values in a range
    println("Print out values in a range")
    for (i in 0..9) {
        print("$i, ")
    }
    println()
    println("Done")
    println("\n")
    //endregion

    //region Print out values in a range with an increment of 2
    // Now use values in a range but increment by 2
    println("Print out values in a range with an increment of 2")
    for (i in 0..9 step 2) {
        print("$i, ")
    }
    println()
    println("Done")
    println("\n")
    //endregion

    //region Print out values in a range to but not including 9
    println("Print out values in a range to but not including 9")
    for (x in 0 until 9)
        print("$x, ")
    println()
    println("Done")
    println("\n")
    //endregion

    //region Print out values in a range to but not including 9 with step 2
    println("Print out values in a range to but not including 9 with step 2")
    for (x in 0 until 9 step 2) {
        print("$x, ")
    }
    println()
    println("Done")
    println("\n")
    //endregion

    //region Iterate down from one value to a lower value
    println("Iterate down from one value to a lower value")
    for (i in 5 downTo 0) {
        print("$i * $i = ${i*i}; ")
    }
    println()
    println("Done")
    println("\n")
    //endregion

}
</code>
</pre>

<h3>For Loop in Kotlin</h3>

<ul>
    <li><strong>Print out values in a range:</strong> Iterates from 0 to 9 and prints each value.</li>
    <li><strong>Print out values in a range with an increment of 2:</strong> Iterates from 0 to 9 with a step of 2 and prints each value.</li>
    <li><strong>Print out values in a range to but not including 9:</strong> Iterates from 0 to 8 and prints each value.</li>
    <li><strong>Print out values in a range to but not including 9 with step 2:</strong> Iterates from 0 to 8 with a step of 2 and prints each value.</li>
    <li><strong>Iterate down from one value to a lower value:</strong> Iterates from 5 down to 0 and prints each value with its square.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different `for` loop examples.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
