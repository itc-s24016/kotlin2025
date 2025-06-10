package chap43
//可視性識別子(protected の動作確認)
fun main() {
    //本当に Prius クラス以外の場所からアクセス出来ないのか検証
    val car = Prius("赤")
    car.drive()

    //Car クラスを継承したクラス( Prius )はアクセスできるが、それ以外の場所からは出来ない
//    car.letEngineWork2()
}