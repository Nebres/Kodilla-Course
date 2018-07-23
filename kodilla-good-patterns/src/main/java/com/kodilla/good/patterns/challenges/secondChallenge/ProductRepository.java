package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

    private Map<Item, Integer> products;

    public ProductRepository() {
        this.products = new HashMap<>();
    }

    public void add(Item item, Integer quantity) {

        if (products.containsKey(item)) {
            this.products.put(item, products.get(item) + quantity);
        } else {
            this.products.put(item,quantity);
        }
    }

    public void remove(Item item, Integer quantity) {
            this.products.remove(item, quantity);
    }

    public void replace(Item item, Integer quantity) {

        int actualOnStock = products.get(item);
        int result = actualOnStock - quantity;

        if (actualOnStock == result) {
            remove(item, quantity);
        } else {
            this.products.put(item, result);
        }
    }

    public boolean check(Item item, Integer quantity) {
        return products.containsKey(item) && products.get(item) >= quantity && quantity >= 0;
    }

}

