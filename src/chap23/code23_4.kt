package chap23
//クラス
fun main() {
    val p = Person()
    p.name = "タケシ"
    p.age = 5
    p.greet()
}

class Person {
    var name: String = ""
    var age: Int = 0
    fun greet(){
        println("""
            |こんにちは！
            |私の名前は ${name} です
            |年齢は ${age} 歳です
        """.trimMargin())
    }
}