package com.kodilla.good.patterns.challenges.thirdChallenge;

abstract class AbstractShop implements Shop {

    protected final FoodProducer foodProducer;

    public AbstractShop(FoodProducer foodProducer) {
        this.foodProducer = foodProducer;
    }

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
                .concat(ShopCommunicates.NEW_LINE)
                .concat(foodProducer.printProductsList());
    }

}
