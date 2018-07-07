package com.kodilla.good.patterns.challenges.thirdChallenge;

public class ThirdChallengeMain {

    public static void main(String[] args){

        new OrderProcessor(new SuplliersDataBase().initializeExtraFoodShop()).printOffer();
        new OrderProcessor(new SuplliersDataBase().initializeExtraFoodShop()).process("BIO Carrot", 10.0);
        new OrderProcessor(new SuplliersDataBase().initializeHealthyShop()).printOffer();
        new OrderProcessor(new SuplliersDataBase().initializeHealthyShop()).process("Tofu", 1000.0);
        new OrderProcessor(new SuplliersDataBase().initializeGlutenFreeShop()).printOffer();
        new OrderProcessor(new SuplliersDataBase().initializeGlutenFreeShop()).process("Bread", 00.0);

    }

}
