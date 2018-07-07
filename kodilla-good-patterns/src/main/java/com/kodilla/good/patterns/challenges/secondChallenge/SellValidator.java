package com.kodilla.good.patterns.challenges.secondChallenge;

public class SellValidator {

    private static final String ORDER_EQUAL_TO_0_COMMUNICATE = "\n Change order quantity to more than 0";
    private static final String ORDER_IS_MORE_THAN_SELLER_HAVE_ON_STOCK = "\n You order more than Seller have on Stock";
    private final Order order;

    public SellValidator(Order order) {
        this.order = order;
    }

    public boolean isThereEnoughThatItem() {
        return order.getSeller().getItmesForSell().get(order.getItem().getItemId()).getItemQuantity() >= order.getQuantity();
    }

    public boolean isQuantityInOrderIsMoreThan0() {
        return order.getQuantity() > 0 ;
    }
    public boolean IsItemIsSaleable() {

    boolean itemToSell = true;

        if (!isQuantityInOrderIsMoreThan0()) {
            System.out.println(ORDER_EQUAL_TO_0_COMMUNICATE);
            return itemToSell = false;
        } else if (!new SellValidator(order).isThereEnoughThatItem()) {
            System.out.println(ORDER_IS_MORE_THAN_SELLER_HAVE_ON_STOCK);
            return itemToSell = false;
        } else if (new SellValidator(order).isThereEnoughThatItem() && new SellValidator(order).isQuantityInOrderIsMoreThan0()) {
            return itemToSell = true;
        }
        return itemToSell;
    }

}
