package practiceCollections

class Exception {
    companion object {
        fun fail(message: String): Nothing {
            throw IllegalAccessException(message)
        }
    }
}