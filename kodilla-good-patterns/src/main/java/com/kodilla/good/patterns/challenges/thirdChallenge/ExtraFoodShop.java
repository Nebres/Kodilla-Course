package com.kodilla.good.patterns.challenges.thirdChallenge;

public class ExtraFoodShop extends AbstractShop {

    private static final double MULTIPLE_PROMOTION = 1.1;

    public ExtraFoodShop(FoodProducer foodProducer) {
        super(foodProducer);
    }
    @Override
    public String getInformationAboutCompany() {
        return ShopCommunicates.NEW_LINE
                .concat(ShopCommunicates.COMPANY_NAME)
                .concat(foodProducer.getName())
                .concat(ShopCommunicates.NEW_LINE)
                .concat(ShopCommunicates.COMPANY_ADDRESS)
                .concat(foodProducer.getAddress())
                .concat(ShopCommunicates.NEW_LINE)
                .concat(ShopCommunicates.COMPANY_NIP)
                .concat(foodProducer.getCompanyNIP())
                .concat(ShopCommunicates.NEW_LINE)
                .concat(ShopCommunicates.COMPANY_PRODUCTS)
                .concat(foodProducer.printProductsList()
                .concat(ShopCommunicates.PROMOTION_INFO));
    }

    @Override
    public void process(String productName, double quality) {

        if (OrderChecker.checkTheOrder(productName, quality * MULTIPLE_PROMOTION,
                foodProducer.getProductsList()) && quality >= 10) {
            System.out.println(ShopCommunicates.ORDER_ACCEPTED
                    .concat(ShopCommunicates.NEW_LINE)
                    .concat(ShopCommunicates.PROMOTION_GRANTED));

        } else if (OrderChecker.checkTheOrder(productName, quality, foodProducer.getProductsList())&& quality < 10) {
            System.out.println(ShopCommunicates.ORDER_ACCEPTED
                    .concat(ShopCommunicates.NEW_LINE)
                    .concat(ShopCommunicates.PROMOTION_NOT_GRANTED)
                    .concat(ShopCommunicates.PROMOTION_NOT_GRANTED_BECAUSE_QUANTITY_LESS_THAN_10));

        } else if (OrderChecker.checkTheOrder(productName, quality, foodProducer.getProductsList())) {
            System.out.println(ShopCommunicates.ORDER_ACCEPTED
                    .concat(ShopCommunicates.NEW_LINE)
                    .concat(ShopCommunicates.PROMOTION_NOT_GRANTED)
                    .concat(ShopCommunicates.PROMOTION_NOT_GRANTED_BECAUSE_NOT_ENOUGH_ON_STOCK));
        } else {
            System.out.println(ShopCommunicates.ORDER_REJECTED);
        }
    }

}
