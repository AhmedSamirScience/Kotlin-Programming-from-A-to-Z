
/**
 * (Comparison Operators)
 * Operator Name       Description                                      Examples
 * ----------------------------------------------------------------------------------------
 * ==                  Equals                                           3 == 3
 *                     Tests if two values are equal
 *
 * !=                  Not equals                                       2 != 3
 *                     Tests that two values are not equal to each
 *                     other
 *
 * <                   Less than                                        2 < 3
 *                     Tests to see if the left-hand value is less
 *                     than the right-hand value
 *
 * >                   Greater than                                     3 > 2
 *                     Tests if the left-hand value is greater
 *                     than the right-hand value
 *
 * <=                  Less than or equal to                            3 <= 4
 *                     Tests if the left-hand value is less than
 *                     or equal to the right-hand value
 *
 * >=                  Greater than or equal to                         5 >= 4
 *                     Tests if the left-hand value is greater
 *                     than or equal to the right-hand value
 *
 * @author Ahmed Samir
 */

/**
 * (Logical Operators)
 * Operator Name       Description                                          Examples
 * ----------------------------------------------------------------------------------------
 * &                   And                                                  (3 < 4) & (5 > 4)
 *                     Returns true if both left and right are true
 *
 * &&                  Short cut and                                        (3 < 4) && (5 > 4)
 *                     Short cut version of the and operator; the right
 *                     hand operand is only evaluated if the left hand
 *                     operand is true
 *                     In most cases, && is preferred in boolean expressions because of its short-circuiting behavior, which can lead to better performance and prevent unnecessary evaluations.
 *
 *
 * |                   Or                                                   (3 < 4) | (3 > 5)
 *                     Returns true if either the left or the right is true
 *
 * ||                  Short cut or                                         (3 < 4) || (3 > 5)
 *                     Short cut version of the or operator; the right
 *                     hand operand is only evaluated if the left hand
 *                     operand is false
 *                     Using || is generally preferred in boolean expressions because of its short-circuiting behavior, which can improve performance and prevent unnecessary evaluations when the left-hand condition is already true.
 *
 *
 * ^                   Exclusive or                                         (2 < 3) ^ (5 < 2)
 *                     Indicates XOR or exclusive OR; it will only
 *                     evaluate to true if only one of the operands is
 *                     true; if both operands are true then the XOR test
 *                     evaluates to false
 *
 * !                   Not                                                  !flag
 *                     Returns true if the value being tested is false
 *
 * Please, be aware that if you will use shortcut && or shortcut || this is useful because of the compiler will not waste memory and will not moving forward with the rest of the condition as long asl the left hand side is not meet the required rule so it is beneficial if you use it .
 * @author Ahmed Samir
 */


/**
 * (Numeric Operators)
 * Operator | Description                                  | Example
 * ---------|----------------------------------------------|-------------------------
 * +        | Performs addition or concatenation            | println(1 + 2)
 *          |                                              | println(2.2 + 3.4)
 *          |                                              | println("Hello " + "World")
 *          |                                              | println("Hello" + 2)
 * ---------|----------------------------------------------|-------------------------
 * -        | Performs subtraction                         | println(2 - 1)
 *          |                                              | println(2.1 - 1)
 *          |                                              | println(3 - 1.5)
 * ---------|----------------------------------------------|-------------------------
 * *        | Performs multiplication                      | println(2 * 3)
 *          |                                              | println(2.5 * 3.4)
 *          |                                              | println(3 * 2.5)
 * ---------|----------------------------------------------|-------------------------
 * /        | Performs division                            | println(6 / 3)
 *          |                                              | println(5 / 2)
 *          |                                              | println(5 / 2.3)
 *          |                                              | println(3.4 / 1.2)
 * ---------|----------------------------------------------|-------------------------
 * %        | Performs modulus (remainder)                 | println(6 % 3)
 *          |                                              | println(5 % 2)
 *          |                                              | println(5 % 2.3)
 *          |                                              | println(3.4 % 1.2)
 * ---------|----------------------------------------------|-------------------------
 * ++       | Increment operator                          | var count = 5
 *          |                                              | count++
 *          |                                              | println(count) // Outputs: 6
 * ---------|----------------------------------------------|-------------------------
 * --       | Decrement operator                          | var count = 5
 *          |                                              | count--
 *          |                                              | println(count) // Outputs: 4
 */

