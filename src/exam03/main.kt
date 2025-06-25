package exam03

import kotlin.enums.EnumEntries

fun main() {
    /*
    プレイヤーキャラクター1体
    敵キャラクター1体
    インスタンスを作り、動作確認をするプログラムを実装してください
    */
    //プレイヤー
    val player1 = Human(
        100,
        100,
        100,
        50,
        50,
        50,
        10,
        10)

    //敵
    val enemy1 = Enemy(
        100,
        100,
        100,
        50,
        50,
        50,
        10,
        10
    )

    println("プレイヤーのHP:${player1.hp}")
    println("　　　　敵のHP:${enemy1.hp}")

    //攻撃した
    println("\n攻撃した")
    player1.attackTo(enemy1)
    println("プレイヤーのHP:${player1.hp}")
    println("　　　　敵のHP:${enemy1.hp}")

    //攻撃された
    println("\n攻撃された")
    enemy1.attackTo(player1)
    println("プレイヤーのHP:${player1.hp}")
    println("　　　　敵のHP:${enemy1.hp}")



}