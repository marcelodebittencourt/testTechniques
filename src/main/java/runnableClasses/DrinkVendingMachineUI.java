package runnableClasses;

import baseClasses.DrinkVendingMachine;

import java.util.Scanner;

public class DrinkVendingMachineUI {
    public static void main(String args[]) {

        DrinkVendingMachine drinkVendingMachine;

        Scanner in = new Scanner(System.in);

        System.out.println("Choose your type of beverage:");
        System.out.println("0 - EXIT THE PROGRAM");
        System.out.println("1 - Hot");
        System.out.println("2 - Cold");

        int typeBeverage = in.nextInt();
        int beverage;
        int addMilk;
        int addSugar;

        if (typeBeverage == 0) {
            System.out.println("Exiting the program...");
        }

        if (typeBeverage == 2) {
            System.out.println("You chose:");
            System.out.println("2 - Cold");

            System.out.println("Choose your beverage:");
            System.out.println("3 - Soda");
            System.out.println("4 - Juice");
            beverage = in.nextInt();

            System.out.println("You chose: ");
            if (beverage == 3)
                System.out.println("3 - Soda");
            else
                System.out.println("4 - Juice");

            drinkVendingMachine = new DrinkVendingMachine(typeBeverage, beverage);
            System.out.println(drinkVendingMachine.getDrinkToDeliver());
        }

        if (typeBeverage == 1) {
            System.out.println("You chose:");
            System.out.println("1 - Hot");

            System.out.println("Choose your beverage:");
            System.out.println("1 - Tea");
            System.out.println("2 - Coffee");
            beverage = in.nextInt();

            System.out.println("You chose: ");
            if (beverage == 1)
                System.out.println("1 - Tea");
            else
                System.out.println("2 - Coffee");

            System.out.println("Do you want to add MILK?");
            System.out.println("0 - No");
            System.out.println("1 - Yes");
            addMilk = in.nextInt();

            if (addMilk == 0)
                System.out.println("You did not add milk.");
            else
                System.out.println("You added milk.");

            System.out.println("Do you want to add SUGAR?");
            System.out.println("0 - No");
            System.out.println("1 - Yes");
            addSugar = in.nextInt();

            if (addSugar == 0)
                System.out.println("You did not add sugar.");
            else
                System.out.println("You added sugar.");

            drinkVendingMachine = new DrinkVendingMachine(typeBeverage, beverage, addMilk, addSugar);
            System.out.println(drinkVendingMachine.getDrinkToDeliver());
        }


    }
}
