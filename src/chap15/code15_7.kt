package chap15
//while(continue)
fun main() {
    for (x in 1..10){
        if (x % 3 == 0){
            //break = 終了
            break
        }
        println("${x}回目の繰り返し処理")
    }

    println("-------------")

    for (x in 1..10){
        if (x % 3 == 0){
            //continue = スキップ
            continue
        }
        println("${x}回目の繰り返し処理")
    }
}