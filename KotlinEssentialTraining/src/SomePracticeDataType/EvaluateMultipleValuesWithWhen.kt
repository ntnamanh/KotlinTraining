package SomePracticeDataType

fun main() {
//    val state = readLine()
//    val capital:String? = when(state) {
//        "CA" -> "Sacramento"
//        "OR" -> "Salem"
//        else -> "Unknown"
//    }
//
//    when(state) {
//        "CA", "OR", "WA" -> println("West Coast")
//        "NH", "VT", "MA" -> println("New England")
//        else -> println("Somewhere in this planet")
//    }
    val theAnswer = 1
    when (theAnswer) {
        in 1..39 -> println("Not yet")
        in 40..45 -> println("Close enough")
        else -> {
            println("Definitely not!")
            println("No, really!")
        }
    }

    val list: Set<String> = setOf("SomePracticeDataType.getA", "b", "c", "h", "m", "w")

    when {
        "SomePracticeDataType.getA" in list -> println("SomePracticeDataType.getA stands for angry")
        "b" in list -> println("b stands for big")
        "c" in list -> println("c stands for charming")
        else -> println("never mind")
    }


}