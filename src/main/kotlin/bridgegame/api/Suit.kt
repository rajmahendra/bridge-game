package bridgegame.api

enum class Suit(private val symbol: String, val shortName: String) {
    SPADE("♠\uFE0F","S"),
    HEART("❤\uFE0F","H"),
    DIAMOND("♦\uFE0F","D"),
    CLUB("♣\uFE0F","C");

    override fun toString(): String {
        return shortName
    }

    companion object {
        val values = enumValues<Suit>()
    }
}