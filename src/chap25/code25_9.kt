package chap25
//プライマリコンストラクタ
fun main() {
    val p1 = Person2("タケシ", 10)
}

class Person2(val name: String, var age: Int){
    init {
        println("コンストラクタのイニシャライザが呼ばれました")
        greet()
    }
    fun greet() {
        println("${name} です ${age} です")
    }
}