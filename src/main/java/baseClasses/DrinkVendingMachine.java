package baseClasses;

import runnableClasses.DrinkVendingMachineUI;

public class DrinkVendingMachine {

    int typeBeverage;
    int beverage;
    int addMilk;
    int addSugar;

    public int getTypeBeverage() {
        return typeBeverage;
    }

    public void setTypeBeverage(int typeBeverage) {
        this.typeBeverage = typeBeverage;
    }

    public int getBeverage() {
        return beverage;
    }

    public void setBeverage(int beverage) {
        this.beverage = beverage;
    }

    public int getAddMilk() {
        return addMilk;
    }

    public void setAddMilk(int addMilk) {
        this.addMilk = addMilk;
    }

    public int getAddSugar() {
        return addSugar;
    }

    public void setAddSugar(int addSugar) {
        this.addSugar = addSugar;
    }

    public DrinkVendingMachine(int typeBeverage, int beverage) {
        this.typeBeverage = typeBeverage;
        this.beverage = beverage;

        this.addMilk = 0;
        this.addSugar = 0;
    }

    public DrinkVendingMachine(int typeBeverage, int beverage, int addMilk, int addSugar) {
        this.typeBeverage = typeBeverage;
        this.beverage = beverage;
        this.addMilk = addMilk;
        this.addSugar = addSugar;
    }

    public String getDrinkToDeliver() {

        String textDrinkToDeliver = "";

        textDrinkToDeliver += "*** It will be delivered a beverage:\n";
        if (typeBeverage == 1) {
            textDrinkToDeliver += "1 - Hot\n";
            if (beverage == 1)
                textDrinkToDeliver += "1 - Tea\n";
            else
                textDrinkToDeliver += "2 - Coffee\n";
            if (addMilk == 0)
                textDrinkToDeliver += "0 - Without Milk\n";
            else
                textDrinkToDeliver += "1 - With Milk\n";
            if (addSugar == 0)
                textDrinkToDeliver += "0 - Without Sugar\n";
            else
                textDrinkToDeliver += "1 - With Sugar\n";
        } else {
            textDrinkToDeliver += "2 - Cold\n";
            if (beverage == 1)
                textDrinkToDeliver += "3 - Soda\n";
            else
                textDrinkToDeliver += "4 - Juice\n";
        }
        return textDrinkToDeliver;
    }
}