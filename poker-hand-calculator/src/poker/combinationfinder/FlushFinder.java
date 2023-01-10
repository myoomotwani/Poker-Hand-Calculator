package poker.combinationfinder;

import poker.Card;
import poker.Combination;
import poker.Suite;

public class FlushFinder {

    Combination checkCombo(Card[] allCards){

     int[] suiteCount = new int[4];

     for(Card card : allCards){
         suiteCount[card.getSuite().getTypeId()]  ++ ;
     }

     for(int i = 0 ; i < 4 ; i++){
         if(suiteCount[i] >= 5){
             Combination combination = Combination.FLUSH ;
             combination.setSuite( Suite.getSuiteFromId(i) );
             return combination ;
         }

     }

     return Combination.HIGH_CARD ;

    }


}
