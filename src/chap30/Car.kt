package chap30
//abstract用クラス(abstract fun)
abstract class Car (val color : String){
    var distance = 0.0

    //{} を使用する = 具体的に書いたらダメ
    abstract fun drive(d: Double)/*{
        distance += d
        println("${color} 色の車が ${d}km 走りました")
        println("その結果、マイレージ￥は ${distance} キロになりました")
    }*/

    /*注意
    * abstract なメソッドが一つでもあるときは、クラス名に気をつけないといけない
    * class Car
    * open class Car
    * これらを避けないとだめ*/
}