package collection.maps.task1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Application {
    private final static List<Integer> initGrades() {

        Random r = new Random();

        return Arrays.asList(
                r.nextInt(6) + 1,
                r.nextInt(6) + 1,
                r.nextInt(6) + 1,
                r.nextInt(6) + 1,
                r.nextInt(6) + 1
        );
    }

    private final static List<Student> initStudentList() {
        return Arrays.asList(
                new Student("Jan", "Kowalczyk", "12345678901"),
                new Student("Piotr", "Nowak", "12345612345"),
                new Student("Dorota", "Piechala", "12345398765"),
                new Student("Eliza", "Dabrowska", "12345698765"),
                new Student("Bartosz", "Karwan", "12245698765"),
                new Student("Anita", "Lichwala", "44442398765"),
                new Student("Grazyna", "Dabrowska", "12222698765")
        );
    }

    public static void main (String[] args) {

        List<Grades> temp = new LinkedList<Grades>();

        for(int i = 0; i < initStudentList().size(); i++) {
            temp.add(new Grades(initGrades()));
        }
        new MapCreator(initStudentList(), temp).createMap();
    }

}
