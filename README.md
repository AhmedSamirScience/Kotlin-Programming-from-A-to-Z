<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kotlin Vararg Parameters Demonstration</title>
</head>
<body>

<h1>Kotlin Vararg Parameters Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the use of the <code>vararg</code> keyword to pass an arbitrary number of arguments into a function. The main function shows how to define and call functions with variable-length parameter lists.</p>

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

<p>The <code>greeter4</code> and <code>greeter4WithInt</code> functions demonstrate how to use the <code>vararg</code> keyword to define a parameter list of arbitrary length in Kotlin. The <code>vararg</code> keyword allows you to pass a variable number of arguments to a function.</p>

<ul>
    <li><strong>Vararg Parameter:</strong> The <code>vararg</code> keyword is used to define a parameter that can accept a variable number of arguments. This is useful when the number of parameters is not known in advance.</li>
    <li><strong>Single Vararg Parameter:</strong> Only one parameter in a function can be defined with <code>vararg</code>. If there are additional parameters, they must use named argument syntax if they follow the <code>vararg</code> parameter.</li>
    <li><strong>Using Vararg Parameters:</strong> You can call functions with <code>vararg</code> parameters by passing a comma-separated list of arguments.</li>
    <li><strong>Mixing Vararg with Named Arguments:</strong> When using <code>vararg</code> with other parameters, the other parameters must be named if they follow the <code>vararg</code> parameter.</li>
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

<h3>Examples of Function Calls</h3>

<p>Here are some examples of how to call functions with <code>vararg</code> parameters:</p>

<ul>
    <li><code>greeter4("John")</code> - Calls the function with one argument.</li>
    <li><code>greeter4("John", "Denise")</code> - Calls the function with two arguments.</li>
    <li><code>greeter4("John", "Denise", "Phoebe", "Adam")</code> - Calls the function with four arguments.</li>
    <li><code>greeter4("John", "Denise", "Phoebe", "Adam", "Jasmine", "Gryff")</code> - Calls the function with six arguments.</li>
    <li><code>greeter4WithInt("Ahmed", "Samir", number = 1)</code> - Calls the function with a <code>vararg</code> list and an additional named parameter.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the functions with <code>vararg</code> parameters.</li>
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
