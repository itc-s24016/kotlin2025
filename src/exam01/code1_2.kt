package exam01
//練習問題(映画館)
fun main() {
    /*
    映画館の入場料を計算するプログラム
    ・シニア：一般：子供の順で人数を入力
    ・シニア：１３００円
    ・一般　：２０００円
    ・子供　：１０００円
    ※１０人以上の場合は一人あたり２００円割引になる
     */

    println("人数を入力してください")
    print("シニア ➤")
    val old = readln().toInt()
    var a = 1300

    print("　一般 ➤")
    val normal = readln().toInt()
    var b = 2000

    print("　子供 ➤")
    val child = readln().toInt()
    var c = 1000

    if (old+normal+child >= 10) {
        a -= 200
        b -= 200
        c -= 200
    }
    println("合計：${(old * a)+(normal * b)+(child * c)}円です")
}