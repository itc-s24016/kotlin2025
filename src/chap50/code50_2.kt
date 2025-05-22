package chap50
//forEach_1
//code13_2 を置き換えてみる
fun main() {
    val x = 5
    (1..9).forEach {
        println("${x} × ${it} は ${x * it} です")
    }
}