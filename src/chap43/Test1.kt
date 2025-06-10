package chap43
//可視性識別子
fun main() {
    //実行可能
    testPublic()

    //testPrivate()
    //private だと参照できないので、下記のやり方で間接的に呼び出す
    testPublic2()

    val a = TestPublic()
    //val b = TestPrivate()
    val b = a.testClass
    println(b)
}