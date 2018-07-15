package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

    public Item initializeItem1() {
        return new Item("TV",4.0,1);
    }

    public Item initializeItem2() {
        return new Item ("Cabele in coil", 12.6,2);
    }

    public Item initializeItem3() {
        return new Item ("T-shirt sell by weight", 88.3,3);
    }

    public Buyer initializeBuyer1() {
        return new Buyer("Jan89", "Janusz Korczak", "Warszawa 02-200");
    }

    public Buyer initializeBuyer2() {
        return new Buyer("Kris", "Krzysztof Robak", "Kraków 12-221");
    }

    private Map<Integer,Item> initializeItemsToSellMap1(){

        Map<Integer, Item> tempMap1 = new HashMap<>();

        tempMap1.put(initializeItem1().getItemId(), initializeItem1());
        tempMap1.put(initializeItem2().getItemId(), initializeItem2());

        return tempMap1;
    }

    private Map<Integer,Item> initializeItemsSellMap2(){

        Map<Integer, Item> tempMap2 = new HashMap<>();

        tempMap2.put(initializeItem3().getItemId(), initializeItem3());

        return tempMap2;
    }

    public Seller initializeSeller1() {
        return new Seller("JO", "Joanna Kowalczyk", "Poznań 60-150", initializeItemsToSellMap1());
    }

    public Seller initializeSeller2() {
        return new Seller("Rafik", "Rafał Kobrzyński", "Olsztyn 10-437", initializeItemsSellMap2());
    }

}
