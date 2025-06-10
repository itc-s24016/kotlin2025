package chap43
//可視性識別子(protected set)
open class Car2(val color: String) {
    var fuel = 50.0 //燃料
        protected set

    fun drive() {
        if (fuel > 0.0) {
            letEngineWork()
            println("${color}の車が走りました")
        }else{
            println("ガス欠で走れません！")
        }
    }
    private fun letEngineWork() {//走るたびに燃料が消費される様子
        fuel -= 1.0
    }
    protected open fun letEngineWork2() {//これで Priusクラスでオーバーライドできる
        fuel -= 1.0
    }
}