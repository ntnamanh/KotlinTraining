package fetureDemo.basic

fun main(args: Array<String>) {
    val a: Int = 3
    println(smartCast(a))
    val b = "abc"
    println(smartCast(b))
    val c = 3.0
    println(smartCast(c))
    val d = ObjectSample2.initObjectSample()
    println(smartCast(d))
    val e = true
    println(smartCast(e))
}

fun smartCast(param: Any): String {
    return when(param) {
        is Int -> "$param is a Int"
        is String -> "$param is a String"
        is Double -> "$param is a Double"
        is ObjectSample2 -> "$param is a Instance of Object"
        else -> "Unknown type"
    }
}