package com.kodilla.good.patterns.challenges.thirdChallenge;

public class ThirdChallengeMain {

    public static void main(String[] args){

        String info1 = new ExtraFoodShop( new FoodProducerDB().initializeExtraFoodShop()).getInformationAboutCompany();
        String info2 = new HealthyShop( new FoodProducerDB().initializeHealthyShop()).getInformationAboutCompany();
        String info3 = new GlutenFreeShop(new FoodProducerDB().initializeGlutenFreeShop()).getInformationAboutCompany();

        System.out.println(info1);
        System.out.println(info2);
        System.out.println(info3);

        new ExtraFoodShop( new FoodProducerDB()
                .initializeExtraFoodShop())
                .process("BIO Carrot", 20.21);
        new HealthyShop( new FoodProducerDB()
                .initializeHealthyShop())
                .process("Tofu", 1000.0);
        new GlutenFreeShop(new FoodProducerDB()
                .initializeGlutenFreeShop())
                .process("Bread", 00.0);
    }

}
