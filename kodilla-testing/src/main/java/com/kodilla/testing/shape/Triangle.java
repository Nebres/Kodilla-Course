package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {

        double s = (sideA + sideB + sideC) * (sideA + sideB - sideC) * (sideA - sideB + sideC) * (0 - sideA + sideB + sideC);
        return Math.sqrt(s) / 4;
    }

}
