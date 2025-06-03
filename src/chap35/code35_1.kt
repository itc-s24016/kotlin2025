package chap35
//データクラス(通常クラスでデータを扱うデメリット)
class Person1(val name: String, val myNumber: Int)
fun main() {
    //この時点で異常はない
    val p1 = Person1("タケシ", 1234)
    val p2 = Person1("ケンタ", 5678)

    println("p1:タケシ, p2:ケンタ")
    if (p1 == p2){ println("二人は同一人物です") }
    else { println("二人は別人です") }

    //データはすべて一致するのに別人判定になってしまう
    val p3 = Person1("タケシ", 1234)
    val p4 = Person1("タケシ", 1234)

    println("p3:タケシ, p4:タケシ")
    if (p3 == p4){ println("二人は同一人物です") }
    else { println("二人は別人です") }
}