package exam03

import kotlin.random.Random

//抽象クラス
abstract class Character(
    val maxHp: Int,
    var hp: Int,
    val maxMp: Int,
    var mp: Int,
    open var attack: Int,
    open var defence: Int
    ) {
    //与えたダメージ
    abstract fun attackTo(target: Character): Int

    //受けたダメージ
    open fun attacked(power: Int): Int {
        return ((power*0.5 - defence*0.25) * (Random.nextInt(28, 36)/32)).toInt()
    }
}