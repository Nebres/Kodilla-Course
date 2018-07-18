package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private final List<String> tasks;
    private final String name;

    public TaskList(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

}
