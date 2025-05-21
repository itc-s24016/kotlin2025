package chap19
//Map_3
fun main() {
    val map: Map<Int, Char> = mapOf(
        1 to 'a',
        2 to 'b',
        3 to 'c',
        26 to 'z'
    )
    println(map[1])
    println(map[2])
    println(map[3])
    println(map[26])
    println(map)

}