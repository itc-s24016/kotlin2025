package chap21
//関数(戻り値無し)
fun main() {
    getTimes2(2, 3, 4)
}

//: Unit は書かなくてもいい
fun getTimes2(x: Int, y: Int, z: Int): Unit {
    println("パラメータとして、${x} と ${y} と ${z} を受け取りました")
    println("これらの値を全部掛け算した答えは ${x * y * z} です")
}