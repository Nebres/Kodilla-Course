package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.Objects;

public class Item {

    private final String id;
    private final double quantity;
    private final int itemUniqueId;

    public Item(String id,double quantity, int itemUniqueId) {
        this.id = id;
        this.quantity = quantity;
        this.itemUniqueId = itemUniqueId;
    }

    public String getItemName() {
        return id;
    }

    public double getItemQuantity() {
        return quantity;
    }

    public int getItemId() {
        return itemUniqueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == null) return false;
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(getItemName(), item.getItemName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getItemName());
    }

}


