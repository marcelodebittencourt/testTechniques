package targetsoftware;

public class Train {

    int hour;
    int minute;

    public Train(int hour, int minute) {

        if ((hour < 0) || (hour > 23)) {
            System.out.println("Invalid informed hour: " + hour + ". Please inform hour betweeen 0 and 23. I will assume 0 hour.");
            hour = 0;
        }

        if ((minute < 0) || (minute > 59)) {
            System.out.println("Invalid informed minute: " + minute + ". Please inform minute betweeen 0 and 59. I will assume 0 minute.");
            minute = 0;
        }

        this.hour = hour;
        this.minute = minute;
    }

    public boolean isDiscount() {
        if ((hour == 9) && (minute < 30))
            return false;

        if ((hour >= 0) && (hour < 9))
            return false;

        if ((hour == 16) && (minute >= 1))
            return false;

        if ((hour > 16) && (hour <= 18))
            return false;

        if ((hour == 19) && (minute <=30))
            return false;

        //discount
        //between 9h31 and 16h00
        //after 19h30
        return true;
    }

}
