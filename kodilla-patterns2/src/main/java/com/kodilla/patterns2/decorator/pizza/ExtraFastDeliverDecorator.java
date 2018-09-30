package com.kodilla.patterns2.decorator.pizza;

import static com.kodilla.patterns2.decorator.pizza.StaticInformation.*;

public class ExtraFastDeliverDecorator extends AbstractPizzaOrderDecorator {

    public ExtraFastDeliverDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost() {
        return super.getCost() + EXTRA_FAST_DELIVER_COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + FAST_DELIVER_INFO;
    }

    @Override
    public int getMinutesToDeliver() {
        return super.getMinutesToDeliver() - MINUTES_LEES_WITH_EXTRA_FAST_DELIVER;
    }

}
