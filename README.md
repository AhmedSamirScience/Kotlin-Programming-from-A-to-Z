<body>

<h1>Kotlin Auxiliary Constructors Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the concept of auxiliary constructors. In Kotlin, every class has a primary constructor, but you can also define one or more auxiliary constructors. These auxiliary constructors provide additional ways to instantiate a class.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Auxiliary Constructors in Kotlin
 * In Kotlin, every class has a primary constructor, but you can also define one or more auxiliary constructors.
 * These auxiliary constructors are useful for providing additional ways to instantiate a class.
 * Let's go through the details and see an example.
 *
 * Key Points of Auxiliary Constructors
 * Defined within the Body: Auxiliary constructors are defined inside the class body.
 * Constructor Keyword: They are declared using the constructor keyword.
 * No Explicit Name: Unlike methods, constructors do not have explicit names.
 * Must Call Another Constructor: An auxiliary constructor must call another constructor, either another auxiliary constructor or the primary constructor.
 * This ensures that the primary constructor is the sole entry point to the class.
 * Syntax
 * The auxiliary constructor syntax involves the constructor keyword followed by the parameter list.
 * It must call another constructor using this(), followed by the appropriate parameter list.
 *
 * class Person4(val name: String, var age: Int) {
 *     // Auxiliary constructor
 *     constructor(age: Int) : this("unnamed", age) {
 *         println("In auxiliary constructor")
 *     }
 * }
 *
 */

fun main() {

    /**
     * Using the Auxiliary Constructor
     * Now you can create a Person4 instance using the auxiliary constructor:
     */
    val person = Person4(25)
    println("Name: ${person.name}, Age: ${person.age}")

    /**
     * Output:
     * Name: unnamed, Age: 25
     */

    /**
     * Summary
     * Auxiliary constructors in Kotlin provide flexibility in class instantiation by allowing additional ways to create objects.
     * They must always delegate to another constructor, ensuring the primary constructor remains the main entry point.
     * This pattern is commonly used to provide default values for some parameters while requiring others.
     *
     * By using auxiliary constructors, you can simplify object creation and make your classes more flexible and user-friendly.
     */
}


/**
 * Example: Person Class with Auxiliary Constructor
 * Consider a Person4 class where we want to allow instantiation with just an age, defaulting the name to "unnamed" if not provided.
 *
 * Primary Constructor
 * The primary constructor takes two parameters, name and age:
 */
//class Person4(val name: String, var age: Int)


/**
 * Auxiliary Constructor
 * The auxiliary constructor allows creating a Person4 instance with only an age:
 */
class Person4(val name: String, var age: Int) {
    // Auxiliary constructor
    constructor(age: Int) : this("unnamed", age) {
        println("In auxiliary constructor")
    }
}

/**
 * Here:
 *
 * The constructor(age: Int) defines an auxiliary constructor that takes an integer age.
 * It calls the primary constructor this("unnamed", age) with "unnamed" as the default name.
 * You can simplify the class by omitting the constructor body if it does nothing extra:
 */
//class Person4(val name: String, var age: Int) {
//    // Auxiliary constructor
//    constructor(age: Int) : this("unnamed", age)
//}
</code>
</pre>

<h3>Key Points of Auxiliary Constructors</h3>

<ul>
    <li><strong>Defined within the Body:</strong> Auxiliary constructors are defined inside the class body.</li>
    <li><strong>Constructor Keyword:</strong> They are declared using the <code>constructor</code> keyword.</li>
    <li><strong>No Explicit Name:</strong> Unlike methods, constructors do not have explicit names.</li>
    <li><strong>Must Call Another Constructor:</strong> An auxiliary constructor must call another constructor, either another auxiliary constructor or the primary constructor. This ensures that the primary constructor is the sole entry point to the class.</li>
</ul>

<h3>Syntax</h3>

<p>The auxiliary constructor syntax involves the <code>constructor</code> keyword followed by the parameter list. It must call another constructor using <code>this()</code>, followed by the appropriate parameter list.</p>

<pre><code>
class Person4(val name: String, var age: Int) {
    // Auxiliary constructor
    constructor(age: Int) : this("unnamed", age) {
        println("In auxiliary constructor")
    }
}
</code></pre>

<h3>Using the Auxiliary Constructor</h3>

<p>You can create a <code>Person4</code> instance using the auxiliary constructor:</p>

<pre><code>
val person = Person4(25)
println("Name: ${person.name}, Age: ${person.age}")
</code></pre>

<p>Output:</p>

<pre><code>
Name: unnamed, Age: 25
</code></pre>

<h3>Summary</h3>

<p>Auxiliary constructors in Kotlin provide flexibility in class instantiation by allowing additional ways to create objects. They must always delegate to another constructor, ensuring the primary constructor remains the main entry point. This pattern is commonly used to provide default values for some parameters while requiring others.</p>

<p>By using auxiliary constructors, you can simplify object creation and make your classes more flexible and user-friendly.</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of the auxiliary constructor example.</li>
</ol>

<h2>Expected Output</h2>

<pre>
<code>
Name: unnamed, Age: 25
</code>
</pre>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
