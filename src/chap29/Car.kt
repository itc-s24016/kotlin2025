package chap29
//ポリモーフィズム用クラス
open class Car(val color: String) {
    var distance = 0.0
    open fun drive(d: Double) {
        this.distance += d
        println("${color} の車が ${distance}km 走りました")
        println("その結果、マイレージは ${distance}キロ になりました")
    }
}