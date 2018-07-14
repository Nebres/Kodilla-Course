package com.kodilla.good.patterns.challenges.thirdChallenge;

public class HealthyShop {

    private final FoodProducer foodProducer;

    public HealthyShop(FoodProducer foodProducer) {
        this.foodProducer = foodProducer;
    }

    public String getInformationAboutCompany() {
        return "\nCompany Name: "
                .concat(foodProducer.getCompanyName())
                .concat("\nAddress: ")
                .concat(foodProducer.getCompanyAddress())
                .concat("\nNIP:")
                .concat(foodProducer.getCompanyNIP())
                .concat("\nProducts: \n")
                .concat(foodProducer.printProductsList());
    }

    public void process(String productName, double quantity) {

        if(new OrderChecker().checkTheOrder(productName, quantity, foodProducer.getProductsList())) {
            System.out.println("Order Accepted!");
        } else {
            System.out.println("Order Rejected");
        }
    }

}
