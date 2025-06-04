package chap38
//クロージャー(活用例)
fun main() {
    val closureA = getCountClosure()
    val closureB = getCountClosure()
    println("クロージャーAが返した値 = ${closureA()}")
    println("クロージャーAが返した値 = ${closureA()}")

    println("クロージャーBが返した値 = ${closureB()}")
    println("クロージャーBが返した値 = ${closureB()}")
    println("クロージャーBが返した値 = ${closureB()}")

    println("クロージャーAが返した値 = ${closureA()}")
    //A の num の状態、B の num の状態それぞれ別で記憶している
    //クラスみたい
}
//引数無し、無名関数の引数も無し、戻り値はInt型
//呼び出しただけで +1 ずつ増えていくカウント機能
fun getCountClosure(): () -> Int{
    var num = 0
    return fun() = ++num
}
//なぜ num が 0 に戻されないのか
//num の前回の状態を記憶しているから