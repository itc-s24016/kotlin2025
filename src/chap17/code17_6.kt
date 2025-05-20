package chap17
//Array と List
fun main() {
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = 4

    val y: List<Int> = listOf(1, 2, 3)
    y[0] = 4

    /*
    共通点：要素数は固定
    Array = 書き換え可能
    List  = 書き換え負荷

    Kotlin: No 'set' operat or method providing array access.
    というエラーが出る
     */
}