package SomePracticeDataType

class OperatorObject(val x: Int, val y: Int ) {
//
    operator fun inc(): OperatorObject {
        return OperatorObject(x+5, y+6)
    }


    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is OperatorObject) return false
        return other.x == x && other.y == y
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }




}