/**
 * Created by stllpt065 on 5/6/17.
 */

object Utils {
    fun getStaticValue(): Int {
        return Int.MAX_VALUE
    }

    val APP_NAME = "Kotlin Demo App"
}

fun main(args: Array<String>) {
    println(Utils.getStaticValue())
    println(Utils.APP_NAME)
}