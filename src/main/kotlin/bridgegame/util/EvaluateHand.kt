package bridgegame.util

import bridgegame.api.Card
import bridgegame.api.Hand

class EvaluateHand {

 companion object {
   fun findHCP( hand: Hand)= hand.getHand().sumOf { it.rank.point }

     fun getDistribution(hand: Hand): Int =
         distributionPoint(hand.spades.size) +
      distributionPoint(hand.hearts.size) +
                distributionPoint(hand.diamonds.size) +
                distributionPoint(hand.clubs.size)


     private fun distributionPoint(count: Int): Int = when(count) {
             5 -> 1; 6 -> 2; 7 -> 3; 8 -> 4; else -> 0
   }
     fun isBalancedHand(hand: Hand):Boolean {
         var countList  = listOf(hand.spades.size, hand.hearts.size, hand.diamonds.size, hand.clubs.size).sortedDescending()
         val str = countList.joinToString ( separator="")
         if(str == "4333" || str == "4432"  || str == "5332")
             return true
         return false
     }
    } //companionObject
 }