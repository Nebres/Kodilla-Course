package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testBoardHaveToDoListBean() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class, Board.class);
        context.getBean(Board.class);
        //When
        boolean actual = context.containsBean("toDoList");
        //Than
        Assert.assertTrue(actual);
    }

    @Test
    public void testBoardHaveInProgressListBean() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class, Board.class);
        context.getBean(Board.class);
        //When
        boolean actual = context.containsBean("inProgressList");
        //Than
        Assert.assertTrue(actual);
    }

    @Test
    public void testBoardHaveDoneListBean() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class, Board.class);
        context.getBean(Board.class);
        //When
        boolean actual = context.containsBean("doneList");
        //Than
        Assert.assertTrue(actual);
    }


    @Test
    public void testAddToDoTask() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class, Board.class);
        Board board = context.getBean(Board.class);
        TaskList task = board.getToDoList();
        List<String> theTask = task.getTasks();
        theTask.add("task to do");
        String expected = "task to do";
        //When
        String actual = theTask.get(0);
        //Than
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddInProgressTask() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class, Board.class);
        Board board = context.getBean(Board.class);
        TaskList task = board.getInProgressList();
        List<String> theTask = task.getTasks();
        theTask.add("task in progress");
        String expected = "task in progress";
        //When
        String actual = theTask.get(0);
        //Than
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddDoneTask() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class, Board.class);
        Board board = context.getBean(Board.class);
        TaskList task = board.getDoneList();
        List<String> theTask = task.getTasks();
        theTask.add("done task");
        String expected = "done task";
        //When
        String actual = theTask.get(0);
        //Than
        Assert.assertEquals(expected, actual);
    }

}
