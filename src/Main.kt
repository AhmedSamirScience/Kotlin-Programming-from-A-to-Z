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




