package fetureDemo.highOrderFunctionsAndLamdas

import fetureDemo.basic.ObjectSample2
import fetureDemo.dslDemo.java.Person
import fetureDemo.dslDemo.java.PersonDto
import java.time.Instant
import java.time.LocalDate
import java.util.*


fun main(args: Array<String>) {

    val add : ((Int, Int) -> Int) = {x , y -> x + y}
    val remove : (Int, Int) -> Int = {x, y -> x - y }
    val time : (Int, Int) -> Int = {x , y -> x * y}
    val div : (Int, Int) -> Int = {x , y -> x / y}

    println(fun1(param1 = 4, param2 = 2, operator = { a, b -> a + b}))
    println(fun1(param1 = 4, param2 = 2, operator = { a, b -> add(a, b)}))
    println(fun1(param1 = 4, param2 = 2, operator = { a, b -> a - b}))
    println(fun1(param1 = 4, param2 = 2, operator = { a, b -> remove(a, b) }))
    println(fun1(param1 = 4, param2 = 2, operator = { a, b -> a * b}))
    println(fun1(param1 = 4, param2 = 2, operator = { a, b -> time(a, b) }))
    println(fun1(param1 = 4, param2 = 2, operator = { a, b -> a / b}))
    println(fun1(param1 = 4, param2 = 2, operator = { a, b -> div(a, b)}))
}

fun add2Num(param1: Int, param2: Int) = param1 + param2

fun fun1(param1: Int, param2: Int ,operator: ((Int, Int) -> Int)): Int {
    return operator(param1, param2)
}



