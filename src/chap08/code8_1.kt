package chap08
//OverFlowの話_1
fun main() {
    //100
    val original: Int = 100

    val a: Byte = original.toByte()
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