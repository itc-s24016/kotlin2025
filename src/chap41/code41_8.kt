package chap41
//ジェネリクス(クラスとリスト生成を一箇所で行う)
class Box3<L, C>(val l: L? = null, val c: C? = null){}

fun main(){
    val box = Box3("ラベル", 12345)
}