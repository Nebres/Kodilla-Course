package collection.lists;

import java.util.List;

public class MarkProcessor {

    private final List<Integer> marks;

    MarkProcessor(List<Integer> marks) {
        this.marks = marks;
    }

    private int getMax() {
        if (marks == null) {
            return 0;
        }
        int maxMark = marks.get(0);
        for (int mark: this.marks) {
            if (maxMark < mark) {
                maxMark = mark;
            }
        }
        return maxMark;
    }

    private int getMin() {
        if (marks == null) {
            return 0;
        }
        int minMark = marks.get(0);
        for (int mark: this.marks) {
            if (minMark > mark) {
                minMark = mark;
            }
        }
        return minMark;
    }

    private double countAverage() {
        double sum = 0.0;
        for (int mark: this.marks) {
            sum += mark;
        }
        double result = sum - getMin() - getMax();
        return marks.size() < 3 ? 0 : result/(marks.size() - 2);
    }

    private void printMarks() {
        System.out.print("Marks: ");
        for (int mark: this.marks) {
            System.out.print(mark + " | ");
        }
        System.out.println("");
    }

    public void process() {
        printMarks();
        System.out.println("Marks average in IT subject equals " + countAverage());
    }

}
