package chap07
//論理演算(xor)

fun main() {
    //不揃いのときに true になる
    println("true xor true: ${true xor true}")
    println("true xor false: ${true xor false}")
    println("false xor true: ${false xor true}")
    println("false xor false: ${false xor false}")

    //ド・モルガンの法則
    val a = true
    val b = false

    !a && !b == !(a || b)
    !a || !b == !(a && b)
}