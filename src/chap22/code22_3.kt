package chap22
//例外処理
fun main() {
    val text = readln()
    try {
        val number = text.toInt()
        println("number: ${number}")
    }catch (e: NumberFormatException) {
        println("「${text}」という文字は数値に変換できません")
    }
}