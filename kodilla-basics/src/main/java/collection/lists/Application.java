package collection.lists;

import java.util.Arrays;
import java.util.List;

public class Application {

    private static List<Book> initBookList() {
        return Arrays.asList (
                new Book("Fundacja", 1951),
                new Book("Achaja", 2003),
                new Book("Wladca Pierscieni", 1954),
                new Book("Pieklo Pocztowe", 2004),
                new Book("Starcie Krolow", 2012),
                new Book("Miecz Przeznaczenia", 1992),
                new Book("Jednym Zakleciem", 2001)
        );
    }

    private static List<Integer> initMarksList() {
        return Arrays.asList(1,2,3,2,1,4,6,2,3,4,3,6,5,3,4);
    }

    public static void main (String[] args) {

        new MarkProcessor(initMarksList()).process();
        new BookProcessor(initBookList()).process();
    }

}
