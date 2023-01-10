package poker;

public class Card {

    int faceValue ;
    Suite suite ;
    int id ;
    public int getFaceValue() {
        return faceValue;
    }

    public Suite getSuite() {
        return suite;
    }

    public int getId() {
        return id;
    }


    public Card(int id ){

        this.id = id ;

        faceValue = id % 13 ;

        if(faceValue == 0)
            faceValue = 13 ;

        suite = Suite.getSuiteFromId((id -1 )/13);



    }

    public Card(int faceValue , Suite suite ){

        this.faceValue = faceValue ;
         this.suite = suite ;

         this.id = 13*  + faceValue  ;
    }

    @Override
    public String toString() {
        return faceValue + " of " + suite;
    }
}
