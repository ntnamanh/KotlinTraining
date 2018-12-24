package fetureDemo.basic

import org.jetbrains.annotations.NotNull

fun main(args: Array<String>) {
//    val objectSample = ObjectSample(id = "id_123", item1 = "abc", item2 = "abc", item3 = "abc", item4 = "abc")
//    objectSample.id

    val objectSample2 = ObjectSample2("abc","abc","abc")
    println(objectSample2.id)
    objectSample2.id = "xyz"
    println(objectSample2.id)
}

data class ObjectSample (@NotNull val id: String, private val item1: String, private val item2: String, val item3: String?, val item4: String?)

class ObjectSample2  (@NotNull val _id: String, val _item1: String, val _item2: String) {

    lateinit var objectSample : ObjectSample

    var id: String? = null
        get() = field + "123"
        set(value) {
            field = value + "abc"
        }

    private var item1: String
    private var item2: String? = null

    init {
        id = _id.capitalize()
        item1 = _item1.capitalize()
        item2 = _item2.capitalize()
//        println(id)
//        println(item1)
//        println(item2)
    }

    constructor(ob: ObjectSample) : this(ob.id, ob.item3!!, ob.item4!!)

    companion object {
        fun initObjectSample(): ObjectSample2 = ObjectSample2("id_123", "item1", "item2")
    }

}



//Constructor

//fun main(args: Array<String>) {
//    AuthLog("abc")
//}

open class Log {
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String)

    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}

class AuthLog: Log {
    constructor(_data: String): this("From AuthLog -> " + _data, 10)

    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData)
}

//Getter and Setter
//fun main(args: Array<String>) {
//
//    val  person = Person()
//    println(person.id)
//    person.id = "a"
//    println(person.id)
//    person.id = "kms"
//    println(person.id)
//}

class objectTest{
    var id : String? = null
    get() {
        return if(field != null) field else "id is null"
    }
    set(value) {
        field = if(value.equals("kms")) {
            value
        } else {
            "Unknown"
        }
    }

}

