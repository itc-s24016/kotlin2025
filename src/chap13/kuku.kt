package chap13
//for文の演習問題
fun main() {
    //掛け算九九の表を作成してください
    // 1×1=1  1×2=2
    // 2×1=2  2×2=4...

    for (i in 1..9){
        for (j in 1..9){
            print("${i}×${j}=${String.format("%02d",i*j)}  ")//2桁で0埋めする
        }
        println()
    }
}