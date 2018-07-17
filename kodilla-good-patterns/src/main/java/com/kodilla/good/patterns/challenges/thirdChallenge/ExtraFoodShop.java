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
                .concat(ShopCommunicates.PROMOTION_INFO)
                .concat(ShopCommunicates.NEW_LINE));
    }

    @Override
    public void process(String productName, double quantity) {

        if (OrderChecker.checkTheOrder(productName, quantity * MULTIPLE_PROMOTION,
                foodProducer.getProductsList()) && quantity >= 10) {
            System.out.println(ShopCommunicates.ORDER_ACCEPTED
                    .concat(ShopCommunicates.NEW_LINE)
                    .concat(ShopCommunicates.PROMOTION_GRANTED)
                    .concat(ShopCommunicates.NEW_LINE));

        } else if (OrderChecker.checkTheOrder(productName, quantity , foodProducer.getProductsList())&& quantity < 10) {
            System.out.println(ShopCommunicates.ORDER_ACCEPTED
                    .concat(ShopCommunicates.NEW_LINE)
                    .concat(ShopCommunicates.PROMOTION_NOT_GRANTED)
                    .concat(ShopCommunicates.PROMOTION_NOT_GRANTED_BECOUSE_QUANTITI_LESS_THAN_10)
                    .concat(ShopCommunicates.NEW_LINE));

        } else if (OrderChecker.checkTheOrder(productName, quantity , foodProducer.getProductsList())) {
            System.out.println(ShopCommunicates.ORDER_ACCEPTED
                    .concat(ShopCommunicates.NEW_LINE)
                    .concat(ShopCommunicates.PROMOTION_NOT_GRANTED)
                    .concat(ShopCommunicates.PROMOTION_NOT_GRANTED_BECOUSE_NOT_ENOUGH_ON_STOCK)
                    .concat(ShopCommunicates.NEW_LINE));
        } else {
            System.out.println(ShopCommunicates.ORDER_REJECTED.concat(ShopCommunicates.NEW_LINE));
        }
    }

}
