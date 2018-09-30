package com.kodilla.patterns2.decorator.pizza;

import static com.kodilla.patterns2.decorator.pizza.StaticInformation.*;

public class HawaiianDecorator extends AbstractPizzaOrderDecorator{

    public HawaiianDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost() {
        return super.getCost() + HAWAIIAN_COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + HAWAIIAN_DESCRIPTION;
    }

    @Override
    public int getMinutesToDeliver() {
        return super.getMinutesToDeliver();
    }

}

