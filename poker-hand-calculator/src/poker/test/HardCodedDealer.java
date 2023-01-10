package poker.test;


import poker.Card;
import poker.Suite;

public class HardCodedDealer {

     Card[] getHandCards(){

        Card card1 = new Card( 5 , Suite.DIAMOND );
        Card card2 = new Card( 11 , Suite.DIAMOND );

        return new Card[] { card1 , card2} ;


    }

    // flop , turn , river

    Card[] getFlop(){

        Card card1 = new Card( 10 , Suite.DIAMOND );
        Card card2 = new Card( 13 , Suite.DIAMOND );
        Card card3 = new Card( 12 , Suite.DIAMOND );

        return new Card[] { card1 , card2 , card3} ;

    }

    Card getTurn(){

        return new Card( 3 , Suite.DIAMOND );


    }

    Card getRiver(){

        return new Card( 2 , Suite.DIAMOND );

    }



}
