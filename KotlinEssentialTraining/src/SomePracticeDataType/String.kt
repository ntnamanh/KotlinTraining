package SomePracticeDataType

fun main() {
    var aString = "Hello"
    println(aString)

    val empty = String()
    println("'$empty'")
    val charArray = aString.toCharArray()
    println(charArray.toList())

    val byteArray = aString.toByteArray()
    println(byteArray.toList())

    aString  += " and good bye"
    println(aString)

    val len = aString.length

    for( i in 0 until len) {
        val c = aString[i]
        println(c)
    }

    val p = aString.indexOf("g")
    val c = aString.toCharArray().filter {x -> checkCharacter(x) }
    val h = fun(listChar: List<Char>): String {
        val result = StringBuilder()
        for( x in 0 until listChar.size) {
            result.append(listChar[x])
        }

        return result.toString()
    }

    val result = h(c)
    val sub = aString.substring(0, p)
    val sub2 = aString.substring(p, aString.length)
    val d = c
    println(result)

}

fun checkCharacter(char: Char): Boolean {
    return char != 'g'
}