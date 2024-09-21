
<body>

<h1>Kotlin Smart Casting Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates smart casting, which allows the Kotlin compiler to automatically determine the type of a variable based on preceding code and safely cast it to the appropriate subtype. This feature ensures type safety without requiring explicit casts, reducing the likelihood of runtime errors.</p>

<h2>Key Concepts</h2>

<ul>
    <li><strong>Smart Cast:</strong> The Kotlin compiler automatically casts variables to the appropriate type if it can guarantee that the cast will succeed based on preceding code.</li>
    <li><strong>Type Safety:</strong> Smart casting ensures type-safe assignments, avoiding the need for manual type casting and reducing the risk of runtime <code>ClassCastException</code>.</li>
</ul>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This example demonstrates Kotlin's smart casting feature.
 * The compiler automatically determines that a variable can safely be cast to a subtype based on preceding code.
 */

// Base class
open class Employee(val name: String, val age: Int, val id: Int)

// Subclass of Employee
class Sales(name: String, age: Int, id: Int) : Employee(name, age, id)

fun main() {
    // Create an instance of Employee and Sales
    var e: Employee = Employee("John", 55, 1234)
    val s = Sales("Adam", 20, 3456)

    // Assign Sales instance to the Employee variable
    e = s

    // Smart cast: The Kotlin compiler determines that `e` holds a reference to an instance of `Sales`
    val salesPerson: Sales = e as Sales

    // Output the salesPerson's details
    println("Salesperson name: ${salesPerson.name}, id: ${salesPerson.id}")
}

/*
 * Output:
 * Salesperson name: Adam, id: 3456
 */

/**
 * Explanation:
 *
 * - The `Employee` class is a base class, and `Sales` is a subclass of `Employee`.
 * - The variable `e` is initially assigned to an `Employee` instance but is later assigned to a `Sales` instance.
 * - The Kotlin compiler performs a **smart cast** when assigning `e` to `salesPerson` because it can infer that `e` holds a `Sales` instance (from the preceding code).
 * - The explicit cast (`e as Sales`) ensures that the compiler treats `e` as a `Sales` instance.
 */

</code>
</pre>

<h3>Smart Casting in Kotlin</h3>

<ul>
    <li><strong>Smart Casting:</strong> Kotlin automatically casts variables to the correct type when it can guarantee the type based on preceding code or <code>is</code> checks. This makes the code safer and eliminates the need for explicit type casts in many cases.</li>
    <li><strong>Type Safety:</strong> If the Kotlin compiler cannot guarantee a valid cast, it generates a compile-time error, preventing runtime <code>ClassCastException</code>.</li>
    <li><strong>Usage of <code>is</code>:</strong> When using the <code>is</code> keyword to check the type, Kotlin smart casts the variable within the checked block, allowing you to use the properties and methods of the specific type without an explicit cast.</li>
</ul>

<h2>Additional Example: Using <code>is</code> for Smart Casting</h2>

<pre>
<code>
fun printEmployeeInfo(employee: Employee) {
    if (employee is Sales) {
        // Smart cast: No need for explicit cast, Kotlin knows employee is Sales here
        println("Salesperson: ${employee.name}, ID: ${employee.id}")
    } else {
        println("Employee: ${employee.name}, ID: ${employee.id}")
    }
}

fun main() {
    val emp = Employee("John", 55, 1234)
    val sales = Sales("Adam", 20, 3456)

    printEmployeeInfo(emp)  // Output: Employee: John, ID: 1234
    printEmployeeInfo(sales)  // Output: Salesperson: Adam, ID: 3456
}
</code>
</pre>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating smart casting in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
