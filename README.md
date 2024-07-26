<body>

<h1>Kotlin Function Parameters as Val Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates that all function parameters in Kotlin are `val`, meaning they cannot be reassigned once the function is invoked. This protects the programmer from accidentally reassigning a parameter's value.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * In Kotlin, all function parameters are `val`, meaning they cannot be reassigned once the function is invoked.
 * This differs from Java, where reassignment is possible.
 *
 */
fun main() {

}

fun add(i: Int) {
    /**
     * This protects the programmer from accidentally reassigning a parameter's value and using the new value later, while expecting the original value.
     */
    //i = i + 1 // won't compile i is a val
}
</code>
</pre>

<h3>Function Parameters in Kotlin</h3>

<p>In Kotlin, all function parameters are implicitly declared as `val`. This means they are read-only and cannot be reassigned within the function. This differs from languages like Java, where function parameters can be reassigned.</p>

<ul>
    <li><strong>Immutable Parameters:</strong> Declaring parameters as `val` ensures that their values remain constant throughout the function, preventing accidental reassignment and potential bugs.</li>
    <li><strong>Example:</strong> In the `add` function, attempting to reassign the parameter `i` will result in a compilation error, ensuring that the original value is preserved.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see that it compiles and runs without errors.</li>
</ol>

<h2>Expected Behavior</h2>

<p>The program will compile and run without any output since the `main` function is empty. Attempting to uncomment the line `i = i + 1` in the `add` function will result in a compilation error, demonstrating that function parameters in Kotlin cannot be reassigned.</p>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
