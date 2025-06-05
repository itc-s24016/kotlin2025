package chap40
//メンバ参照(::メソッド名)
class Person2(val name: String, val age: Int){
    //同じクラス内にあるなら(::moreYearsAT)のように型名を省ける
    //クラス内のメソッドで、::メソッド名とするとそのメソッドを実行しているインスタンスのメソッドを実行する関数オブジェクトが参照できる
    fun greet() {
        println("${name}(${age})")
        at18year(::moreYearsAt)
    }
    fun greet2() {
        println("${name}(${age})")
        at30year(::moreYearsAt)
    }
    fun moreYearsAt(year: Int): Int {
        return year - age
    }
}

fun at18year(action: (Int) -> Int){
    println("18まで、あと${action(18)}年です")
}
fun at30year(action: (Int) -> Int){
    println("30まで、あと${action(30)}年です")
}

fun main(){
    val p1 = Person2("ユミ", 8)
    val p2 = Person2("ケンタ", 5)
    p1.greet()
    p2.greet2()
}