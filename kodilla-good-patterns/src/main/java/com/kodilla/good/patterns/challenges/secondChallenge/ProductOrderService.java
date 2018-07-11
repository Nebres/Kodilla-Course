package com.kodilla.good.patterns.challenges.secondChallenge;

public class ProductOrderService {

    private static final String INFO_FOR_BUYER = "\n You buy From %s %s %s \n Address and real name: %s \n %s \n";
    private static final String INFO_FOR_SELLER = " %s buy form You %s %s \n Address and real name: %s \n %s";
    private static final String TERMINATED_INFO= "Process Terminated";
    private final Order order;

    public ProductOrderService(Order order) {
        this.order = order;
    }

    private String printCommunicateForBuyer() {
        return String.format(INFO_FOR_BUYER,
                order.getSeller().getUserNick(),
                order.getQuantity(),
                order.getItem().getItemName(),
                order.getSeller().getUserRealName(),
                order.getSeller().getUserAddress()
        );
    }

    private String printCommunicateForSeller() {
        return String.format(INFO_FOR_SELLER,
                order.getBuyer().getUserNick(),
                order.getQuantity(),
                order.getItem().getItemName(),
                order.getBuyer().getUserRealName(),
                order.getBuyer().getUserAddress()
        );
    }

    public void sellProcess() {

        if (new SellValidator(order).isItemIsSaleable()) {
            System.out.println(printCommunicateForBuyer());
            System.out.println(printCommunicateForSeller());
        } else {
            System.out.println(TERMINATED_INFO);
        }
    }

}
