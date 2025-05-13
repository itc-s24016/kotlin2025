package chap05
//文字と文字列1

//Charは１文字だけ文字を格納するが、Stringは文字列を格納可能
//変数の中に変数を入れ込む
fun main() {
    val world = "世界！"
    val message= "こんにちは、$world"
    println(message)
}
