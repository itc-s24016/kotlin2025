package chap43
//可視性識別子(private の動作確認)
fun main() {
    val car = Car("赤")
    repeat(51, { car.drive() })
    //この記述だと参照出来ない　Kotlin: Unresolved reference 'letEnginWork'.
//    car.letEnginWork()
//    println(car.fuel)
}