package chap19
//Map(MutableMap)リストに追加削除
fun main() {
    val map: MutableMap<String, String> = mutableMapOf(
        "Pen" to "ペン"
    )
    println("元："+map)

    map.put("Apple", "アップル")        //追加方法１
    map += "Pineapple" to "パイナップル" //追加方法２
    println("新："+map)

    println("------------")

    map.remove("Pen") //削除方法１
    //Map内にキーが存在しない場合にNoneを返すため、キーの存在を確認したい場合に便利

    map -= "Pineapple"     //削除方法２
    println("削除後："+map)
}