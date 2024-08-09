<h1>Kotlin Default Constructor Parameters Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates how to use default values for constructor parameters in Kotlin. This feature makes constructor parameters optional, providing flexibility in object creation.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * In Kotlin, you can provide default values for constructor parameters, making them optional.
 * To do this, add an assignment operator (=) followed by the default value in the parameter list.
 * Here’s an example with the Person2 class:
 */
class Person2(val name: String = "", val age: Int = 0)

/**
 * In Person2, both name and age are optional parameters, with name defaulting to "" and age to 0.
 *
 * If all parameters have default values, the compiler generates a zero-parameter constructor, which is useful for Java interoperability.
 *
 * Given the Person2 class definition, you can create instances in the following ways:
 */
fun main() {

    /**
     * p1 is an instance of Person2 with name as "John" and age as 36.
     * p2 is an instance with name as "Denise" and age using the default value 0.
     * p3 is an instance with both name and age using their default values, "" and 0, respectively.
     */
    val p1 = Person2("John", 36)
    val p2 = Person2("Denise")
    val p3 = Person2()
}
</code>
</pre>

<h3>Using Default Constructor Parameters</h3>

<p>In Kotlin, you can provide default values for constructor parameters, making them optional. To do this, add an assignment operator (<code>=</code>) followed by the default value in the parameter list. Here’s an example with the <code>Person2</code> class:</p>

<pre><code>
class Person2(val name: String = "", val age: Int = 0)
</code></pre>

<p>In the <code>Person2</code> class, both <code>name</code> and <code>age</code> are optional parameters, with <code>name</code> defaulting to an empty string (<code>""</code>) and <code>age</code> to <code>0</code>.</p>

<p>If all parameters have default values, the compiler generates a zero-parameter constructor, which is useful for Java interoperability.</p>

<h3>Creating Instances of the Class</h3>

<p>Given the <code>Person2</code> class definition, you can create instances in the following ways:</p>

<pre><code>
val p1 = Person2("John", 36)
val p2 = Person2("Denise")
val p3 = Person2()
</code></pre>

<p>In this example:</p>

<ul>
    <li><strong>p1</strong> is an instance of <code>Person2</code> with <code>name</code> as "John" and <code>age</code> as 36.</li>
    <li><strong>p2</strong> is an instance with <code>name</code> as "Denise" and <code>age</code> using the default value <code>0</code>.</li>
    <li><strong>p3</strong> is an instance with both <code>name</code> and <code>age</code> using their default values, <code>""</code> and <code>0</code>, respectively.</li>
</ul>

<h3>Summary</h3>

<p>Kotlin allows you to provide default values for constructor parameters, making them optional. This feature adds flexibility to how you create instances of a class, making it easier to handle different use cases and improving interoperability with Java.</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
p1: Person2(name=John, age=36)
p2: Person2(name=Denise, age=0)
p3: Person2(name=, age=0)
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
