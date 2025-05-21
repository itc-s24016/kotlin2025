package chap20
//Scanner
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    print("何か入力してください：")
    val line = sc.nextLine()
    println(line)

    print("何か入力してください(空白NG)：")
    val string = sc.next()
    println(string)

    print("整数を入力してください：")
    val num = sc.nextInt()
    println("「${num}」の2倍の数：${num * 2}")
}