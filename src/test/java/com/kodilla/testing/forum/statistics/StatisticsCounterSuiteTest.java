package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCounterSuiteTest {

    private final static int CASE_EQUAL_TO_0 = 0;
    private final static int CASE_EQUAL_TO_1000 = 1000;
    private final static int COMMENTS_EQUAL_TO_500 = 500;

    private List<String> createEmptyUserList() {

        List<String> users = new ArrayList<String>();

        return users;
    }

    private List<String> create100UsersList() {

        List<String> users = new ArrayList<String>();

        String user = "user";

        for ( int i = 0;  i < 100; i++ ) {
            users.add(user + i);
        }
        return users;
    }

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test

    public void testStatisticsCounterCase1() {

        //CASE 1 ( users = 100, posts = 1000, comments = 500, comments < posts )
        //Given
        final double DELTA = 1e-2;
        int expectedUser = 100;
        int expectedPost = 1000;
        int expectedComments = 500;
        double expectedNumberOfPostsPerUser = 10.00;
        double expectedNumberOfCommentsPerUser = 5.00;
        double expectedNumberOfCommentsPerPost = 0.50;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(create100UsersList());
        when(statisticsMock.postsCount()).thenReturn(CASE_EQUAL_TO_1000);
        when(statisticsMock.commentsCount()).thenReturn(COMMENTS_EQUAL_TO_500);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        int actualUser = statistics.getNumberOfUsers();
        int actualPost = statistics.getNumberOfPosts();
        int actualComments = statistics.getNumberOfComments();
        double actualNumberOfPostsPerUser = statistics.getNumberOfPostsPerUser();
        double actualNumberOfCommentsPerUser = statistics.getNumberOfCommentsPerUser();
        double actualNumberOfCommentsPerPost = statistics.getNumberOfCommentsPerPost();
        //Then
        Assert.assertEquals(expectedUser, actualUser);
        Assert.assertEquals(expectedPost, actualPost);
        Assert.assertEquals(expectedComments, actualComments);
        Assert.assertEquals(expectedNumberOfPostsPerUser, actualNumberOfPostsPerUser, DELTA);
        Assert.assertEquals(expectedNumberOfCommentsPerUser, actualNumberOfCommentsPerUser, DELTA);
        Assert.assertEquals(expectedNumberOfCommentsPerPost, actualNumberOfCommentsPerPost, DELTA);
    }

    @Test

    public void testStatisticsCounterCase2() {

        //CASE 2 ( users = 0, posts = 0, comments = 500, comments > posts )
        //Given
        final double DELTA = 1e-2;
        int expectedUser = 0;
        int expectedPost = 0;
        int expectedComments = 500;
        double expectedNumberOfPostsPerUser = 0;
        double expectedNumberOfCommentsPerUser = 0;
        double expectedNumberOfCommentsPerPost = 0;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(createEmptyUserList());
        when(statisticsMock.postsCount()).thenReturn(CASE_EQUAL_TO_0);
        when(statisticsMock.commentsCount()).thenReturn(COMMENTS_EQUAL_TO_500);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        int actualUser = statistics.getNumberOfUsers();
        int actualPost = statistics.getNumberOfPosts();
        int actualComments = statistics.getNumberOfComments();
        double actualNumberOfPostsPerUser = statistics.getNumberOfPostsPerUser();
        double actualNumberOfCommentsPerUser = statistics.getNumberOfCommentsPerUser();
        double actualNumberOfCommentsPerPost = statistics.getNumberOfCommentsPerPost();
        //Then
        Assert.assertEquals(expectedUser, actualUser);
        Assert.assertEquals(expectedPost, actualPost);
        Assert.assertEquals(expectedComments, actualComments);
        Assert.assertEquals(expectedNumberOfPostsPerUser, actualNumberOfPostsPerUser, DELTA);
        Assert.assertEquals(expectedNumberOfCommentsPerUser, actualNumberOfCommentsPerUser, DELTA);
        Assert.assertEquals(expectedNumberOfCommentsPerPost, actualNumberOfCommentsPerPost, DELTA);
    }

}
