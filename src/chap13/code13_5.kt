package chap13
//for文(step)
fun main() {
    // for (変数 in Range step 値){ 処理 }

    val x = 5
    for (i in 0..20 step 5){
        println("${x} × ${i} は ${x * i} です")
    }
}