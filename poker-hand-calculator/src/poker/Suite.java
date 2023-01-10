package poker;

public enum Suite {




    DIAMOND(0),
    SPADE(1),
    HEART(2),
    CLUB(3);

    private int typeId ;
    public int getTypeId() {
        return typeId;
    }

    Suite(int typeId){
        this.typeId = typeId ;

    }


    public static Suite getSuiteFromId(int typeId){

        switch (typeId){

            case 0:
                return DIAMOND ;
            case 1:
                return SPADE ;
            case 2:
                return HEART ;
            case 3:
                return CLUB ;
            default:
                return null ;


        }
    }



}
