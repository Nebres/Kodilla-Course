package collection.sets.task2;

import java.util.Arrays;
import java.util.List;

public class Application {

    private final static List<Order> initOrder() {
        return Arrays.asList(
                new Order("xxz", 1),
                new Order("xxz", 1),
                new Order("xsz", 3),
                new Order("xaz", 4),
                new Order("xoz", 5),
                new Order("xoz", 5),
                new Order("xxz", 7),
                new Order("xxz", 7)
        );
    }

    public static void main (String[] args) {

        new OrdersGenerator(initOrder()).hashSetCreator();
    }

}
