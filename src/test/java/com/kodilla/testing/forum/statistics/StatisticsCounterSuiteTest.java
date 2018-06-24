package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCounterSuiteTest {

    private static int testNumber  = 1;

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
        System.out.println("Test Case: begin test number: " + testNumber);
        testNumber ++;
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin tests \n");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("\n Test Suite: end");
    }

    @Test
    public void testStatisticsCounterNumberOfUserEqual00() {

        //CASE ( users = 100 )
        //Given
        int expectedUser = 100;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(create100UsersList());
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        int actualUser = statistics.getNumberOfUsers();
        //Then
        Assert.assertEquals(expectedUser, actualUser);
    }

    @Test
    public void testStatisticsCounterNumberOfUserEqual0() {

        //CASE ( users = 0 )
        //Given
        int expectedUser = 0;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(createEmptyUserList());
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        int actualUser = statistics.getNumberOfUsers();
        //Then
        Assert.assertEquals(expectedUser, actualUser);
    }

    @Test
    public void testStatisticsCounterNumberOfPostsEqual1000() {

        //CASE 1 ( posts = 1000 )
        //Given
        int expectedPost = 1000;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        int actualPost = statistics.getNumberOfPosts();
        //Then
        Assert.assertEquals(expectedPost, actualPost);
    }

    @Test
    public void testStatisticsCounterNumberOfPostsEqual0() {

        //CASE ( posts = 0 )
        //Given
        int expectedPost = 0;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        int actualPost = statistics.getNumberOfPosts();
        //Then
        Assert.assertEquals(expectedPost, actualPost);
    }

    @Test
    public void testStatisticsCounterNumberOfCommentsEqual500() {

        //CASE ( comments = 500)
        //Given
        int expectedComments = 500;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(500);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        int actualComments = statistics.getNumberOfComments();
        //Then
        Assert.assertEquals(expectedComments, actualComments);
    }

    @Test
    public void testStatisticsCounterNumberOfCommentsEqual0() {

        //CASE ( comments = 0)
        //Given
        int expectedComments = 0;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        int actualComments = statistics.getNumberOfComments();
        //Then
        Assert.assertEquals(expectedComments, actualComments);
    }

    @Test
    public void testStatisticsCounterPostPerUserWhenUsersEqual100AndPostsEqual1000() {

        //CASE ( users = 100, posts = 1000)
        //Given
        double expectedNumberOfPostsPerUser = 10.00;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(create100UsersList());
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double actualNumberOfPostsPerUser = statistics.getNumberOfPostsPerUser();
        //Then
        Assert.assertEquals(expectedNumberOfPostsPerUser, actualNumberOfPostsPerUser, 1e-2);

    }

    @Test
    public void testStatisticsCounterPostPerUserWhenUsersEqual0AndPostsEqual0() {

        //CASE ( users = 0, posts = 0 )
        //Given
        double expectedNumberOfPostsPerUser = 0;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(createEmptyUserList());
        when(statisticsMock.postsCount()).thenReturn(0);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double actualNumberOfPostsPerUser = statistics.getNumberOfPostsPerUser();
        //Then
        Assert.assertEquals(expectedNumberOfPostsPerUser, actualNumberOfPostsPerUser, 1e-2);
    }

    @Test
    public void testStatisticsCounterCommentsPerUserWhenUsersEqual100AndCommentsEqual500() {

        //CASE ( users = 100, comments = 500 )
        //Given
        double expectedNumberOfCommentsPerUser = 5.00;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(create100UsersList());
        when(statisticsMock.commentsCount()).thenReturn(500);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double actualNumberOfCommentsPerUser = statistics.getNumberOfCommentsPerUser();
        //Then
        Assert.assertEquals(expectedNumberOfCommentsPerUser, actualNumberOfCommentsPerUser, 1e-2);
    }

    @Test
    public void testStatisticsCounterCommentsPerUserWhenUsersEqual0AndCommentsEqual0() {

        //CASE ( users = 0, comments = 0)
        //Given
        double expectedNumberOfCommentsPerUser = 0.00;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(create100UsersList());
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double actualNumberOfCommentsPerUser = statistics.getNumberOfCommentsPerUser();
        //Then
        Assert.assertEquals(expectedNumberOfCommentsPerUser, actualNumberOfCommentsPerUser, 1e-2);
    }

    @Test
    public void testStatisticsCounterCommentsPerPostWhenPostsEqual1000AndCommentsEqual500() {

        //CASE ( posts = 1000, comments = 500 )
        //Given
        double expectedNumberOfCommentsPerPost = 0.50;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double actualNumberOfCommentsPerPost = statistics.getNumberOfCommentsPerPost();
        //Then
        Assert.assertEquals(expectedNumberOfCommentsPerPost, actualNumberOfCommentsPerPost, 1e-2);
    }

    @Test
    public void testStatisticsCounterCommentsPerPostWhenPostsEqual0AndCommentsEqual500() {

        //CASE ( posts = 0, comments = 500 )
        //Given
        double expectedNumberOfCommentsPerPost = 0.00;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(500);
        StatisticsCounter statistics = new StatisticsCounter(statisticsMock);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double actualNumberOfCommentsPerPost = statistics.getNumberOfCommentsPerPost();
        //Then
        Assert.assertEquals(expectedNumberOfCommentsPerPost, actualNumberOfCommentsPerPost, 1e-2);
    }

    @Test
    public void testStatisticsCounterAllMethodCase1() {

        //CASE ( users = 100, posts = 1000, comments = 500, comments < posts )
        //Given
        int expectedUser = 100;
        int expectedPost = 1000;
        int expectedComments = 500;
        double expectedNumberOfPostsPerUser = 10.00;
        double expectedNumberOfCommentsPerUser = 5.00;
        double expectedNumberOfCommentsPerPost = 0.50;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(create100UsersList());
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
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
        Assert.assertEquals(expectedNumberOfPostsPerUser, actualNumberOfPostsPerUser, 1e-2);
        Assert.assertEquals(expectedNumberOfCommentsPerUser, actualNumberOfCommentsPerUser, 1e-2);
        Assert.assertEquals(expectedNumberOfCommentsPerPost, actualNumberOfCommentsPerPost, 1e-2);
    }

    @Test
    public void testStatisticsCounterAllMethodCase2() {

        //CASE ( users = 0, posts = 0, comments = 500, comments > posts )
        //Given
        int expectedUser = 0;
        int expectedPost = 0;
        int expectedComments = 500;
        double expectedNumberOfPostsPerUser = 0.00;
        double expectedNumberOfCommentsPerUser = 0.00;
        double expectedNumberOfCommentsPerPost = 0.00;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(createEmptyUserList());
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(500);
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
        Assert.assertEquals(expectedNumberOfPostsPerUser, actualNumberOfPostsPerUser, 1e-2);
        Assert.assertEquals(expectedNumberOfCommentsPerUser, actualNumberOfCommentsPerUser, 1e-2);
        Assert.assertEquals(expectedNumberOfCommentsPerPost, actualNumberOfCommentsPerPost, 1e-2);
    }

}