/**
 * (Assignment Operators)
 * Operator | Description                           | Examples
 * ---------|---------------------------------------|---------------------------
 * +=       | Equivalent of x = x + y               | x += y
 * -=       | Equivalent of x = x - y               | x -= y
 * *=       | Equivalent of x = x * y               | x *= y
 * /=       | Equivalent of x = x / y               | x /= y
 * %=       | Equivalent of x = x % y               | x %= y
 */



fun main() {

    //region and Logical Operator
    // Using and operator
    //it must be two conditions equals to true
    println("\t (and) Logical Operator")
    val resultAndTrue = (3 < 4) and (5 > 4)
    println("Result of (3 < 4) and (5 > 4): $resultAndTrue") // true
    val resultAndFalseFirstCase = (3 < 4) and (3 > 4)
    println("Result of (3 < 4) and (3 > 4): $resultAndFalseFirstCase") // false
    val resultAndFalseSecondCase = (5 < 4) and (5 > 4)
    println("Result of (5 < 4) and (5 > 4): $resultAndFalseSecondCase") // false
    println("\n")
    //endregion

    //region && (Short-circuit logical &&) operator
    // Using && (Short cut and) operator
    //if the compiler see first the left hand side condition and if it equals to true then it will evaluate the right hand side. therefore if the left hand side equals to true then it will see the right and do the result with true if the right hand side equals to true then the result is equals to ture.
    //hna lazem yshouf el awl el left hand side equals to true 3lshan yshouf el right hand side
    println("\t (&&) Logical Operator")
    val resultShortCutAndZeroCase = (3 < 4) && (5 > 4)
    println("Result of (3 < 4) && (5 > 4): $resultShortCutAndZeroCase") // true
    val resultShortCutAndFirstCase = (3 < 4) && (3 > 4)
    println("Result of (3 < 4) && (5 > 4): $resultShortCutAndFirstCase") // false
    val resultShortCutAndSecondCase = (5 < 4) && (5 > 4)
    println("Result of (5 < 4) && (5 > 4): $resultShortCutAndSecondCase") // false
    val resultShortCutAndThirdCase = (5 < 4) && (3 > 4)
    println("Result of (5 < 4) && (3 > 4): $resultShortCutAndThirdCase") // false
    println("\n")
    //endregion



    //region Using or operator
    //if the compiler found on of side is equals to true then it will generate the result with true.
    println("\t (or) Logical Operator")
    val resultOrTrue = (3 < 4) or (5 > 4)
    println("Result of (3 < 4) or (5 > 4): $resultOrTrue") // true

    val resultOrFalseBothCases = (3 > 4) or (5 > 6)
    println("Result of (3 > 4) or (5 > 6): $resultOrFalseBothCases") // false

    val resultOrFalseFirstCase = (3 > 4) or (5 > 4)
    println("Result of (3 > 4) or (3 > 4): $resultOrFalseFirstCase") // true
    println("\n")
    //endregion

    //region Using || (Short-circuit logical OR) operator
    //if the compiler see first the left hand side condition and if it equals to false then it will evaluate the right hand side. therefore if the left hand side equals to false then it will see the right hand side.
    //hna lazem yshouf el awl el left hand side equals to false 3lshan yshouf el right hand side w law kan b fasle bardo el right hand side yb2a el final hykon b false w law la2a el right hand side b true yb2a el final hykon b-true bas zai m2oltlk howa lazem yt2kd mn el left hand side enha b false 3lshan yshouf el right hand side ymken tkon b-true

    println("\t (||) Logical Operator")
    val resultShortCutOrZeroCase = (3 < 4) || (5 > 4)
    println("Result of (3 < 4) || (5 > 4): $resultShortCutOrZeroCase") // true

    val resultShortCutOrFirstCase = (3 < 4) || (3 > 4)
    println("Result of (3 < 4) || (3 > 4): $resultShortCutOrFirstCase") // true

    val resultShortCutOrSecondCase = (5 < 4) || (5 > 4)
    println("Result of (5 < 4) || (5 > 4): $resultShortCutOrSecondCase") // true

    val resultShortCutOrThirdCase = (5 < 4) || (3 > 4)
    println("Result of (5 < 4) || (3 > 4): $resultShortCutOrThirdCase") // false
    println("\n")
    //endregion



    //region && - || in the if condition
    if((5 < 4) && (5 > 4))
        println("&& Ture")
        else
        println("&& false")

    if((5 < 4) and (5 > 4))
        println("and Ture")
    else
        println("&& false")


    if((5 < 4) || (5 > 4))
        println("|| Ture")
    else
        println("|| false")

    if((5 < 4) or (5 > 4))
        println("or Ture")
    else
        println("or false")

    //endregion

}