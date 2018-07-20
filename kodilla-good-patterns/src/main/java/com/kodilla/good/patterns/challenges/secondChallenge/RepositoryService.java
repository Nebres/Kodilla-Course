package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.Set;

public class RepositoryService {

    private static Set<Item> items = DataBase.createItemsSet();

    public static void changeQuantity(Item theItem, double theQuantity) {

            Item itemAfterChange = new Item(theItem.getItemName(), theItem.getItemQuantity() - theQuantity);
            items.add(itemAfterChange);
    }

    public static Set<Item> getItems() {
        return items;
    }

}
