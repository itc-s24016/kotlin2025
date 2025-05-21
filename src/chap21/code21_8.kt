package chap21
//関数(簡略化:複数の引数)
fun main() {
    val answer = getTimes(2, 3)
    println(answer)
}

fun getTimes(x: Int, y: Int): Int = x * y