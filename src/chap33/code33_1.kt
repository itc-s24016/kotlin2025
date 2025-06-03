package chap33
//Anyクラス
open class Car(val color: String){
    open fun drive(): String {
        return "${color}の車が走る！"
    }
}
    /*
    Any     = Carクラスの親クラス(自動生成)
    Car     = Priusの親クラス
    Ferrari = Carクラスの子クラス

    open class Car(val color: String){
    じつは省略されていた ▼
    open class Car(val color: String):Any(){
    */
    class Ferrari(color: String) : Car(color)

fun main() {
    val car = Car("赤")
    println(car.drive())
    println(car.drive().toString())

    /*
    println() は、Kotlin が自動的に toString() を呼び出していた
    ・データクラス(自動生成されるメソッド類)
    toString(), equals, hashCode()
     */
}