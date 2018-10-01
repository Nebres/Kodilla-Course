package com.kodilla.patterns2.decorator.pizza;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder {

    private final PizzaOrder pizzaOrder;

    public AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    public double getCost() {
       return pizzaOrder.getCost();
    }
    public String getDescription() {
        return pizzaOrder.getDescription();
    }

    public int getMinutesToDeliver() {
        return pizzaOrder.getMinutesToDeliver();
    }

}
