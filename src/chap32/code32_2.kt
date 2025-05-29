package chap32
//null許容型, 非null許容型、エルビス演算子
fun main() {
    /*【 普通に null をいれてみた 】
    var text: String = "あいうえお"
    println("文字列「${text}」の長さ = ${text.length}")
    text = null //error:非null型'String'の値にnullは使用できません
    println("文字列「${text}」の長さ = ${text.length}")
    */

    /*【 String? にしてみた 】
    var text: String? = "あいうえお"
    println("文字列「${text}」の長さ = ${text.length}")
    text = null
    println("文字列「${text}」の長さ = ${text.length}") //ピリオドがエラーになる
    /*【エラー内容】
    'Nothing?' 型の null 許容レシーバーでは、
    安全な (?.) または null 以外がアサートされた (!!.) 呼び出しのみが許可されます。
    */*/

    //【 String? と text?.length にしてみた 】
    var text: String? = "あいうえお"
    println("文字列「${text}」の長さ = ${text?.length}")
    text = null
    println("文字列「${text}」の長さ = ${text?.length}")
    /*
    * 変数?.メソッド、関数 の書き方を「セーフコール、安全呼び出し」という
    * 安全呼び出しは普通の変数に使用しても問題ないので、普段保険として書いても大丈夫
    */


    //null を受け付けないメソッド
    fun countTextLength1(text: String): Int{ return text.length }

    //null を受け付けられるメソッド  ※null なら 0 を返す処理
    fun countTextLength2(text: String?): Int{
        return text?.length ?: 0
    }
    var text_a: String = "あいうえお"
    var text_b: String? = "あいうえお"
/*
    var length_a = countTextLength1(text_a) //OK
    var length_b = countTextLength1(text_b) //NG
    var length_n1 = countTextLength1(null)  //NG
    var length_n2 = countTextLength2(null)  //OK

    println(length_a)
    println(length_b)
    println(length_n1)
    println(length_n2)
*/

    //【 null 許容型を入れるとエラーになるので、「非許容型変数」にした 】
    var length_b = countTextLength1(text_b!!) //変数！！　おすすめしない
    println(length_b)
//    length_b = null   //あえて null を入れてみた
//    println(length_b) //だめだった

    //エルビス演算子
    val list: List<String?> = listOf("a", "b", null)
    for (i in list){
        if(i != null){
            println(i)
        }
    }
}