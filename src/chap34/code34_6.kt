package chap34
import kotlin.math.sqrt
//null 許容型(if と retrun)
fun main() {
    val number1 = null
    val number2 = 10

    printCubicSquareRoot(number1)
    printCubicSquareRoot(number2)
}

fun printCubicSquareRoot(num: Int?){
    /* 【 よくある書き方 】
    null が入るかもしれない許容型のときは、
    真っ先に null の場合の処理を書いて、
    else の変わりに return を書くことで、
    null の場合は if を通ったあとすぐに終了、
    そうじゃないなら先のプログラムを読み込んで実行していくという
    分岐になる*/
    if (num == null){
        println("null なのでなにもしない")
        return //ここで強制終了になる
    }
    val result = sqrt((num * num * num).toDouble())
    println("${num} を3乗した数の平方根は ${result} です")
}