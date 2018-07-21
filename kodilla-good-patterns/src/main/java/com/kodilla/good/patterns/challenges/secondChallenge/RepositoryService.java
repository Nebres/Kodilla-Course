package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.*;

public class RepositoryService {

    private Set<Item> itemsBase;

    public RepositoryService(Set<Item> itemsBase) {
        this.itemsBase = itemsBase;
    }

    public Set<Item> getItemBase() {
        return itemsBase;
    }

    public void changeItemsInDataBase(Order order) {

        double baseNumber = itemsBase
                .stream()
                .filter(item -> item.equals(order.getItem()))
                .mapToDouble(Item::getItemQuantity)
                .sum();

        double quantityToSub = order.getItem().getItemQuantity();

        double actualQuantity = baseNumber - quantityToSub;
        String actualId = order.getItem().getItemName();

        Item theItem = new Item(actualId, actualQuantity);

        this.itemsBase.add(theItem);
    }

}

