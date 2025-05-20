package chap18
//Set(mutable)
fun main() {
    val s: MutableSet<String> = mutableSetOf("あ", "い", "う", "え", "お")
    println(s)

    println("-----------------------")

    s.add("か")
    s += "き"
    s += "く"
    println(s)

}