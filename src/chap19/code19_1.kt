package chap19
//Map_1
fun main() {
    val map: Map<String, String> = mapOf(
        "Pen" to "ペン",
        "Apple" to "アップル",
        "Pineapple" to "パイナップル"
    )
    println(map["Pen"])
    println(map["Pineapple"])
    println(map["Apple"])
    println(map)
}