package com.kodilla.patterns2.decorator.pizza;

import static com.kodilla.patterns2.decorator.pizza.StaticInformation.BASE_COST;
import static com.kodilla.patterns2.decorator.pizza.StaticInformation.BASE_DESCRIPTION;
import static com.kodilla.patterns2.decorator.pizza.StaticInformation.BASE_MINUTES;

public class BasePizzaDecorator implements PizzaOrder {


    public double getCost() {
        return BASE_COST;
    }
    public String getDescription() {
        return BASE_DESCRIPTION;
    }

    public int getMinutesToDeliver() {
        return BASE_MINUTES;
    }
}
