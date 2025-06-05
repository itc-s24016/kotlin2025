package chap41
//ジェネリクス(様々な型でリストを作成する)
fun main() {
    val box_s = Box<String>()
    val box_i = Box<Int>()
    box_s.setValues("String", "あいうえお")
    box_i.setValues("Int", 1000)
}