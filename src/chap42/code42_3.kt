package chap42
//パッケージ
import jp.ac.it_college.std.s24016.example.cars.Car
import chap27.Car as car27
import chap28.Car as car28
fun main() {
    //フルバージョン
    val c1 = jp.ac.it_college.std.s24016.example.cars.Car("赤")
    c1.drive()

    //import を使用したバージョン
    val c2 = Car("青")
    c2.drive()

    /*　jp.ac.it_college.std.s24016.example.cars の Car
    　　chap27 の Car
    　  chap28 の Car　のように、
    使用したいメソッド名が被っていると、
    どの Car を実行すればいいかわからなくなるので
    import alias で別名を指定するか
    フルネームで記述しないといけない  */

    val c3 = car27("白")
    val c4 = car28("黒")
    c3.drive(10.0)
    c4.drive(10.0)
}