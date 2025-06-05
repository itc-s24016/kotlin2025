package chap40
//メンバ参照(他の方法と比較)
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("どの言語でもありそうな方法")
    for (i in list){
        println(i)
    }

    println("Kotlin のラムダ式を使った方法")
    list.forEach{
        println(it)
    }

    println("Kotlin メンバ参照を使った方法")
    list.forEach( ::println )
}