package collection.queue;

public class Application {

    public static void main (String[] args) {

        Book book1 = new Book("Fundacja", "Issac Asimov", 1951);
        Book book2 = new Book("Achaja", "Andrzej Ziemianski", 2003);
        Book book3 = new Book("Wladca Pierscieni", "J.R.R Tolkien", 1954);
        Book book4 = new Book("Pieklo Pocztowe", "Terry Prachett", 2011);
        Book book5 = new Book("Miecz Przeznaczenia", "Andrzej Sapkowski", 1992);

        BooksStock booksStock = new BooksStock();

        booksStock.addBook(book1);
        booksStock.addBook(book2);
        booksStock.addBook(book3);
        booksStock.addBook(book4);
        booksStock.addBook(book5);

        booksStock.runProcess();
    }

}
