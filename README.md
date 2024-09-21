
<body>

<h1>Kotlin Explicit Casting Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates explicit casting in Kotlin using the <code>as</code> operator. Sometimes, the Kotlin compiler cannot automatically determine the actual type of a value. In such cases, explicit casting is required to access specific properties or methods of the expected type.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates explicit casting in Kotlin using the `as` operator.
 *
 * Sometimes the Kotlin compiler cannot automatically determine the actual type of a value.
 * In such cases, explicit casting is required to access specific properties or methods of the expected type.
 * The `as` operator is used to cast a value to a specific type.
 */

fun getData(): Any {
    // This function returns an object of type Any, which could be anything
    return "Hello"
}

fun main() {
    // The value returned by getData() is stored in 'any', which has type Any
    val any: Any = getData()

    // Trying to access the 'length' property of 'any' without casting will cause a compilation error
    // println(any.length) // This will not compile

    // Explicit casting is required to tell the compiler that 'any' is actually a String
    val message: String = any as String

    // Now we can access the 'length' property since 'message' is explicitly cast to String
    println("Message length: ${message.length}")
}

/*
 * Output:
 * Message length: 5
 */
</code>
</pre>

<h3>Explanation</h3>

<ul>
    <li>The function <code>getData()</code> returns a value of type <code>Any</code>, which could be any type.</li>
    <li>The compiler does not automatically know that <code>any</code> is a <code>String</code>, so accessing <code>length</code> directly would cause a compile-time error.</li>
    <li>Using the <code>as</code> operator, we cast <code>any</code> to a <code>String</code>, allowing us to access its properties like <code>length</code>.</li>
    <li>The casted value is stored in the <code>message</code> variable, allowing us to safely access its properties.</li>
</ul>

<h3>Smart Cast Limitation</h3>

<p>
Sometimes the Kotlin compiler cannot automatically determine the type of a value, especially when it comes from a function that returns <code>Any</code> or from an external source. In such cases, you can use the <code>as</code> operator to explicitly cast the value to the correct type.
</p>

<h3>Casting with <code>as</code></h3>

<p>
When the type is unclear or the compiler cannot infer it, you can use the <code>as</code> operator to explicitly cast the value to the desired type.
</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the explicit casting demonstration.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
