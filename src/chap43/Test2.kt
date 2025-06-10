package chap43
//可視性識別子
public fun testPublic() {
    println("可視性識別子が public です")
}

private fun testPrivate() {
    println("可視性識別子が private です")
}

//同じファイル内なら private も呼び出せる
fun testPublic2() {
    println("===\npublic な関数から private の関数を呼び出してみた")
    testPrivate()
    println("===")
}

public class TestPublic(){
    //これは出来ない
    //val privateObj = TestPrivate()
    //こうならできる
    private val privateObject = TestPrivate()
    val testClass: TestAbstract = privateObject
}

//抽象クラス
abstract class TestAbstract

//サブクラスとして作成する
private class TestPrivate() : TestAbstract(){}