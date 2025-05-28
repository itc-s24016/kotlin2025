package chap29
//ポリモーフィズムを使っていないコード
fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByFerrari(car1)
    driveByPrius(car2)
}

//別々の関数名にする
fun driveByFerrari(car: Ferrari){
    car.drive(100.0)
}

fun driveByPrius(car: Prius){
    car.drive(100.0)
}