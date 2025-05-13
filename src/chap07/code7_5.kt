package chap07
//論理演算(&&_4)
fun main() {
    val delicious = false
    val cheap = false
    println("このレストランは美味しくない:${delicious}")
    println("このレストランは安くない:${cheap}")

    val letsEat = delicious && cheap
    println("食事する？:${letsEat}")
}