<body>

<h1>Kotlin Inline Functions Demonstration</h1>

<p>This repository contains a simple Kotlin application that demonstrates the use of the <code>inline</code> keyword to optimize function calls. Inline functions allow the compiler to replace the function call with the actual code inside the function, reducing performance overhead.</p>

<h2>Code Overview</h2>

<pre>
<code>
/**
 * Calling a function has some performance cost. For simple functions, like adding one to a number, this cost can be high.
 * Kotlin solves this with the inline keyword, which allows the compiler to replace the function call with the actual code inside the function.
 */

/**
 * Video Reference: https://www.youtube.com/watch?v=GLLI8h67ryo
 */
fun main() {

    //region if we don't use inline function
    /**
     * if we don't use the inline function with tech
     *
     * fun guide(){
     *     print ("guide start")
     *     teach()
     *     print ("guide end")
     * }
     * fun teach() {
     *     print("teach")
     * }
     *
     * (((the decompiler will look like the below)))
     *
     * public void guide ()
     * {
     *     System.out.print("guide start");
     *     teach();
     *     System.out.print("guide end");
     * }
     * public void teach ()
     * {
     *     System.out.print("teach");
     * }
     */
    //endregion

    //region if we use inline function
    /**
     * if we use the inline function with tech
     *
     * fun guide(){
     *     print ("guide start")
     *     teach()
     *     print ("guide end")
     * }
     * inline fun teach() {
     *     print("teach")
     * }
     *
     * (((the decompiler will look like the below)))
     *
     * public void guide ()
     * {
     *     System.out.print("guide start");
     *     System.out.print("teach");
     *     System.out.print("guide end");
     * }
     */
    //endregion

}
</code>
</pre>

<h3>Inline Functions in Kotlin</h3>

<p>Calling a function has some performance cost. For simple functions, this cost can be significant. Kotlin provides the <code>inline</code> keyword to mitigate this cost by allowing the compiler to replace the function call with the actual code inside the function.</p>

<h4>Without Inline Functions</h4>
<p>Consider the following example without using inline functions:</p>

<pre>
<code>
fun guide() {
    print("guide start")
    teach()
    print("guide end")
}

fun teach() {
    print("teach")
}
</code>
</pre>

<p>When decompiled, the code looks like this:</p>

<pre>
<code>
public void guide() {
    System.out.print("guide start");
    teach();
    System.out.print("guide end");
}

public void teach() {
    System.out.print("teach");
}
</code>
</pre>

<h4>With Inline Functions</h4>
<p>Now, consider the following example using inline functions:</p>

<pre>
<code>
fun guide() {
    print("guide start")
    teach()
    print("guide end")
}

inline fun teach() {
    print("teach")
}
</code>
</pre>

<p>When decompiled, the code looks like this:</p>

<pre>
<code>
public void guide() {
    System.out.print("guide start");
    System.out.print("teach");
    System.out.print("guide end");
}
</code>
</pre>

<p>As you can see, the <code>teach</code> function call is replaced with its body, reducing the overhead of the function call.</p>

<h2>Benefits of Inline Functions</h2>

<ul>
    <li><strong>Performance:</strong> Reduces the overhead of function calls, which can be significant for small, frequently called functions.</li>
    <li><strong>Optimization:</strong> Allows the compiler to optimize the code better by reducing indirections and improving cache performance.</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li>Clone the repository:
        <pre><code>git clone &lt;repository-url&gt;</code></pre>
    </li>
    <li>Open the project in your preferred IDE (e.g., IntelliJ IDEA, Android Studio).</li>
    <li>Navigate to the <code>main</code> function.</li>
    <li>Run the <code>main</code> function to see the demonstration of inline functions.</li>
</ol>

<h2>License</h2>

<p>This project is licensed under the MIT License.</p>

<h2>Author</h2>

<p><strong>Ahmed Samir</strong> - Software Engineer</p>

</body>
</html>
