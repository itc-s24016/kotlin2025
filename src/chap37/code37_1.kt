package chap37
//関数オブジェクト(説明)
import kotlin.random.Random
fun main() {
    //関数名の前にコロンを２つ書くことで、関数をオブジェクトとして変数に格納できる
    val p = ::calculatePlus
    val m = ::calculateMinus

    println(p(2.0, 3.0))
    println(m(2.0, 3.0))

    printRandomValuesCalculation(p)
    printRandomValuesCalculation(m)
}
fun calculatePlus(x: Double, y: Double) = x + y  //足し算関数
fun calculateMinus(x: Double, y: Double) = x - y //引き算関数

//乱数 x, y を使って、 渡された関数（p:足し算, m:引き算）を実行する関数
fun printRandomValuesCalculation(calculator: (Double, Double) -> Double) {
    val x = Random.nextDouble()
    val y = Random.nextDouble()
    val result = calculator(x, y)
    println("計算結果は ${result} です")
}
/* p(2.0, 3.0)
   m(2.0, 3.0) を関数内で用意しているイメージ*/