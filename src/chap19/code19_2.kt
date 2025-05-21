package chap19
//Map_2
fun main() {
    val map: Map<Char, Int> = mapOf(
        'a' to 1,
        'b' to 2,
        'c' to 3,
        'z' to 26
    )
    println(map['a'])
    println(map['b'])
    println(map['c'])
    println(map['z'])
    println(map)
}