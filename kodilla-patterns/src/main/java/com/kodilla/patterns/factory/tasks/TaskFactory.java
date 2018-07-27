package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    protected final static String DRIVING_TASK = "DRIVING TASK";
    protected final static String SHOPPING_TASK = "SHOPPING TASK";
    protected final static String PAINTING_TASK = "PAINTING TASK";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case "DRIVING TASK":
               return new DrivingTask("Drive for supplies", "To market","Van");

            case "SHOPPING TASK":
                return new ShoppingTask("Buy supplies", "Paints", 30.0);

            case "PAINTING TASK":
                return new PaintingTask("Paint School", "White","Classroom 4");

            default:
                return null;
        }
    }

}
