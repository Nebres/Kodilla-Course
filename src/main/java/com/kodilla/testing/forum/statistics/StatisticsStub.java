package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;


public class StatisticsStub implements Statistics {

    private final List<String> usersList;
    private final List<String> postsList;
    private final List<String> commentsList;
    private int medianPostsPerUser;
    private int medianCommentsPerUser;
    private int medianCommentsPerPost;


    public StatisticsStub(List<String> usersList, List<String> postsList, List<String>  commentsList,
                          int medianPostsPerUser, int medianCommentsPerUser,  int medianCommentsPerPost ) {

        this.usersList = usersList;
        this.postsList = postsList;
        this.commentsList = commentsList;
        this.medianCommentsPerPost = commentsCount() / postsCount();
        this.medianCommentsPerUser = commentsCount() / usersCount();
        this.medianPostsPerUser = postsCount() / usersCount();
    }

    @Override
    public List<String> usersNames() {

        List<String> tempList = new ArrayList<String>();

        for(String user : usersList) {
            tempList.add(user);
            tempList.add(user);
        }
        return tempList;
    }

    @Override
    public int postsCount() {
        return postsList.size();
    }

    @Override
    public int commentsCount(){
        return commentsList.size();
    }

    public int usersCount() {
        List<String> tempList = usersNames();
        return tempList.size();
    }

    public int getMedianPostsPerUser() {
        return medianPostsPerUser;
    }

    public int getMedianCommentsPerUser() {
        return medianCommentsPerUser;
    }

    public int getMedianCommentsPerPost() {
        return medianCommentsPerPost;
    }

    public List<String> getUsersList() {
        return usersList;
    }

    public List<String> getPostsList() {
        return postsList;
    }

    public List<String> getCommentsList() {
        return commentsList;
    }
}
