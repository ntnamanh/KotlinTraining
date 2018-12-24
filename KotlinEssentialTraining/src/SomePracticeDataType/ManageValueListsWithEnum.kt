package SomePracticeDataType

import SomePracticeDataType.Operation.*

fun main() {
    val num1 = MathLib.getInput()
    val num2 = MathLib.getInput()

    println("Select an operation ($OPERATORS)")
    val operator = readLine()

    val result:Double? =
        when(operator) {
            ADD.operator -> MathLib.addValue(num1, num2)
            SUBTRACT.operator -> MathLib.minus(num1, num2)
            MULTIPLY.operator -> MathLib.mul(num1, num2)
            DIVIDE.operator -> MathLib.div(num1, num2)
            else -> throw Exception("Unknown operation")
        }
    println(result)

}