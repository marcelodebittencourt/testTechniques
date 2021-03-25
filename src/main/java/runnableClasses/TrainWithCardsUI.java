package runnableClasses;

import baseClasses.Train;
import baseClasses.TrainWithCards;

import java.util.Scanner;

public class TrainWithCardsUI {
    public static void main(String args[]) {

        int age;
        boolean railroadAgeCard;
        boolean withChild;
        boolean railroadFamilyCard;

        TrainWithCards trainWithCards;

        while ( true ) {

            Scanner in = new Scanner(System.in);

            System.out.println("How old are you?");
            age = in.nextInt();

            System.out.println("*****************************************");
            System.out.println("* WARNING! For the next four questions: *");
            System.out.println("*          Answer true for YES.         *");
            System.out.println("*          Answer false for NO.         *");
            System.out.println("*****************************************");

            System.out.println("Do you have a railroad AGE card?");
            railroadAgeCard = in.nextBoolean();

            System.out.println("Are you travelling with a CHILD/TEENAGER under 16?");
            withChild = in.nextBoolean();

            System.out.println("Do you have a railroad FAMILY card?");
            railroadFamilyCard = in.nextBoolean();

            trainWithCards = new TrainWithCards(age, railroadAgeCard, withChild, railroadFamilyCard);

            System.out.println("*** DISCOUNT: " + trainWithCards.getDiscount() + " %");

            System.out.println("Do you want to continue inserting new records?");

            if( ! in.nextBoolean() )
                break;
        }

    }

}
