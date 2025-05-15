package chap11
//Rangeとifの演習問題
import kotlin.random.Random
/*
code7_14 のプログラムを if式 + Range で再実装してください
borderC = 60,
borderB = 70,
borderA = 80,
borderS = 90,
最小値 = 0,
最大値 = 100
scoreが        0-borderC未満 なら D
         borderC-borderB未満 なら C
         borderB-borderA未満 なら B
         borderA-borderS未満 なら A
         borderS-100        なら S
結果を変数 judge で出力
 */
fun main() {
    val score = Random.nextInt(0, 100)

    val borderC = 60
    val borderB = 70
    val borderA = 80
    val borderS = 90

    val judge =
        if      (score in 0..<borderC){ "D" }
        else if (score in borderC..<borderB){ "C" }
        else if (score in borderB..<borderA){ "B" }
        else if (score in borderA..<borderS){ "A" }
        else    { "S" }
    println("score ${score}: ${judge}")
}