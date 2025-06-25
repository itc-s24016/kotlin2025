package exam03

import kotlin.random.Random

open class Human(
    maxHp: Int,
    hp: Int,
    maxMp: Int,
    mp: Int,

    var strength: Int,
    var stamina: Int,
    var weapon: Int,
    var armor: Int,
    override var attack: Int = strength+weapon,
    override var defence: Int = stamina+armor
    ) : Character(
    maxHp,
    hp,
    maxMp,
    mp,
    attack,
    defence
) {
    override fun attackTo(target: Character): Int {
        val damage = target.attacked(attack)
        target.hp -= damage
        return target.hp
    }

    override fun attacked(power: Int): Int {
        return ((power*0.5 - defence*0.25) * (Random.nextInt(28, 36)/32)).toInt()
    }
}