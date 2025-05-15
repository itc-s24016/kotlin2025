package chap10
//いろんなRange
fun main() {
    val rangeA: LongRange = 0.. 10_000_000_000L
    val rangeB: CharRange = 'A'..'E'
    val rangeC: CharRange = 'あ'..'お'

    val flagA = 500 in rangeA
    val flagB = 'D' in rangeB
    val flagC = 'え' in rangeC

    println("flagA: ${flagA}")
    println("flagB: ${flagB}")
    println("flagC: ${flagC}")
}