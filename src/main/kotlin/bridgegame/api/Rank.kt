package bridgegame.api


enum class Rank(val symbol: String, val rank: Int = 0, val point: Int = 0) {
    ACE("A",1,4), KING("K",2,3), QUEEN("Q",3,2),
    JACK("J",4,1),    TWO("2",5), THREE("3",6),
    FOUR("4",7), FIVE("5",8), SIX("6",9),
    SEVEN("7",10), EIGHT("8",11), NINE("9",12),
    TEN("T",13);

    override fun toString(): String {
        return symbol
    }

    companion object {
        val values = enumValues<Rank>()
    }
}