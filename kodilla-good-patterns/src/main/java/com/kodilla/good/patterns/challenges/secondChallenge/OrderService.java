package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.Set;

public class OrderService {

    public boolean isAccepted(Order order, Set<Item> itemSet) {

        Item theItem = order.getItem();

        double quantityWanted = order.getQuantity();
        double quantityOnStock = itemSet
                .stream()
                .filter(item -> item.equals(theItem))
                .mapToDouble(Item::getItemQuantity)
                .sum();

        return itemSet.contains(theItem) && quantityWanted <= quantityOnStock && quantityWanted > 0;
    }

}

