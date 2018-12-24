package practiceCollections

import java.util.*

fun main(a: Array<String>) {
//    val set = setOf<String>("b", "a", "c", "d", "e")
//  //  val set2 = setOf<String>("a","x", "y", "z")
//
//    val text = """
//    for (c in "foo")
//        print(c)
//"""
//
    val binaryReps = TreeMap<Char, String>()
    for(x in 'A'..'F') {
        val binary = Integer.toBinaryString(x.toInt())
        binaryReps[x] = binary
    }

    for((char, string) in binaryReps) {
        println("$char = $string")
    }

    val l = mutableListOf("10", "15", "234")

    for ((index, element) in l.withIndex()) {
        println("$index = $element")
    }

//    val num = TEST

//
// TEST   println(text)
//    println(set.drop(1))

}

//fun requestTokent(post: Post) {
//
//}

//fun <T> powerset(set: Set<T>): Set<Set<T>> =
//    if (set.isEmpty()) setOf(emptySet())
//    else {
//        val powersetOfRest = powerset(set.drop(1))
//        powersetOfRest + powersetOfRest.map { it + set.first() }
//    }
