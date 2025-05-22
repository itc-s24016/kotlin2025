package chap50
//文字列同士の比較の仕方
fun main() {
    /*
    Java では String の比較はメソッドを使用しないといけなかったが、
    Kotlin ではどの型でも == で比較できる
     */
    print("文字を入力してください")
    val x = readln()
    print("もう一度入力してください")
    val y = readln()

    println("「${x}」と「${y}」が同じか？ ${x == y}")
}