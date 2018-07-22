package com.kodilla.spring.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int publicatedPosts;

    public ForumUser(int userId, String userName, char sex, LocalDate birthDate, int publicatedPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.publicatedPosts = publicatedPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublicatedPosts() {
        return publicatedPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return getUserId() == forumUser.getUserId() &&
                getSex() == forumUser.getSex() &&
                getPublicatedPosts() == forumUser.getPublicatedPosts() &&
                Objects.equals(getUserName(), forumUser.getUserName()) &&
                Objects.equals(getBirthDate(), forumUser.getBirthDate());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getUserId(), getUserName(), getSex(), getBirthDate(), getPublicatedPosts());
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publicatedPosts=" + publicatedPosts +
                '}';
    }

}
