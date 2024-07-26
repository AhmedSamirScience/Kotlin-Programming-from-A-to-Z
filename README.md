<body>

<h1>Kotlin Data Types Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates various data types in Kotlin, including integer, floating-point, and boolean types. The main function showcases examples of each type and prints their properties.</p>

<h2>Code Overview</h2>

<pre>
<code>
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
</code>
</pre>

<h3>Integer Types in Kotlin</h3>

<ul>
    <li><strong>Byte</strong>: 8 bits, Min value: -128, Max value: 127</li>
    <li><strong>Short</strong>: 16 bits, Min value: -32,768, Max value: 32,767</li>
    <li><strong>Int</strong>: 32 bits, Min value: -2,147,483,648 (−2^31), Max value: 2,147,483,647 (2^31−1)</li>
    <li><strong>Long</strong>: 64 bits, Min value: -9,223,372,036,854,775,808 (−2^63), Max value: 9,223,372,036,854,775,807 (2^63−1)</li>
</ul>

<h3>Floating-point Types in Kotlin</h3>

<ul>
    <li><strong>Float</strong>: 32 bits, Represents a single-precision 32-bit IEEE 754 floating point number, Min value: -3.4028235e38, Max value: 3.4028235e38</li>
    <li><strong>Double</strong>: 64 bits, Represents a double-precision 64-bit IEEE 754 floating point number, Min value: -1.7976931348623157e308, Max value: 1.7976931348623157e308</li>
</ul>

<h3>Boolean Type in Kotlin</h3>

<ul>
    <li><strong>Boolean</strong>: Values are true/false, Used to represent the truth (or not) of something</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different data type examples.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
