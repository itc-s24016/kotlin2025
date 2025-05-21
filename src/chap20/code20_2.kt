package chap20
//readln
fun main() {
    print("名前を入力してください：")
    val name = readln()
    print("年齢を入力してください：")
    val age = readln().toInt()

    println("Hello, ${name}! You are ${age} years old.")
}