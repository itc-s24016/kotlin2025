package chap40
//メンバ参照(maxBy, minBy)
class Person(val name: String, val age: Int){
    fun greet() {
        println("${name}です, ${age}歳です")
    }
    fun displayName(): String {
        return "${name}(${age})"
    }
}


fun main() {
    val p1 = Person("タケシ", 5)
    val p2 = Person("ユミ", 8)

    val list = listOf(p1, p2)
//    val pMax = list.maxBy { p: Person -> p.age }
    val pMax = list.maxBy ( Person::age )
    print("最年長 < ")
    pMax.greet()

    //すごい長いエラーが出たので、
    //メインメニュー > ビルド > プロジェクトの再ビルド
    val nameFunc = Person::displayName
    println(nameFunc(pMax))
}