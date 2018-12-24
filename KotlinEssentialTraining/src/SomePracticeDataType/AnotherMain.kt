package SomePracticeDataType

import kotlin.math.*

fun main(args: Array<String>) {
    val num1:Int = 15
    val num2:Int = 10

    val sum = num1.plus(num2)
    println("sum = $sum")

    val difference = num1.minus(num2)
    println("difference = $difference")

    val quotient:Double = num1.toDouble().div(num2)
    println("quotient = $quotient")

    val remainder = num1.rem(num2)
    println("remainder = $remainder")

    val neg = -152.5
    val absolute = abs(neg)
    println(absolute)
    println(round(absolute))
    println(floor(absolute).toInt())
    println()
}