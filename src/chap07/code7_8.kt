package chap07
//論理演算(||_３)
fun main() {
    val delicious = false
    val cheap = true
    println("このレストランは美味しくない:${delicious}")
    println("このレストランは安い:${cheap}")

    val letsEat = delicious || cheap
    println("食事する？:${letsEat}")
}