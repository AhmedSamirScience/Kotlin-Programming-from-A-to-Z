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


fun simpleTaxCalculator(amount: Double) = amount * 0.3

fun calculateTax(salary: Double, func: (Double) -> Double): Double {
    return func(salary)
}