/**
 * The default value comes after the type, preceded by an equals sign =, and must match the parameter type.
 * If a value is provided, it overrides the default; otherwise, the default is used.
 */
fun main() {

    /**
     * | Parameter | Type     | Mandatory/Optional | Default Value            |
     * |-----------|----------|--------------------|--------------------------|
     * | name      | String   | Mandatory          | None                     |
     * | message   | String   | Optional           | "Live Long and Prosper"  |
     *
     * In the first example, where only one argument was provided, the default message was used. In the second example, a provided message was used instead of the default.
     * In `greeter2()`, the term "mandatory" is used for the `name` parameter, and "optional" is used for the `message` parameter, which has a default value.
     */
    greeter2("Theeban")
    greeter2("Jasmine", "Have a Nice Day!")

}

fun greeter2(name: String, message: String = "Live Long and Proper") {
    println("Welcome $name - $message")
}