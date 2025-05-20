package chap17
//mutableListの宣言の仕方まとめ
fun main() {
    val a: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    val b = mutableListOf(1, 2, 3, 4, 5)

    //空のリストを用意したい...
    //val c = mutableListOf()         //これはダメ
    val d = mutableListOf<String>() //こう記述する

}