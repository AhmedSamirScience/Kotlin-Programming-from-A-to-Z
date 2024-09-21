
<body>

<h1>Kotlin Inheritance and Property Overriding Demonstration</h1>

<p>This repository contains a Kotlin application that demonstrates how properties (both constructor properties and member properties) can be overridden in subclasses. To allow a property to be overridden, it must be marked as <code>open</code> in the superclass. The subclass can then override the property using the <code>override</code> keyword.</p>

<h2>Key Concepts</h2>

<ul>
    <li><strong>open Keyword:</strong> Used to mark a property in a superclass that can be overridden by a subclass.</li>
    <li><strong>override Keyword:</strong> Required in the subclass to indicate that the property is overriding a property from the superclass.</li>
    <li><strong>Constructor Properties:</strong> Constructor properties can also be overridden in subclasses.</li>
</ul>

<h2>Code Overview</h2>

<pre>
<code>
// Base class with an open member property and open function
open class Base {
    // Open property that can be overridden
    open val label: String = "Base"

    // Open function that can be overridden
    open fun print(): Unit = println("Base print")
}

class Derived : Base() {
    // Overriding the label property
    override val label: String = "Derived"

    // Overriding the print() function
    override fun print(): Unit = println("Derived print")
}

fun main() {
    // Creating an instance of Base
    val base = Base()
    println(base.label)  // Output: Base
    base.print()  // Output: Base print

    println("----------")

    // Creating an instance of Derived
    val derived = Derived()
    println(derived.label)  // Output: Derived
    derived.print()  // Output: Derived print
}

/*
 * Output:
 * Base
 * Base print
 * ----------
 * Derived
 * Derived print
 */
</code>
</pre>

<h3>Overriding Properties and Methods in Kotlin</h3>

<ul>
    <li><strong>Overriding Properties:</strong> In Kotlin, properties can be overridden in subclasses by marking them as <code>open</code> in the superclass. The subclass must use the <code>override</code> keyword to override the property.</li>
    <li><strong>Constructor Property Overriding:</strong> Both constructor properties and member properties can be overridden in subclasses. This allows flexible inheritance in Kotlin classes.</li>
    <li><strong>Class Hierarchy:</strong> Once a property is marked as <code>open</code> in a root class, it remains open for all subclasses in the hierarchy, allowing further overrides.</li>
</ul>

<h2>More Examples</h2>

<h3>Example 2: Overriding Constructor and Member Properties</h3>

<pre>
<code>
// Base class with open member properties
open class Cat {
    open val dangerous = false
    open val name: String = "Sammy"

    override fun toString(): String = "$name is " + (if (dangerous) "dangerous" else "timid")
}

// Derived class overriding constructor and member properties
class Tiger(override val name: String) : Cat() {
    override val dangerous = true
}

fun main() {
    val cat = Cat()
    println(cat)  // Output: Sammy is timid

    val tiger = Tiger("Tigger")
    println(tiger)  // Output: Tigger is dangerous
}
</code>
</pre>

<h3>Example 3: Overriding Properties in a Class Hierarchy</h3>

<pre>
<code>
open class Trade(val tradeId: String, open val stock: String = "IBM", open var quantity: Int = 0)

open class EquityTrade(id: String, override val stock: String = "MSoft", qty: Int) : Trade(id, quantity = qty)

class ShortEquityTrade(id: String, override val stock: String = "Short", qty: Int) : EquityTrade(id, qty = qty)

fun main() {
    val trade = Trade("T123", quantity = 100)
    println("Trade: ${trade.tradeId}, ${trade.stock}, ${trade.quantity}")  // Output: Trade: T123, IBM, 100

    val equityTrade = EquityTrade("T456", qty = 200)
    println("EquityTrade: ${equityTrade.tradeId}, ${equityTrade.stock}, ${equityTrade.quantity}")  // Output: EquityTrade: T456, MSoft, 200

    val shortTrade = ShortEquityTrade("T789", qty = 300)
    println("ShortEquityTrade: ${shortTrade.tradeId}, ${shortTrade.stock}, ${shortTrade.quantity}")  // Output: ShortEquityTrade: T789, Short, 300
}
</code>
</pre>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the output demonstrating how properties can be overridden in Kotlin.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
