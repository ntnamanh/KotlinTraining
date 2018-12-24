package SomePracticeDataType

import java.lang.NumberFormatException

fun main() {
    try{
        print("Value 1: ")
        val value1 = readLine()
        val d1 = value1!!.toDouble()
        print("Value 2: ")
        val value2 = readLine()
        val d2 = value2!!.toDouble()
        val d3 = ArrayList<String>()
        d3.add("abc")
        d3.add("xyz")
        println(d1)
        println(d2)
    } catch (e: KotlinNullPointerException) {
        println("Input variable can not be null")

    } catch (e: NumberFormatException) {
        println("${e.message} must be SomePracticeDataType.getA number")
    }
}