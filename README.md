
<body>

<h1>Kotlin Final Property Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates how to close properties in Kotlin using the <code>final</code> keyword. In Kotlin, both member properties and constructor properties can be marked as <code>final</code> to prevent subclasses from overriding the property. The <code>final</code> keyword is used alongside <code>override</code> to close the property in a subclass, making it impossible for further subclasses to override it.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates how to close properties in Kotlin using the `final` keyword.
 *
 * In Kotlin, properties (both member properties and constructor properties) can be marked as `final`.
 * This prevents subclasses from overriding the property. The `final` keyword is used alongside `override` to
 * close the property in a subclass, making it impossible for further subclasses to override it.
 */

open class Food(open val type: String = "generic")

open class Cake(
    /**
     * Overrides the `type` property from Food but marks it as final,
     * preventing any further overriding in subclasses of Cake.
     */
    final override val type: String = "Sponge"
) : Food()

open class Biscuit(
    /**
     * Overrides the `type` property from Food, but keeps it open for further overriding
     * in subclasses of Biscuit.
     */
    override val type: String = "Sweet"
) : Food()

fun main() {
    // Demonstrating the behavior of the `type` property in different subclasses
    val cake = Cake()
    val biscuit = Biscuit()

    println("Cake type: ${cake.type}")    // Output: Sponge
    println("Biscuit type: ${biscuit.type}") // Output: Sweet
}

/*
 * Output:
 * Cake type: Sponge
 * Biscuit type: Sweet
 */
</code>
</pre>

<h3>Explanation</h3>

<ul>
    <li>The <code>Food</code> class defines an open property <code>type</code>, allowing subclasses to override it.</li>
    <li>The <code>Cake</code> class overrides the <code>type</code> property and marks it as <code>final</code>, preventing further overrides in subclasses of <code>Cake</code>.</li>
    <li>The <code>Biscuit</code> class overrides the <code>type</code> property but does not mark it as <code>final</code>, meaning that subclasses of <code>Biscuit</code> can still override the property.</li>
</ul>

<h3>Open vs Final Properties</h3>

<p>
- The <strong>Open Property</strong>: The <code>Food</code> class has an open property <code>type</code>, allowing subclasses to override it.
</p>
<p>
- The <strong>Final Override in Cake</strong>: In the <code>Cake</code> class, the <code>type</code> property is overridden and marked as final, meaning that any subclass of <code>Cake</code> cannot further override this property.
</p>
<p>
- The <strong>Still Open in Biscuit</strong>: In contrast, the <code>Biscuit</code> class overrides the <code>type</code> property but does not mark it as final, allowing further subclasses to override it if needed.
</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating the behavior of open and final properties in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
