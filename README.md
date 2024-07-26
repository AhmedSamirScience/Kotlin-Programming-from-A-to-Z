<body>

<h1>Kotlin Null Safety Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates various null safety features in Kotlin, including nullable and non-nullable types, safe calls, Elvis operator, not-null assertion operator, smart casts, and safe casting. The main function showcases examples of each feature and prints their results.</p>

<h2>Code Overview</h2>

<pre>
<code>
fun main() {

    //region nonNullableVar
    /**
     * the commented out line will not compile as it will
     * generate a compiler error stating that ‘Null can not be a value of a non-null type
     * String’.
     */
    println("(nonNullableVar)")
    // Standard variable - cannot be set to null
    var nonNullableVar = "abc"
    println("nonNullableVar: $nonNullableVar")
    println("\n")
    // nonNullableVar = null // Compilation error
    //endregion

    //region NullableVar
    /**
     * To specify a nullable type we need to explicitly specify the type with a trailing
     * ‘?’, for example
     */
    println("(NullableVar)")
    // Nullable variable - can be set to null
    var nullableVar: String? = "abc"
    println("nullableVar: $nullableVar")
    nullableVar = null
    println("nullableVar now: $nullableVar")
    println("\n")
    //endregion

    //region (The Safe Call Operator ) (‘?’)
    /**
     * (The Safe Call Operator ) (‘?’)
     */
    println("(The Safe Call Operator -> ‘?’)")
    // Nullable variable - can be set to null
    var nullableVarSafeCallOperator: String? = "John"
    println(nullableVarSafeCallOperator?.length)
    nullableVarSafeCallOperator = null
    println(nullableVarSafeCallOperator?.length)
    println("\n")
    //endregion

    //region (The Elvis Operator) (“?:”)
    /**
     * (The Elvis Operator) (“?:”)
     */
    println("(The Elvis Operator -> “?:”)")
    var nullableVarElvisOperator : String? = "John"
    val l2 = nullableVarElvisOperator?.length ?: -1
    println(l2)
    nullableVarElvisOperator = null
    val l3 = nullableVarElvisOperator?.length ?: -1
    println(l3)
    println("\n")
    //endregion

    //region (The Not-Null Assertion Operator) ("!!.")
    /**
     * (The Not-Null Assertion Operator) ("!!.")
     *
     * The not-null assertion operator is formed of two exclamation marks i.e. !!.
     * This operator is used to treat a nullable variable as a non-null type. If the
     * current value of the nullable type is null when the operator is applied then a
     * NullPointerException error will be generated. Otherwise it will be treated
     * as a normal non-null type.
     */
    println("The Not-Null Assertion Operator -> !!.)")
    var nullableVarNotNullAssertionOperation: String? = "John"
    val l4 = nullableVarNotNullAssertionOperation!!.length
    println(l4)
    /**
     * However, the compiler will analyse the code and see that the nullableVar is
     * set to null the line before the not-null assertion operator is applied; in this case
     * it will not even compile the code as it knows that it will always result in a
     * NullPointerException error being generated
     */
    // nullableVarNotNullAssertionOperation = null
    //val l5 = nullableVarNotNullAssertionOperation!!.length
    //println(l5)
    println("\n")
    //endregion

    //region (Smart Compilation)
    /**
     * (Smart Compilation)
     */

    /**
     * The Kotlin compiler is smart enough to work out whether a value is null or not in
     * many situations. This is illustrated below
     */
    var total: Int? = null
    // total++ // won’t compile as total may be null
    if (total != null) {
        total++
    }
    /**
     * The first line of this code declares a new var called total of type Int? (that
     * is it is a nullable integer). However, it currently holds the value null. This means
     * that if we attempt to increment total using the increment (++) operator (which is the
     * same as saying total = total + 1) then we would be trying to add 1 to null which
     * is illegal. Thus the second line in the example has to be commented out as it would
     * generate a compile time error. We could of course use one of the nullable operators
     * to handle this such as the safe dot operator (?.). However, in this case we are using
     * an explicit if statement that will check to see if total is null. If it is not null then
     * we can safely increment total. The compiler is smart enough to understand this and
     * allow the increment of total within the if block.
     */
    //endregion

    //region (Safe Casting to Non Null Type) (as?)
    /**
     * (Safe Casting to Non Null Type -> as?)
     */
    println("(Safe Casting to Non Null Type -> as?)")
    val totalSafeCastingToNonNullType: Int? = null
    println(totalSafeCastingToNonNullType as? Int)
    println("\n")
    //endregion

}
</code>
</pre>

<h3>Null Safety in Kotlin</h3>

<ul>
    <li><strong>Non-nullable Types:</strong> Standard variable cannot be set to null.</li>
    <li><strong>Nullable Types:</strong> Nullable variable can be set to null using a trailing '?'.</li>
    <li><strong>Safe Call Operator:</strong> Uses '?' to safely call methods on nullable variables.</li>
    <li><strong>Elvis Operator:</strong> Uses '?:' to provide a default value if a variable is null.</li>
    <li><strong>Not-Null Assertion Operator:</strong> Uses '!!' to assert that a variable is not null, throwing a NullPointerException if it is.</li>
    <li><strong>Smart Compilation:</strong> The Kotlin compiler can infer nullability in many cases, allowing safe operations within an if block.</li>
    <li><strong>Safe Casting:</strong> Uses 'as?' to safely cast to a non-null type, returning null if the cast is not possible.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different null safety examples.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
