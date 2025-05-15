package chap12
//when文の使い方_1
import kotlin.random.Random

fun main() {
    val x = Random.nextInt(1, 5)
    when (x) {
        1, 2 -> {println("ワンかツーのどちらかです")}
        3    -> {println("スリー")}
        else -> {println("ワン、ツー、スリー以外の数字です")}
    }
}