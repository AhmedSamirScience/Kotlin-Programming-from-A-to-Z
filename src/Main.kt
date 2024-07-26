/**
 * Using position to assign values to parameters is simple but can be problematic with multiple parameters, especially with defaults.
 * Named parameter passing solves this by assigning values to parameters by name, making position irrelevant.
 */
fun main() {

    /**
     * With named parameters, the order of parameters doesn't matter, allowing you to change their order freely.
     */
    greeter3(message="Have a Nice Day!", name="Jasmine")


    /**
     * Mixing named and positioned arguments is not allowed (Compilation Error)
     */
    //greeter3(message="Have a Nice Day!", "Jasmine")


    println("max(x=3, 4): " + max(x=3, 4))


    /**
     * Mixing named and positioned arguments is not allowed (Compilation Error)
     */
    //println("max(x=3, 4): " + max(y=3, 4))

}

fun greeter3(name: String,
             title: String = "Dr",
             prompt: String = "Welcome",
             message: String = "Live Long and Proper") {
    println("$prompt $title $name - $message")
}

fun max(x: Int, y: Int ): Int = if (x > y) { x } else { y }
