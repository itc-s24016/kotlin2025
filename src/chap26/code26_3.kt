package chap26
//セカンダリコンストラクタ
//受け取った引数のカスタマイズをしてプライマリコンストラクタに合うように調整して渡す
fun main() {
    val p = Person(7)
    val p2 = Person("鈴木", "太郎")
}

class Person(val name: String, var age: Int){
    init {
        println("プライマリコンストラクタのイニシャライザが呼ばれました")
        println("指定されたパラメータは ${name} と ${age} です")
    }

    constructor(age: Int) : this("名無し", age) {
        println("年齢だけを指定するセカンダリコンストラクタのイニシャライザが呼ばれました")
    }

    //name に２つの引数を収めたい時
    constructor(lastName: String, firstName: String) : this("${lastName} ${firstName}", 20){
        println("苗字と名前を指定するセカンダリコンストラクタのイニシャライザが呼ばれました")
    }
}