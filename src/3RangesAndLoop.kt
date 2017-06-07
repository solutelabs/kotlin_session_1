/**
 * Created by stllpt065 on 5/6/17.
 */
fun main(args: Array<String>) {


    for (x in 1..100) {
        println(x)
    }


    //for reverse
    for (x in 5 downTo 1) {
        println(x) // prints "54321"
    }

    for (x in 10 until 10) {
        println(x) //excludes 10
    }

    for (x in 1..10 step 2) {
        println(x)
    }

    /*
    * Ranges are handled in a special way by the compiler,
    * and are compiled into index-based for loops
    * that are supported directly on the JVM
    *
    * */
}