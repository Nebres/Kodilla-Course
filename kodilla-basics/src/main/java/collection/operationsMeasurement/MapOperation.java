package collection.operationsMeasurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class MapOperation {

    private Book book;
    private LinkedList<Book> booksList;
    private ArrayList<Integer> idList;
    private	HashMap<Book, Integer> mapa;

    public MapOperation(LinkedList<Book> booksList, ArrayList<Integer> idList) {
        this.booksList = booksList;
        this.idList = idList;
        this.mapa = new HashMap<Book, Integer>();
    }

    public 	HashMap<Book, Integer> createMap() {

        for (int i = 0; i < booksList.size(); i++) {
            mapa.put(booksList.get(i), idList.get(i));
        }

        return mapa;
    }

    public String checkTimeRemovefromMap() {

        HashMap<Book, Integer> mapa = this.mapa;

        long begin = System.nanoTime();
        mapa.remove(book, 1232234);
        long end = System.nanoTime();
        return String.format("Usuwanie elementu nr 1232234 z mapy zajelo:  " + (end - begin) + " ns");

    }

    public String checkTimeAddtoMap() {

        HashMap<Book, Integer> mapa = this.mapa;

        long begin = System.nanoTime();
        mapa.put(new Book("zzz", "vvv"), new Integer(3000001));
        long end = System.nanoTime();
        return String.format("Dodawanie elementu nr 3000001 do mapy zajelo:  " + (end - begin) + " ns");

    }

    public String checkTimeFindInMap() {

        HashMap<Book, Integer> mapa = this.mapa;

        long begin = System.nanoTime();
        mapa.get(1234562);
        long end = System.nanoTime();
        return String.format("Znalezienie elementu nr 1234562 w mapie zajelo:  " + (end - begin) + " ns");

    }

    public void runProcces() {
        System.out.println(checkTimeFindInMap() + "\n" + checkTimeAddtoMap() + "\n" + checkTimeRemovefromMap());
    }

}
