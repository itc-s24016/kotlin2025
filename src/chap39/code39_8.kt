package chap39
//ラムダ式(引数に関数を求める)
import kotlin.random.Random
fun main() {
    //ここで引数に入れる計算機のカスタマイズをする
    randomNumberCalculate(10){
        //it * 2 //２倍する計算機
        it * it * it //体積を求める計算機
    }
}
//引数に乱数の最大値と計算機を入れる　入れる計算機は main で作る
fun randomNumberCalculate(max: Int, calculator:(Int) -> Int){
    val targetNumber = Random.nextInt(max+1)
    val result = calculator(targetNumber)
    println("計算結果：${result}")
}