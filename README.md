<body>

<h1>Kotlin Numeric Type Conversions Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates explicit numeric type conversions in Kotlin. Unlike many languages, Kotlin does not automatically convert from one numeric type to another. Instead, explicit conversion operators/methods must be used.</p>

<h2>Code Overview</h2>

<pre>
<code>
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
</code>
</pre>

<h3>Numeric Type Conversion Methods in Kotlin</h3>

<ul>
    <li><code>toByte()</code>: Converts to Byte</li>
    <li><code>toShort()</code>: Converts to Short</li>
    <li><code>toInt()</code>: Converts to Int</li>
    <li><code>toLong()</code>: Converts to Long or use the letter L after an integer literal, e.g., 34L</li>
    <li><code>toFloat()</code>: Converts to Float or use the letter F after a numeric literal, e.g., 34.5F</li>
    <li><code>toDouble()</code>: Converts to Double</li>
    <li><code>toChar()</code>: Converts to Char</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different numeric type conversion examples.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
