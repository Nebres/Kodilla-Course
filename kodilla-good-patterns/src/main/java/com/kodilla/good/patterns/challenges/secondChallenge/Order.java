package com.kodilla.good.patterns.challenges.secondChallenge;

import java.time.LocalDate;

public class Order {

    private Item item;
    private Seller seller;
    private Buyer buyer;
    private double quantity;

    public Order(Item item, Seller seller, Buyer buyer, double quantity) {
        this.item = item;
        this.seller = seller;
        this.buyer = buyer;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public Seller getSeller() {
        return seller;
    }

    public double getQuantity() {
        return quantity;
    }

    public Buyer getBuyer() {
        return buyer;
    }

}
