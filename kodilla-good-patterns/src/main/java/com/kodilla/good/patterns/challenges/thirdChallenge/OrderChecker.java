package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.Map;

public class OrderChecker {

    private boolean IsThereIsNamedProduct(String productName, Map<String, Double> productList) {
        return productList.containsKey(productName);
    }

    private boolean IsOrderIsMoreThen0(double quantity) {
        return quantity > 0;
    }

    private boolean IsThereIsEnoughQuantityOfProduct(String productName, double quantity, Map<String, Double> productList) {
        return productList.get(productName) >= quantity;
    }

    public boolean checkTheOrder(String productName, double quantity, Map<String, Double> productList ) {

        if (!IsThereIsNamedProduct(productName, productList)) {
            System.out.println("\nWrong product Name");
        }

        if (!IsOrderIsMoreThen0(quantity)) {
            System.out.println("\nValue must be more than 0");
        }

        if (!IsThereIsEnoughQuantityOfProduct(productName, quantity, productList)){
            System.out.println("\nYour supplier hasn't have so much product on stock");
        }

        return IsThereIsNamedProduct(productName, productList) && IsOrderIsMoreThen0(quantity)
                && IsThereIsEnoughQuantityOfProduct(productName, quantity, productList);
    }

}


