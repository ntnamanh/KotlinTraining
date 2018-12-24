package SomePracticeDataType

fun main() {
    var nullValue:String? = null
    var values = intArrayOf(1,3, 5, 7, 9)
//
//    println(values.indices)
//    println(nullValue)
//
//    val l:Int? = nullValue?.length
//
//    val message = if(l !=null ) {
//        "length is $l"
//    }
//    else {
//        "l is null"
//    }
//
//
//
//    val  l2 = l ?: -1
//    println("The value of l2 is $l2")
//
//
//    try {
//        val l3 = l!!
//        println("The value of l3 is $l3")
//    } catch (e: KotlinNullPointerException) {
//        println("l3 is null")
//    }

    for(i in values.indices step 2) {
        println(values[i])
    }
}