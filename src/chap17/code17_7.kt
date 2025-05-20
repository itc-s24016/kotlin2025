package chap17
//リスト(MutableList) リストに追加
fun main() {
    val a: MutableList<String> = mutableListOf("こんにちは", "Kotlin", "よろしく")
    for ((i, x) in a.withIndex()) {
        println("${i} : ${x}")
    }
    println("------------")

    //インデックスを指定して追加していく
    a.add(2, "どうぞ")

    //リストの末尾に追加していく
    a.add("お願いします")

    //同様に末尾に追加していく
    a += "!"

    for ((i, x) in a.withIndex()) {
        println("${i} : ${x}")
    }
}