package chap12
//when文
fun main() {
    val x = "Hello"

    //Java における swhich文と同じ
    when (x) {
        "GoodMorning" -> println("おはようございます")
        "Hello" -> println("こんにちは")
        "Good Evening" -> println("こんばんは")
        else -> println("どうも！")
    }
}