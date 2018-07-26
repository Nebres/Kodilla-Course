package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean done = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
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
        if (!(o instanceof ShoppingTask)) return false;
        ShoppingTask that = (ShoppingTask) o;
        return Double.compare(that.quantity, quantity) == 0 &&
                Objects.equals(getTaskName(), that.getTaskName()) &&
                Objects.equals(whatToBuy, that.whatToBuy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTaskName(), whatToBuy, quantity);
    }

    @Override
    public String toString() {
        return "ShoppingTask{" +
                "taskName='" + taskName + '\'' +
                ", whatToBuy='" + whatToBuy + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
