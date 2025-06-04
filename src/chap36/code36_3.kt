package chap36
//スコープ(変数の宣言場所)
fun main() {
    val p = Person2()
    p.setNameAndAge("タケシ", 5)
    p.greet()
}

class Person2{
    var name = ""
    var age = 0

    fun setNameAndAge(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun greet() {
        println("${name} です　${age} 歳です")
    }

    /* if, else 内の under20 は外から参照出来ない
    fun hoge() {
        if (age >= 20) { val under20 = true }
        else { val nuder20 = false}

        if (under20){ println("20歳以上です") }
    }*/

    //これなら行ける
    fun hoge() {
        val under20 = if (age >= 20){ true }
        else { false }
        if (under20){ println("20歳以上です") }
    }
}