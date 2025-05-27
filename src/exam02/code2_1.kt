package exam02

import kotlin.random.Random

fun main() {
    //クラス名  :Dice = サイコロ
    //プロパティ：サイコロの識別用の名前( name ), 今の出目( number ), サイコロの最大値( maxNumber )
    //メソッド  :サイコロを振る( roll )
    //一般的な六面サイコロ以外も対応できるように、コンストラクタで最大値をパラメータで受け取る

    println("【１：六面体  ２：多面体】")
    print("サイコロを選んでください ➤ ")

    val play = readln().toInt()
    if (play == 1){
        val d1 = Dice("六面体サイコロ")
        println(d1.roll())
    }else if (play == 2){
        val d2 = Dice("多面体サイコロ")
        print("\n最大値を設定してください ➤ ")
        d2.maxNumber = readln().toInt()
        println(d2.roll())
    }
}

class Dice (val name: String = "", var number: Int = 0, var maxNumber: Int = 6){
    init{
        println("${name}が選択されました!")
    }
    fun roll(): String {
        number = Random.nextInt(1,maxNumber)
        return "結果：${number}"
    }
}