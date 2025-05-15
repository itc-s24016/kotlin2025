package chap12
//when文の使い方_2
import kotlin.random.Random

fun main() {
    val x = Random.nextInt(1, 5)
    val message = when (x) {
        1 -> "ワン"
        2 -> "ツー"
        3 -> "スリー"
        else -> "ワン、ツー、スリー以外の数字です"
    }
    println(message)
}