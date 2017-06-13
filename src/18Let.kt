/**
 * Created by stllpt065 on 6/6/17.
 */

fun main(args: Array<String>) {

    var nullableValue: String? = null

    nullableValue = " I have value now"

    nullableValue?.let { println("It's not null") }

    val m : Int = 8


    nullableValue?.let { println(it) }

}