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

    private static final StringBuilder STRING_BUILDER = new StringBuilder();
    private static final String SEPARATOR = " ";

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
        List<String> theTaskDone = tasksDone.getTasks();
        theTaskDone.add("done task");
        String expected = "done task\n";
        //When
        String actual = tasksDone.toString();
        //Than
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class, Board.class);
        Board board = context.getBean(Board.class);

        TaskList tasksTodo = board.getToDoList();
        List<String> theTaskToDo = tasksTodo.getTasks();
        theTaskToDo.add("task to do");

        TaskList tasksInProgress = board.getInProgressList();
        List<String> theTaskInProgress = tasksInProgress.getTasks();
        theTaskInProgress.add("task in progress");

        TaskList tasksDone = board.getDoneList();
        List<String> theTaskDone = tasksDone.getTasks();
        theTaskDone.add("done task");

        String expected = "task to do task in progress done task";
        //When
        String actual = STRING_BUILDER
                .append(theTaskToDo.get(0))
                .append(SEPARATOR)
                .append(theTaskInProgress.get(0))
                .append(SEPARATOR)
                .append(theTaskDone.get(0))
                .toString();
        //Than
        Assert.assertEquals(expected, actual);
    }

}
