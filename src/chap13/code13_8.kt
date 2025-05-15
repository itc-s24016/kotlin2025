package chap13
//for文(downToとstep)
fun main() {
    //9から1へ2ずつ減らす
    val x = 5
    for (i in 9 downTo 1 step 2){
        println("${x} × ${i} は ${x * i} です")
    }
}