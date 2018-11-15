package collection.operationsMeasurement;

public class Book {

    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {return true;}
        if (obj == null) {return false;}
        if (obj instanceof Book) {
            Book otherBook = (Book) obj;
            return title.equals(otherBook.title) &&
                    author.equals(otherBook.author);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 17*title.hashCode() + 31*author.hashCode();
    }

}
