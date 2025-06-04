package chap37
//関数オブジェクト(無名関数)
fun main() {
    val p = fun(x: Double, y: Double): Double = x + y
    val m = fun(x: Double, y: Double): Double = x - y

    printRandomValuesCalculation(p)
    printRandomValuesCalculation(m)
    /*
    val p = ::calculatePlus
    fun calculatePlus(x: Double, y: Double) = x + y
                   ▼
             関数名を省くと...
    val p = ::_____________
    fun _____________(x: Double, y: Double) = x + y
                   ▼
            余分なものを削除し、
    val p =
    fun(x: Double, y: Double) = x + y
                   ▼
              　合体させると
    val p = fun(x: Double, y: Double): Double = x + y  */
}