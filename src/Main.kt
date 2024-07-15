
fun main() {

    //region Easy Example
    /**
     * This means that
     * • if value is 0 then the message “It is a 0” will be printed out.
     * • If value is 1 or 2 then the message “It is a 1 or 2” will be printed out
     * • If value is 3 then the message “It is too high” will be printed out.
     * • otherwise if it is any other value then the default else clause will be run and the
     * message “Default” will be printed out.
     * Note that it is not required to have an else clause. That is, the else clause is
     * an optional element of a when expression and can be included or not as required by
     * the programmer.
     */
    println("(Easy Example)")
    val valueEasyExampleOnWhen = 1
    when (valueEasyExampleOnWhen) {
        0 -> println("It is a 0")
        1, 2 -> println("It is a 1 or 2")
        3 -> println("It is to high")
        else -> println("Default")
    }
    println("\n")
    //endregion

    //region In
    /**
     * • in 5...10 indicates that if the value is in the range 5 up to and including 10
     * then use the associated string.
     * • !in 10...20 indicates that if the value is not in the range 10 to 20 use the
     * associated string
     */
    println("(In)")

    val valueInExampleOnWhen = 1
    val messageDeepDiveExampleOnWhen = when(valueInExampleOnWhen) {
        0 -> "Invalid number"
        1, 2 -> "Number too low"
        3 -> "Number correct"
        4 -> "Number too high, but acceptable"
        in 5..10 -> "Number too high, might be acceptable"
        !in 10..20 -> "What are you on"
        else -> "Bad number"
    }
    println("message: $messageDeepDiveExampleOnWhen")
    println("\n")
    //endregion

    //region Comparing String
    /**
     * We are not restricted to just using numbers in a when condition (as is the case in
     * some other languages). For example, the following example uses a String as the
     * type to be tested
     */
    println("(Comparing String)")
    val valueComparingStringExampleOnWhen = "John"
    when (valueComparingStringExampleOnWhen) {
        "John" -> println("Dad")
        "Denise" -> println("Mum")
        else -> println("Not mum or dad")
    }
    println("\n")
    //endregion

    //region Comparing Object
    /**
     * We can in fact use any type with a when expression, if we have a custom type
     * Person then we can use such a type with when expression and test for equality
     * between instances of the type, for example
     */
    println("(Comparing Object)")
    val person = Person()
    val person1 = person
    when (person1) {
        person -> println("its me")
        else -> println("its not me")
    }
    println("\n")
    //endregion

    //region Comparing Reference Type
    /**
     * We can even use a when expression to determine what type of thing we have.
     * This can be done using the is operator. Thus allows us to check whether a val
     * or var holds something that is an Int, or a String, or a Double etc. This is
     * illustrated below (note Any means that the val x is any type of thing)
     */
    println("(Comparing Reference Type)")
    val x: Any = 32
    when (x) {
        is Int -> println("Its a Int")
        is Double -> println("Its a Double")
        is Boolean -> println("Its a Boolean")
        is String -> println("Its a String")
        is Person -> println("Its a Person")
        else -> println("its something else")
    }
    println("\n")
    //endregion

    //region Comparing String but with have more than one statement associated with each condition
    /**
     * If you need to have more than one statement associated with each condition within
     * a when expression, you can use curly brackets to group them together
     */
    println("(Comparing String but with have more than one statement associated with each condition)")
    val total = 34
    when (total) {
        0 -> {
            println("Its Zero")
            println("Never mind")
        }
        in 1..5 -> println("Not Bad")
        else -> println("Excellent")
    }
    println("\n")
    //endregion

}

class Person