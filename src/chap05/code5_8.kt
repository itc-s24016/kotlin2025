package chap05
//文字と文字列2

/**
 * $world、
 * ${world}、
 * どっちでも可能だが、なるべく${world}にすること
 * {}の中に計算式を記述することも可能
 */
fun main() {
    val h: Int = 8

    //失敗例
    //val message = "本日働いた時間は、$h時間"
    //「h時間」なんて変数は無いと言われる

    val message1 = "本日働いた時間は、${h}時間"
    println(message1)
    
    val message2 = "このペースで一ヶ月毎日働くと、${h *  30}時間の労働になります。"
    val message3 = "このペースで一年間毎日働くと、${h * 365}時間の労働になります。"
    println(message2)
    println(message3)

    //「"""|」でEnter ダブクォ×３とパイプ
    val message4 = """|
        |こんにちは、世界！
        |私はKotlinに関して勉強しています。
        |Kotlinでは、とても簡潔なプログラムを書くことが出来ます。
        |皆さん、一緒に楽しくプログラミングしましょう！
    """.trimMargin()
    println(message4)

    println("-----")

    val w = "世界"
    val k = "Kotlin"
    val message5 = """|
        |こんにちは、${w}!
        |私は${k}に関して勉強しています。
        |${k}では、とても簡潔なプログラムを書くことが出来ます。
        |皆さん、一緒に楽しくプログラミングしましょう！
    """.trimMargin()
    println(message5)
}