package chap35
//データクラス(データクラスでデータを扱うメリット)
data class Person(val name: String, val number: Int)

fun main() {
    val p1 = Person("タケシ", 1234)
    val p2 = Person("タケシ", 1234)

    println("p1のハッシュコード: ${p1.hashCode()}")
    println("p2のハッシュコード: ${p2.hashCode()}")

    if (p1 == p2){ println("二人は同一人物です") }
    else { println("二人は別人です") }

    val person2Set = setOf(p1, p2)
    println(person2Set)
    /*
    ハッシュ値も一緒、set で扱っても正常に動くようになる
    println() で生成される toString() もいい感じに表示してくれる
    Before:[chap35.Person2@34a245ab, chap35.Person2@7cc355be]
    After :[Person(name=タケシ, number=1234)]
    */
}