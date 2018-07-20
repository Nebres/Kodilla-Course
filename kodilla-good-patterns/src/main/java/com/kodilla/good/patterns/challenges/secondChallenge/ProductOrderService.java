package com.kodilla.good.patterns.challenges.secondChallenge;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;

    private Order order;

    public ProductOrderService(InformationService informationService, OrderService orderService, Order order) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.order = order;
    }

    public void process() {
        boolean isAccepted = orderService.isAccepted(order);

        if (isAccepted) {
            informationService.printInfoAboutBuyer(order);
            RepositoryService.changeQuantity(order.getItem(), order.getQuantity());
        } else {
            System.out.println(OrderCommunicates.ORDER_REJECTED);
        }
    }

}

