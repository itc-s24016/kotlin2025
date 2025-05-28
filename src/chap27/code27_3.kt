package chap27
//クラスの継承
//code27_1 の Car クラスを継承している
class Ferrari(color: String) : Car(color)

fun main() {
    val car = Ferrari("赤")
    car.drive(5.0)
    car.drive(10.0)
}