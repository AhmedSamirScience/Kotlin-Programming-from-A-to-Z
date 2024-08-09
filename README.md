<h1>Kotlin Private Properties Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates how to use private properties in a class. In Kotlin, you can define a constructor property as private, meaning it is accessible only within the class and not from outside the class.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Private Properties
 * In Kotlin, you can define a constructor property as private. This property:
 *
 * Requires a value when an instance is created.
 * Is accessible within the class itself.
 * Is not accessible from outside the class.
 * Here’s an example using the Person3 class:
 */
class Person3(private val id: String,
              val name: String = "",
              val age: Int = 0) {
}

/**
 * In this example:
 *
 * The id property is private, so it must be provided when creating an instance, but it can't be accessed from outside the class.
 * The name and age properties are public and read-only (val), and they are optional parameters with default values.
 * When creating an instance of Person3, you must provide an id, but you can choose whether to provide values for name and age.
 * Here’s a simple application demonstrating this:
 */
fun main() {

    val p1 = Person3("id1", "John", 50)
    println("${p1.name} is ${p1.age}")
    // compile-time error: id is a private property
    // println("${p1.id}")

    /**
     * Output:
     * John is 50
     */

}
</code>
</pre>

<h3>Using Private Properties</h3>

<p>In Kotlin, you can define a constructor property as private. This property:</p>

<ul>
    <li>Requires a value when an instance is created.</li>
    <li>Is accessible within the class itself.</li>
    <li>Is not accessible from outside the class.</li>
</ul>

<h3>Example: Person3 Class</h3>

<p>Here’s an example using the <code>Person3</code> class:</p>

<pre><code>
class Person3(private val id: String,
              val name: String = "",
              val age: Int = 0) {
}
</code></pre>

<p>In this example:</p>

<ul>
    <li>The <code>id</code> property is private, so it must be provided when creating an instance, but it can't be accessed from outside the class.</li>
    <li>The <code>name</code> and <code>age</code> properties are public and read-only (<code>val</code>), and they are optional parameters with default values.</li>
</ul>

<h3>Creating and Using Instances</h3>

<p>When creating an instance of <code>Person3</code>, you must provide an <code>id</code>, but you can choose whether to provide values for <code>name</code> and <code>age</code>:</p>

<pre><code>
fun main() {
    val p1 = Person3("id1", "John", 50)
    println("${p1.name} is ${p1.age}")
    // compile-time error: id is a private property
    // println("${p1.id}")
}
</code></pre>

<h3>Expected Output</h3>

<pre>
<code>
John is 50
</code>
</pre>

<p>Note: Attempting to access the <code>id</code> property outside the class will result in a compile-time error because it is private.</p>

<h3>Summary</h3>

<p>Private properties in Kotlin are useful when you want certain class properties to be inaccessible from outside the class. This helps to encapsulate the class's internal state and ensures that only the class's methods can interact with these properties.</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
