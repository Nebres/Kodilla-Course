package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.*;

public class DataBase {

    public static Item initializeItem1() {
        return new Item("TV",4.0);
    }

    private static Item initializeItem2() {
        return new Item ("Cabele in coil", 12.6);
    }

    private static Item initializeItem3() {
        return new Item ("T-shirt sell by weight", 88.3);
    }

    public static Buyer initializeBuyer1() {
        return new Buyer("Jan89", "Janusz Korczak", "Warszawa 02-200");
    }

    public static Buyer initializeBuyer2() {
        return new Buyer("Kris", "Krzysztof Robak", "Kraków 12-221");
    }


    public static Set<Item> createItemsSet() {
        Set<Item> items = new HashSet<>();
        items.add(initializeItem1());
        items.add(initializeItem2());
        items.add(initializeItem3());

        return items;
    }

}

