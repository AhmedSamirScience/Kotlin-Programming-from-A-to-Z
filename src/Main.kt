/**
 * Objects and Inheritance in Kotlin
 * In Kotlin, not only classes but also objects can participate in inheritance. An object can extend an open class, meaning that it inherits the data and behavior from the superclass. The object, however, cannot be extended further.
 *
 * Key Points:
 * Inheritance with Objects: Objects can inherit from open classes, gaining all the functionality of the superclass.
 * No Constructors for Objects: Objects don't have constructors, but when inheriting from a superclass, the superclass's constructor is invoked to initialize the object.
 *
 *
 * object <ObjectName> : <Superclass>()
 *
 */


/**
 * This example demonstrates how an object in Kotlin can extend an open class and inherit its behavior.
 */

open class Logger {
    // Method that can be inherited by subclasses or objects
    fun log() = println("log")
}

object HelloWorldLogger : Logger() {
    // Method in the object that calls the inherited log() method
    fun doSomething() = log()
}

fun main() {
    // Using the HelloWorldLogger object
    HelloWorldLogger.doSomething()
}

/*
 * Output:
 * log
 */

/**
 * Explanation:
 *
 * - The `Logger` class is marked as `open`, allowing it to be inherited by other classes or objects.
 * - `HelloWorldLogger` is an object that extends `Logger`. It inherits the `log()` method.
 * - `doSomething()` is a method in `HelloWorldLogger` that invokes the inherited `log()` method.
 * - In `main()`, calling `HelloWorldLogger.doSomething()` results in the `log()` method being called, printing "log".
 *
 * **Important Notes**:
 *
 * - Although objects don't have constructors, the superclass constructor (`Logger()`) is invoked to initialize the object.
 * - The object `HelloWorldLogger` is both an instance of `Logger` and its own type (`HelloWorldLogger`), meaning it can be used anywhere a `Logger` is expected.
 */


/**
 * Summary:
 * Inheritance with Objects: The HelloWorldLogger object extends the Logger class, inheriting its log() method. Objects in Kotlin can extend open classes but cannot be further extended.
 *
 * Constructor Invocation: Even though objects don't have their own constructors, the superclass constructor is invoked when extending an open class to initialize the object.
 *
 * Use Case:
 *
 * The object HelloWorldLogger can be used in any context that requires an instance of Logger, as it is both an instance of Logger and its own object type.
 * This class.kt file demonstrates how objects can inherit from open classes in Kotlin, showing the benefits of inheritance in reusable code design while maintaining the simplicity of singleton objects.
 */