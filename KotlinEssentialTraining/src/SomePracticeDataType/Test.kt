package SomePracticeDataType

fun main() {
//    println(SomePracticeDataType.joinOptions(listOf("SomePracticeDataType.getA", "b", "c")))
//    val list = listOf(1,3,5,7,9)
//    println(list.any{SomePracticeDataType.check(it)})

//    val num = 0..readLine()!!.toInt()
//    for (x in num) {
//        print(x)
//    }

//    SomePracticeDataType.checkSomething(listOf("SomePracticeDataType.getA", "b", "d", "g"))

//    val SomePracticeDataType.name = readLine()
//
//    if(SomePracticeDataType.name == "Bird") SomePracticeDataType.ahihi() else SomePracticeDataType.ahoho()


//    val order = SomePracticeDataType.Order()
//    while(true) {
//        println("Do you want to keep ordering? y/n")
//        val question = readLine()
//        if(question == "y") SomePracticeDataType.inputDrink(order)
//        else {
//            SomePracticeDataType.printBill(order)
//            return
//        }
//    }

    loop@ for (x in 0..10) {

    }
    val list = listOf("SomePracticeDataType.getA", "b", "c", "d")
    println(list.indices)

}

fun inputDrink(order: Order){
    println("Input drink's SomePracticeDataType.name: ")
    val drinkName = readLine()
    println("Input quality: ")
    val quality = readLine()
    order.addDrinkAndQuality(drinkName!!, quality!!.toInt())
}

fun printBill(order: Order) {
    println("SomePracticeDataType.Detail of order")
    for ( x in order.listOrder) {
        println("drink's SomePracticeDataType.name: ${x.drinkName}, quality : ${x.quality}")
    }
    println("Thank for using our service!!! take sh*t and get lost motherfuck*r")
}

fun ahihi() = print("Hello! Boss")

fun ahoho() = print("Hello! enemies")

fun check(num: Int): Boolean = (num%2) ==0

fun checkSomething(collection: Collection<String>): Unit {
    print(collection.any{ check(it) })
}

fun check(string: String): Boolean {
    return  string == "SomePracticeDataType.getA" ||
            string == "b" ||
            string == "c"
}
fun joinOptions(options: Collection<String>): String = options.joinToString()