package collection.lists.firstTask;

public class Book {

   private final String title;
    private final int releaseYear;

    public Book(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public int getReleaseYaer() {
        return this.releaseYear;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean find(int year) {
        return this.releaseYear > year;
    }

    public String toString() {
        return "\"" + title + "\"" + ", (" + releaseYear + ")";
    }

}
