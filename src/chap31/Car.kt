package chap31
//インターフェースを実装する
open class Car (val color: String){
    fun greet(){
        println("${color} 色の車です")
    }
}