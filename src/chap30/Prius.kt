package chap30
//abstract用クラス
class Prius(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color} のプリウスが走っています！スィーン！")
        println("すごい静かですね！")
        println("マイレージは ${distance} キロです")
        println("トヨタの車はいっぱい走ってもなかなか故障しません！")
    }

    //Prius 独自の内容を記述しないと、Car クラスの内容が返される
}