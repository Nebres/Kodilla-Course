package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeTask implements Observable {

    private List<HomeTask> homeTasks;
    private List<Mentor> mentors;
    private final String student;
    private final double module;

    public HomeTask(String student, double module) {
        this.homeTasks = new ArrayList<>();
        this.mentors = new ArrayList<>();
        this.student = student;
        this.module = module;
    }

    @Override
    public void notifyObserver() {
        for (Mentor mentor: mentors) {
            mentor.update(this);
        }
    }

    @Override
    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void addTaskToCheck(HomeTask homeTask) {
        homeTasks.add(homeTask);
        notifyObserver();
    }

    public List<HomeTask> getHomeTasks() {
        return homeTasks;
    }

    public List<Mentor> getMentors() {
        return mentors;
    }

    public String getStudent() {
        return student;
    }

    public double getModule() {
        return module;
    }

}
