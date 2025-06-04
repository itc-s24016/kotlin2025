package chap37
////関数オブジェクト(関数で関数を返す)
fun main() {
    //Kotlin固有らしい
    val calculator1 = getCalculator("+")
    val calculator2 = getCalculator("-")
    val result1 = calculator1(10.0, 2.0)
    val result2 = calculator2(10.0, 2.0)
    println(result1)
    println(result2)
}

fun getCalculator(type: String): (Double, Double) -> Double {
    val p = fun(x: Double, y: Double) = x + y // x+y が本当の戻り値
    val m = fun(x: Double, y: Double) = x - y

    return when(type) {
        "+"  -> p //関数を返す
        else -> m //(返された時点で関数内で x+y は済んでいる)
    }
}