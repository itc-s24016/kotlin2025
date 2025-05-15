package chap13
//for文(downTo)
fun main() {
    //1ずつ減らしたいときはdownTo を使う

    val x = 5
    for (i in 9 downTo 1){
        println("${x} × ${i} は ${x * i} です")
    }
}