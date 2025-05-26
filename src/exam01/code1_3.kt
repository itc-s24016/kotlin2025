package exam01
//練習問題(お釣り)
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    /*
    お釣りの金種計算
    ・価格をランダムな数値で表示
    ・支払う金額を入力
    お釣りに必要な金種ごとの枚数を出力してください（最小で）
    足りない場合は「足りません」と出力する
     */
    val price = Random.nextInt(100..9000)
    println("価格：${price}")
    print("いくら払いますか？：")
    val pay = readln().toInt()

    val money: IntArray = intArrayOf(10000, 5000, 1000, 500, 100, 50, 10, 5, 1)

    if (price > pay){println("足りません")}
    else{
        var nokori = pay - price
        val otsuri = nokori

        for (i in 0..<money.count()){
            var how = 0
            if (nokori >= money[i]){
                how = nokori / money[i]
                println("${money[i]}: ${how}枚")
                nokori -= money[i] * how
            }else{println("${money[i]}: ${how}枚")}
        }
        println("${otsuri}円のお釣りです")
    }
}