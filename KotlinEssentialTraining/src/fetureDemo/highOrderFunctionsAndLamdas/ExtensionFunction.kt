package fetureDemo.highOrderFunctionsAndLamdas

import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {

//    "abc".check()
//    3.check()
//
//    val aString = "abc"
//    val aInt = 0
//
//    aString.check()
//    aInt.check()
//
//    val c = aString to aInt
//
//    println(1 daysAgo "yesterday")
//    println(2.daysAgo("2 days ago"))
//
//
//
//    val num1 = 2
//    val num2 = 3
//
//    println("The biggest number is ${num1 compare num2}")
//
//
//
//    println("kms".format())

}



fun String.format(): String {
    return this.toUpperCase()
}

fun Any.check(): Unit {
    if(this !is String) throw IllegalAccessError("This is not a String")
}

infix fun Int.compare(param2: Int): Int {
    return if(this > param2) this else param2
}

infix fun Int.daysAgo(yesterday: String): LocalDate {
    val dateTime = LocalDateTime.now()
    print(message = "$yesterday is ")
    return dateTime.minusDays(this.toLong()).toLocalDate()
}