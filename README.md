<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kotlin Inheritance and Overriding Member Functions Demonstration</title>
</head>
<body>

<h1>Kotlin Inheritance and Overriding Member Functions Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates inheritance and how to override member functions in Kotlin. In Kotlin, member functions of a superclass can be overridden in subclasses to provide their own implementation, using the <code>override</code> keyword.</p>

<h2>Key Concepts</h2>

<ul>
    <li><strong>Overriding:</strong> Subclasses can override a member function of the superclass to provide their own implementation.</li>
    <li><strong>open Keyword:</strong> Classes and functions in Kotlin are final by default. They must be explicitly marked with the <code>open</code> keyword to allow inheritance or overriding.</li>
    <li><strong>override Keyword:</strong> The <code>override</code> keyword is required to override a function from the superclass, ensuring the compiler knows that the subclass intends to replace it.</li>
</ul>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Inheritance and Overriding Member Functions in Kotlin
 * In Kotlin, overriding occurs when a member function is defined in both a superclass and one of its subclasses.
 * The subclass's implementation replaces or extends the behavior of the superclass's method.
 */

// Base class with open methods and properties
open class Person(val name: String = "", var age: Int = 0) {

    // Method to simulate a birthday
    fun birthday() {
        println("Happy birthday! You were $age")
        age++
        println("You are now $age")
    }

    // Overridden toString method in Person
    override fun toString(): String = "Person($name, $age)"
}

// Subclass of Person with additional properties
open class Employee(name: String, age: Int, val id: String) : Person(name, age) {

    // Additional property
    var rateOfPay: Double = 7.5

    // Method to calculate pay based on hours worked
    fun calculatePay(hoursWorked: Int): Double {
        return hoursWorked * rateOfPay
    }

    // Overridden toString method in Employee
    override fun toString(): String = "Employee($name, $age, $id)"
}

// Subclass of Employee with further properties
class SalesPerson(name: String, age: Int, id: String, val region: String, val sales: Double) : Employee(name, age, id) {

    // Method to calculate a sales bonus
    fun bonus(): Double {
        return sales * 0.5
    }

    // Overridden toString method in SalesPerson
    override fun toString(): String = "SalesPerson($name, $age, $id, $region, $sales)"
}

fun main() {
    // Creating instances of Person, Employee, and SalesPerson
    val p = Person("Jasmine", 21)
    val e = Employee("Adam", 23, "ABC123")
    val s = SalesPerson("Phoebe", 32, "XYZ987", "South West", 905.55)

    // Printing the string representations of each instance
    println(p)  // Output: Person(Jasmine, 21)
    println(e)  // Output: Employee(Adam, 23, ABC123)
    println(s)  // Output: SalesPerson(Phoebe, 32, XYZ987, South West, 905.55)
}

/*
 * Output:
 * Person(Jasmine, 21)
 * Employee(Adam, 23, ABC123)
 * SalesPerson(Phoebe, 32, XYZ987, South West, 905.55)
 */

/**
 * Explanation:
 *
 * 1. **Class Hierarchy**:
 *    - `Person` is the base class with properties `name` and `age`.
 *    - `Employee` extends `Person` and adds the `id` property and a method to calculate pay.
 *    - `SalesPerson` extends `Employee` and adds `region` and `sales` properties, as well as a method to calculate a bonus.
 *
 * 2. **Overriding toString**:
 *    - The `toString()` method is overridden in each class to provide a customized string representation.
 *    - `Person` prints `name` and `age`.
 *    - `Employee` adds the `id` field to the output.
 *    - `SalesPerson` includes additional properties `region` and `sales`.
 *
 * 3. **Overriding Rules**:
 *    - The `override` keyword is mandatory to override methods in Kotlin.
 *    - Each subclass provides its own version of `toString()`, which is called based on the type of the object.
 */
</code>
</pre>

<h3>Inheritance and Overriding in Kotlin</h3>

<ul>
    <li><strong>Overriding Methods:</strong> The <code>toString()</code> method is overridden in each class (<code>Person</code>, <code>Employee</code>, and <code>SalesPerson</code>) to provide different string representations of instances.</li>
    <li><strong>Using open and override:</strong></li>
    <ul>
        <li>The <code>Person</code> class and its <code>toString()</code> function are marked as <code>open</code>, allowing them to be overridden by subclasses.</li>
        <li>The <code>override</code> keyword is required in the subclasses to replace the <code>toString()</code> method of the parent class.</li>
    </ul>
    <li><strong>Dynamic Dispatch:</strong> When <code>println()</code> is called on instances of <code>Person</code>, <code>Employee</code>, or <code>SalesPerson</code>, the appropriate <code>toString()</code> method is invoked depending on the runtime type of the object.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating inheritance and overriding member functions in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
