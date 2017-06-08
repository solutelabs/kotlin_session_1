/**
 * Created by stllpt065 on 5/6/17.
 */
fun main(args: Array<String>) {


    for (x in 1..10) {
        print(x)
    }

    println()
    //for reverse
    for (x in 5 downTo 1) {
        print(x) // prints "54321"
    }
    println()

    for (x in 1 until 10) {
        print(x) //excludes 10
    }
    println()
    for (x in 1..10 step 2) {
        print(x)
    }

    /*
    * Ranges are handled in a special way by the compiler,
    * and are compiled into index-based for loops
    * that are supported directly on the JVM
    *
    * */
}