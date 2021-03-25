package runnableClasses;

import baseClasses.Train;

import java.util.Scanner;

public class TrainUI{
        public static void main(String args[]) {

            int hourToRead;
            int minuteToRead;
            String ticketType;

            while ( true ) {

                Scanner in = new Scanner(System.in);

                System.out.println("TYPE -1 IN THE Hour to EXIT");

                System.out.println("Hour of your train: ");
                hourToRead = in.nextInt();

                if(hourToRead == -1)
                    break;

                System.out.println("Minute of your train: ");
                minuteToRead = in.nextInt();

                Train train = new Train(hourToRead, minuteToRead);

                ticketType = "Full price ticket";

                if (train.isDiscount()) {
                    ticketType = ("Discount ticket");
                }

                System.out.println("*** Your train ticker: " + ticketType + "\n");

            }

        }

}
