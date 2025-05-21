package chap22
//例外処理(複数)
fun main() {
    val week = arrayOf("日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日")
    println("０〜６の数字を入力してください")
    val text = readln()

    try {
        val choice = text.toInt()
        println("選択肢: ${choice} は ${week[choice]} です")
    } catch (e: NumberFormatException) {
        println("「${text}」という文字は数値に変換できません")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("範囲外の選択肢です")
    } catch (e: Exception) {
        //上記２つのエラー以外が起きた時に表示させる = 想定外、わからないエラー用
        println("予想外の例外が発生しました")
    }
}