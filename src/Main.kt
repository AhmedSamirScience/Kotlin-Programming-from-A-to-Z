
fun main() {

    //region Print out values in a range
    println("Print out values in a range")
    for (i in 0..9) {
        print("$i, ")
    }
    println()
    println("Done")
    println("\n")
    //endregion

    //region Print out values in a range with an increment of 2
    // Now use values in a range but increment by 2
    println("Print out values in a range with an increment of 2")
    for (i in 0..9 step 2) {
        print("$i, ")
    }
    println()
    println("Done")
    println("\n")
    //endregion

    //region Print out values in a range to but not including 9
    println("Print out values in a range to but not including 9")
    for (x in 0 until 9)
        print("$x, ")
    println()
    println("Done")
    println("\n")
    //endregion

    //region Print out values in a range to but not including 9 with step 2
    println("Print out values in a range to but not including 9 with step 2")
    for (x in 0 until 9 step 2) {
        print("$x, ")
    }
    println()
    println("Done")
    println("\n")
    //endregion

    //region Iterate down from one value to a lower value
    println("Iterate down from one value to a lower value")
    for (i in 5 downTo 0) {
        print("$i * $i = ${i*i}; ")
    }
    println()
    println("Done")
    println("\n")
    //endregion

}