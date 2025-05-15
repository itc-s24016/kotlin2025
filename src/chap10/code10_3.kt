package chap10
//IntRangeの使い方(！in)
fun main() {
    //年齢
    val age: Int = 10

    //範囲
    val range1: IntRange = 0..6
    val range2: IntRange = 7..12
    val range3: IntRange = 13..15

    //判定（年齢が範囲の中に無いかどうか）
    val flag1 = age !in range1
    val flag2 = age !in range2
    val flag3 = age !in range3

    //該当しない世代で true を返す
    println("${age} 歳の子供は就学前ではない ${flag1}")
    println("${age} 歳の子供は小学生ではない ${flag2}")
    println("${age} 歳の子供は中学生ではない ${flag3}")
}