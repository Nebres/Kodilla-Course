package com.kodilla.good.patterns.challenges.secondChallenge;

import static com.kodilla.good.patterns.challenges.secondChallenge.DataBase.*;

public class SecondChallengesMain {

    public static void main(String[] args) {

        InformationService information = new InformationService();
        OrderService orderService = new OrderService();
        new RepositoryService();

        Order order = new Order(initializeItem1(), initializeBuyer1(), 2);
        Order order2 = new Order(initializeItem1(), initializeBuyer2(), 2);
        Order order3 = new Order(initializeItem1(), initializeBuyer2(), 0);

        new ProductOrderService(information, orderService, order).process();
        new ProductOrderService(information, orderService, order2).process();
        new ProductOrderService(information, orderService, order3).process();
    }

}