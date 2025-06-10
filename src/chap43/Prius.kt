package chap43
//可視性識別子(protected のサブクラス)
class Prius(color: String): Car(color) {
    /*
    元が private だとオーバーライド出来ない
    でも、private のままオーバーライドできるようにしたいなら
    元を private -> protected open に変更すればいい
     */
    override fun letEngineWork2(){
        println("走行中")
    }
}