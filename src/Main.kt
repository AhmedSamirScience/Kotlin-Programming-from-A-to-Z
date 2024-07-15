
fun main() {

    //region Break Loop Statement
    println("(Break Loop Statement)")
    println("First Example:")
    val y = 10
    val x = 5
    for (i in 0 until y) {
        if (i == x) {
            break
        }
        print("i: $i, ")
    }
    println("Done")
    println("\n")


    println("Second Example:")
    loop@ for (i in 0 until 4) {
        for (j in 0 until 2) {
            if (i == 3) {
                break@loop
            }
            println("i=$i - j=$j, ")
        }
    }
    println("-------------------------------------------------- \n\n")
    //endregion

    //region Continue Loop Statement
    println("(Continue Loop Statement)")
    println("First Example:")
    for (i in 0 until 10) {
        print("i=$i ")
        if ((i % 2) == 1) {
            continue
        }
        println("hey its an even number")
        println("we love even numbers")
    }
    println("Done")
    println("\n")


    println("Second Example:")
    outer@ for (i in 1..4) {
        println("i = $i")
        for (j in 1..4) {
            val result = i + j
            if (result == 5) continue@outer
            println("\t$i + $j = $result ")
        }
    }
    println("-------------------------------------------------- \n\n")
    //endregion

    //region When with Continue and Break
    println("(Continue Loop Statement)")
    for (i in 0..10) {
        when (i) {
            2 -> continue
            4 -> break
            else -> println(i)
        }
    }
    println("Done")
    println("-------------------------------------------------- \n\n")
    //endregion

}