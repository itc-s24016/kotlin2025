package chap29
//ポリモーフィズムを活用しているコード
fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")

    //一つのメソッドで呼び出すことができるようになった
    driveByCar(car1)
    driveByCar(car2)
}

//Ferrari も Prius も Car クラスを継承しているという「共通点」がある
fun driveByCar(car: Car){
    car.drive(100.0)
}
