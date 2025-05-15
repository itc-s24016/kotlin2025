package chap10
//Rangeで<を扱う
fun main() {
    /**
     * Rangeで x以上y未満 にしたいときは
     * val rangeA = 0..<10 と記述する
     * ※昔は「条件を含まない」を
     * val rangeA = 0 until 10　と記述していた
     * 今は !in と組み合わせればいい
     */
    val rangeA = 0..<10    //0以上10未満

    //変数を入れることも可能
    val max = 5
    val rangeB = 0..<max   //0以上5未満
    val rangeC = 0..<max-1 //0以上4未満

    println("9 in rangeA: ${9 in rangeA}")
    println("10 in rangeA: ${10 in rangeA}")
    println("4 in rangeB: ${4 in rangeB}")
    println("5 in rangeB: ${5 in rangeB}")
    println("4 in rangeC: ${4 in rangeC}")
    println("3 in rangeC: ${3 in rangeC}")
}