/**
 * Created by stllpt065 on 5/6/17.
 */

fun main(args: Array<String>) {
    var sample: Any = "i don't know, which type is this"

    if (sample is String) {
        print(sample.length) // here 'sample' automatically casts to String.
    }

    if (sample is Int) {
        print(sample + 7)
    }

    if(sample !is Int){

    }

}
