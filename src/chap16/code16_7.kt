package chap16
//リストを for でまわす(.withIndex())
fun main() {
    val a: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400, 3000, 3800)

    //インデックスと要素を取得する
    //一つの変数で扱う
    for (money in a.withIndex()) {
        println("${money.index}: 時給は ${money.value} 円です")
    }

    //2つの変数で扱う
    for ((index, money) in a.withIndex()) {
        println("${index}: 時給は ${money} 円です")
    }
}
