package chap21
//関数
fun main() {
    val answer: Int = getThreeTimes(5)
    println(answer)
}

//受け取った入力値を3倍にして返す
fun getThreeTimes(value: Int): Int {
    return value * 3
}