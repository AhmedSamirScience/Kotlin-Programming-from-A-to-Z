<body>

<h1>Kotlin Unsigned Integer Types Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates various unsigned integer types in Kotlin. The main function showcases examples of each type and prints their properties.</p>

<h2>Code Overview</h2>

<pre>
<code>
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
    val intToUShort: UShort = 10.toUShort()
    val ushortMin: UShort = UShort.MIN_VALUE
    val ushortMax: UShort = UShort.MAX_VALUE
    val ushortExample: UShort = 12345u
    println("UShort - Min value: $ushortMin, Max value: $ushortMax, Example value: $ushortExample, Converted from Int: $intToUShort")
    //endregion

    //region UByte example
    println("\n(UByte example)")
    val intToUByte: UByte = 10.toUByte()
    val ubyteMin: UByte = UByte.MIN_VALUE
    val ubyteMax: UByte = UByte.MAX_VALUE
    val ubyteExample: UByte = 123u
    println("UByte - Min value: $ubyteMin, Max value: $ubyteMax, Example value: $ubyteExample, Converted from Int: $intToUByte")
    //endregion

    //region UInt example
    println("\n(UInt example)")
    val intToUInt: UInt = 10.toUInt()
    val uintMin: UInt = UInt.MIN_VALUE
    val uintMax: UInt = UInt.MAX_VALUE
    val uintExample: UInt = 123456789u
    println("UInt - Min value: $uintMin, Max value: $uintMax, Example value: $uintExample, Converted from Int: $intToUInt")

    //endregion

    //region ULong example
    println("\n(ULong example)")
    val intToULong: ULong = 10.toULong()
    val ulongMin: ULong = ULong.MIN_VALUE
    val ulongMax: ULong = ULong.MAX_VALUE
    val ulongExample: ULong = 1234567890123456789uL
    println("ULong - Min value: $ulongMin, Max value: $ulongMax, Example value: $ulongExample, Converted from Int: $intToULong")
    //endregion

}
</code>
</pre>

<h3>Unsigned Integer Types in Kotlin</h3>

<table>
    <tr>
        <th>Type</th>
        <th>Minimum Value</th>
        <th>Maximum Value</th>
    </tr>
    <tr>
        <td>UInt</td>
        <td>0u</td>
        <td>4294967295u</td>
    </tr>
    <tr>
        <td>ULong</td>
        <td>0uL</td>
        <td>18446744073709551615uL</td>
    </tr>
    <tr>
        <td>UByte</td>
        <td>0u</td>
        <td>255u</td>
    </tr>
    <tr>
        <td>UShort</td>
        <td>0u</td>
        <td>65535u</td>
    </tr>
</table>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different unsigned integer type examples.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
