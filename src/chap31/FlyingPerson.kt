package chap31
//Person を継承したクラス
open class FlyingPerson(name: String, age: Int) : Person(name, age), Flyable {
    override fun fly() {
        println("まさか！人間が空を飛んでいます")
    }
}