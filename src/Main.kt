/**
 * Unlike many languages Kotlin does not automatically convert from one numeric type
 * to another. Instead explicit conversion operators/methods must be used. All numeric
 * types support conversions to other types using the following methods:
 * • toByte(): Byte
 * • toShort(): Short
 * • toInt(): Int
 * • toLong(): Long or use the latter L after an integer literal, e.g,. 34L
 * • toFloat(): Float or use the letter F after ta numeric literal e.g. 34.5F
 * • toDouble(): Double
 * • toChar(): Char
 */
fun main() {
    // toByte(): Byte
    val intToByte: Byte = 10.toByte()
    println("Converted Int to Byte: $intToByte")

    // toShort(): Short
    val intToShort: Short = 100.toShort()
    println("Converted Int to Short: $intToShort")

    // toInt(): Int
    val doubleToInt: Int = 3.14.toInt()
    println("Converted Double to Int: $doubleToInt")

    // toLong(): Long
    val intToLong: Long = 10000000000L
    println("Converted Int to Long: $intToLong")

    // toFloat(): Float
    val doubleToFloat: Float = 3.14.toFloat()
    println("Converted Double to Float: $doubleToFloat")

    // toDouble(): Double
    val floatToDouble: Double = 3.14F.toDouble()
    println("Converted Float to Double: $floatToDouble")

    // toChar(): Char
    val intToChar: Char = 65.toChar()
    println("Converted Int to Char: $intToChar")
}
