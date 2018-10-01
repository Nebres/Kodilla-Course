package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        HomeTask jhony = new Student("Jhony", 10.1);
        HomeTask bob = new Student("Bob", 12.4);
        HomeTask anna = new Student("Anna", 3.1);
        HomeTask elle = new Student("Elle", 15.1);
        HomeTask jhony2 = new Student("Jhony", 10.2);
        Mentor mentor = new Mentor ("Chris");
        Mentor mentor2 = new Mentor("Luisa");
        jhony.addMentor(mentor);
        jhony2.addMentor(mentor);
        bob.addMentor(mentor);
        anna.addMentor(mentor);
        elle.addMentor(mentor2);
        //When
        jhony.addTaskToCheck(jhony);
        jhony2.addTaskToCheck(jhony2);
        bob.addTaskToCheck(bob);
        anna.addTaskToCheck(anna);
        elle.addTaskToCheck(elle);

        int mentorExcpected = 4;
        int mentor2Expected = 1;
        int mentorActual = mentor.getUpdateCount();
        int mentro2Actual = mentor2.getUpdateCount();
        //Then
        Assert.assertEquals(mentorExcpected, mentorActual);
        Assert.assertEquals(mentor2Expected, mentro2Actual);

    }
}
