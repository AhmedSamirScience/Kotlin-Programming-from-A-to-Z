/**
 * Inheritance and Overriding Member Functions in Kotlin
 * In Kotlin, overriding occurs when a member function is defined in both a superclass and one of its subclasses. The subclass's implementation replaces or extends the behavior of the superclass's method. To override a member function, the subclass must explicitly use the override keyword, ensuring that the compiler knows the function is meant to replace the one from the superclass.
 *
 * Key Points:
 * Overriding: Subclasses can override a member function of the superclass to provide their own implementation.
 * open Keyword: In Kotlin, classes and functions are final by default, meaning they cannot be inherited or overridden unless they are explicitly marked with the open keyword.
 * override Keyword: The override keyword is required to override a function from the superclass.
 * Example: Overriding toString() in a Hierarchy of Classes
 */

/**
 * This example demonstrates how to override member functions in Kotlin classes.
 * The `toString()` function is overridden in multiple classes to provide class-specific string representations.
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

/**
 * Summary:
 * Overriding Methods: The toString() method is overridden in each class (Person, Employee, and SalesPerson) to provide different string representations of instances.
 *
 * Using open and override:
 *
 * The Person class and its toString() function are marked as open, allowing them to be overridden by subclasses.
 * The override keyword is required in the subclasses to replace the toString() method of the parent class.
 * Dynamic Dispatch: When println() is called on instances of Person, Employee, or SalesPerson, the appropriate toString() method is invoked depending on the runtime type of the object.
 *
 * This example demonstrates inheritance and method overriding in Kotlin, showing how different classes in a hierarchy can provide their own implementations of the same method.
 */
