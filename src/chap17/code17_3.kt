package chap17
//Array と List
fun main() {
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = 4

    val y: List<Int> = listOf(1, 2, 3)
    y[0] = 4

    /*
    List は中身を書き換えられずに
    Kotlin: No 'set' operat or method providing array access.
    というエラーが出る
     */
}