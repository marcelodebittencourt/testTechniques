package targetsoftware;

public class Train {

    int hour;
    int minute;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Train(int hour, int minute) {

        if ((hour < 0) || (hour > 23)) {
            System.out.println("Invalid informed hour: " + hour + ". Please inform hour betweeen 0 and 23. I will assume 0 hour.");
            hour = 0;
        }

        if ((minute < 0) || (minute > 59)) {
            System.out.println("Invalid informed minute: " + minute + ". Please inform minute betweeen 0 and 59. I will assume 0 minute.");
            minute = 0;
        }

        setHour(hour);
        setMinute(minute);
    }

    public boolean isDiscount() {
        if ((getHour() == 9) && (getMinute() < 30))
            return false;

        if ((getHour() >= 0) && (getHour() < 9))
            return false;

        if ((getHour() == 16) && (getMinute() >= 1))
            return false;

        if ((getHour() > 16) && (getHour() <= 18))
            return false;

        if ((getHour() == 19) && (getMinute() <=30))
            return false;

        //discount
        //between 9h31 and 16h00
        //after 19h30
        return true;
    }

}
