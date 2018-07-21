package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.HashSet;
import java.util.Set;

public class SecondChallengesMain {

    public static Item initializeItem1() {
        return new Item("TV",4.0);
    }

    private static Item initializeItem2() {
        return new Item ("Cabele in coil", 12.6);
    }

    private static Item initializeItem3() {
        return new Item ("T-shirt sell by weight", 88.3);
    }

    public static Buyer initializeBuyer1() {
        return new Buyer("Jan89", "Janusz Korczak", "Warszawa 02-200");
    }

    public static Set<Item> createItemsSet() {
        Set<Item> items = new HashSet<>();
        items.add(initializeItem1());
        items.add(initializeItem2());
        items.add(initializeItem3());

        return items;
    }

    public static void main(String[] args) {

        InformationService information = new InformationService();
        OrderService orderService = new OrderService();

        Order order = new Order(initializeItem1(), initializeBuyer1(), 2);

        ProductOrderService productOrderService = new ProductOrderService(information, orderService, order);
        productOrderService.process();

        Order order2 = new Order(initializeItem1(), initializeBuyer1(), 5);

        ProductOrderService productOrderService2 = new ProductOrderService(information, orderService, order2);
        productOrderService2.process();
    }

}