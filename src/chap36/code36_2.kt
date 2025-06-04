package chap36
//スコープ(セッターを用いる)
fun main() {
    val p = Person1()
    p.greet()
}

class Person1{
    var name = "名無しさん"
    var age = 0

    fun greet() {
        val name = "ヒロシ"
        val age = 46
        println("${name} です　${age} 歳です")
    }
}