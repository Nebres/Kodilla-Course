package collection.sets.task2;

import java.util.HashSet;
import java.util.List;

public class OrdersGenerator {
    private final List<Order> orderList;

    public OrdersGenerator(List<Order> orderList) {
        this.orderList = orderList;
    }

    public void hashSetCreator() {

        HashSet<Order> orderSet = new HashSet<Order>();

        for (Order order : orderList) {
            orderSet.add(order);
        }
        System.out.println(orderSet);
    }

}
