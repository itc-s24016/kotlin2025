package jp.ac.it_college.std.s24016.example.cars
//パッケージ用クラス
open class Car(val color : String) {
    open fun drive() {
        println("${color}の車が走っています")
    }
}