package poker;

// this bean is to represent the poker hand
public enum Combination implements  Comparable<Combination> {

    ROYAL_FLUSH,
    STRAIGHT_FLUSH ,
    FLUSH,
    STRAIGHT,
    HIGH_CARD;

    public int getHighCard() {
        return highCard;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setHighCard(int highCard) {
        this.highCard = highCard;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    int highCard ;
    Suite suite ;




    @Override
    public String toString() {

        if(this == STRAIGHT )
            return super.toString() + " with high card : " + highCard;

        if(this == FLUSH || this == ROYAL_FLUSH)
            return super.toString() + " with suite : " + suite;

        if(this == STRAIGHT_FLUSH)
            return super.toString() + " with suite : " + suite + " with high card : " + highCard;

        return super.toString() ;
    }
}
