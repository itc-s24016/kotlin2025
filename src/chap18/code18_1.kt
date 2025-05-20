package chap18
//Set(normal)
fun main() {
    //中身の書き換えが出来ない方
    val s: Set<String> = setOf("あ", "い", "う", "え", "お")
    println(s)

    println("----------------")

    for (x in s) {
        println(x)
    }

    //順番の概念が無いのでインデックスの指定ができない
    //println(s[0])
}