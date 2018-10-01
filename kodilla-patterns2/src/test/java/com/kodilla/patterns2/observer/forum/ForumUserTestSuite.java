package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelp = new JavaHelpForumTopic("Java Help");
        ForumTopic javaTools = new JavaToolsForumTopic("Java Tools");
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobra = new ForumUser("Ivone Escobra");
        ForumUser jessiPinkman = new ForumUser("Jessi Pinkman");
        javaHelp.registerObserver(johnSmith);
        javaTools.registerObserver(ivoneEscobra);
        javaHelp.registerObserver(jessiPinkman);
        javaTools.registerObserver(jessiPinkman);
        //When
        javaHelp.addPost(new Post("test title 1", "test content 1"));
        javaHelp.addPost(new Post("test title 2", "test content 2"));
        javaHelp.addPost(new Post("test title 3", "test content 3"));
        javaTools.addPost(new Post("test title 4", "test content 4"));
        javaTools.addPost(new Post("test title 5", "test content 5"));
        int jhonSmithExcpected = 3;
        int ivoneEscobarExpected = 2;
        int jessiPinkmanExpected = 5;
        int jhonSmithActual = johnSmith.getUpdateCount();
        int ivoneEscobraActual = ivoneEscobra.getUpdateCount();
        int jessiPinkmanActual = jessiPinkman.getUpdateCount();
        //Then
        Assert.assertEquals(jessiPinkmanExpected, jessiPinkmanActual);
        Assert.assertEquals(jhonSmithExcpected, jhonSmithActual);
        Assert.assertEquals(ivoneEscobarExpected, ivoneEscobraActual);

    }
}
