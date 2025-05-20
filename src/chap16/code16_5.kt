package chap16
//リストを for でまわす(.count)
fun main() {
    val a: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400, 3000, 3800)

    //kotlin の .count() は必ず < になおすこと
    for (i in 0..< a.count()) {
        println("${i + 1}年目の時給は ${a[i]} 円です")
    }
}