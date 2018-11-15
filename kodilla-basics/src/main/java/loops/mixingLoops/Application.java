package loops.mixingLoops;

import java.util.ArrayDeque;

public class Application {

    public static void main (String[] args) {

        ArrayDeque<String> aList = new Stock().fillInStock();
        new Divide(aList).runProcess();
    }

}
