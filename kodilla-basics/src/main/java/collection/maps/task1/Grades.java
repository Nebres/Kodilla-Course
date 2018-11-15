package collection.maps.task1;

import java.util.List;

public class Grades {

    private final List<Integer> grades;

    public Grades(List<Integer> grades) {
        this.grades = grades;
    }

    public double countTheMean() {
        double sum = 0.00;
        for (int grade: this.grades) {
            sum += grade;
        }
        sum = sum / grades.size();
        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {return true;}
        if (obj == null) {return false;}

        if (obj instanceof Grades) {
            Grades otherGrades = (Grades) obj;
            return grades.equals(otherGrades.grades);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 177*grades.hashCode();
    }

}
