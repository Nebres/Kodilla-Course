package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.Set;

public class OrderService {

    public boolean isAccepted(Order order) {

        Item theItem = order.getItem();
        Set<Item> theSet = RepositoryService.getItems();
        double quantityWanted = order.getItem().getItemQuantity();
        double quantityOnStock = theSet
                .stream()
                .filter(item -> item.equals(theItem))
                .mapToDouble(Item::getItemQuantity)
                .sum();

        return theSet.contains(theItem) && quantityWanted <= quantityOnStock && quantityWanted > 0;
    }

}

