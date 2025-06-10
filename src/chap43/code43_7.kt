package chap43
//可視性識別子(protected set の動作確認)
fun main(){
    val car = Car2("白")
    car.drive()
    /*
    ・fuel が protected なので fuel を参照出来ない
    　しかし、protected を外すと参照はできるが、外部から書き換えも出来てしまう

    そこで、protected set をすると書き換え行為ができなくなる
    このように、setter だけ protected にすることもできる
     */
//    car.fuel = 100.0
    println("燃料の残り: ${car.fuel}")
}