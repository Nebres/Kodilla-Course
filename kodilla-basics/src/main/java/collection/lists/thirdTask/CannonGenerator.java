package collection.lists.thirdTask;

import java.util.LinkedList;
import java.util.Random;

public class CannonGenerator {

    private static final Random RANDOM = new Random();

    public static LinkedList<Cannon> getCannons() {

        LinkedList<Cannon> cannonList = new LinkedList<>();

        for (int i = 0; i < RANDOM.nextInt(15) + 5; i++) {
            cannonList.add(new Cannon());
        }
        return cannonList;
    }

}
