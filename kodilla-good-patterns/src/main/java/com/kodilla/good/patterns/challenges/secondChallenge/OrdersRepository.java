package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.ArrayList;
import java.util.List;

public class OrdersRepository {

    private final static String LIST_OF_ACCEPTED_ORDERS = "\nList of accepted orders:";
    private final static String LIST_OF_REJECTED_ORDERS = "\nList of rejected orders:";
    private static List<Order> acceptedOrders = new ArrayList<>();
    private static List<Order> rejectedOrders= new ArrayList<>();

    public void addPositionToAcceptedList(Order order) {
        acceptedOrders.add(order);
    }

    public void addPositionToRejectedList(Order order) {
        rejectedOrders.add(order);
    }

    public void printLists() {
        System.out.println(LIST_OF_ACCEPTED_ORDERS);
        acceptedOrders.forEach(System.out::print);
        System.out.println(LIST_OF_REJECTED_ORDERS);
        rejectedOrders.forEach(System.out::print);
    }

}
