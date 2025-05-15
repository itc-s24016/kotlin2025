package chap12
//when文
fun main() {
    val x = "Hello"

    //Java における swhich文と同じ
    //※一つマッチするものがあると他は実行せずに終了するので break が存在しない
    when (x) {
        "GoodMorning" -> println("おはようございます")
        "Hello" -> println("こんにちは")
        "Good Evening" -> println("こんばんは")
        else -> println("どうも！")
    }
}