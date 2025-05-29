package chap31
//Car を継承したクラス
open class FlyingCar(color: String) : Car(color), Flyable {
    override fun fly() {
        println("すごい！車が空を飛んでいます")
    }
}