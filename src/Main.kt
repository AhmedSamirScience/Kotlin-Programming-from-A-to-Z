/**
 * In Kotlin, all function parameters are `val`, meaning they cannot be reassigned once the function is invoked.
 * This differs from Java, where reassignment is possible.
 *
 *
 */
fun main() {

}


fun add(i: Int) {
    /**
     * This protects the programmer from accidentally reassigning a parameter's value and using the new value later, while expecting the original value.
     */
    //i = i + 1 // won't compile i is a val
}