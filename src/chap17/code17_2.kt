package chap17
//リストの表示の仕方まとめ
fun main() {
    //val a: List<Int> = listOf(1000, 1200, 1500)
    val a: IntArray = intArrayOf(1000, 1200, 1500)
    //Int の部分のことを「型パラメーター」という

    //インデックス指定
    println("1年目の時給は ${a[0]} です")
    println("2年目の時給は ${a[1]} です")
    println("3年目の時給は ${a[2]} です")

    //ループ
    for (money in a) {
        println("時給は ${money} です")
    }

    //インデックス付きループ
    for ((index, money) in a.withIndex()) {
        println("${index+1} 年目の時給は ${money} です")
    }

    //要素数に合わせてループ
    for (i in 0..< a.count()) {
        println("${i + 1}年目の時給は ${a[i]} 円です")
    }
}