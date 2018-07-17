package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BoardConfig {

    @Autowired
    @Qualifier ("taskToDo")
    TaskList taskList;

    @Bean(name = "taskToDo")
    @Scope("prototype")
    public TaskList getToDoList() {
        return taskList;
    }

    @Bean(name = "taskInProgress")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return taskList;
    }

    @Bean(name = "taskDone")
    @Scope("prototype")
    public TaskList getDoneList() {
        return taskList;
    }

}
