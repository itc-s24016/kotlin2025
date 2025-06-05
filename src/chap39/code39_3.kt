package chap39
//ラムダ式(引数が一つのときに可能な最省略化)
fun main() {
    val function1: (String) -> String = fun(x: String): String { return x + "ちゃん" }
    val function2: (String) -> String = fun(x) = x + "ちゃん"
    val function3: (String) -> String = { x -> x + "ちゃん" }
  //val function4: (String) -> String = { it -> it + "ちゃん" }
    val function4: (String) -> String = { it + "ちゃん" } //ここポイント！


    println(function1("タケシ"))
    println(function2("タケシ"))
    println(function3("タケシ"))
    println(function4("タケシ"))
}