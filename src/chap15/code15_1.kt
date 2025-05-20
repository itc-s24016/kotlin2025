package chap15
//while(break)
import kotlin.random.Random

fun main() {
    while (true){
        val value = Random.nextInt(100)
        if (value < 10) {
            break
        }
        println("乱数：${value}")
    }
}