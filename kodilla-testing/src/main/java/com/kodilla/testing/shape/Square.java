package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideOfTheSquare;

    public Square(double sideOfTheSquare) {
        this.sideOfTheSquare = sideOfTheSquare;
    }

    public String getShapeName(){
        return "Square";
    }

    public double getField() {
        return Math.pow(sideOfTheSquare, 2.00);
    }
}
