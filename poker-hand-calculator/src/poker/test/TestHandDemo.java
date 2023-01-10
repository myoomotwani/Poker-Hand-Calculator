package poker.test;


import poker.Combination;
import poker.combinationfinder.CombinationFinder;

public class TestHandDemo {

    public static void main(String[] args) {
        TestHandDemo testHandDemo = new TestHandDemo();
        testHandDemo.startDemo();
    }

    void startDemo(){

        CombinationFinder combinationFinder = new CombinationFinder();

        HardCodedDealer hardCodedDealer = new HardCodedDealer();
        Combination dummyPlayerCombo = combinationFinder.getBestCombo (hardCodedDealer.getHandCards() , hardCodedDealer.getFlop() ,
                hardCodedDealer.getTurn() , hardCodedDealer.getRiver()) ;

        System.out.println("Player dummy has " + dummyPlayerCombo);


    }
}
