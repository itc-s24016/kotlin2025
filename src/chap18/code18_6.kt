package chap18
//List と Set
fun main() {
    //List
    val x = mutableListOf("あ", "い", "う", "え", "お")
    println("コレクション内の要素数： ${x.count()}") //結果：5
    x += "あ"
    x += "あ"
    x += "あ"
    println("コレクション内の要素数： ${x.count()}") //結果：8
    println("LIST:"+x)

    println("--------------")

    //Set ※リスト内で同じデータがある、入れると自動的に重複が無くなる
    val y = mutableSetOf("あ", "い", "う", "え", "お")
    println("コレクション内の要素数： ${y.count()}") //結果：5
    y += "あ"
    y += "あ"
    y += "あ"
    println("コレクション内の要素数： ${y.count()}") //結果：5
    println("SET:"+y)
}