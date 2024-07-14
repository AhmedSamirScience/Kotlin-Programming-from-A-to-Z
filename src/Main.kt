/**
 * Unsigned integers are integers that can only contain zero or positive integers (they
 * cannot hold negative numbers). This is because they do not use any memory to store
 * the sign (+ or −) with the number (as they can only be non-negative numbers). This
 * means that they can hold an integer you know to only be positive in an unsigned type
 * more efficiently than in a regular signed integer type
 *
 * Note: val minusOne: Uint = -1U (Illegal can’t have a negative unsigned int)
 *
 *
 * Unsigned Integer Types in Kotlin
 *
 * | Type   | Minimum Value      | Maximum Value            |
 * |--------|--------------------|--------------------------|
 * | UInt   | 0u                 | 4294967295u              |
 * | ULong  | 0uL                | 18446744073709551615uL   |
 * | UByte  | 0u                 | 255u                     |
 * | UShort | 0u                 | 65535u                   |
 *
 */

fun main() {

    //region UShort example
    println("\n(UShort example)")
    val ushortMin: UShort = UShort.MIN_VALUE
    val ushortMax: UShort = UShort.MAX_VALUE
    val ushortExample: UShort = 12345u
    println("UShort - Min value: $ushortMin, Max value: $ushortMax, Example value: $ushortExample")
    //endregion

    //region UByte example
    println("\n(UByte example)")
    val ubyteMin: UByte = UByte.MIN_VALUE
    val ubyteMax: UByte = UByte.MAX_VALUE
    val ubyteExample: UByte = 123u
    println("UByte - Min value: $ubyteMin, Max value: $ubyteMax, Example value: $ubyteExample")
    //endregion

    //region UInt example
    println("\n(UInt example)")
    val uintMin: UInt = UInt.MIN_VALUE
    val uintMax: UInt = UInt.MAX_VALUE
    val uintExample: UInt = 123456789u
    println("UInt - Min value: $uintMin, Max value: $uintMax, Example value: $uintExample")

    //endregion

    //region ULong example
    println("\n(ULong example)")
    val ulongMin: ULong = ULong.MIN_VALUE
    val ulongMax: ULong = ULong.MAX_VALUE
    val ulongExample: ULong = 1234567890123456789uL
    println("ULong - Min value: $ulongMin, Max value: $ulongMax, Example value: $ulongExample")
    //endregion

}