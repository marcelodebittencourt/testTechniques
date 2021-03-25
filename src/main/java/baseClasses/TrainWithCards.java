package baseClasses;

public class TrainWithCards {

    int age;
    boolean railroadAgeCard;
    boolean withChild;
    boolean railroadFamilyCard;

    public TrainWithCards(int age, boolean railroadAgeCard, boolean withChild, boolean railroadFamilyCard) {

        if ( railroadAgeCard && railroadFamilyCard )
            System.out.println("WARNING! Invalid scenario: it is allowed to have just one card");

        this.age = age;
        this.railroadAgeCard = railroadAgeCard;
        this.withChild = withChild;
        this.railroadFamilyCard = railroadFamilyCard;
    }

    public boolean isRailroadAgeCard() {
        return railroadAgeCard;
    }

    public void setRailroadAgeCard(boolean railroadAgeCard) {
        this.railroadAgeCard = railroadAgeCard;
    }

    public boolean isWithChild() {
        return withChild;
    }

    public void setWithChild(boolean withChild) {
        this.withChild = withChild;
    }

    public boolean isRailroadFamilyCard() {
        return railroadFamilyCard;
    }

    public void setRailroadFamilyCard(boolean railroadFamilyCard) {
        this.railroadFamilyCard = railroadFamilyCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDiscount() {
        if ( isRailroadAgeCard() && isRailroadFamilyCard() )
            return 0;

        if ( age >= 60 && isRailroadAgeCard() )
            return 34;

        if ( isWithChild() ) {
            if ( isRailroadFamilyCard() )
                return 50;
            else
                return 10;
        }

        return 0;

    }

}
