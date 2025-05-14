package chap07
//変数の中に条件式を記述する
fun main() {
    val x = 75
    val a = x >= 50 && x <= 100
    val b = x < 50 || x > 100
    println("変数 x が 50 から 100 の範囲内にある: ${a}")
    println("変数 x が 50 から 100 の範囲外にある: ${b}")
}