package chap30
//abstract用クラス
class Ferrari(color: String) : Car(color){
    override fun drive(d: Double) {
        distance += d
        println("${color} のフェラーリが走っています！ブウォォォォーン！")
        println("おおっ、カッコいい！！！")
        println("マイレージは ${distance} キロになったぜい！")
    }
}