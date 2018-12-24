package practiceCollections

fun main(a: Array<String>) {

    val array1 = arrayOf("Red", "Green", "Blue")
    for (element in array1) {
        println(element)
    }

    val mixed  = arrayOf("Red", 123, true)
    for (element in mixed) {
        println(element)
    }

    val nulls = arrayOfNulls<String >(3)
    nulls[0] = "ahihi"
    nulls[1] = "ahoho"
    nulls[2] = "ahehe"
    for (e in nulls) {
        println(e)
    }

    val intArray = intArrayOf(1, 3, 5)
    for (element in intArray) {
        println(element)
    }

}

