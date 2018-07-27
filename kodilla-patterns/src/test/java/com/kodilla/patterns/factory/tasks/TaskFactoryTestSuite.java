package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testCreateTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task expectedDrivingTask = new DrivingTask("Drive for supplies", "To market", "Van");
        Task expectedShoppingTask = new ShoppingTask("Buy supplies", "Paints", 30.0);
        Task expectedPaintingTask = new PaintingTask("Paint School", "White","Classroom 4");
        //When
        Task actualDrivingTask =  taskFactory.createTask(TaskFactory.DRIVING_TASK);
        Task actualShoppingTask = taskFactory.createTask(TaskFactory.SHOPPING_TASK);
        Task actualPaintingTask = taskFactory.createTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals(expectedDrivingTask, actualDrivingTask);
        Assert.assertEquals(expectedShoppingTask, actualShoppingTask);
        Assert.assertEquals(expectedPaintingTask, actualPaintingTask);
    }

    @Test
    public void testExecuteTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.createTask(TaskFactory.PAINTING_TASK);
        //When
        Assert.assertNotNull(task);
        task.executeTask();
        boolean actual = task.isTaskExecuted();
        //Than
        Assert.assertTrue(actual);
    }

}
