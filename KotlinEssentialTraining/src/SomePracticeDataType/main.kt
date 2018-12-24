package SomePracticeDataType

var myName = "David"

fun main(args: Array<String>) {
    var num1:Int = 5.5.toInt()
    var num3:Double? = num1.toDouble()
    var n1:String = "AbC"
    var n2:String = "abc"
    println("n1 equals to n2 is ${(n1.equals(n2, true))}")

    num1 += 2
    println("The first variable is $num1 ")
    var num2:Double = 4.toDouble()
    ++num2
    println("The second variable is $num2")

    val name = name("Bird", "Super")
    println("My SomePracticeDataType.name is ${name.lastName} ${name.firstName} ")
}

data class name(val firstName:String, val lastName:String)