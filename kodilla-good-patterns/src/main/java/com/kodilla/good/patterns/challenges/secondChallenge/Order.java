package com.kodilla.good.patterns.challenges.secondChallenge;

public class Order {

    private final Item item;
    private final Seller seller;
    private final Buyer buyer;
    private final double quantity;

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

    @Override
    public String toString() {
        return "\nOrder{" +
                "item=" + item.getItemName() +
                ", seller=" + seller.getUserRealName() +
                ", buyer=" + buyer.getUserRealName() +
                ", quantity=" + quantity +
                "}\n";
    }

}
