package com.kodilla.good.patterns.challenges.secondChallenge;

public class Order {

    private final Item item;
    private final Buyer buyer;
    private final int quantity;

    public Order(Item item, Buyer buyer, int quantity) {
        this.item = item;
        this.buyer = buyer;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item=" + item +
                ", buyer=" + buyer.toString() +
                ", quantity=" + quantity +
                '}';
    }

}
