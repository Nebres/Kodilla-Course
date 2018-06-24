package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double baseOfTriangle;
    private double heightOfTriangle;


    public Triangle(double baseOfTriangle, double heightOfTriangle) {
        this.baseOfTriangle = baseOfTriangle;
        this.heightOfTriangle = heightOfTriangle;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {

        double result = 0.00;

        if (baseOfTriangle > 0 && heightOfTriangle > 0 ) {
           result = 0.5 * baseOfTriangle * heightOfTriangle;
        }
        return result;
    }

}

