package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials millenials = new Millenials("Janek");
        YGeneration yGeneration = new YGeneration("Kazik");
        ZGeneration zGeneration = new ZGeneration("Zdziś");
        String expectedMillenialsPost = "User: Janek share: [ I share Snapchat Post ]";
        String expectedYgenerationPost = "User: Kazik share: [ I share Twitter Post ]";
        String expectedZgenerationPost = "User: Zdziś share: [ I share Facebook Post ]";
        //When
        String actualMillenialsPost = millenials.sharePost();
        String actualYgenerationPost = yGeneration.sharePost();
        String actualZgenerationPost = zGeneration.sharePost();
        //Then
        Assert.assertEquals(expectedMillenialsPost, actualMillenialsPost);
        Assert.assertEquals(expectedYgenerationPost, actualYgenerationPost);
        Assert.assertEquals(expectedZgenerationPost, actualZgenerationPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials millenials = new Millenials("Janek");
        millenials.setSocialPublisher(new FacebookPublisher());
        String expected = "User: Janek share: [ I share Facebook Post ]";
        //When
        String actual = millenials.sharePost();
        //Than
        Assert.assertEquals(expected, actual);
    }

}
