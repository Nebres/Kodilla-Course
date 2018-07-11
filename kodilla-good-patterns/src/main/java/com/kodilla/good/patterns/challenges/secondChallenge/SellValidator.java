package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.Map;

public class SellValidator {

    private static final String ORDER_EQUAL_TO_0_COMMUNICATE = "\n Change order quantity to more than 0";
    private static final String ORDER_IS_MORE_THAN_SELLER_HAVE_ON_STOCK = "\n You order more than Seller have on Stock";
    private final Order order;

    public SellValidator(Order order) {
        this.order = order;
    }

    public boolean isThereEnoughThatItem() {

        int orderedId = order.getItem().getItemId();
        Map<Integer, Item> itemsToSellByChosenSeller = order.getSeller().getItmesForSell();

        return itemsToSellByChosenSeller.get(orderedId).getItemQuantity() <= order.getQuantity();
    }

    public boolean isForSell() {
        return order.getQuantity() > 0 ;
    }

    public boolean isItemIsSaleable() {

    boolean itemToSell = true;

        if (!isForSell()) {
            System.out.println(ORDER_EQUAL_TO_0_COMMUNICATE);
            return itemToSell = false;
        } else if (isThereEnoughThatItem()) {
            System.out.println(ORDER_IS_MORE_THAN_SELLER_HAVE_ON_STOCK);
            return itemToSell = false;
        } else if (isThereEnoughThatItem()
                && isForSell()) {
            return itemToSell = true;
        }
        return itemToSell;
    }

}
