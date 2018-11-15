package collection.lists.fourthTask;

public class SimpleClock {

    private int hour;
    private int minute;

    public SimpleClock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void addOneMinute() {
        minute++;
        int plusHour = minute / 60;
        minute = minute % 60;
        hour = (hour + plusHour) % 24;
    }

}
