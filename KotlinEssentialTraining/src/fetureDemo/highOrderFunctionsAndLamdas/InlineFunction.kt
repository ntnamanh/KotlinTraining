package fetureDemo.highOrderFunctionsAndLamdas

fun main(args: Array<String>) {

    val b: (Int, Int) -> Int = { x, y -> x + y}
    println(b(3,4))

    twoAndThree(3,4, 5, {a, b, c -> add(a, b, c) }, "k", "m", "s", {a, b, c -> combineString(a, b, c) })
}

fun combineString(s1: String, s2: String, s3: String): String {
    return s1 + s2 + s3
}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}


fun twoAndThree(
        a: Int,
        b: Int,
        c: Int ,
        f: (Int, Int, Int) -> Int,
        s1: String,
        s2: String,
        s3: String,
        f2: (String, String, String)-> String) {
    val result = f(a,b,c)
    val resultOfString = f2(s1, s2, s3)
    println("The result is $result")
    println("The string is $resultOfString")
}





