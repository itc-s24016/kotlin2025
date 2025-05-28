package chap25
//コンストラクタ
fun main() {
    val p = Person("タケシ", 5)
    p.greet()

    //プロパティ名を明示的に書く：違う順番で書ける
    val p2 = Person(age = 8, name = "ケンタ")
    p2.greet()

    //何も指定しない：プロパティの初期値が返る
    val p3 = Person()
    p3.greet()
    //あとから渡すことが可能(varの場合のみ)
    p3.age = 12
    p3.greet()

    //一つだけ渡す：可能
    val p4 = Person(name = "Hoge")
    p4.greet()
}

//constructor は記述しなくてもいい
class Person constructor(val name: String="名無し", var age: Int = 0) {
    fun greet() {
        println("${name} です ${age} 歳です")
    }

}
