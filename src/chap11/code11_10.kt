package chap11
//valで結果の上書きを防ぐ
fun main() {
    //-------------------------------
    val age1 = 14
    var message1 = ""

    if (age1 in 13..15){
        message1 = "中学生です"
    }else{
        message1 = "中学生ではありません"
    }
    //message = "小学生"
    println(message1)
    //-------------------------------
    /*
    この書き方だと、もし println する前に誤って message に他の値が入ってしまった場合、
    結果が上書き出来てしまうので、以下の記述方法で防ぐ
    */
    val age2 = 14
    val message2: String

    if (age2 in 13..15){
        message2 = "中学生です"
    }else{
        message2 = "中学生ではありません"
    }
    //message2 = '小学生です'　　//エラーになる
    println(message2)
}