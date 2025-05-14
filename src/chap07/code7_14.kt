package chap07
//論理演算演習(Random)と注意点
import kotlin.random.Random

fun main() {
    val a = Random.nextInt(0, 100)

    //a が  0-59 なら D
    //a が 60-69 なら C
    //a が 70-79 なら B
    //a が 80-89 なら A
    //a が 90-   なら S

    print("${a} : ")
//    if (a <= 59){ println("D") }
//    else if (a >= 60 && a <= 69){ println("C") }
//    else if (a >= 70 && a <= 79){ println("B") }
//    else if (a >= 80 && a <= 89){ println("A") }
//    else if (a >= 90){ println("S") }

    //整頓後
    if (a < 60){ println("D") }
    else if (a < 70){ println("C") }
    else if (a < 80){ println("B") }
    else if (a < 90){ println("A") }
    else { println("S") }

    /*注意する記述
    関数T: print(1を実行) return true
    関数F: print(2を実行) return false

    ・(例)if (T || F)
    結果：1を実行
    　　　2を実行
    ----------------------------
    ・if (F && T)
    　結果：2を実行

    ※ANDはどちらかがfalseだとfalseになるのが確定するので、
    　その後の関数Tを実行しなくなる
    ----------------------------
    ・if (T || F)
    　結果：1を実行

     ※ORはどちらかがtrueだとtrueになるのが確定するので、
      その後の関数Fを実行しなくなる
     */
}