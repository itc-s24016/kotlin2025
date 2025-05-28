package chap29
//ポリモーフィズムを少しを使っているコード
fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")

    //同じメソッド名で呼び出すことができるようになった
    driveByCar(car1)
    driveByCar(car2)
}

fun driveByCar(car: Ferrari){
    println("Ferrari 対応の driveByCar が呼ばれました")
    car.drive(100.0)
}

fun driveByCar(car: Prius){
    println("Prius 対応の driveByCar が呼ばれました")
    car.drive(100.0)
}