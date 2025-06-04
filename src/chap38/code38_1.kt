package chap38
//クロージャー(使用した場合)
fun main() {
    val c1 = getTextClosure("さん")
    val c2 = getTextClosure("くん")
    val c3 = getTextClosure("ちゃん")

    println(c1("タケシ"))
    println(c2("タケシ"))
    println(c3("タケシ"))
}

fun getTextClosure(x: String): (String) -> String {
    return fun(name) = name + x
}