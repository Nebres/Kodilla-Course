package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BookLibrary {

    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {

        List<Book> bookList = new ArrayList<Book>();

        if (titleFragment.length() < 3) {
            return Collections.emptyList();
        }

        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) {
            return Collections.emptyList();
        }

        bookList = resultList;
        return bookList;
    }

   public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
       return null;
   }

}
