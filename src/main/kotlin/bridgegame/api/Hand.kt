package bridgegame.api

class Hand {
     val spades = mutableListOf<Card>()
     val hearts = mutableListOf<Card>()
     val diamonds = mutableListOf<Card>()
     val clubs = mutableListOf<Card>()

    private fun orderHand(cards: MutableList<Card> = mutableListOf<Card>()) {
        cards.sortBy { it.rank.rank }
    }

    fun addCard(
        spades: Array<String> = arrayOf(), hearts: Array<String> = arrayOf(),
        diamonds: Array<String> = arrayOf(),clubs: Array<String> = arrayOf()) {

    }

    fun addCard(card: Card)  {
        if (getHand().size == 13) throw IllegalStateException("Hand is already full")
        if (getHand().find { it.rank == card.rank && it.suit == card.suit } != null ) throw IllegalStateException("Hand is already added")
        when(card.suit) {
            Suit.HEART -> {hearts.add(card);orderHand(hearts);}
            Suit.DIAMOND -> {diamonds.add(card);orderHand(diamonds);}
            Suit.CLUB -> {clubs.add(card);orderHand(clubs);}
            Suit.SPADE -> {spades.add(card);orderHand(spades);}
        }

    }

   fun getHand() = spades.toList() + hearts.toList() + diamonds.toList() + clubs.toList()

    override fun toString(): String {
        return "Hand(spades=$spades, hearts=$hearts, diamonds=$diamonds, clubs=$clubs)"
    }

}