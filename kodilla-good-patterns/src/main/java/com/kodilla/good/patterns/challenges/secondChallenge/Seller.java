package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.Map;

public class Seller implements User {

    private String nick;
    private String realName;
    private String address;
    private Map<Integer, Item> itemsForSell;

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

}
