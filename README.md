<body>

<h1>Kotlin Higher-Order Functions Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the use of higher-order functions, which are functions that can take other functions as parameters or return functions as results. Higher-order functions are a key concept in functional programming, providing flexibility and reusability.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Why Use Higher-Order Functions?
 * You might wonder why to use a higher-order function instead of directly calling functions like increment or mult. For example:
 * multi(10)
 *
 * This has the same effect as:
 * processor(10, mult)
 */

fun main() {
    /**
     * The first approach seems simpler and more efficient. However, higher-order functions are powerful because they allow us to apply an unknown function to data at a later time.
     * This creates reusable code for when the specific function is determined later.
     *
     * Example: Tax Calculation
     * Consider calculating tax based on a salary. The exact tax calculation depends on external factors, so we need a flexible function:
     */
    val tax = calculateTax(45000.0, ::simpleTaxCalculator)
    println("Tax payable: $tax")
    /**
     * simpleTaxCalculator multiplies a number by 0.3.
     * calculateTax takes a salary and a function to calculate the tax.
     * In main, we pass 45000.0 as the salary and reference simpleTaxCalculator using the :: operator.
     *
     * Output:
     * Tax payable: 13500.0
     */


    /**
     * We can also use an anonymous function or a lambda for tax calculation:
     */
    val tax1 = calculateTax(45000.0) { amount -> amount * 0.25 }
    println("Tax payable: $tax1")

    /**
     * Using trailing lambda syntax, this calculates 25% tax:
     * Output:
     * Tax payable: 11250.0
     */
}

/**
 * Simple tax calculation function.
 * @param amount the amount to be taxed
 * @return the calculated tax
 */
fun simpleTaxCalculator(amount: Double) = amount * 0.3

/**
 * Higher-order function for tax calculation.
 * @param salary the salary to be taxed
 * @param func the tax calculation function
 * @return the calculated tax
 */
fun calculateTax(salary: Double, func: (Double) -> Double): Double {
    return func(salary)
}
</code>
</pre>

<h3>Why Use Higher-Order Functions?</h3>

<p>Higher-order functions are powerful because they allow us to apply an unknown function to data at a later time, creating reusable code for when the specific function is determined later. This flexibility makes higher-order functions essential in scenarios where the exact function to be applied is not known upfront.</p>

<h3>Example: Tax Calculation</h3>

<p>Consider calculating tax based on a salary. The exact tax calculation depends on external factors, so we need a flexible function:</p>

<ul>
    <li><strong>Using a Named Function:</strong> We define a simple tax calculator that multiplies a number by 0.3 and use it with the <code>calculateTax</code> function.
        <pre><code>
val tax = calculateTax(45000.0, ::simpleTaxCalculator)
println("Tax payable: $tax")
        </code></pre>
        Output:
        <pre><code>
Tax payable: 13500.0
        </code></pre>
    </li>
    <li><strong>Using a Lambda Function:</strong> We can also use an anonymous function or a lambda for tax calculation.
        <pre><code>
val tax1 = calculateTax(45000.0) { amount -> amount * 0.25 }
println("Tax payable: $tax1")
        </code></pre>
        Output:
        <pre><code>
Tax payable: 11250.0
        </code></pre>
    </li>
</ul>

<h3>Benefits of Higher-Order Functions</h3>

<p>Using higher-order functions provides several benefits:</p>

<ul>
    <li><strong>Reusability:</strong> Higher-order functions enable you to create reusable and composable code blocks.</li>
    <li><strong>Flexibility:</strong> You can pass different functions to higher-order functions, making your code more flexible and adaptable.</li>
    <li><strong>Conciseness:</strong> Using lambdas and higher-order functions can lead to more concise and readable code.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the higher-order function examples.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
Tax payable: 13500.0
Tax payable: 11250.0
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
