package collection.lists.thirdTask;

import java.util.Random;

public class Cannon {

    private static final Random r = new Random();
    private boolean loaded;

    public Cannon() {
        this.loaded = r.nextBoolean();
    }

    public boolean isLoaded(){
        return this.loaded;
    }

    public void setCannon(boolean loaded) {
        this.loaded = loaded;
    }

    public void fire() {
        if (!isLoaded()) {
            System.out.println("not loaded");
            setCannon(true);
        }
        System.out.println("Fire");
    }

}


