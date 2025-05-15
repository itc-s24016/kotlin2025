package chap13
//for文
fun main() {
    // for (変数 in Range){ 処理 }

    val x = 5
    for (i in 1..9) {
        println("${x} × ${i} は ${x * i} です")
    }
}