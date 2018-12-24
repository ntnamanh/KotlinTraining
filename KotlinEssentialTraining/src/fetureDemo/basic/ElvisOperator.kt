package fetureDemo.basic

import fetureDemo.dslDemo.java.Person
import java.lang.IllegalArgumentException

fun main(a: Array<String>) {

    var a: String? = null

    print(a!!)


//    var c = readLine()?.toIntOrNull()
   // var d = fail("abc")?.toDoubleOrNull() ?: print("abc")
//    var e = readLine()?.toBoolean()
//
//    val number = readLine()?.toIntOrNull() ?: fail("invalid input format")
//    val doubleVariable = readLine()?.toDoubleOrNull() ?: println("")
//    val floatVariable = readLine()?.toFloatOrNull() ?: fail("invalid input format")
//    val string = readLine()?: fail("invalid input format")

}

fun fail(message: String):String {
    return "${1/0}"
}
