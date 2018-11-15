package collection.maps.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCreator {

    private final List<Student> students;
    private final List<Grades> grades;

    public MapCreator(List<Student> students, List<Grades> grades) {
        this.students = students;
        this.grades = grades;
    }

    public void createMap() {

        HashMap<Student, Grades> register = new HashMap<Student, Grades>();

        for (int i = 0; i < students.size(); i++) {
            register.put(students.get(i), grades.get(i));
        }

        for (Map.Entry<Student, Grades> entry: register.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", mean: " + entry.getValue().countTheMean());
        }
    }

}
