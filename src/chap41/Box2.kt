package chap41
//ジェネリクス(どんな型でも扱えるリストのクラス2)
class Box2<L, C> {
    //ここで型を詳しく書かないことで、ラベル名もコンテンツも自由に型を決められる
    var l: L? = null
    var c: C? = null

    fun setValues(l: L, c: C) {
        this.l = l
        this.c = c
        println("${l}: ${c}")
    }
}