package chap07
//論理演算(||_2)
fun main() {
    val delicious = true
    val cheap = false
    println("このレストランは美味しい:${delicious}")
    println("このレストランは安くない:${cheap}")

    val letsEat = delicious || cheap
    println("食事する？:${letsEat}")
}