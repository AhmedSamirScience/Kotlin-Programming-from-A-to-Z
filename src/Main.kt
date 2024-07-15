
fun main() {
    /**
     * In some cases, we want to execute the body of statements at least once; you can
     * accomplish this with the do loop construct
     */

    var count = 0
    println("Starting")
    do {
        print("$count, ")
        count++
    } while (count < 10)
    println()
    println("Done")
}