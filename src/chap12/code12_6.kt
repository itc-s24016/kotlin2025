package chap12
//whenの演習問題
import kotlin.random.Random
/*
code11_13 のプログラムを when で再実装してください
*/
fun main() {
    val score = Random.nextInt(0, 100)

    val borderC = 60
    val borderB = 70
    val borderA = 80
    val borderS = 90

    val judge = when (score) {
        in 0..<borderC -> "D"
        in borderC..<borderB -> "C"
        in borderB..<borderA -> "B"
        in borderA..<borderS -> "A"
        else -> "S"
    }
    println("score ${score}: ${judge}")
}