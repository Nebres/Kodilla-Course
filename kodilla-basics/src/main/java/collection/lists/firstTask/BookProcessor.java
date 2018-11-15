package collection.lists.firstTask;

import java.util.List;

public class BookProcessor {

    private final static String OUTPUT_COMMUNICATE = " \n Book released before year 2000: %s ";
    private List<Book> bookList;

    public BookProcessor(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void process() {
        for (Book book: bookList) {
            if(book.getReleaseYaer() < 2000) {
                System.out.println(String.format(OUTPUT_COMMUNICATE, book));
            }
        }
    }

}
