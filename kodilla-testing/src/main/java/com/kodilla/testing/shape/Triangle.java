package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double base;
    private double height;


    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {

        double result = 0.00;

        if (base > 0 && height > 0 ) {
           result = 0.5 * base * height;
        }
        return result;
    }

}

