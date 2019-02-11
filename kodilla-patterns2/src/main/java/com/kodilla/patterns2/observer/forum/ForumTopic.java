package com.kodilla.patterns2.observer.forum;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ForumTopic implements Observable {

    private final List<Observer> observers;
    private final List<String> messages;
    private final String name;

    public ForumTopic(String name) {
        this.observers = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.name = name;
    }

    public void addPost(Post post) {
        messages.add(post.getTitle());
        notifyObserver();
    }

    public String getName() {
        return name;
    }

    public List<String> getMessages() {
        return messages;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumTopic)) return false;
        ForumTopic that = (ForumTopic) o;
        return Objects.equals(observers, that.observers) &&
                Objects.equals(getMessages(), that.getMessages()) &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(observers, getMessages(), getName());
    }

    @Override
    public String toString() {
        return "ForumTopic{" +
                "observers=" + observers +
                ", messages=" + messages +
                ", name='" + name + '\'' +
                '}';
    }

}
