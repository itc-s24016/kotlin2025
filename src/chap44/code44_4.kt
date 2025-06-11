package chap44
//拡張関数
import kotlin.random.Random
data class Person(val name: String, val age: Int)

fun main(){
    val p = randomPerson()
    p?.let(::println) //.let(::処理) NULLでないときだけ処理を実行する
    println("終了")
}

fun randomPerson(): Person? {
    return if (Random.nextBoolean()) {
        Person("タケシ", 8)
    }else null
}