/**
 * Created by stllpt065 on 5/6/17.
 */


fun main(args: Array<String>) {
    getValue("Hello")
    getValue(4)
    getValue(9)
    getValue(11)
    getValue(6.6F)


     var x: Int = 8
     var y: Int = 9

     when {
         x > y -> println("$x > $y")
         x < y -> println("$x < $y")
         x == y -> println("$x = $y")
     }
}


fun getValue(value: Any)  = when (value) {
    is String -> println("It is String")
    4, 5 -> println("It is 4 or 5")
    in 1..10 -> println("I'm between 1 to 10")
    !is Float -> println("It's not a Float")
    else -> println("I don't know, what is this")
}

fun get() : Boolean = true
