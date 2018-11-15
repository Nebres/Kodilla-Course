package collection.lists.fourthTask;

import java.util.ArrayList;
import java.util.Random;

public class ClockGenerator {

    private final static Random GENERATOR = new Random();
    private final static int MAX_NUMBERS_OF_CLOCKS = 40;
    private final static int NUMBERS_OF_CLOCKS = GENERATOR.nextInt(MAX_NUMBERS_OF_CLOCKS);
    private final static int MAX_RANDOM_HOUR = 24;
    private final static int MAX_RANDOM_MINUTES = 60;

    public static ArrayList<SimpleClock> generateClocks() {

        ArrayList<SimpleClock> clockList = new ArrayList<>();

        for (int i = 0; i < NUMBERS_OF_CLOCKS; i++) {

            clockList.add(new SimpleClock(GENERATOR.nextInt(MAX_RANDOM_HOUR),GENERATOR.nextInt(MAX_RANDOM_MINUTES)));
        }
        return clockList;
    }

}
