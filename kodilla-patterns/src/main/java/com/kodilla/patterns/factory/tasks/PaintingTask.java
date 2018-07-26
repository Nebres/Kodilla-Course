package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean done = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
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
        if (!(o instanceof PaintingTask)) return false;
        PaintingTask that = (PaintingTask) o;
        return Objects.equals(getTaskName(), that.getTaskName()) &&
                Objects.equals(getColor(), that.getColor()) &&
                Objects.equals(getWhatToPaint(), that.getWhatToPaint());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getTaskName(), getColor(), getWhatToPaint());
    }

    @Override
    public String toString() {
        return "PaintingTask{" +
                "taskName='" + taskName + '\'' +
                ", color='" + color + '\'' +
                ", whatToPaint='" + whatToPaint + '\'' +
                '}';
    }

}
