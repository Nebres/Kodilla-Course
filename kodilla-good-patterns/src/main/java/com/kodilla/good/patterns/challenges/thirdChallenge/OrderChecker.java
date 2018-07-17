package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.Map;

public class OrderChecker {

    private static boolean isThereNamedProduct(String productName, Map<String, Double> productList) {
        return productList.containsKey(productName);
    }

    private static boolean isOrderedMoreThen0(double quantity) {
        return quantity > 0;
    }

    private static boolean isThereEnoughSpecifiedProduct(String productName, double quantity, Map<String, Double> productList) {
        return productList.get(productName) >= quantity;
    }
    public static boolean checkTheOrder(String productName, double quantity, Map<String, Double> productList ) {

        if (!isThereNamedProduct(productName, productList)) {
            System.out.println(ShopCommunicates.NEW_LINE.concat(ShopCommunicates.WRONG_PRODUCT_NAME));
        }

        if (!isOrderedMoreThen0(quantity)) {
            System.out.println(ShopCommunicates.NEW_LINE.concat(ShopCommunicates.NOT_ENOUGH_PRODUCT_NUMBER));
        }

        if (!isThereEnoughSpecifiedProduct(productName, quantity, productList)){
            System.out.println(ShopCommunicates.NEW_LINE.concat(ShopCommunicates.VALUE_INFORMATION));
        }

        return isThereNamedProduct(productName, productList) && isOrderedMoreThen0(quantity)
                && isThereEnoughSpecifiedProduct(productName, quantity, productList);
    }

}


