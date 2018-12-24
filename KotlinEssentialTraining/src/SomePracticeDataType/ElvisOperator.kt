package SomePracticeDataType

import jdk.nashorn.internal.runtime.regexp.joni.Config.log
import java.lang.IllegalArgumentException

fun main(a: Array<String>) {
    val b = readLine()?.toIntOrNull() ?: fail("variable required")


}

fun fail(message: String):Nothing {
    throw IllegalArgumentException(message)
}
