package chap50
//forEach_2
fun main() {
    val a = listOf("こんにちは", "Kotlin", "どうぞ", "よろしく")

    println("forEach 使う方法１")
    a.forEach { println(it) }

    println("forEach 使う方法２")
    a.forEach (::println)
}