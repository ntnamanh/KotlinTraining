package practiceCollections


fun main(a : Array<String>) {
//    val colorList = listOf("Red", "Green", "Blue", 123, true, false, 5.3)
//    println(colorList)
//
//    println("Number of color: ${colorList.size}")
//    println(colorList::class.simpleName)

//    val mutableList = mutableListOf(3, "abc", true, 4.5, listOf("abc", "dec"), ClothingItem("abc", "cdf", 3.5))
//    mutableList.add("xyz")
//    mutableList.forEach(::println)
//    mutableList.forEach {it ->
//        println(message = it::class.simpleName)
//    }

    val mulListString = mutableListOf("abc", "hjk", "edg")

    mulListString.sort()
//    println(mulListString)

    print(mulListString.any { it == "abc" })
}