
fun main() {

    //region nonNullableVar
    /**
     * the commented out line will not compile as it will
     * generate a compiler error stating that ‘Null can not be a value of a non-null type
     * String’.
     */
    println("(nonNullableVar)")
    // Standard variable - cannot be set to null
    var nonNullableVar = "abc"
    println("nonNullableVar: $nonNullableVar")
    println("\n")
    // nonNullableVar = null // Compilation error
    //endregion

    //region NullableVar
    /**
     * To specify a nullable type we need to explicitly specify the type with a trailing
     * ‘?’, for example
     */
    println("(NullableVar)")
    // Nullable variable - can be set to null
    var nullableVar: String? = "abc"
    println("nullableVar: $nullableVar")
    nullableVar = null
    println("nullableVar now: $nullableVar")
    println("\n")
    //endregion

    //region (The Safe Call Operator ) (‘?’)
    /**
     * (The Safe Call Operator ) (‘?’)
     */
    println("(The Safe Call Operator -> ‘?’)")
    // Nullable variable - can be set to null
    var nullableVarSafeCallOperator: String? = "John"
    println(nullableVarSafeCallOperator?.length)
    nullableVarSafeCallOperator = null
    println(nullableVarSafeCallOperator?.length)
    println("\n")
    //endregion

    //region (The Elvis Operator) (“?:”)
    /**
     * (The Elvis Operator) (“?:”)
     */
    println("(The Elvis Operator -> “?:”)")
    var nullableVarElvisOperator : String? = "John"
    val l2 = nullableVarElvisOperator?.length ?: -1
    println(l2)
    nullableVarElvisOperator = null
    val l3 = nullableVarElvisOperator?.length ?: -1
    println(l3)
    println("\n")
    //endregion

    //region (The Not-Null Assertion Operator) ("!!.")
    /**
     * (The Not-Null Assertion Operator) ("!!.")
     *
     * The not-null assertion operator is formed of two exclamation marks i.e. !!.
     * This operator is used to treat a nullable variable as a non-null type. If the
     * current value of the nullable type is null when the operator is applied then a
     * NullPointerException error will be generated. Otherwise it will be treated
     * as a normal non-null type.
     */
    println("The Not-Null Assertion Operator -> !!.)")
    var nullableVarNotNullAssertionOperation: String? = "John"
    val l4 = nullableVarNotNullAssertionOperation!!.length
    println(l4)
    /**
     * However, the compiler will analyse the code and see that the nullableVar is
     * set to null the line before the not-null assertion operator is applied; in this case
     * it will not even compile the code as it knows that it will always result in a
     * NullPointerException error being generated
     */
    // nullableVarNotNullAssertionOperation = null
    //val l5 = nullableVarNotNullAssertionOperation!!.length
    //println(l5)
    println("\n")
    //endregion

    //region (Smart Compilation)
    /**
     * (Smart Compilation)
     */

    /**
     * The Kotlin compiler is smart enough to work out whether a value is null or not in
     * many situations. This is illustrated below
     */
    var total: Int? = null
    // total++ // won’t compile as total may be null
    if (total != null) {
        total++
    }
    /**
     * The first line of this code declares a new var called total of type Int? (that
     * is it is a nullable integer). However, it currently holds the value null. This means
     * that if we attempt to increment total using the increment (++) operator (which is the
     * same as saying total = total + 1) then we would be trying to add 1 to null which
     * is illegal. Thus the second line in the example has to be commented out as it would
     * generate a compile time error. We could of course use one of the nullable operators
     * to handle this such as the safe dot operator (?.). However, in this case we are using
     * an explicit if statement that will check to see if total is null. If it is not null then
     * we can safely increment total. The compiler is smart enough to understand this and
     * allow the increment of total within the if block.
     */
    //endregion

    //region (Safe Casting to Non Null Type) (as?)
    /**
     * (Safe Casting to Non Null Type -> as?)
     */
    println("(Safe Casting to Non Null Type -> as?)")
    val totalSafeCastingToNonNullType: Int? = null
    println(totalSafeCastingToNonNullType as? Int)
    println("\n")
    //endregion

}