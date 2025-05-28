package chap29
//ポリモーフィズム用クラス
class Prius(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color} のプリウスが走っています！スィーン！")
        println("すごい静かですね！")
        println("マイレージは ${distance} キロです")
        println("トヨタの車はいっぱい走ってもなかなか故障しません！")
    }
}