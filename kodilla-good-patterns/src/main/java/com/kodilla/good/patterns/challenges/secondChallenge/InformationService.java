package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.Set;

import static com.kodilla.good.patterns.challenges.secondChallenge.OrderCommunicates.ACTUAL_QUANTITY;

public class InformationService {

    public void printInfoAboutBuyer(Order order, Set<Item> itemsSet) {
        System.out.println(order.getBuyer().toString());

        String theItem = order.getItem().getItemName();

        double actualOnStock = itemsSet
                .stream()
                .filter(item -> item.equals(order.getItem()))
                .mapToDouble(Item::getItemQuantity)
                .sum();

        System.out.println(String.format(ACTUAL_QUANTITY, theItem, actualOnStock));
    }

}
