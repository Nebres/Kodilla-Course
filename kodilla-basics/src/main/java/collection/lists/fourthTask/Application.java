package collection.lists.fourthTask;

import java.util.ArrayList;

public class Application {

    public static void main (String[] args) {

        new ClockGenerator();
        ArrayList<SimpleClock> clockList = ClockGenerator.generateClocks();
        new ClockSwitcher(clockList).run();
    }

}
