package collection.operationsMeasurement;

import java.util.LinkedList;

public class Processor {

    private LinkedList<Book> booksList;
    private Book book;

    public Processor(LinkedList<Book> booksList, Book book) {
        this.booksList = booksList;
        this.book = book;
    }

    public String checkTimeRemovefromBegin() {

        long begin = System.nanoTime();
        booksList.remove(0);
        long end = System.nanoTime();

        return String.format("Usuniecie ostatniego elementu z LinkedList zajelo: " + (end - begin) + " ns");
    }

    public String checkTimeRemovefromEnd() {

        long begin = System.nanoTime();
        booksList.remove(booksList.size() - 1);
        long end = System.nanoTime();

        return String.format("Usuniecie pierwszego elementu z LinkedList zajelo: " + (end - begin) + " ns");
    }

    public String checkTimeAddtoEnd() {

        long begin = System.nanoTime();
        booksList.add(book);
        long end = System.nanoTime();

        return String.format("Dodanie elementu jako ostatniego do  z LinkedList zajelo: " + (end - begin) + " ns");
    }

    public String checkTimeAddtoBegin() {

        long begin = System.nanoTime();
        booksList.addFirst(book);
        long end = System.nanoTime();

        return String.format("Dodanie elementu jako pierwszego do z LinkedList zajelo: " + (end - begin) + " ns");
    }

    public void runProcces() {
        System.out.println(checkTimeRemovefromBegin() + "\n" + checkTimeRemovefromEnd() + "\n" + checkTimeAddtoEnd()
                + "\n" + checkTimeAddtoBegin());
    }

}

