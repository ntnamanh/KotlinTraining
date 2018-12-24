package SomePracticeDataType

import java.lang.NumberFormatException

fun main() {



    try {
        getInput()
    }catch (e: NumberFormatException) {
        println("Should be number")
    }
}

private fun getInput() {
    val a: String? = readLine()
    val b = a?.toDouble()
    println(b)
}
