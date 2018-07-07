package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.secondChallenge.DataBase;
import com.kodilla.good.patterns.challenges.secondChallenge.Order;
import com.kodilla.good.patterns.challenges.secondChallenge.ProductOrderService;

public class SecondChallengesMain {

    public static void main(String[] args) {

        Order order1 = new DataBase().initializeOrder1();
        Order order2 = new DataBase().initializeOrder2();
        Order order3 = new DataBase().initializeOrder3();
        Order order4 = new DataBase().initializeOrder4();
        Order order5 = new DataBase().initializeOrder5();

        new ProductOrderService(order1).sellProcess();
        new ProductOrderService(order2).sellProcess();
        new ProductOrderService(order3).sellProcess();
        new ProductOrderService(order4).sellProcess();
        new ProductOrderService(order5).sellProcess();
    }

}