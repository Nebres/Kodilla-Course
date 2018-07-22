package com.kodilla.good.patterns.challenges.secondChallenge;

public class InformationService {

    private static final String INFORMATION_FOR_BUYER = "You buy %d of %s";
    private static final String REJECTED_INFORMATION = "Order Rejected";

    public void inform(Order order, boolean isOrdered) {

        if (isOrdered) {
            System.out.println(order.getBuyer().toString());
            String theItem = order.getItem().getItemName();
            int theNumber = order.getQuantity();
            System.out.println(String.format(INFORMATION_FOR_BUYER, theNumber, theItem));
        } else {
            System.out.println(REJECTED_INFORMATION);
        }
    }

}
