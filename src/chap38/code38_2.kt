package chap38
//クロージャー(使用しない場合)
fun main() {
    var x = ""

    x = "さん"
    val c1 = fun(name: String) = name + x

    x = "くん"
    val c2 = fun(name: String) = name + x

    x = "ちゃん"
    val c3 = fun(name: String) = name + x

    /* 宣言のタイミングによって結果は変わる
       c1, c2, c3 の中身：同じ、現在は x：ちゃん
       x の状態が ちゃん のまま、出力される
       c2 の下で println すれば、くん で表示される */
    println(c1("タケシ"))
    println(c2("タケシ"))
    println(c3("タケシ"))
}