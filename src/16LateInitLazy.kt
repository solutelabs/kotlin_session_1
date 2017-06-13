/**
 * Created by stllpt065 on 5/6/17.
 */
class DemoClass {
    lateinit var str: String


    fun memberFun() {
        str = "Here I want to initialize"
    }

    val otherString: String by lazy {
        "new value"
    }

}

fun main(args: Array<String>) {

    val obj: DemoClass = DemoClass()

    println(obj.str)


}