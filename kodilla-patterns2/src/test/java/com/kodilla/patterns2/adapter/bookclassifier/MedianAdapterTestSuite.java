package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.adapter.bookclassifier.MedianaAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedian() {
        //When
        MedianaAdapter adapter = new MedianaAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book ("Author1", "Title1", 1969, "test1" ));
        books.add(new Book ("Author2", "Title2", 1999, "test2" ));
        books.add(new Book ("Author3", "Title3", 1985, "test3" ));
        books.add(new Book ("Author4", "Title4", 1973, "test4" ));
        books.add(new Book ("Author5", "Title5", 1991, "test5" ));
        books.add(new Book ("Author6", "Title6", 2002, "test6" ));
        books.add(new Book ("Author7", "Title7", 1955, "test7" ));
        books.add(new Book ("Author8", "Title8", 2015, "test8" ));
        //Given
        int expected = 1991;
        int actual = adapter.publicationYearMedian(books);
        //Then
        Assert.assertEquals(expected, actual);
    }

}

