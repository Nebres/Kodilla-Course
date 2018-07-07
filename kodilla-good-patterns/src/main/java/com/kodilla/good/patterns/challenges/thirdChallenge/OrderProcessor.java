package com.kodilla.good.patterns.challenges.thirdChallenge;

public class OrderProcessor {

    private final Supplier supplier;

    public OrderProcessor(Supplier supplier) {
        this.supplier = supplier;
    }

    public void printOffer() {
        System.out.println(supplier.getInformationAboutCompany());
    }

    public void process(String productName, double quantity) {

        if(new OrderValidator().validateOrder(productName, quantity, supplier.getProductsList())) {
            System.out.println("Order Accepted!");
        } else {
            System.out.println("Order Rejected");
        }
    }

}
