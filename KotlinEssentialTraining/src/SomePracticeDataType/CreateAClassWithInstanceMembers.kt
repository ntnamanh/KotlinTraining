package SomePracticeDataType

import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main() {
    val mathLib = MathLib()
    try {
        while(true) {
            val a = MathLib.getInput()
            mathLib.addVal(a)
            println(mathLib.total)
        }
    } catch (e: NullPointerException) {
        println(" can not be null")
    } catch (e: NumberFormatException) {
        println("${e.message} must be number")
    }


}