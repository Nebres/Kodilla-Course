package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private final static String NEW_LINE = "\n";
    private final static StringBuilder STRING_BUILDER = new StringBuilder();
    private final List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {

        for (String id : tasks) {
            STRING_BUILDER.append(id).append(NEW_LINE);
        }
        return STRING_BUILDER.toString();
    }


}
