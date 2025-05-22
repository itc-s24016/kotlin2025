package exam01
//練習問題(FizzBuzz)
fun main() {
    /*
    １から入力値までの FizzBuzz を出力
    FizzBuzz とは、
    3の倍数 = Fizz
    5の倍数 = Buzz
    他 = そのまま数字
    で出力させるプログラム練習問題
     */

    val x = readln().toInt()

    (1..x).forEach {
        if (it % 15 == 0) {println("FizzBuzz")}
        else if (it % 3 == 0) {println("Fizz")}
        else if (it % 5 == 0) {println("Buzz")}
        else {println(it)}
    }

//    print("数字を入力してください ➤")
//    val x = readln().toInt()
//
//    (1..x).forEach {
//        val result = if(it % 15 == 0){
//            "FizzBuzz"
//        }else if (it % 3 == 0){
//            "Fizz"
//        }else if (it % 5 == 0){
//            "Buzz"
//        }else {
//            //result は String だから揃える
//            it.toString()
//        }
//        println(result)
//    }
}