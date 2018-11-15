package collection.sets.task1;

public class Book {

    private final String title;
    private final String author;
    private final int releaseYear;

    public Book(String title, String author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public String toString() {
        return title + ", " + author + ", " + releaseYear;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {return true;}
        if (obj == null) {return false;}

        if (obj instanceof Book) {
            Book otherBook = (Book) obj;
            return title.equals(otherBook.title) &&
                    author.equals(otherBook.author) &&
                    releaseYear == otherBook.releaseYear;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 17 * getTitle().hashCode() + 31 * getAuthor().hashCode() + 37 * getReleaseYear();
    }

}
