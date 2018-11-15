package collection.operationsMeasurement;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

    public static void main (String[] args) {

        Book book = new Book("xzz", "abb");
        ArrayList<Integer> idList = new IdCreator(3000000).createId();
        LinkedList<Book> booksList = new BooksList().createList(book, 3000000);

        new Processor(booksList, book).runProcces();
        new MapOperation(booksList, idList).runProcces();
    }

}
