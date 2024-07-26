<body>

<h1>Kotlin KDoc and Special Characters Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the usage of KDoc comments and various special characters in strings. The main function showcases how to print different escape sequences in Kotlin.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * These @symbols are collectively known as KDoc. Some of these are shown below:
 * The *main* Function used to start
 * this simple Hello World application.
 * @author Ahmed Samir -> the author of the code
 * @since 1.0 -> versions
 * @see Main -> cross-references or where is your point that you will describe and document
 * @params functions -> symbol used to describe parameters to functions
 */
fun main() {
    println("\tHello — Inserts tab")
    println("\bHello — Inserts backspace")
    println("\nHello — Inserts newline")
    println("\rHello — Inserts carriage return")
    println("\'Hello — Inserts single quote character")
    println("\"Hello — Inserts double quote character")
    println("\\Hello — Inserts backslash")
    println("\$Hello — Inserts dollar character")
}
</code>
</pre>

<h3>KDoc Symbols Explanation</h3>

<ul>
    <li><code>@symbol</code>: These symbols are used in KDoc comments for various purposes.</li>
    <li><code>@author</code>: Indicates the author of the code.</li>
    <li><code>@since</code>: Specifies the version of the code.</li>
    <li><code>@see</code>: Provides cross-references or additional documentation points.</li>
    <li><code>@params</code>: Describes the parameters of functions.</li>
</ul>

<h3>Special Characters in Strings</h3>

<ul>
    <li><code>\t</code>: Inserts a tab.</li>
    <li><code>\b</code>: Inserts a backspace.</li>
    <li><code>\n</code>: Inserts a newline.</li>
    <li><code>\r</code>: Inserts a carriage return.</li>
    <li><code>\'</code>: Inserts a single quote character.</li>
    <li><code>\"</code>: Inserts a double quote character.</li>
    <li><code>\\</code>: Inserts a backslash.</li>
    <li><code>\$</code>: Inserts a dollar character.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different special characters.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
