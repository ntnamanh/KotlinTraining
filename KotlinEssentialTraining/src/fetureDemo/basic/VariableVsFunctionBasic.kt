package fetureDemo.basic

import fetureDemo.dslDemo.java.Person

//fun main(args: Array<String>) {
//    val a = 3
//    var b: String
//
//   println(1 `is bigger than` 2)
//
//}

fun exampleFunction(param1: Int, param2: String, param3: Double, param4: Long, param5: ObjectSample2): Int {
    return 0
}

fun exampleFunction2(param1: Int, param2: String, param3: Double, param4: Long, param5: ObjectSample2): Any {
    return "result"
}

fun exampleFunction3(param1: Int, param2: String, param3: Double, param4: Long, param5: ObjectSample2): Unit {

}

fun exampleFunction4(param1: Int, param2: String, param3: Double, param4: Long, param5: ObjectSample2) {

}

//fun exampleFunction5(param1: Int, param2: String, param3: Double, param4: Long, param5: ObjectSample2)
fun exampleFunction6(param1: Int, param2: Int) = ( param1 + param2 ) /2

fun exampleFunction6(param1: String, param2: String) = param1 + param2 + "abc"

fun exampleFunction6(param1: Double, param2: String) = param1.toString() + param2

infix fun Int.`is bigger than`(param1: Int) = this > param1


fun main(args: Array<String>) {
    println(1 `is bigger than` 2)
}