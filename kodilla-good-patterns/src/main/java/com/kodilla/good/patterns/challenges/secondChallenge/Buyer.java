package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.Objects;

public class Buyer implements User {

    private final String nick;
    private final String realName;
    private final String address;

    public Buyer(String nick, String realName, String address) {
        this.nick = nick;
        this.realName = realName;
        this.address = address;

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

    @Override
    public boolean equals(Object o) {
        if (this == null) return false;
        if (this == o) return true;
        if (!(o instanceof Buyer)) return false;
        Buyer buyer = (Buyer) o;
        return Objects.equals(nick, buyer.nick) &&
                Objects.equals(realName, buyer.realName) &&
                Objects.equals(address, buyer.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nick, realName, address);
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "nick='" + nick + '\'' +
                ", realName='" + realName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
