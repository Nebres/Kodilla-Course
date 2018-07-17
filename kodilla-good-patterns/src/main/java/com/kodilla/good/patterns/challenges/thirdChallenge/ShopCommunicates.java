package com.kodilla.good.patterns.challenges.thirdChallenge;

public interface ShopCommunicates {

    String NEW_LINE = "\n";
    String SEPARATOR = " | ";
    String COMPANY_ADDRESS = "Address: ";
    String COMPANY_NIP = "NIP: ";
    String COMPANY_PRODUCTS = "Products: ";
    String COMPANY_NAME = "Company Name: ";
    String ORDER_ACCEPTED = "Order Accepted!";
    String ORDER_REJECTED = "Order Rejected!";
    String WRONG_PRODUCT_NAME = "Wrong product name ";
    String VALUE_INFORMATION = "Value must be more than 0";
    String NOT_ENOUGH_PRODUCT_NUMBER = "Your supplier hasn't have so much product on stock";
    String EMPTY_MARK = "";
    String NEW_DISCOUNT_INFORMATION = "Thanks for purchase. Because You are our loyal client, we want inform You about " +
            "new discount. Since next month it will change from 3% to 5%";
    String PROMOTION_INFO = "We have promotion! If You Order more then 10 units our products , You get 10% " +
            "more for free ( only if we have enough product on stock)";
    String PROMOTION_GRANTED = "Promotion is granted. You get extra 10%";
    String PROMOTION_NOT_GRANTED = "Promotion is not granted.";
    String PROMOTION_NOT_GRANTED_BECOUSE_NOT_ENOUGH_ON_STOCK = " We don't have enough products on stock";
    String PROMOTION_NOT_GRANTED_BECOUSE_QUANTITI_LESS_THAN_10 = " You Order less than 10 unit.";

}
