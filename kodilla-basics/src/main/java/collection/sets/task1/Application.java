package collection.sets.task1;

import java.util.Arrays;
import java.util.List;

public class Application {

    private static List<Book> initBookList() {
        return Arrays.asList (
                new Book("Fundacja", "Issac Asimov", 1951),
                new Book("Achaja", "Andrzej Ziemianski", 2003),
                new Book("Wladca Pierscieni", "J.R.R Tolkien", 1954),
                new Book("Pieklo Pocztowe", "Terry Prachett", 2011)
        );
    }

    public static void main (String[] args) {

        new HashSetGenerator(initBookList()).runProcess();
    }

}
