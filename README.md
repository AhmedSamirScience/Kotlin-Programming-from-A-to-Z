<body>

<h1>Kotlin Vararg Parameters Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the use of the `vararg` keyword to pass an arbitrary number of arguments into a function. The main function shows how to define and call functions with variable-length parameter lists.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Kotlin allows passing an arbitrary number of arguments into a function using the `vararg` keyword to define a parameter list of arbitrary length.
 */

fun main() {

    /**
     * The `vararg` keyword can only be applied to one parameter in a function.
     * If it's not the last parameter, subsequent parameters must use the named argument syntax.
     */

    greeter4("John")
    greeter4("John", "Denise")
    greeter4("John", "Denise", "Phoebe", "Adam")
    greeter4("John", "Denise", "Phoebe", "Adam", "Jasmine", "Gryff")

    greeter4WithInt("Ahmed", "Samir", number = 1)
}

/**
 * This function demonstrates the use of the `vararg` keyword.
 * @param params a variable-length list of strings
 */
fun greeter4(vararg params: String) {
    params.forEach { print("$it , ") }
    println()
}

/**
 * This function demonstrates the use of the `vararg` keyword with an additional parameter.
 * @param params a variable-length list of strings
 * @param number an integer parameter that must use named argument syntax
 */
fun greeter4WithInt(vararg params: String, number: Int) {
    params.forEach { print("$it , ") }
    println()
}
</code>
</pre>

<h3>Vararg Parameters in Kotlin</h3>

<p>The `greeter4` and `greeter4WithInt` functions demonstrate how to use the `vararg` keyword to define a parameter list of arbitrary length in Kotlin. The `vararg` keyword allows you to pass a variable number of arguments to a function.</p>

<ul>
    <li><strong>Vararg Parameter:</strong> The `vararg` keyword is used to define a parameter that can accept a variable number of arguments. This is useful when the number of parameters is not known in advance.</li>
    <li><strong>Single Vararg Parameter:</strong> Only one parameter in a function can be defined with `vararg`. If there are additional parameters, they must use named argument syntax if they follow the `vararg` parameter.</li>
</ul>

<h3>Details of Functions</h3>

<table>
    <thead>
        <tr>
            <th>Function</th>
            <th>Parameters</th>
            <th>Description</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>greeter4</td>
            <td>vararg params: String</td>
            <td>Prints each string in the variable-length parameter list.</td>
        </tr>
        <tr>
            <td>greeter4WithInt</td>
            <td>vararg params: String, number: Int</td>
            <td>Prints each string in the variable-length parameter list and includes an additional integer parameter.</td>
        </tr>
    </tbody>
</table>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the functions with `vararg` parameters.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
John , 
John , Denise , 
John , Denise , Phoebe , Adam , 
John , Denise , Phoebe , Adam , Jasmine , Gryff , 
Ahmed , Samir , 
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
