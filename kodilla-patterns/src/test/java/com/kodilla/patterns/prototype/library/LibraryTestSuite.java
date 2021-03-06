package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.Set;

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

        Set<Book> expected  = library.getBooks();
        //When
        Assert.assertNotNull(shallowClonedLibrary);
        Assert.assertNotNull(deepClonedLibrary);
        Set<Book> actualShallowCopy = shallowClonedLibrary.getBooks();
        Set<Book> actualDeepCopy  = deepClonedLibrary.getBooks();
        //Than
        Assert.assertEquals(expected, actualShallowCopy);
        Assert.assertEquals(expected, actualDeepCopy);
    }

}
