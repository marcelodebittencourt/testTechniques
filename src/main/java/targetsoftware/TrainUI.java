package targetsoftware;

import java.util.Scanner;

public class TrainUI{
        public static void main(String args[]) {

            while ( true ) {

                Scanner in = new Scanner(System.in);

                System.out.println("TYPE -1 IN THE Hour to EXIT");

                System.out.println("Hour of your train: ");
                int hourToRead = in.nextInt();

                if(hourToRead == -1)
                    break;

                System.out.println("Minute of your train: ");
                int minuteToRead = in.nextInt();

                Train train = new Train(hourToRead, minuteToRead);

                String ticketType = "Full price ticket";

                if (train.isDiscount()) {
                    ticketType = ("Discount ticket");
                }

                System.out.println("*** Your train ticker: " + ticketType + "\n");

            }

        }

}
