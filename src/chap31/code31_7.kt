package chap31
//Flyable を実装して実行
class FlyingVehicle : Flyable

fun main() {
    val person = FlyingPerson("タケシ", 5)
    val car = FlyingCar("赤")
    val vehicle = FlyingVehicle()
    makeItFly(person) //Car のメッセージ
    makeItFly(car)    //Person のメッセージ
    vehicle.fly()         //Flyable のメッセージ
}
fun makeItFly(a: Flyable){
    a.fly()
}