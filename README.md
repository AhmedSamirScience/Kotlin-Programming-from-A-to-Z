<body>

<h1>Kotlin Property Visibility Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates property visibility. In Kotlin, properties can be marked with different visibility modifiers to control access both within the class and from external classes.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This class demonstrates property visibility in Kotlin.
 *
 * - The `id` property is a private constructor property, meaning it is only accessible within the class.
 * - The `name` property is a public constructor property, accessible outside the class.
 * - The `desk` property is a private member level property, meaning it is only accessible within the class.
 */
class Person(private val id: String, val name: String) {

    // Member level property with private visibility
    private var desk: String = "at home"

    // Function to access the private properties within the class
    fun describe(): String {
        return "Person(id=$id, name=$name, desk=$desk)"
    }

    // Function to change the desk location
    fun changeDeskLocation(newLocation: String) {
        desk = newLocation
    }
}

fun main() {
    // Creating an instance of Person
    val person = Person("123ABC", "John Doe")

    // Accessing the public property 'name'
    println("Person's Name: ${person.name}")

    // Attempting to access private properties will result in a compile-time error
    // println(person.id) // Error: Cannot access 'id': it is private in 'Person'
    // println(person.desk) // Error: Cannot access 'desk': it is private in 'Person'

    // Using public methods to interact with private properties
    println(person.describe())
    person.changeDeskLocation("in the office")
    println(person.describe())
}

/*
 * Output:
 * Person's Name: John Doe
 * Person(id=123ABC, name=John Doe, desk=at home)
 * Person(id=123ABC, name=John Doe, desk=in the office)
 */

/**
 * Explanation:
 *
 * - `id` is a private constructor property, so it must be provided when the `Person` class is instantiated, but it cannot be accessed from outside the class.
 * - `name` is a public constructor property, making it accessible from outside the class.
 * - `desk` is a private member level property, so it can only be accessed within the `Person` class.
 * - The `describe()` function provides a way to access and display private properties.
 * - The `changeDeskLocation()` function allows modification of the `desk` property within the class.
 *
 * Note: Private properties can be either `val` (read-only) or `var` (read-write).
 */
</code>
</pre>

<h3>Property Visibility in Kotlin</h3>

<ul>
    <li><strong>Private Constructor Property:</strong> The <code>id</code> property is private and only accessible within the class.</li>
    <li><strong>Public Constructor Property:</strong> The <code>name</code> property is public and accessible outside the class.</li>
    <li><strong>Private Member Level Property:</strong> The <code>desk</code> property is private and can only be accessed within the class.</li>
    <li><strong>Public Methods:</strong> The <code>describe()</code> and <code>changeDeskLocation()</code> functions provide controlled access and modification of private properties.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output of different examples demonstrating property visibility.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
