package com.kodilla.good.patterns.challenges.secondChallenge;

public class OrderProcessor {

    private OrderService orderService;
    private InformationService informationService;

    public OrderProcessor(final OrderService orderService, final InformationService informationService) {
        this.orderService = orderService;
        this.informationService = informationService;
    }

    public OrderDto process(Order order) {
        boolean isOrdered = orderService.order(order);
        informationService.inform(order, isOrdered);
        return new OrderDto(order, isOrdered);
    }

}

