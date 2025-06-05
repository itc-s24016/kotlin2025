package chap41
//ジェネリクス(様々な型でリストを作成する)
fun main() {
    val box1 = Box2<Int, String>()
    val box2 = Box2<String, Double>()

    box1.setValues(100, "百")
    box2.setValues("円周率", 3.14)
}