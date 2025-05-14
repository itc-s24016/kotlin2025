package chap08
//例外とは
fun main() {
    //String
    val original: String = "あいうえお"

    val a: Byte = original.toByte()  //ここで Byte に変換できずに NumberFormatException が起こる
    val b: Short = original.toShort()
    val c: Int = original.toInt()
    val d: Long = original.toLong()
    val e: Float = original.toFloat()
    val f: Double = original.toDouble()
    val g: String = original.toString()
    val h: UByte = original.toUByte()
    val i: UShort = original.toUShort()
    val j: UInt = original.toUInt()
    val k: ULong = original.toULong()

    println("a = ${a}")
    println("b = ${b}")
    println("c = ${c}")
    println("d = ${d}")
    println("e = ${e}")
    println("f = ${f}")
    println("g = ${g}")
    println("h = ${h}")
    println("i = ${i}")
    println("j = ${j}")
    println("k = ${k}")
}