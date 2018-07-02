package com.kodilla.testing.library;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private final static LibraryDatabase LIBRARY_DATABASE_MOCK = mock(LibraryDatabase.class);
    private final static BookLibrary BOOK_LIBRARY = new BookLibrary(LIBRARY_DATABASE_MOCK);
    private final static LibraryUser LIBRARY_USER_JAN = new LibraryUser("Jan", "Kowalczyk", "123345679");

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(LIBRARY_DATABASE_MOCK.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);
        // When
        List<Book> theListOfBooks = BOOK_LIBRARY.listBooksWithCondition("Secret");
        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(LIBRARY_DATABASE_MOCK.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(LIBRARY_DATABASE_MOCK.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(LIBRARY_DATABASE_MOCK.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);
        // When
        List<Book> theListOfBooks0 = BOOK_LIBRARY.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = BOOK_LIBRARY.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = BOOK_LIBRARY.listBooksWithCondition("FortyBooks");
        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(LIBRARY_DATABASE_MOCK.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);
        // When
        List<Book> theListOfBooks10 = BOOK_LIBRARY.listBooksWithCondition("An");
        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(LIBRARY_DATABASE_MOCK, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfWhenUserHaveNoBooks() {
        //Given
        List<Book> resultList = generateListOfNBooks(0);
        when(LIBRARY_DATABASE_MOCK.listBooksInHandsOf(LIBRARY_USER_JAN))
                .thenReturn(resultList);
        List<Book> expected = new ArrayList<>();
        // When
        List<Book> actual = LIBRARY_DATABASE_MOCK.listBooksInHandsOf(LIBRARY_USER_JAN);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testListBooksInHandsOfWhenUserHave1Book() {
        //Given
        List<Book> resultList = generateListOfNBooks(1);
        when(LIBRARY_DATABASE_MOCK.listBooksInHandsOf(LIBRARY_USER_JAN))
                .thenReturn(resultList);
        List<Book> expected = new ArrayList<>();
        expected.add(new Book("Title 1", "Author 1", 1971));
        // When
        List<Book> actual = LIBRARY_DATABASE_MOCK.listBooksInHandsOf(LIBRARY_USER_JAN);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testListBooksInHandsOfWhenUserHave5Book() {
        //Given
        List<Book> resultList = generateListOfNBooks(5);
        when(LIBRARY_DATABASE_MOCK.listBooksInHandsOf(LIBRARY_USER_JAN))
                .thenReturn(resultList);
        List<Book> expected = new ArrayList<>();
        expected.add(new Book("Title 1", "Author 1", 1971));
        expected.add(new Book("Title 2", "Author 2", 1972));
        expected.add(new Book("Title 3", "Author 3", 1973));
        expected.add(new Book("Title 4", "Author 4", 1974));
        expected.add(new Book("Title 5", "Author 5", 1975));
        // When
        List<Book> actual = LIBRARY_DATABASE_MOCK.listBooksInHandsOf(LIBRARY_USER_JAN);
        // Then
        assertEquals(expected, actual);
    }

}
