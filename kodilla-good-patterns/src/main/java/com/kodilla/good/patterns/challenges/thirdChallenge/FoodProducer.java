package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.Map;

public class FoodProducer {

    private final String companyName;
    private final String companyAddress;
    private final String companyNIP;
    private final Map<String, Double> productsList;

    public FoodProducer(String companyName, String companyAddress, String companyNIP, Map<String, Double> productsList) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyNIP = companyNIP;
        this.productsList = productsList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanyNIP() {
        return companyNIP;
    }

    public Map<String, Double> getProductsList() {
        return productsList;
    }

    public String printProductsList() {

        String result = "";

        for (Map.Entry<String, Double> entry : productsList.entrySet()) {
           result = result
                   .concat(entry.getKey())
                   .concat(" | ")
                   .concat(entry.getValue().toString()).concat("\n");
        }
        return result;
    }

}
