package chap07
//論理演算(not)
fun main() {
    val a = true
    val b = !a //not a = true じゃなく false に反転する
    val c = !b //not b = false じゃなく true に反転する

    println("a の値は ${a} です")
    println("b の値は ${b} です")
    println("c の値は ${c} です")
}