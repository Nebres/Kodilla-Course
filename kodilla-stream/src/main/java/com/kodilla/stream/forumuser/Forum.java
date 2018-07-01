package com.kodilla.stream.forumuser;

import java.util.List;

public final class Forum {

   private final List<ForumUser> userList;

    public Forum(List<ForumUser> userList) {
        this.userList = userList;
    }

    public List<ForumUser> getUsersList() {
        return userList;
    }

}
