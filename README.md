<body>

<h1>Kotlin Named Parameters Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the use of named parameters in function calls. The main function shows how to use named parameters to assign values to function parameters, making the order of parameters irrelevant and improving code readability.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Using position to assign values to parameters is simple but can be problematic with multiple parameters, especially with defaults.
 * Named parameter passing solves this by assigning values to parameters by name, making position irrelevant.
 */
fun main() {

    /**
     * With named parameters, the order of parameters doesn't matter, allowing you to change their order freely.
     */
    greeter3(message="Have a Nice Day!", name="Jasmine")


    /**
     * Mixing named and positioned arguments is not allowed (Compilation Error)
     */
    //greeter3(message="Have a Nice Day!", "Jasmine")


    println("max(x=3, 4): " + max(x=3, 4))


    /**
     * Mixing named and positioned arguments is not allowed (Compilation Error)
     */
    //println("max(x=3, 4): " + max(y=3, 4))

}

/**
 * This function demonstrates the use of named parameters.
 * @param name the name of the person to greet
 * @param title the title of the person (default is "Dr")
 * @param prompt the greeting prompt (default is "Welcome")
 * @param message a greeting message (default is "Live Long and Prosper")
 */
fun greeter3(name: String,
             title: String = "Dr",
             prompt: String = "Welcome",
             message: String = "Live Long and Prosper") {
    println("$prompt $title $name - $message")
}

/**
 * This function returns the maximum of two integers.
 * @param x the first integer
 * @param y the second integer
 */
fun max(x: Int, y: Int ): Int = if (x > y) { x } else { y }
</code>
</pre>

<h3>Named Parameters in Kotlin</h3>

<p>The `greeter3` function demonstrates how to use named parameters in Kotlin. Named parameters allow you to assign values to function parameters by name, making the order of parameters irrelevant. This is particularly useful when a function has multiple parameters with default values.</p>

<ul>
    <li><strong>Named Parameters:</strong> The function call <code>greeter3(message="Have a Nice Day!", name="Jasmine")</code> demonstrates how to use named parameters to assign values, allowing the order of parameters to be changed freely.</li>
    <li><strong>Positional Parameters:</strong> Mixing named and positional arguments is not allowed and will result in a compilation error.</li>
</ul>

<h3>Details of Parameters</h3>

<table>
    <thead>
        <tr>
            <th>Parameter</th>
            <th>Type</th>
            <th>Mandatory/Optional</th>
            <th>Default Value</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>name</td>
            <td>String</td>
            <td>Mandatory</td>
            <td>None</td>
        </tr>
        <tr>
            <td>title</td>
            <td>String</td>
            <td>Optional</td>
            <td>"Dr"</td>
        </tr>
        <tr>
            <td>prompt</td>
            <td>String</td>
            <td>Optional</td>
            <td>"Welcome"</td>
        </tr>
        <tr>
            <td>message</td>
            <td>String</td>
            <td>Optional</td>
            <td>"Live Long and Prosper"</td>
        </tr>
    </tbody>
</table>

<p>The `greeter3` function has both mandatory and optional parameters. The `name` parameter is mandatory, while `title`, `prompt`, and `message` are optional with default values. Named parameters allow you to call the function with arguments in any order, as long as you specify the parameter names.</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the function with named parameters.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
Welcome Dr Jasmine - Have a Nice Day!
max(x=3, 4): 4
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
