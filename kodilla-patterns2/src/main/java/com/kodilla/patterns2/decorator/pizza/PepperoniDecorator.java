package com.kodilla.patterns2.decorator.pizza;

import static com.kodilla.patterns2.decorator.pizza.StaticInformation.*;

public class PepperoniDecorator extends AbstractPizzaOrderDecorator{

    public PepperoniDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost() {
        return super.getCost() + PEPPERONI_COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + PEPPERONI_DESCRIPTION;
    }

    @Override
    public int getMinutesToDeliver() {
        return super.getMinutesToDeliver();
    }

}
