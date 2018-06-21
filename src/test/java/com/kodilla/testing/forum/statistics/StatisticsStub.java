package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;


public class StatisticsStub implements Statistics {


    // dummy data
    public List<String> usersNames() {

        List<String> usersList = new ArrayList<String>();

        return usersList;
    }

    public int postsCount() {
        return 1000;
    }

    public int commentsCount() {
        return 500;
    }
}

