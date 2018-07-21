package com.kodilla.good.patterns.challenges.secondChallenge;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private static RepositoryService repositoryService = new RepositoryService(SecondChallengesMain.createItemsSet());

    private Order order;

    public ProductOrderService(InformationService informationService, OrderService orderService, Order order) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.order = order;
    }

    public void process() {
        boolean isAccepted = orderService.isAccepted(order, repositoryService.getItemBase());

        if (isAccepted) {
            informationService.printInfoAboutBuyer(order, repositoryService.getItemBase());
            repositoryService.changeItemsInDataBase(order);
        } else {
            System.out.println(OrderCommunicates.ORDER_REJECTED);
        }
    }

}

