package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Library");
        library.getBooks().add(new Book("Fundacja", "Issac Asimov",
                LocalDate.of(1951, 10, 12)));
        library.getBooks().add(new Book("Achaja", "Andrzej Ziemianski",
                LocalDate.of(2003, 6, 25)));
        library.getBooks().add(new Book("Wladca Pierscieni", "J.R.R Tolkien",
                LocalDate.of(1954, 12, 1)));
        library.getBooks().add(new Book("Pieklo Pocztowe", "Terry Prachett",
                LocalDate.of(2011, 1, 18)));
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        int expected  = library.getBooks().size() * 2;
        //When
        assert shallowClonedLibrary != null;
        assert deepClonedLibrary != null;
        int actual = shallowClonedLibrary.getBooks().size() + deepClonedLibrary.getBooks().size();
        //Than
        Assert.assertEquals(expected, actual);
    }

}
