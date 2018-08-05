package com.kodilla.spring.testing.shape;

public class Square implements Shape {

    private double sideOfTheSquare;

    public Square(double sideOfTheSquare) {
        this.sideOfTheSquare = sideOfTheSquare;
    }

    @Override
    public String getShapeName(){
        return "Square";
    }

    @Override
    public double getField() {
        return Math.pow(sideOfTheSquare, 2.00);
    }

}
