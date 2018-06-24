package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double baseOfTriangle;
    private double hightOfTriangle;


    public Triangle(double baseOfTriangle, double hightOfTriangle) {
        this.baseOfTriangle = baseOfTriangle;
        this.hightOfTriangle = hightOfTriangle;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {

        double result = 0.00;

        if (baseOfTriangle > 0 && hightOfTriangle > 0 ) {
           result = 0.5 * baseOfTriangle * hightOfTriangle;
        }
        return result;
    }

}

