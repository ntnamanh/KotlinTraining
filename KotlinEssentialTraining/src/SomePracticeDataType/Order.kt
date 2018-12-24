package SomePracticeDataType

class Order {

    var listOrder = ArrayList<Detail>()

    fun addDrinkAndQuality(drinkName: String, quality: Int) {
        val detail = Detail(drinkName, quality)
//        if(checkDuplicateDrink(drinkName)){
            listOrder.add(detail)
  //      }
    }

//    fun checkDuplicateDrink(SomePracticeDataType.name: String, quality: Int): Boolean {
//        for (x in listOrder) {
//            if(x.drinkName == SomePracticeDataType.name) {
//                x.quality
//                return false
//            }
//        }
//        return true
//    }
}

data class Detail(private val _drinkName: String,private val _quality: Int) {
    var drinkName: String? = _drinkName
    var quality: Int? = _quality
}


