<!DOCTYPE html>
<html lang="en">
 
<body>

<h1>Kotlin Interface Inheritance Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates how interfaces can inherit from other interfaces in Kotlin. In Kotlin, an interface can inherit from zero or more other interfaces, allowing the creation of a hierarchy of interfaces. When an interface inherits from multiple interfaces, it combines all the declarations from the inherited interfaces. Any class or object implementing such an interface must implement all the abstract members from each of the inherited interfaces.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates how interfaces can inherit from other interfaces in Kotlin.
 *
 * In Kotlin, an interface can inherit from zero or more other interfaces. This allows us to create a hierarchy of interfaces.
 * When an interface inherits from multiple interfaces, the resulting interface combines all the declarations from the inherited interfaces.
 * Any class or object implementing such an interface must implement all the abstract members from each of the inherited interfaces.
 */

// Define the Workers interface with an abstract function
interface Workers {
    fun doWork()
}

// Define the Employers interface that extends the Cloneable interface
interface Employers : Cloneable {
    fun printSelf()
}

// Define the Records interface that inherits from both Workers and Employers
interface Records : Workers, Employers {
    fun doSomething()
}

// Concrete class Employee that implements the Records interface
class Employee : Records {

    // Implement the doWork() function from Workers
    override fun doWork() {
        println("Employee is doing work.")
    }

    // Implement the printSelf() function from Employers
    override fun printSelf() {
        println("Employee details: Name - John, Position - Developer")
    }

    // Implement the doSomething() function from Records
    override fun doSomething() {
        println("Employee is performing a special task.")
    }

    // Additional function to clone the Employee object (from Cloneable)
    public override fun clone(): Any {
        return super.clone()
    }
}

fun main() {
    // Create an instance of Employee
    val employee = Employee()

    // Call functions from all inherited interfaces
    employee.doWork()          // From Workers
    employee.printSelf()       // From Employers
    employee.doSomething()     // From Records

    // Demonstrate the clone function from Cloneable
    val clonedEmployee = employee.clone()
    println("Cloned Employee: $clonedEmployee")
}

/*
 * Output:
 * Employee is doing work.
 * Employee details: Name - John, Position - Developer
 * Employee is performing a special task.
 * Cloned Employee: Employee@<hashcode>
 */
</code>
</pre>

<h3>Explanation</h3>

<ul>
    <li>The <code>Workers</code> interface defines the <code>doWork()</code> function.</li>
    <li>The <code>Employers</code> interface extends the <code>Cloneable</code> interface and defines the <code>printSelf()</code> function.</li>
    <li>The <code>Records</code> interface extends both <code>Workers</code> and <code>Employers</code>, inheriting <code>doWork()</code> and <code>printSelf()</code> and adding the <code>doSomething()</code> function.</li>
    <li>The <code>Employee</code> class implements the <code>Records</code> interface and must provide implementations for all inherited abstract functions.</li>
    <li>The <code>main()</code> function demonstrates creating an instance of <code>Employee</code> and calling all inherited functions, including the <code>clone()</code> function from <code>Cloneable</code>.</li>
</ul>

<h3>Interface Inheritance</h3>

<p>
- The <strong>Workers Interface</strong>: Defines a single abstract function, <code>doWork()</code>.
</p>
<p>
- The <strong>Employers Interface</strong>: Extends the <code>Cloneable</code> interface and defines an additional abstract function, <code>printSelf()</code>.
</p>
<p>
- The <strong>Records Interface</strong>: Inherits from both <code>Workers</code> and <code>Employers</code>, resulting in a union of all abstract members from the inherited interfaces.
</p>
<p>
- The <strong>Concrete Implementation (Employee)</strong>: The <code>Employee</code> class implements the <code>Records</code> interface and must provide implementations for all inherited functions: <code>doWork()</code>, <code>printSelf()</code>, and <code>doSomething()</code>. Additionally, since <code>Records</code> indirectly inherits <code>Cloneable</code>, the <code>clone()</code> function is implemented in the <code>Employee</code> class.
</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating the inheritance of multiple interfaces in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
