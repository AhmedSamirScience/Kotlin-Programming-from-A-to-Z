<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kotlin Function Parameters with Default Values Demonstration</title>
</head>
<body>

<h1>Kotlin Function Parameters with Default Values Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the use of function parameters with default values in Kotlin. The main function shows how to define and call functions with mandatory and optional parameters.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * The default value comes after the type, preceded by an equals sign =, and must match the parameter type.
 * If a value is provided, it overrides the default; otherwise, the default is used.
 */
fun main() {

    /**
     * | Parameter | Type     | Mandatory/Optional | Default Value            |
     * |-----------|----------|--------------------|--------------------------|
     * | name      | String   | Mandatory          | None                     |
     * | message   | String   | Optional           | "Live Long and Prosper"  |
     *
     * In the first example, where only one argument was provided, the default message was used. In the second example, a provided message was used instead of the default.
     * In `greeter2()`, the term "mandatory" is used for the `name` parameter, and "optional" is used for the `message` parameter, which has a default value.
     */
    greeter2("Theeban")
    greeter2("Jasmine", "Have a Nice Day!")

}

/**
 * This function takes two parameters:
 * @param name the name of the person to greet, which is mandatory
 * @param message a greeting message, which is optional and defaults to "Live Long and Prosper"
 */
fun greeter2(name: String, message: String = "Live Long and Prosper") {
    println("Welcome $name - $message")
}
</code>
</pre>

<h3>Function Parameters with Default Values in Kotlin</h3>

<p>The <code>greeter2</code> function demonstrates how to use default values for parameters in Kotlin. The <code>message</code> parameter has a default value of "Live Long and Prosper". If no value is provided for this parameter when the function is called, the default value is used. If a value is provided, it overrides the default value. In the example above:</p>

<ul>
    <li><strong>First Example:</strong> The function is called with one argument ("Theeban"), so the default message is used.</li>
    <li><strong>Second Example:</strong> The function is called with two arguments ("Jasmine" and "Have a Nice Day!"), so the provided message is used instead of the default.</li>
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
            <td>message</td>
            <td>String</td>
            <td>Optional</td>
            <td>"Live Long and Prosper"</td>
        </tr>
    </tbody>
</table>

<p>In the `greeter2` function, the term "mandatory" is used for the `name` parameter, meaning it must always be provided when calling the function. The `message` parameter is "optional" because it has a default value. If no value is provided for `message`, the function uses the default value. If a value is provided, it overrides the default value.</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the function with default parameter values.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
Welcome Theeban - Live Long and Prosper
Welcome Jasmine - Have a Nice Day!
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
