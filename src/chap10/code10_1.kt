package chap10
//IntRangeとは
/**
 * x: IntRange = 開始値..終了値
 */
fun main() {
    //x以上y以下の値が入っているが表示は出来ない
    val a: IntRange = 0..6
    val b: IntRange = 7..12
    val c: IntRange = 13..15
    /*
    なんとか表示できるように処理を文字に起こしているだけで、
    この内容が入っているわけではない
    */
    println(a)
    println(b)
    println(c)
}