package chap39
//ラムダ式(説明)
fun main() {
    //関数オブジェクトの無名関数の引数と返り値( 処理 )を { } でまとめる書き方
    //フルで書いたパターン
    val plus1: (Int, Int) -> Int = fun(x: Int, y: Int): Int { return x + y }

    //型等を省略したパターン
    val plus2: (Int, Int) -> Int = fun(x, y) = x + y

    //最短パターン = ラムダ式
    val plus3: (Int, Int) -> Int = {x, y -> x + y}

    //結果は同じ
    println(plus1(10, 2))
    println(plus2(10, 2))
    println(plus3(10, 2))
}