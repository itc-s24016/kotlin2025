package chap43
//可視性識別子
open class Car(val color: String) {
    private var fuel = 50.0 //燃料

    public fun drive() {
        if (fuel > 0.0) {
            letEngineWork()
            println("${color}の車が走りました")
            println("現在: ${fuel}L")
        }else{
            println("ガス欠で走れません！")
        }
    }

    private fun letEngineWork() {//走るたびに燃料が消費される様子
        fuel -= 1.0
        println("残り: ${fuel}L")
    }

    protected open fun letEngineWork2() {//これで Priusクラスでオーバーライドできる
        fuel -= 1.0
        println("残り: ${fuel}L")
    }
}