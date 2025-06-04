package chap37
//関数オブジェクト(無名関数各種)
fun main() {
    val p1 = fun(x: Double, y: Double) = x + y
    val p2 = fun(x: Double, y: Double): Double = x + y
    val p3 = fun(x: Double, y: Double): Double {return x + y}
    val p4: (Double, Double) -> Double = fun(x: Double, y: Double): Double {return x + y}
    val p5: (Double, Double) -> Double = fun(x, y) = x + y
    /* いろんな書き方( 結果は同じ )
    ・p4 が最も省略せずに書いた書き方
    ・{ } を使用する際は、必ず retune を書くこと    */

    printRandomValuesCalculation(p1)
    printRandomValuesCalculation(p2)
    printRandomValuesCalculation(p3)
    printRandomValuesCalculation(p4)
    printRandomValuesCalculation(p5)
}