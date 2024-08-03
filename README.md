<body>

<h1>Kotlin Equality Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the concept of equality between instances. In Kotlin, equality between instances is represented by the operators <code>==</code> and <code>===</code> (and their not versions <code>!=</code> and <code>!==</code>). They have different meanings:</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Equality Between Instances
 * In Kotlin, equality between instances is represented by the operators == and === (and their not versions != and !==).
 * They have different meanings:
 *
 * == represents structural or value equality. For example, two instances of the type Person are considered equal if their data is the same (e.g., "John" aged 32 is equal to another "John" aged 32).
 * != is the inverse of ==.
 * === represents referential equality, meaning the instances are literally the same (i.e., the same object in memory).
 * !== is the inverse of ===.
 * Here's an example using the Person class that overrides the equals() function:
 */
class Person(val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        return when (other) {
            null -> false
            is Person -> (other.name == name) && (other.age == age)
            else -> false
        }
    }
}

fun main() {

    val p1 = Person("John", 21)
    val p2 = Person("John", 21)
    val p3 = p1

    // checks for reference equality
    println("p1 === p2: ${p1 === p2}")
    // checks for structural equality
    println("p1 == p2: ${p1 == p2}")
    // again structural equality
    println("p1.equals(p2): ${p1.equals(p2)}")
    println("p1 !== p2: ${p1 !== p2}")
    println("p1 === p3: ${p1 === p3}")
    println("p1 !== p3: ${p1 !== p3}")

    /**
     * Output
     * p1 === p2: false
     * p1 == p2: true
     * p1.equals(p2): true
     * p1 !== p2: true
     * p1 === p3: true
     * p1 !== p3: false
     *
     */
}
</code>
</pre>

<h3>Equality Between Instances</h3>

<p>In Kotlin, equality between instances is represented by the operators <code>==</code> and <code>===</code> (and their not versions <code>!=</code> and <code>!==</code>). They have different meanings:</p>

<ul>
    <li><code>==</code> represents structural or value equality. For example, two instances of the type Person are considered equal if their data is the same (e.g., "John" aged 32 is equal to another "John" aged 32).</li>
    <li><code>!=</code> is the inverse of <code>==</code>.</li>
    <li><code>===</code> represents referential equality, meaning the instances are literally the same (i.e., the same object in memory).</li>
    <li><code>!==</code> is the inverse of <code>===</code>.</li>
</ul>

<h3>Example Using the Person Class</h3>

<p>Here’s an example using the <code>Person</code> class that overrides the <code>equals()</code> function:</p>

<pre><code>
class Person(val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        return when (other) {
            null -> false
            is Person -> (other.name == name) && (other.age == age)
            else -> false
        }
    }
}

fun main() {

    val p1 = Person("John", 21)
    val p2 = Person("John", 21)
    val p3 = p1

    // checks for reference equality
    println("p1 === p2: ${p1 === p2}")
    // checks for structural equality
    println("p1 == p2: ${p1 == p2}")
    // again structural equality
    println("p1.equals(p2): ${p1.equals(p2)}")
    println("p1 !== p2: ${p1 !== p2}")
    println("p1 === p3: ${p1 === p3}")
    println("p1 !== p3: ${p1 !== p3}")

    /**
     * Output
     * p1 === p2: false
     * p1 == p2: true
     * p1.equals(p2): true
     * p1 !== p2: true
     * p1 === p3: true
     * p1 !== p3: false
     *
     */
}
</code></pre>

<h3>Output</h3>

<pre>
<code>
p1 === p2: false
p1 == p2: true
p1.equals(p2): true
p1 !== p2: true
p1 === p3: true
p1 !== p3: false
</code>
</pre>

<h3>Summary</h3>

<p>Kotlin provides operators to check both structural and referential equality between instances. Structural equality checks if the data inside the instances are the same, while referential equality checks if the instances are the exact same object in memory. This allows for more flexible and accurate comparisons in your Kotlin programs.</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the equality example.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
p1 === p2: false
p1 == p2: true
p1.equals(p2): true
p1 !== p2: true
p1 === p3: true
p1 !== p3: false
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
