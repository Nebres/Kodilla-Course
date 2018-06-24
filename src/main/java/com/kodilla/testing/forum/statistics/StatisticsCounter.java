package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {

    private final Statistics statistics;
    private final static String OUTPUT_COMMUNICATE = "Forum statistics: \n Number of users = %d \n Number of posts = %d \n " +
            "Number of comments %d \n Number of posts per user = %s \n Number of comments per user = %s \n Number of comments per post = %s";
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double numberOfPostsPerUser;
    private double numberOfCommentsPerUser;
    private double numberOfCommentsPerPost;

    public StatisticsCounter(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        this.numberOfPostsPerUser = numberOfUsers == 0 ? 0 : numberOfPosts / numberOfUsers;
        this.numberOfCommentsPerUser = numberOfUsers == 0 ? 0 : numberOfComments / numberOfUsers;
        this.numberOfCommentsPerPost = numberOfPosts == 0 ? 0.00 : (double)numberOfComments / numberOfPosts;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getNumberOfPostsPerUser() {
        return numberOfPostsPerUser;
    }

    public double getNumberOfCommentsPerUser() {
        return numberOfCommentsPerUser;
    }

    public double getNumberOfCommentsPerPost() {
        return numberOfCommentsPerPost;
    }

    public void showStatistics() {
        System.out.println(String.format(OUTPUT_COMMUNICATE,getNumberOfUsers(), getNumberOfPosts(), getNumberOfComments(),
                getNumberOfPostsPerUser(), getNumberOfCommentsPerUser(), getNumberOfCommentsPerPost()));
    }

}
