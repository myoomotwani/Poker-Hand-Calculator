package poker;

import java.util.Random;

// class to deal cards to players
public class Dealer {

    int numOfPlayers ;
    Card[] deck ;

    int nextCardIndex ;

    Dealer(int numOfPlayers){

        this.numOfPlayers = numOfPlayers ;
        deck = new Card[53] ;


        for(int i = 1 ; i <= 52 ; i++){
            deck[i ] = new Card(i);
        }

        // now shuffle
        for(int i = 0 ; i < 3 ; i++){
            shuffleDeck();
        }

        nextCardIndex = 1 ;

    }

    void shuffleDeck(){

        // for each card , find random swap number , and then swap
        Random rand = new Random();
        for(int i = 1 ; i <= 52 ; i++){
            int swapIndex = rand.nextInt(1, 52) ;
            Card temp = deck[i];
            deck[i] = deck[swapIndex];
            deck[swapIndex] = temp ;

            if(deck[i] == null || deck[swapIndex] == null)
                System.out.println("null found");

        }

    }

    void printDeck(){

        for(int i = 1 ; i <= 52 ; i++){
            System.out.println(deck[i]);
        }
    }
    Card[][] getHandCardForAllPlayers(){

        Card[][] cards = new Card[numOfPlayers][2];

        for(int i = 0 ; i < numOfPlayers ; i++){
            cards[i] = new Card[2];
            cards[i][0] = deck[nextCardIndex++];
        }

        for(int i = 0 ; i < numOfPlayers ; i++){

            cards[i][1] = deck[nextCardIndex++];
        }


        return cards ;

    }

    // flop = first 3 table cards.
    Card[] getFlop(){

        nextCardIndex++ ; // burn one card

        Card[] cards = new Card[3];
        cards[0] = deck[nextCardIndex++];
        cards[1] = deck[nextCardIndex++];
        cards[2] = deck[nextCardIndex++];

        return  cards ;

    }

    Card getNextCardInDeck(){

        nextCardIndex++ ; // burn one card
        return  deck[nextCardIndex++] ;

    }



}
