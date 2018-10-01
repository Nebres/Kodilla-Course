package com.kodilla.patterns2.decorator.pizza;

import static com.kodilla.patterns2.decorator.pizza.StaticInformation.*;

public class AmericanaDecorator extends AbstractPizzaOrderDecorator{

    public AmericanaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost() {
        return super.getCost() + AMERICANA_COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + AMERICANA_DESCRIPTION;
    }

    @Override
    public int getMinutesToDeliver() {
        return super.getMinutesToDeliver();
    }
}
