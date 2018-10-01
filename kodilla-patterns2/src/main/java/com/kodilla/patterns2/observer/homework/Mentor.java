package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private String name;
    int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeTask homeTask) {
        updateCount++;
        System.out.println("To " + name + ": " + homeTask.getStudent() + ",sent task " + homeTask.getModule() +
                " to check" + "\n" + "total tasks to check: " + updateCount);
    }

    public int getUpdateCount() {
        return updateCount;
    }

}
