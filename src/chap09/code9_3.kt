package chap09
//valとvarの違い
/**
 * val:定数 var:変数
 */
fun main() {
    var a = 100
    println("a: ${a}")

    a = 101
    println("a: ${a}")

    /*
    もし val で実行すると...
    val b = 100
    b = 101
    結果：val cannot be reassigned.
     */
}