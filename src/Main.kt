/**
 * Smart Casting in Kotlin
 * In Kotlin, smart casting refers to the ability of the compiler to automatically determine the type of a variable at runtime based on preceding code, allowing safe assignments without requiring explicit type casts. The Kotlin compiler analyzes the context and determines whether an automatic cast is safe, avoiding runtime errors that could occur with unsafe casts.
 *
 * Key Points:
 * Smart Cast: The Kotlin compiler automatically casts variables to the appropriate type if it can guarantee that the cast will succeed based on preceding assignments or checks.
 * Type Safety: Smart casting ensures that assignments are type-safe, avoiding the need for manual type casting and reducing the risk of ClassCastException.
 * Example: Smart Casting
 */

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

/**
 * How Smart Casting Works:
 * Initial Assignment: The variable e is of type Employee. However, when assigned to s, which is an instance of Sales, the compiler understands that e now holds a reference to a Sales object.
 *
 * Smart Cast: The Kotlin compiler analyzes the code and determines that the cast from Employee to Sales is safe. Since e holds a reference to a Sales object, the assignment to salesPerson is allowed.
 *
 * Explicit Cast: In this example, the e as Sales cast is used to make the cast explicit. In many cases, if you check the type using is, Kotlin automatically smart casts without requiring an explicit cast.
 *
 * Example: Using is for Smart Casting
 * In Kotlin, smart casts also occur when you use the is keyword to check the type of an object. If the check succeeds, Kotlin automatically casts the variable.
 */

/*
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

/**
 * Explanation:
 *
 * - The `is` keyword is used to check if `employee` is of type `Sales`.
 * - When the check passes, the compiler **automatically smart casts** `employee` to `Sales`, allowing access to its properties without explicit casting.
 */

 */

/**
 * Summary:
 * Smart Casting: Kotlin automatically casts variables to the correct type when it can guarantee the type based on preceding code or is checks. This makes the code safer and eliminates the need for explicit type casts in many cases.
 *
 * Type Safety: If the Kotlin compiler cannot guarantee a valid cast, it generates a compile-time error, preventing runtime ClassCastException.
 *
 * Usage of is: When using the is keyword to check the type, Kotlin smart casts the variable within the checked block, allowing you to use the properties and methods of the specific type without an explicit cast.
 *
 * Smart casting is a powerful feature in Kotlin that simplifies type safety and reduces the need for manual casting while ensuring that assignments are safe and error-free.
 */