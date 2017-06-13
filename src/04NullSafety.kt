/**
 * Created by stllpt065 on 5/6/17.
 */


fun main(args: Array<String>) {

    var iCanNotBeNull: String = "Not null value"

//  iCanNotBeNull = null

    var canBeNull: String? = "Can be null or non null"

    canBeNull = null

    //Safe call
    println(canBeNull?.length)

    //Elvis operator
    println(canBeNull?.length ?: 7)

    //Force operators
    println(canBeNull!!.length)

}