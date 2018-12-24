package SomePracticeDataType

data class ClothingItem constructor(val _type: String,
                                    val _size: String,
                                    val _price: Double) {

    companion object {
        fun createItem(): ClothingItem {
            println("Input type:")
            val type = readLine() ?: fail("variable required")
            println("Input size:")
            val size = readLine() ?: fail("variable required")

            return ClothingItem(type, size, 15.0)
        }
    }

}