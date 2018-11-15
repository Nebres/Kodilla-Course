package collection.lists.thirdTask;

import java.util.LinkedList;

public class Application {

    public static void main (String[] args) {

        LinkedList<Cannon> cannonList = new CannonGenerator().getCannons();

        for (Cannon cannon : cannonList) {
            new Cannon().fire();
        }
    }

}
