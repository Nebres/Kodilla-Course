package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;


public class StatisticsCounter {

    StatisticsStub stub;

    public StatisticsCounter(StatisticsStub stub) {
        this.stub = stub;
    }

    public List<StatisticsStub> calculateAdvStatistics(Statistics statistics) {

        List <StatisticsStub> stats = new ArrayList<StatisticsStub>();

        StatisticsStub tempData = new StatisticsStub(stub.getUsersList(), stub.getPostsList(), stub.getCommentsList(),
                stub.getMedianPostsPerUser(), stub.getMedianCommentsPerUser(), stub.getMedianCommentsPerPost());

        stats.add(tempData);

        return stats;

    }

    public void showStatistics() {

        List<StatisticsStub> data = calculateAdvStatistics(stub);

        for (StatisticsStub acctualData : data ) {

            System.out.println("Number of the users: " + acctualData.getUsersList().size());
            System.out.println("Number of the posts: " + acctualData.getPostsList().size());
            System.out.println("Number of the comments: " + acctualData.getCommentsList().size());
            System.out.println("Post per user: " + acctualData.getMedianPostsPerUser());
            System.out.println("Comments per user: " + acctualData.getMedianCommentsPerUser());
            System.out.println("Comments per post: " + acctualData.getMedianCommentsPerPost());

        }
    }

}
