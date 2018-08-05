package com.kodilla.good.patterns.challenges.thirdChallenge;

public class HealthyShop extends AbstractShop {

    public HealthyShop(FoodProducer foodProducer) {
        super(foodProducer);
    }

    public void process(String productName, double quality) {

        if (OrderChecker.checkTheOrder(productName, quality, foodProducer.getProductsList())) {
            System.out.println(ShopCommunicates.ORDER_ACCEPTED.concat(ShopCommunicates.NEW_LINE));
        } else {
            System.out.println(ShopCommunicates.ORDER_REJECTED.concat(ShopCommunicates.NEW_LINE));
        }
    }

}
