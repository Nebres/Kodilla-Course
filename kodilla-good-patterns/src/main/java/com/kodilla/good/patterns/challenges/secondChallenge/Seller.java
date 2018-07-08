package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.Map;
import java.util.Objects;

public class Seller implements User {

    private final String nick;
    private final String realName;
    private final String address;
    private final Map<Integer, Item> itemsForSell;

    public Seller(String nick, String realName, String address, Map<Integer, Item> itemsForSell) {
        this.nick = nick;
        this.realName = realName;
        this.address = address;
        this.itemsForSell = itemsForSell;
    }

    public String getUserNick() {
        return nick;
    }

    public String getUserRealName() {
        return realName;
    }

    public String getUserAddress() {
        return address;
    }

    public Map<Integer, Item> getItmesForSell() {
        return itemsForSell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == null) return false;
        if (this == o) return true;
        if (!(o instanceof Seller)) return false;
        Seller seller = (Seller) o;
        return Objects.equals(nick, seller.nick) &&
                Objects.equals(realName, seller.realName) &&
                Objects.equals(address, seller.address) &&
                Objects.equals(itemsForSell, seller.itemsForSell);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nick, realName, address, itemsForSell);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "nick='" + nick + '\'' +
                ", realName='" + realName + '\'' +
                ", address='" + address + '\'' +
                ", itemsForSell=" + itemsForSell +
                '}';
    }

}

