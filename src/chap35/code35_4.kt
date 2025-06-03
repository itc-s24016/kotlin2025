package chap35
//データクラス(== の処理をカスタムする方法)
class Person2(val name: String, val myNumber: Int){
    //ctrl + o で生成される
    override fun equals(other: Any?): Boolean {
        return (other != null
            && other is Person2
            && this.name == other.name
            && this.myNumber == other.myNumber)
    }
}//データの中身を一つずつチェック = すべてOKなら同じ(==)として扱う

fun main() {
    val p1 = Person2("タケシ", 1234)
    val p2 = Person2("タケシ", 1234)

    println("p1のハッシュコード: ${p1.hashCode()}")
    println("p2のハッシュコード: ${p2.hashCode()}")

    if (p1 == p2){ println("二人は同一人物です") }
    else { println("二人は別人です") }
    /*
    同一人物判定になったが、ハッシュ値は異なる値になっている
    これだと、map, set を使うときに異常が起こる

    Set はデータが重複しないように格納されるはずが、
    p1 p2 のハッシュ値が異なるため、違うデータとして扱われている
    */
    val person2Set = setOf(p1, p2)
    println(person2Set)
}