package chap34
//スマートキャスト
import chap33.Car

fun main() {
    val number = 123
    val text = "あいうえお"
    val car = Car("赤")
    val person = Person("タケシ", 5)

    printClassInfo(number)
    printClassInfo(text)
    printClassInfo(car)
    printClassInfo(person)
}

//引数の型を Any にした = どんな型の引数でも渡せるようになる
fun printClassInfo(obj: Any) {
    val hashcode = obj.hashCode()
    val text = obj.toString()
    println("テキスト = ${text}、　ハッシュコード = ${hashcode}")

    //こんなこともできる
    if (obj is Person) {
        println("↑ これは Person クラスのインスタンスです")
        obj.greet()
    }else if (obj is Car) {
        println("↑ これは Car クラスのインスタンスです")
        obj.drive()
    }
}

class Car(var color: String){
    fun drive(d: Double){
        println("${color} の車が ${d}km 走りました")
    }
}
class Person(var name: String, var age: Int){
    fun greet(){
        println("${name} です  ${age} 歳です")
    }
}