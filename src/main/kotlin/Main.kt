import bridgegame.api.Card
import bridgegame.api.Hand
import bridgegame.api.Rank
import bridgegame.api.Suit
import bridgegame.util.EvaluateHand

fun main() {
    val hand = Hand()

    val hand1 = Hand()
    hand1.addCard( spades = arrayOf("AS", "KS", "QS", "2S", "6S"),
        hearts = arrayOf("AH", "2H", "3H"),
        diamonds = arrayOf("AD", "JD", "6D"),
        clubs = arrayOf("5C", "6C"))

    println("HCP : "+ EvaluateHand.findHCP(hand1))
    println("Distribution : " + EvaluateHand.getDistribution(hand1))
    println("isBalancedHand : " + EvaluateHand.isBalancedHand(hand1))

    with(hand) {
        addCard(Card(Suit.SPADE,Rank.SIX))
        addCard(Card(Suit.HEART,Rank.TWO))
        addCard(Card(Suit.DIAMOND,Rank.SIX))
        addCard(Card(Suit.DIAMOND,Rank.JACK))
        addCard(Card(Suit.DIAMOND,Rank.ACE))
        addCard(Card(Suit.CLUB,Rank.FIVE))
        addCard(Card(Suit.CLUB,Rank.SIX))
        addCard(Card(Suit.HEART,Rank.ACE))
        addCard(Card(Suit.SPADE,Rank.ACE))
        addCard(Card(Suit.SPADE,Rank.TWO))
        addCard(Card(Suit.HEART,Rank.THREE))
        addCard(Card(Suit.SPADE,Rank.KING))
        addCard(Card(Suit.SPADE,Rank.QUEEN))
        println (this)
    }

    println("HCP : "+ EvaluateHand.findHCP(hand))
    println("Distribution : " + EvaluateHand.getDistribution(hand))
    println("isBalancedHand : " + EvaluateHand.isBalancedHand(hand))
}