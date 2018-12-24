package practiceCollections

import practiceCollections.CartOperators.*
import practiceCollections.Exception.Companion.fail
import SomePracticeDataType.ClothingItem
import java.text.NumberFormat
import java.util.*

fun main(a: Array<String>) {
    val cart = mutableMapOf<ClothingItem, Int>()
    while(true) {
        println("Do you want to keep using using our service y/n?")
        val answer = readLine()
        when(answer) {
            "y" -> addToCart(cart)
            "n" -> return
        }
    }
}

@Suppress("UNUSED_EXPRESSION")
fun addToCart(map: MutableMap<ClothingItem, Int> ): Boolean {

    println("Please choose operator add, remove, sum up!")
    val operator = readLine()
    when(operator) {
        ADD.operators-> {
            add(map)
            return true
        }
        REMOVE.operators -> {
            remove(map)
            return true
        }
        SUM.operators -> {
            sumUp(map)
            return false
        }
        else -> {
            println("invalid command")
            return true
        }
    }
}

fun add(cart:  MutableMap<ClothingItem, Int>) {

    val clothingItem = ClothingItem.createItem()

    println("input quantity:")

    val q = readLine()?.toIntOrNull() ?: fail("variable required")

    for ((item, quantity) in cart) {
        if (item._type == clothingItem._type && item._size == clothingItem._size) {
            cart[clothingItem] = quantity.plus(q)
        }
    }
    cart[clothingItem] = q
}



fun remove(cart: MutableMap<ClothingItem, Int>) {

    val clothingItem = ClothingItem.createItem()

    val q = readLine()?.toIntOrNull() ?: fail("variable required")

    if(!cart.containsKey(clothingItem)) {
        println("This item does not exist")
        return
    }
    for ((item, quantity) in cart) {
        if (item._type == clothingItem._type && item._size == clothingItem._size) {
            when {
                quantity > q -> {
                    cart[clothingItem] = quantity.minus(q)
                    return
                }
                quantity == q -> cart.remove(clothingItem).let { return }
                else -> println("Invalid input quantity").let { return }
            }
        }
    }
}


fun sumUp(cart: Map<ClothingItem, Int>) {
    if(cart.isEmpty()) return

    var total = 0.0
    Locale.setDefault(Locale.FRANCE)
    val formatter = NumberFormat.getCurrencyInstance()
    for ((item, quantity) in cart) {
        val itemTotalPrice: Double = quantity * item._price
        println("This ${item._type} costs ${formatter.format(itemTotalPrice)}")
        total += total + itemTotalPrice
    }

    println("The total is ${formatter.format(total)}")
    println("Thank for using our service!!!")
}
