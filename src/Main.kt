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

/**
 * Explanation:
 *
 * - The `Workers` interface defines the `doWork()` function.
 * - The `Employers` interface extends the `Cloneable` interface and defines the `printSelf()` function.
 * - The `Records` interface extends both `Workers` and `Employers`, inheriting `doWork()` and `printSelf()` and adding the `doSomething()` function.
 * - The `Employee` class implements the `Records` interface and must provide implementations for all inherited abstract functions.
 * - The `main()` function demonstrates creating an instance of `Employee` and calling all inherited functions, including the `clone()` function from `Cloneable`.
 */

/**
 * Explanation:
 * Interface Inheritance:
 *
 * The Workers interface defines a single abstract function doWork().
 * The Employers interface extends the Cloneable interface and defines an additional abstract function printSelf().
 * The Records interface extends both Workers and Employers, resulting in a union of all abstract members from the inherited interfaces.
 * Concrete Implementation (Employee):
 *
 * The Employee class implements the Records interface and must provide implementations for all inherited functions: doWork(), printSelf(), and doSomething().
 * Additionally, since Records indirectly inherits Cloneable, the clone() function is implemented in the Employee class.
 * Output:
 *
 * The program creates an instance of Employee, calls all the inherited functions, and demonstrates cloning using the Cloneable interface.
 * This class.kt file provides a complete example of how interfaces can inherit from other interfaces in Kotlin, along with detailed comments and explanations.
 */