import javax.xml.ws.ServiceMode

/**
 * Created by stllpt065 on 5/6/17.
 */


data class User(var id: Int, var name: String)

/*
* This wil automatically create
* equals() & hashCode()
* toString()
* getter and setters
* copy()
*
* all this
*
* */
//data class with custom getter and setters
data class Person(var id: Int, private var _name: String) {

    var name = _name
        get() = field
        set(value) {
            field = "$value will be modified"
        }
}


fun main(args: Array<String>) {
    val mObj = User(12, "Name")

    var person = Person(12, "name")
    person.name = "New value"
    println(person.name)
}