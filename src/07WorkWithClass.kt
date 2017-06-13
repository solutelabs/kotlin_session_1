/**
 * Created by stllpt065 on 5/6/17.
 */
open class KotlinClass1 {

    companion object{
        val value : Int = 8
    }
}


class KotlinClass2 : KotlinClass1(),Listener {
    override fun onAction() {

    }


}

