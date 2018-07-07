package com.kodilla.good.patterns.challenges.secondChallenge;

public class Item {

    private String itemName;
    private double itemQuantity;
    private int itemId;

    public Item(String itemName,double itemQuantity, int itemId) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemQuantity() {
        return itemQuantity;
    }

    public int getItemId() {
        return itemId;
    }

}


