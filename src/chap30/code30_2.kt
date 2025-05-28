package chap30
//abstract で継承成功例
fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    car1.drive(10.0)
    car2.drive(10.0)
}