    fun convert(x:Double,
            converter: (Double) -> Double) : Double {
        val result = converter(x)
        println("$x is converted to $result")
        return result
    }
   fun convertFie(converter: (Int) -> Double) : Double {
       val result = converter(5)
       println("5 is converted to $result")
       return result
   }
    fun main() {
        convert(20.0, { c: Double -> c * 1.8 + 32 })
        convertFie {it*1.8+32}
    }