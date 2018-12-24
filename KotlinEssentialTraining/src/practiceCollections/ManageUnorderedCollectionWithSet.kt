package practiceCollections

fun main(a: Array<String>) {
    var colorSet = mutableSetOf("abc", "Green", "Blue")
    println(colorSet)

    colorSet.add("Purple")
    colorSet.remove("abc")
    println(colorSet)
    var colorList = colorSet.toMutableList()
    colorList.removeAt(0)
    println(colorList)

    colorSet.add("Green")
    println(colorSet)
}