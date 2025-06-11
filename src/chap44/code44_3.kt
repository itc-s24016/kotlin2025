package chap44
//拡張関数
fun main() {
    /*
    //Stringクラスを継承し、新しいクラス、メソッドを作ろうとしているが実行出来ない
    val text = MyString("勉強")
    val message = text.getOneTwoFiveMessage()
    println(message)
    //コンパイルエラー：Kotlin: This type is final, so it cannot be extended.
    */

    val text = "勉強"
    val message = text.getOneTwoFiveMessage()
    println("記述法１：${message}")
    println("記述法２：${text.getOneTwoFiveMessage}")
}
/*
class MyString(a: String): String(a){
    fun getOneTwoFiveMessage() = "一に${this}、二に${this}、三四がなくて五に${this}"
}*/

//拡張関数の記述の仕方
fun String.getOneTwoFiveMessage(): String = "一に${this}、二に${this}、三四がなくて五に${this}"

//こうも記述できる
val String.getOneTwoFiveMessage: String
    get() = "一に${this}、二に${this}、三四がなくて五に${this}"