package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

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
    public void testBoardHaveBoard() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class, Board.class);
        context.getBean(Board.class);
        //When
        boolean actual = context.containsBean("board");
        //Than
        Assert.assertTrue(actual);
    }

    @Test
    public void testTaskListToString() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class, Board.class);
        Board board = context.getBean(Board.class);
        TaskList tasksDone = board.getDoneList();
        tasksDone.getTasks().add("done task");
        String expected = "done task\n";
        //When
        String actual = tasksDone.toString();
        //Than
        Assert.assertEquals(expected, actual);
        System.out.println(board.toString());
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class, Board.class);
        Board board = context.getBean(Board.class);

        board.getToDoList().getTasks().add("task to do");
        board.getInProgressList().getTasks().add("task in progress");
        board.getDoneList().getTasks().add("done task");

        String expected = "Board:" +
                "\nTo Do List: " +
                "\ntask to do" +
                "\nIn Progress List: " +
                "\ntask in progress" +
                "\nDone List: " +
                "\ndone task" +
                "\n";
        //When
        String actual = board.toString();
        //Than
        Assert.assertEquals(expected, actual);
    }

}
