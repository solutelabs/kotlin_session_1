/**
 * Created by stllpt065 on 5/6/17.
 */
fun main(args: Array<String>) {
    var mDataset: String = "This is sample string"

    println(mDataset.length)
    println(mDataset.get(6))
    println(mDataset.replace(" ", "_"))

    with(mDataset) {

        println(length)
        println(get(6))
        println(replace(" ", "_"))
    }

    mDataset.apply {

    }


}