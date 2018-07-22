package com.kodilla.spring.testing.shape;

import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes;

    public ShapeCollector(List<Shape> shapeList) {
        this.shapes = shapeList;
    }

    public void addFigure(Shape shape) {
        this.shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        this.shapes.remove(shape);
    }

    public Shape getFigure(int i) {
        return this.shapes.get(i);
    }


    public String showFigures() {

        StringBuilder builder = new StringBuilder();
        for (Shape shape : shapes) {
            builder.append(shape.getShapeName()).append(" | ");
        }
        return builder.toString();
    }

}
