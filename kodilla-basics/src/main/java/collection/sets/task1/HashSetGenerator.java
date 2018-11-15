package collection.sets.task1;

import java.util.HashSet;
import java.util.List;

public class HashSetGenerator {

    private List<Book> bookList;

    public HashSetGenerator(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void runProcess() {

        HashSet<Book> bookSet = new HashSet<Book>();

        for (Book book : bookList) {
            bookSet.add(book);
        }

        System.out.println("Ksiazki wydane przed rokiem 2010: \n");
        for (Book theBook: bookSet){
            if(theBook.getReleaseYear() < 2010){
                System.out.println(theBook);
            }
        }
    }

}
