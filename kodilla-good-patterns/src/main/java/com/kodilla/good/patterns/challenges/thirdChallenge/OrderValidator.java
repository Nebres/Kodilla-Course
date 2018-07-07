package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.Map;

public class OrderValidator {

    public boolean IsThereIsNamedProduct(String productName, Map<String, Double> productList) {
        return productList.containsKey(productName);
    }

    public boolean IsOrderIsMoreThen0(double quantity) {
        return quantity > 0;
    }

    public boolean IsThereIsEnoughQuantityOfProduct(String productName, double quantity, Map<String, Double> productList) {
        return productList.get(productName) >= quantity;
    }

    public boolean validateOrder(String productName, double quantity, Map<String, Double> productList ) {

        if (!IsThereIsNamedProduct(productName, productList)) {
            System.out.println("Wrong product Name");
        }

        if (!IsOrderIsMoreThen0(quantity)) {
            System.out.println("Value must be more than 0");
        }

        if (!IsThereIsEnoughQuantityOfProduct(productName, quantity, productList)){
            System.out.println("Your supplier hasn't have so much product on stock");
        }

        return IsThereIsNamedProduct(productName, productList) && IsOrderIsMoreThen0(quantity)
                && IsThereIsEnoughQuantityOfProduct(productName, quantity, productList);
    }

}


