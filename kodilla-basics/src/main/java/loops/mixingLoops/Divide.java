package loops.mixingLoops;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Divide {

    private ArrayList<String> oddList = new ArrayList<String>();
    private ArrayList<String> evenList = new ArrayList<String>();
    private ArrayDeque<String> list;

    public Divide(ArrayDeque<String> list) {
        this.list = list;
    }


    public void divinedStock() {

        for (String a : list) {
            if (list.size() != 0 ){
                if (a.length() % 2 == 0) {
                    this.evenList.add(a);
                } else {
                    this.oddList.add(a);
                }
            }
        }
    }

    public void printLists() {

        for (String even : evenList) {
            System.out.println("String with even numbers of a: " + even);
        }

        for (String odd : oddList) {
            System.out.println("String with odd numbers of a: " + odd);
        }
    }

    public void runProcess() {
        divinedStock();
        printLists();
    }

}
