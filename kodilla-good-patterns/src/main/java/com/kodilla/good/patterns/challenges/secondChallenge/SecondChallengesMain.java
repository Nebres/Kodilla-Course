package com.kodilla.good.patterns.challenges.secondChallenge;

public class SecondChallengesMain {

    public static void main(String[] args) {

        DataBase db = new DataBase();
        OrdersRepository orders = new OrdersRepository();

        new ProductOrderService(new Order(
                db.initializeItem1(),
                db.initializeSeller1(),
                db.initializeBuyer1(),
                2))
                .sellProcess();

        new ProductOrderService(new Order(
                db.initializeItem2(),
                db.initializeSeller1(),
                db.initializeBuyer2(),
                0.4))
                .sellProcess();

        new ProductOrderService(new Order(
                db.initializeItem3(),
                db.initializeSeller2(),
                db.initializeBuyer1(),
                23.4)
        )
                .sellProcess();

        new ProductOrderService(new Order(
                db.initializeItem1(),
                db.initializeSeller1(),
                db.initializeBuyer2(),
                100.0))
                .sellProcess();

        new ProductOrderService(new Order(
                db.initializeItem1(),
                db.initializeSeller1(),
                db.initializeBuyer2(),
                0.0))
                .sellProcess();

        orders.printLists();
    }

}