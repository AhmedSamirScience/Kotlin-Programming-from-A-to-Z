
<body>

<h1>Kotlin Final Keyword Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates how to close member functions in Kotlin using the <code>final</code> keyword. In Kotlin, a member function marked as <code>open</code> in a base class can be overridden in subclasses. However, by marking a function as <code>final</code> in a subclass, you can prevent further overriding.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * This file demonstrates how to close member functions in Kotlin using the `final` keyword.
 *
 * In Kotlin, a member function marked as `open` in a root class is open for overriding in all subclasses.
 * However, you may want to prevent further overriding in a specific subclass.
 * This can be done by marking the overridden member function as `final`.
 */

open class Food {
    /**
     * An open function that can be overridden in subclasses.
     */
    open fun eatMe() = println("Food - eatMe()")
}

open class Cake : Food() {
    /**
     * Overrides the eatMe() function but marks it as final,
     * preventing further overriding in subclasses of Cake.
     */
    final override fun eatMe() = println("Cake - eatMe()")
}

open class Biscuit : Food() {
    /**
     * Overrides the eatMe() function but leaves it open for further overriding
     * in subclasses of Biscuit.
     */
    override fun eatMe() = println("Biscuit - eatMe()")
}

fun main() {
    // Demonstrating the behavior of eatMe() in different subclasses
    val food: Food = Food()
    val cake: Food = Cake()
    val biscuit: Food = Biscuit()

    food.eatMe()      // Output: Food - eatMe()
    cake.eatMe()      // Output: Cake - eatMe()
    biscuit.eatMe()   // Output: Biscuit - eatMe()
}

/*
 * Output:
 * Food - eatMe()
 * Cake - eatMe()
 * Biscuit - eatMe()
 */
</code>
</pre>

<h3>Explanation</h3>

<ul>
    <li>The <code>Food</code> class has an open <code>eatMe()</code> function that can be overridden in subclasses.</li>
    <li>The <code>Cake</code> class overrides <code>eatMe()</code> and marks it as <code>final</code>, preventing any further overrides in subclasses of <code>Cake</code>.</li>
    <li>The <code>Biscuit</code> class overrides <code>eatMe()</code> but leaves it open, meaning subclasses of <code>Biscuit</code> can still override it.</li>
</ul>

<h3>Open vs Final Functions</h3>

<p>
- The <strong>Open Function</strong>: The <code>Food</code> class defines the <code>eatMe()</code> function as open, allowing it to be overridden in its subclasses.
</p>
<p>
- The <strong>Final Override in Cake</strong>: In the <code>Cake</code> class, the <code>eatMe()</code> function is overridden and marked as final, preventing any further overrides in subclasses of <code>Cake</code>.
</p>
<p>
- The <strong>Still Open in Biscuit</strong>: In contrast, the <code>Biscuit</code> class overrides the <code>eatMe()</code> function but does not mark it as final, allowing subclasses of <code>Biscuit</code> to override it further.
</p>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating the behavior of open and final functions in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
