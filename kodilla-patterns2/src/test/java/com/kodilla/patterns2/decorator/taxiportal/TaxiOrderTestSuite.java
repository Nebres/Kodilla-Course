package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        BigDecimal expected = new BigDecimal(5.00);
        BigDecimal actual = taxiOrder.getCost();
        //Then
        assertEquals(expected,actual);

    }

    @Test
    public void getDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        String expected = "Drive a course";
        String actual = taxiOrder.getDescription();
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //When
        BigDecimal expected = new BigDecimal(40.00);
        BigDecimal actual = taxiOrder.getCost();
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //When
        String expected = "Drive a course by taxi Network";
        String actual = taxiOrder.getDescription();
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void testUberNetworkWithTwoChildSeatsGetCost() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        BigDecimal expected = new BigDecimal(29);
        BigDecimal actual = taxiOrder.getCost();
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void testUberNetworkWithTwoChildSeatsGetDescription() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        String expected = "Drive a course by Uber Network + child seat + child seat";
        String actual = taxiOrder.getDescription();
        //Then
        assertEquals(expected,actual);

    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new VipDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ExpressDecorator(taxiOrder);
        //When
        String expected = "Drive a course variant VIP + child seat express service";
        String actual = taxiOrder.getDescription();
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        BigDecimal expected = new BigDecimal(52);
        BigDecimal actual = taxiOrder.getCost();
        //Then
        assertEquals(expected,actual);
    }

}