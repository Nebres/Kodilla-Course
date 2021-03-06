package com.kodilla.good.patterns.challenges.thirdChallenge;

public class GlutenFreeShop extends AbstractShop {

    public GlutenFreeShop(FoodProducer foodProducer) {
        super(foodProducer);
    }

    @Override
    public void process(String productName, double quality) {

        if (OrderChecker.checkTheOrder(productName, quality, foodProducer.getProductsList())) {
            System.out.println(ShopCommunicates.ORDER_ACCEPTED
                    .concat(ShopCommunicates.NEW_LINE)
                    .concat(ShopCommunicates.NEW_DISCOUNT_INFORMATION));
        } else {
            System.out.println(ShopCommunicates.ORDER_REJECTED);
        }
    }

}

