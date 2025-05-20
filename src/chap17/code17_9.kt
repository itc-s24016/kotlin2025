package chap17
//リストから削除
fun main() {
    val a: MutableList<String> = mutableListOf(
        "こんにちは", "Kotlin", "どうぞ", "よろしく"
    )

    a.removeAt(2)
    for ((i, x) in a.withIndex()) {
        println("${i} : ${x}")
    }
}