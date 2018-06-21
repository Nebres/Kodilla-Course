package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {

    Statistics statistics;
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

        if (numberOfUsers != 0) {
            this.numberOfPostsPerUser = numberOfPosts / numberOfUsers;
        } else {
            this.numberOfPostsPerUser = 0;
        }

        if (numberOfUsers != 0) {
            this.numberOfCommentsPerUser =  numberOfComments / numberOfUsers;
        } else {
            this.numberOfCommentsPerUser = 0;
        }

        if (numberOfPosts != 0) {
            double numberOfCommentsChangedToDouble = (double)numberOfComments;
            this.numberOfCommentsPerPost = numberOfCommentsChangedToDouble / numberOfPosts;
        } else {
            this.numberOfCommentsPerPost = 0;
        }
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
