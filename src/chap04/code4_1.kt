package chap04
//Kotlinが扱える数値の基本型

/**
 * 型名が灰色になっているもの(Int, Long等)は型推論が可能
 * 「明示的に指定された型はここでは冗長です」って言われる
 */

fun main(){
    val a: Byte = 100
    val b: Short = 10000
    val c: Int = 1000000000
    val d: Long = 1000000000000000000L
    val e: Float = 0.123f
    val f: Double = 0.123456789
    val g: UByte = 200u
    val h: UShort = 40000u
    val i: UInt = 3000000000U
    val j: ULong = 10000000000000000000u

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)
    println(j)
}
