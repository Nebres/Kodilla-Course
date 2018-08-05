package com.kodilla.good.patterns.challenges.secondChallenge;

public class InformationService {

    private static final String INFORMATION_FOR_BUYER = "%s \nYou buy %d of %s";
    private static final String REJECTED_INFORMATION = "Order Rejected";

    public void inform(Order order, boolean isOrdered) {

        if (isOrdered) {
            System.out.println(String.format(INFORMATION_FOR_BUYER, order.getBuyer(), order.getQuantity(),
                    order.getItem().getItemName()));
        } else {
            System.out.println(REJECTED_INFORMATION);
        }
    }

}
