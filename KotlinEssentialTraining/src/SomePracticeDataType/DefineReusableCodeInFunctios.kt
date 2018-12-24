package SomePracticeDataType

fun main() {
    val num1 = 4.0
    val num2 = 3.5

    val sum = a(num1, num2)
    println(sum)

    val minus = MathLib.addValue(num1, num2)
    println(minus)

    val result = tryListElement(5, 6, 8, 9)
    println(result)

}

val a = fun (param: Double, param2: Double): Double {
    return param.plus(param2)
}

fun addValue(param1: Double, param2: Double): Double = param1.plus(param2)

fun calcValue(param1: Double, param2: Double, op:String = "+"): Double {
 return 0.0
}

fun tryListElement(vararg param1: Int): Int {
    var result: Int = 0
    for (i in param1) {
        result += i
    }
    return result
}