package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaOrderTest {

    @Test
    public void testPizzaOrderGetCost() {
        PizzaOrder pizzaOrder = new BasePizzaDecorator();
        pizzaOrder = new HawaiianDecorator(pizzaOrder);
        pizzaOrder = new ExtraFastDeliverDecorator(pizzaOrder);
        //When
        double expected = 11.00;
        double actual = pizzaOrder.getCost();
        //Then
        assertEquals(expected,actual,0.01);
    }

    @Test
    public void testPizzaOrderGetMinutesToDeliver() {
        PizzaOrder pizzaOrder = new BasePizzaDecorator();
        pizzaOrder = new PepperoniDecorator(pizzaOrder);
        pizzaOrder = new ExtraFastDeliverDecorator(pizzaOrder);
        //When
        int expected = 30;
        int actual = pizzaOrder.getMinutesToDeliver();
        //Then
        assertEquals(expected,actual,0.01);
    }

    @Test
    public void testPizzaOrderGetDescription() {
        PizzaOrder pizzaOrder = new BasePizzaDecorator();
        pizzaOrder = new AmericanaDecorator(pizzaOrder);
        pizzaOrder = new ExtraFastDeliverDecorator(pizzaOrder);
        //When
        String expected = "Pizza with tomato sauce and cheese, pork meat, mushrooms, sliced tomato ,extra fast deliver ";
        String actual = pizzaOrder.getDescription();
        //Then
        assertEquals(expected,actual);
    }

}