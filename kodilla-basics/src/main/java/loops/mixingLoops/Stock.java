package loops.mixingLoops;

import java.util.ArrayDeque;
import java.util.Random;

public class Stock {

    private ArrayDeque<String> aList;

    Random generator = new Random();

    public Stock() {
        this.aList = new ArrayDeque<String>();
    }

    public String generateRandomString() {

        int k = generator.nextInt(49) + 1;
        StringBuilder builder = new StringBuilder();
        String a = "A";
        String temp = "";

        for ( int i = 0 ; i < k ; i++) {
            temp = builder.append(a).toString();
            if( i == k) {
                return temp;
            }
        }

        return temp;
    }

    public ArrayDeque<String> fillInStock() {

        for ( int i = 0; i <= 50; i++) {
            this.aList.push(generateRandomString());
        }
        return this.aList;
    }

}
