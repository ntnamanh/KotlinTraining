package SomePracticeDataType

class MathLib {
    var total = 0.0

    fun addVal(num: Double) {
        total += num
    }

    companion object {
        fun addValue(param1: Double, param2: Double): Double = param1.plus(param2)
        fun minus(param1: Double, param2: Double): Double = param1.minus(param2)
        fun div(param1: Double, param2: Double): Double = param1.div(param2)
        fun mul(param1: Double, param2: Double): Double = param1.times(param2)
        fun reminder(param1: Double, param2: Double): Double = param1.rem(param2)
        fun tryInsertManyElement(vararg num: Int): Int {
            var result: Int = 0
            for (x in num) {
                result *= x
            }
            return result
        }
        fun new(param1: Int?): Int = param1 ?: -1
        fun getInput(): Double {
            val a: String?  = readLine()
            val b = a!!.toDouble()
            return b
        }
    }
}