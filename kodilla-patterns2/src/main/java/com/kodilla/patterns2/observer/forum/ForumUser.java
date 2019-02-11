package com.kodilla.patterns2.observer.forum;

import java.util.Objects;

public class ForumUser implements Observer {

    private final String username;
    private int updateCount;

    public ForumUser(String username) {
        this.username = username;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(username + "New message in topic " + forumTopic.getName() + "\n" +
                " total: " + forumTopic.getMessages().size() + " messages");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return getUpdateCount() == forumUser.getUpdateCount() &&
                Objects.equals(getUsername(), forumUser.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getUpdateCount());
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", updateCount=" + updateCount +
                '}';
    }

}
