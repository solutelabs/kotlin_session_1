/**
 * Created by stllpt065 on 5/6/17.
 */

fun main(args: Array<String>) {


    funWithArg(3, "three")

    funWithArg(intArg = 3, strArg = "three")

    funWithArg(strArg = "three", intArg = 3)

    funWithDefaultArg(10)
    funWithDefaultArg()

}

fun simpleFun(): Int {
    return 5
}

fun simpleFun1(): Int = 5


fun funWithArg(intArg: Int, strArg: String) {
    println("$intArg and $strArg")
}

fun funWithDefaultArg(intArg: Int = 8) {
    println("Value received $intArg")
}

//https://kotlinlang.org/docs/reference/functions.html