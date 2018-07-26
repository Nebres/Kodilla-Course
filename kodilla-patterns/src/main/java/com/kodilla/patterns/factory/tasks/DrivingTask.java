package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean done = false;


    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public void executeTask() {
        this.done = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return this.done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DrivingTask)) return false;
        DrivingTask that = (DrivingTask) o;
        return Objects.equals(getTaskName(), that.getTaskName()) &&
                Objects.equals(getWhere(), that.getWhere()) &&
                Objects.equals(getUsing(), that.getUsing());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getTaskName(), getWhere(), getUsing());
    }

    @Override
    public String toString() {
        return "DrivingTask{" +
                "taskName='" + taskName + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                '}';
    }

}
