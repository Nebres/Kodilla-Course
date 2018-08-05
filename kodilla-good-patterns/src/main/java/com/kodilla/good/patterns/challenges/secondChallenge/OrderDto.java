package com.kodilla.good.patterns.challenges.secondChallenge;

public class OrderDto {

    private final Order order;
    private final boolean isOrdered;

    public OrderDto(Order order, boolean isOrdered) {
        this.order = order;
        this.isOrdered = isOrdered;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

}
