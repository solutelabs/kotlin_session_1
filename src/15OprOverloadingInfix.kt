/**
 * Created by stllpt065 on 5/6/17.
 */

fun main(args: Array<String>) {

    val ahm = City("Ahmedabad", 1000)
    val mumbai = City("Mumbai", 2000)

    val totalPopulation = ahm + mumbai

    println(totalPopulation)

    //normal call
    ahm.isLargerThan(mumbai)

    // infix call
    ahm isLargerThan mumbai


}

data class City(val name: String, val population: Int) {

    operator fun plus(otherName: City): Int {
        return this.population + otherName.population
    }

    infix fun isLargerThan(otherName: City): Boolean {
        return this.population >= otherName.population
    }
}

//https://kotlinlang.org/docs/reference/operator-overloading.html