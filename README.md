<!DOCTYPE html>
<html lang="en">

<body>

<h1>Kotlin Class and Interface Implementation Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates how a class or object can extend another class and implement one or more interfaces in Kotlin. A class or object can inherit behavior from a superclass and also implement abstract members in multiple interfaces.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates how a class or object can extend another class and implement one or more interfaces in Kotlin.
 *
 * A class or object can inherit behavior from a superclass and also implement abstract members in multiple interfaces.
 * - The superclass (if any) and interfaces are specified after the colon (:) separated by commas.
 * - The order of the superclass and interfaces in the list does not matter.
 * - A class specifies which constructor should be run, whereas interfaces do not have constructors.
 */

// Define an interface Writer with a single abstract function
interface Writer {
    fun writeSomething()
}

// Define an interface Speaker with a single abstract function
interface Speaker {
    fun saySomething()
}

// Open class Author with a constructor parameter `name`
open class Author(val name: String) {
    fun printAuthorName() {
        println("Author name: $name")
    }
}

// Class TechnicalAuthor extends Author and implements Writer and Speaker interfaces
class TechnicalAuthor(name: String) : Author(name), Writer, Speaker {

    // Implementation of the saySomething() function from the Speaker interface
    override fun saySomething() {
        println("Hello, I am a technical author.")
    }

    // Implementation of the writeSomething() function from the Writer interface
    override fun writeSomething() {
        println("Writer's block!")
    }
}

fun main() {
    // Create an instance of TechnicalAuthor
    val technicalAuthor = TechnicalAuthor("John Doe")

    // Call functions from the superclass and implemented interfaces
    technicalAuthor.printAuthorName()    // From the Author class
    technicalAuthor.saySomething()       // From the Speaker interface
    technicalAuthor.writeSomething()     // From the Writer interface
}

/*
 * Output:
 * Author name: John Doe
 * Hello, I am a technical author.
 * Writer's block!
 */
</code>
</pre>

<h3>Explanation</h3>

<ul>
    <li>The <code>Writer</code> and <code>Speaker</code> interfaces each define a single abstract function.</li>
    <li>The <code>Author</code> class is an open class with a constructor parameter <code>name</code>.</li>
    <li>The <code>TechnicalAuthor</code> class extends <code>Author</code> and implements the <code>Writer</code> and <code>Speaker</code> interfaces.</li>
    <li>The <code>TechnicalAuthor</code> class provides implementations for all abstract functions and uses the superclass constructor.</li>
    <li>The <code>main()</code> function demonstrates creating an instance of <code>TechnicalAuthor</code> and calling its functions.</li>
</ul>

<h3>Extending a Class and Implementing Interfaces</h3>

<p>
- The <strong>Interface Definition</strong>: The <code>Writer</code> and <code>Speaker</code> interfaces each define a single abstract function that must be implemented by any class that inherits them.
</p>
<p>
- The <strong>Superclass (Author)</strong>: The <code>Author</code> class is an open class with a constructor parameter <code>name</code> and a concrete function <code>printAuthorName()</code>.
</p>
<p>
- The <strong>Subclass with Multiple Interfaces (TechnicalAuthor)</strong>: The <code>TechnicalAuthor</code> class extends the <code>Author</code> class and implements the <code>Writer</code> and <code>Speaker</code> interfaces. It provides implementations for the abstract <code>writeSomething()</code> and <code>saySomething()</code> functions and uses the constructor of the superclass <code>Author</code>.
</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating the extension of a class and implementation of multiple interfaces in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
