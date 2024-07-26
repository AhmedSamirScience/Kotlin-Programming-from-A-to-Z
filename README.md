<body>

<h1>Kotlin Break and Continue Statements Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the use of the `break` and `continue` statements in Kotlin. The main function shows how to use these statements to control the flow of loops.</p>

<h2>Code Overview</h2>

<pre>
<code>
fun main() {

    //region Break Loop Statement
    println("(Break Loop Statement)")
    println("First Example:")
    val y = 10
    val x = 5
    for (i in 0 until y) {
        if (i == x) {
            break
        }
        print("i: $i, ")
    }
    println("Done")
    println("\n")


    println("Second Example:")
    loop@ for (i in 0 until 4) {
        for (j in 0 until 2) {
            if (i == 3) {
                break@loop
            }
            println("i=$i - j=$j, ")
        }
    }
    println("-------------------------------------------------- \n\n")
    //endregion

    //region Continue Loop Statement
    println("(Continue Loop Statement)")
    println("First Example:")
    for (i in 0 until 10) {
        print("i=$i ")
        if ((i % 2) == 1) {
            continue
        }
        println("hey its an even number")
        println("we love even numbers")
    }
    println("Done")
    println("\n")


    println("Second Example:")
    outer@ for (i in 1..4) {
        println("i = $i")
        for (j in 1..4) {
            val result = i + j
            if (result == 5) continue@outer
            println("\t$i + $j = $result ")
        }
    }
    println("-------------------------------------------------- \n\n")
    //endregion

    //region When with Continue and Break
    println("(When with Continue and Break)")
    for (i in 0..10) {
        when (i) {
            2 -> continue
            4 -> break
            else -> println(i)
        }
    }
    println("Done")
    println("-------------------------------------------------- \n\n")
    //endregion

}
</code>
</pre>

<h3>Break and Continue Statements in Kotlin</h3>

<ul>
    <li><strong>Break Loop Statement:</strong> 
        <ul>
            <li><strong>First Example:</strong> Iterates from 0 to 9 and breaks the loop when `i` equals 5.</li>
            <li><strong>Second Example:</strong> Uses labeled `break` to break out of an outer loop.</li>
        </ul>
    </li>
    <li><strong>Continue Loop Statement:</strong> 
        <ul>
            <li><strong>First Example:</strong> Continues the loop for odd numbers, but prints additional messages for even numbers.</li>
            <li><strong>Second Example:</strong> Uses labeled `continue` to skip to the next iteration of an outer loop when the sum of `i` and `j` equals 5.</li>
        </ul>
    </li>
    <li><strong>When with Continue and Break:</strong> Uses `when` expression inside a loop to demonstrate `continue` and `break` statements based on the value of `i`.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the `break` and `continue` statement examples.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
