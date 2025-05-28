package chap27
//継承
//open class = 継承可能なクラスという目印
//open fun = オーバーライド可能なメソッド
//override fun = オーバーライドしているメソッド
//final override fun = オーバーライドされた先でオーバーライドされないようにする

open class Car(val color: String){
    var distance = 0.0
    open fun drive(d: Double){
        distance += d
        println("${color} の車が ${d}km 走りました")
        println("マイレージは ${distance}キロ になりました")
    }
}

/*
fun main() {
    val car = Car()
    car.drive(5.0)
    car.drive(10.0)
}*/
