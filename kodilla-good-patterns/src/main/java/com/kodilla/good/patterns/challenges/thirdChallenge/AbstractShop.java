package com.kodilla.good.patterns.challenges.thirdChallenge;

abstract class AbstractShop implements Shop {

    private final FoodProducer foodProducer;

    public AbstractShop(FoodProducer foodProducer) {
        this.foodProducer = foodProducer;
    }

    public String getInformationAboutCompany() {
        return ShopComunicates.NEW_LINE
                .concat(ShopComunicates.COMAPNY_NAME)
                .concat(foodProducer.getCompanyName())
                .concat(ShopComunicates.NEW_LINE)
                .concat(ShopComunicates.COMAPNY_ADDRESS)
                .concat(foodProducer.getCompanyAddress())
                .concat(ShopComunicates.NEW_LINE)
                .concat(ShopComunicates.COMAPNY_NIP)
                .concat(foodProducer.getCompanyNIP())
                .concat(ShopComunicates.NEW_LINE)
                .concat(ShopComunicates.COMAPNY_PRODUCTS)
                .concat(foodProducer.printProductsList()
                .concat(ShopComunicates.NEW_LINE));
    }

    public void process(String productName, double quantity) {

        if(new OrderChecker().checkTheOrder(productName, quantity, foodProducer.getProductsList())) {
            System.out.println(ShopComunicates.ORDER_ACCEPTED.concat(ShopComunicates.NEW_LINE));
        } else {
            System.out.println(ShopComunicates.ORDER_REJECTED.concat(ShopComunicates.NEW_LINE));
        }
    }

}
