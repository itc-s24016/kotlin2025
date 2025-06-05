package chap41
//ジェネリクス(どんな型でも扱えるリストのクラス)
class Box<T> {
    //T(Type) ：どの型を扱うのか、後で指定するという意味　何の文字でもいい
    var label: String = ""
    var content: T? = null

    fun setValues(label: String, content: T){
        this.label = label
        this.content = content
        println("${label}: ${content}")
    }
}