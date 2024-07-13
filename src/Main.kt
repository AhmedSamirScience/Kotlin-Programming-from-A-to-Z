
/*
 * Integer types in Kotlin:
 *
 * Type   Size (bits)            Min value                                  Max value
 * ------------------------------------------------------------------------------------
 * Byte   8                      -128                                       127
 * Short  16                     -32,768                                    32,767
 * Int    32                     -2,147,483,648 (−2^31)                     2,147,483,647 (2^31−1)
 * Long   64                     -9,223,372,036,854,775,808 (−2^63)         9,223,372,036,854,775,807 (2^63−1)
 */

/*
 * Floating-point types in Kotlin:
 *
 * Type    Size (bits) Description                                                  Min value                             Max value
 * ------------------------------------------------------------------------------------------------------------------------------
 * Float   32          Represents a single-precision 32-bit IEEE 754 floating       -3.4028235e38                         3.4028235e38
 *                     point number
 * Double  64          Represents a double-precision 64-bit IEEE 754 floating       -1.7976931348623157e308               1.7976931348623157e308
 *                     point number
 */

/*
 * Boolean type in Kotlin:
 *
 * Type    Values       Description
 * ---------------------------------
 * Boolean  true/false   Used to represent the truth (or not) of something
 */

fun main() {

    //region Byte example
    println("\n(Byte example)")
    val byteExample: Byte = 127
    println("Byte example: $byteExample, Length: ${Byte.SIZE_BITS} bits, Max value: ${Byte.MAX_VALUE}, Min value: ${Byte.MIN_VALUE}")

    // Short example
    val shortExample: Short = 32767
    println("Short example: $shortExample, Length: ${Short.SIZE_BITS} bits, Max value: ${Short.MAX_VALUE}, Min value: ${Short.MIN_VALUE}")

    // Int example
    val intExample: Int = 2_147_483_647
    println("Int example: $intExample, Length: ${Int.SIZE_BITS} bits, Max value: ${Int.MAX_VALUE}, Min value: ${Int.MIN_VALUE}")

    // Long example
    val longExample: Long = 9_223_372_036_854_775_807L
    println("Long example: $longExample, Length: ${Long.SIZE_BITS} bits, Max value: ${Long.MAX_VALUE}, Min value: ${Long.MIN_VALUE}")
    println("")
    //endregion

    //region  Float example
    println("(Float example)")
    val floatExample: Float = 3.14159f
    println("Float example: $floatExample, Min value: ${Float.MIN_VALUE}, Max value: ${Float.MAX_VALUE}")

    // Double example
    val doubleExample: Double = 3.141592653589793
    println("Double example: $doubleExample, Min value: ${Double.MIN_VALUE}, Max value: ${Double.MAX_VALUE}")
    println("")
    //endregion

    //region Boolean examples
    println("(Boolean example)")
    val isKotlinFun: Boolean = true
    val isJavaFun: Boolean = false

    println("Is Kotlin fun? $isKotlinFun")
    println("Is Java fun? $isJavaFun")
    println("")
    //endregion

}
