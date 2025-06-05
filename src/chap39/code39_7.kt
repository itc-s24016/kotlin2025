package chap39
//ラムダ式(戻り値の説明)
import kotlin.random.Random
fun main() {
    val randomSuffix = nameString()
    println(randomSuffix("タケシ No."))

    //こう書くこともできる
    val custom: (String) -> String = { it + Random.nextInt(100) }
    println("${custom("タケシ No.")} New!")
}
fun nameString(): (String) -> String {
    return {
        val randomNumber = Random.nextInt(100)
        it + randomNumber //最後の１文が return になる
    }
}