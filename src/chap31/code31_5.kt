package chap31
//デモ
fun main() {
    val person = FlyingPerson("タケシ", 5)
    val car = FlyingCar("赤")
    makeItFly(person)
    makeItFly(car)
}
/*
fun makeItFly(a: Flyable){
    a.fly()
}*/
