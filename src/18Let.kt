/**
 * Created by stllpt065 on 6/6/17.
 */

fun main(args: Array<String>) {

    var nullableValue: String? = null

    val let = nullableValue?.let { println("It's not null") }

    nullableValue = " I have value now"

    nullableValue?.let { println(it) }


}