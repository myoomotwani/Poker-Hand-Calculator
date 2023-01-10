package poker.combinationfinder;



import poker.Card;
import poker.Combination;

import java.util.Arrays;
import java.util.Comparator;

public class CombinationFinder {

    // this method checks for straight , flush , straight flush , royal flush
    public Combination getBestCombo(Card[] handCards , Card[] flop , Card turn , Card river){

        //combine and sort
        Card[] allCards = combineAndSort( handCards ,  flop ,  turn ,  river);

        Combination bestCombo = Combination.HIGH_CARD ;


        // check for straight
        StraightFinder straightFinder = new StraightFinder() ;
        Combination straightCombo = straightFinder.checkStraight(allCards);
        bestCombo = max(bestCombo , straightCombo);

        // check for flush
        FlushFinder flushFinder = new FlushFinder();
        Combination flushCombo  = flushFinder.checkCombo(allCards);
        bestCombo = max(bestCombo , flushCombo);

        // check for straight flush
        Combination straightFlushCombo = Combination.HIGH_CARD ;

        if(  Combination.STRAIGHT  == straightCombo && Combination.FLUSH  == flushCombo ){

            StraightFlushFinder straightFlushFinder = new StraightFlushFinder();
             straightFlushCombo = straightFlushFinder.checkCombo(allCards , flushCombo.getSuite());

            bestCombo = max(bestCombo , straightFlushCombo);
        }


        // check for royal flush
        if(Combination.STRAIGHT_FLUSH == straightFlushCombo && straightFlushCombo.getHighCard() == 14){
            Combination royalFlushCombo = Combination.ROYAL_FLUSH ;
            royalFlushCombo.setSuite(straightFlushCombo.getSuite());

            bestCombo = max(bestCombo , royalFlushCombo);
        }



        return bestCombo ;
    }


    Combination max( Combination combination1 , Combination combination2){

        return  ( combination1.compareTo(combination2) > 0 ) ? combination2 :  combination1 ;


    }






    Card[] combineAndSort(Card[] handCards , Card[] flop , Card turn , Card river){

        Card[] allCards = new Card[7];
        int index = 0 ;
        for(int i = 0 ; i < 2 ; i++)
            allCards[index++] = handCards[i] ;

        for(int i = 0 ; i < 3 ; i++)
            allCards[index++] = flop[i] ;

        allCards[index++] = turn ;
        allCards[index] = river ;

        Arrays.sort(allCards , Comparator.comparingInt(a -> a.getFaceValue()));

        return allCards ;

    }


}
