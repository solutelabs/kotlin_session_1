/**
 * Created by stllpt065 on 5/6/17.
 */


fun higher(func: (Int) -> Unit) {

    //...

    func(7)

    //...

}

fun higher1(arg1: Int, func: (Int, String) -> Unit) {

    //...

    func(5, "string")

    //...
}

fun higher2(onSuccess: () -> Unit, onFailure: () -> Unit) {

    //..

    onSuccess()

    //...

    onFailure()

    //...
}


fun main(args: Array<String>) {

    //Type 1
    higher { param -> println(param) } //use of lambda
    higher { println(it) }

    //Type 2
    higher1(4, { i, s -> println("$i and $s") })
    higher1(4) {
        i, s ->
        println("$i and $s")
    }

    //Type 3
    higher2(onSuccess = {
        println("It's success")
    }, onFailure = {
        println("It's failure")
    })
}
