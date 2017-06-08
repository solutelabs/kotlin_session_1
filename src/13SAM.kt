/**
 * Created by stllpt065 on 5/6/17.
 */

fun main(args: Array<String>) {

    samConversion(Listener { print("it's SAM Single Abstract Method") })

    samConversion(object : Listener {
        override fun onAction() {

        }
    })
}


fun samConversion(listener: Listener) {

    listener.onAction()

}

