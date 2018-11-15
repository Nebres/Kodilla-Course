package collection.lists.fourthTask;

import java.util.List;

public class ClockSwitcher {

    private final static String COMMUNICATE_BEFORE_SWITCH = "Clocks before switch:";
    private final static String COMMUNICATE_AFTER_SWITCH = "Clocks after switch:";

    private final List<SimpleClock>	simpleClockList;


    public ClockSwitcher(List<SimpleClock> simpleClockList) {
        this.simpleClockList = simpleClockList;
    }

    private void printClocksBeforeSwitch() {

        System.out.println(COMMUNICATE_BEFORE_SWITCH + "\n");

        for (SimpleClock clock : simpleClockList) {
            String tempClock = String.format("%02d:%02d", clock.getHour(), clock.getMinute());
            System.out.println(tempClock);
        }
    }

    private void switchClock() {

        System.out.println("\n" + COMMUNICATE_AFTER_SWITCH + "\n");

        for (SimpleClock clock : simpleClockList) {

            clock.addOneMinute();
            String tempClock = String.format("%02d:%02d", clock.getHour(), clock.getMinute());
            System.out.println(tempClock);
        }
    }

    public void run() {
        printClocksBeforeSwitch();
        switchClock();
    }

}
