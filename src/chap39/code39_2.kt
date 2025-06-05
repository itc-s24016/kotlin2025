package chap39
//ラムダ式(省略化)
fun main() {
    printResult({x, y -> x + y}) //第一形体
    printResult(){x, y -> x + y} //第二形体(()の外に記述)
    printResult{x, y -> x + y}     //最終形体(()を除外)
}

fun printResult(calculator: (Int, Int) -> Int) {
    val result = calculator(10, 2)
    println("計算結果：${result}")
}