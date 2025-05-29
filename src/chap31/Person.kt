package chap31
//インターフェースを実装する
open class Person (val name: String, var age: Int){
    fun greet(){
        println("${name} です! ${age} 歳です！")
    }
}