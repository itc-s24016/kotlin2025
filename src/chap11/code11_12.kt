package chap11
//if式における返り値の書き方
fun main() {
    /**
     * ※返り値に return はつけない
     * 変数:型 = if(処理) { 同じ型の返り値 }
     *          else{ 同じ型の返り値 }
     */

    val age = 14
    val message = if (age in 13..15){
        println("1番目の処理が行われました")
        "中学生です"
    }else{
        println("2番目の処理が行われました")
        "中学生ではありません"
    }

    println(message)
}