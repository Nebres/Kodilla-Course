package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    protected final static String DRIVING_TASK_FOR_JHON = "DTFJ";
    protected final static String SHOPPING_TASK_FOR_GREGOR = "STFG";
    protected final static String PAINTING_TASK_FOR_ELLEN = "PTFE";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case "DTFJ":
               return new DrivingTask("Drive for supplies", "To market","Van");

            case "STFG":
                return new ShoppingTask("Buy supplies", "Paints", 30.0);

            case "PTFE":
                return new PaintingTask("Paint School", "White","Classroom 4");

            default:
                return null;
        }
    }

}
