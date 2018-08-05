package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.Objects;

public class Item {

    private final String id;

    public Item(String id) {
        this.id = id;
    }

    public String getItemName() {
        return id;
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


