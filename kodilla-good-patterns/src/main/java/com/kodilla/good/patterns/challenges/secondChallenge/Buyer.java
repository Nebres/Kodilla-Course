package com.kodilla.good.patterns.challenges.secondChallenge;

public class Buyer implements User {

    private String nick;
    private String realName;
    private String address;


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



}
