package com.kodilla.patterns2.observer.homework;

public interface Observable {

    void notifyObserver();
    void addMentor(Mentor mentor);
    void addTaskToCheck(HomeTask homeTask);

}
