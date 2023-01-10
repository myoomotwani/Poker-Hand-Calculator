package poker;


import poker.combinationfinder.CombinationFinder;

public class PokerGamePlayDemo {


    public static void main(String[] args) {
        PokerGamePlayDemo pokerGamePlayDemo = new PokerGamePlayDemo();
        pokerGamePlayDemo.startThePlay();
    }

    void startThePlay(){

        Dealer dealer = new Dealer(2);

        dealer.printDeck() ;
        Card[][] handCards = dealer.getHandCardForAllPlayers();

        Card[] flop = dealer.getFlop();

        Card turn = dealer.getNextCardInDeck();
        Card river = dealer.getNextCardInDeck();

        System.out.println("");
        System.out.println("The hand cards are : " );


        System.out.println("For player 1 " );
        for(int i = 0 ; i < 2 ; i++){
            System.out.println(handCards[0][i]);
        }

        System.out.println("For player 2 " );
        for(int i = 0 ; i < 2 ; i++){
            System.out.println(handCards[1][i]);
        }

        System.out.println("");
        CombinationFinder combinationFinder = new CombinationFinder();
        Combination bestCombo1 = combinationFinder.getBestCombo( handCards[0] , flop , turn , river );
        Combination bestCombo2 = combinationFinder.getBestCombo( handCards[1] , flop , turn , river );

        System.out.println("Player 1 has " + bestCombo1);
        System.out.println("Player 2 has " + bestCombo2);





    }


}
