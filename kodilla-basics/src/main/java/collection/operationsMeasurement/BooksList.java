package collection.operationsMeasurement;

import java.util.LinkedList;

public class BooksList {

    private LinkedList<Book> booksList;

    public BooksList() {
        this.booksList = new LinkedList<Book>();
    }

    public LinkedList<Book> createList(Book book, int k) {
        for (int i = 0; i < k; i++) {
            booksList.add(book);
        }
        return booksList;
    }

}
