package SomePracticeDataType

fun main(a: Array<String>) {

    val a = mutableListOf<String>("a", "b", "c").joinToString{it.toUpperCase()}
    println(a)
}