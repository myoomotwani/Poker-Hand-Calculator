package poker.combinationfinder;


import poker.Card;
import poker.Combination;
import poker.Suite;

public class StraightFlushFinder {

    Combination checkCombo(Card[] allCards , Suite targetSuite){

        Combination bestCombo = Combination.HIGH_CARD ;
        boolean[] isPresent = new boolean[15]; // 0 waste - 1to 13 , then 14 for ACE

        // for each face value populate info if its present.
        // If face value is 1 , also count it as ACE , hence face  value = 14
        for(Card card : allCards){
            if(card.getSuite().equals(targetSuite)){
                if(card.getFaceValue() == 1)
                    isPresent[14] = true ;
                isPresent[card.getFaceValue()] = true ;
            }


        }

        // iterate through each face value , find maximum continuous sequence length leading upto that face value.
        // if sequence length is more that or equal to 5 , it's a straight.
        // Straight appearing at highest face value will be highest.
        int sequenceLength = 0 ;

        for( int i = 1 ; i <= 14 ; i++){

            if(isPresent[i])
                sequenceLength ++ ;
            else
                sequenceLength = 0 ;

            if(sequenceLength >= 5){
                Combination straightCombo = Combination.STRAIGHT_FLUSH ;
                straightCombo.setHighCard(i)  ;

                bestCombo = straightCombo ;
                bestCombo.setSuite(targetSuite);
            }

        }

        return bestCombo ;

    }
}
