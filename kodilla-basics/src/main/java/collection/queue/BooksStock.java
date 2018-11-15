package collection.queue;

import java.util.ArrayDeque;

public class BooksStock {

    private ArrayDeque<Book> bookList;

    public BooksStock() {
        this.bookList = new ArrayDeque<Book>();
    }

    public void addBook(Book book) {
        this.bookList.push(book);
    }

    public void booksStockSize() {
        System.out.println("Stock size: " + bookList.size() + " books");
    }

    public void removeStock() {

        for (Book book : bookList) {
            if( bookList.size() != 1){
                this.bookList.pop();
            }
        }
        System.out.println("Last book on stock: " + bookList.pop());
    }

    public void runProcess() {
        booksStockSize();
        removeStock();
        booksStockSize();
    }

}
