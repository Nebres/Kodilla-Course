package com.kodilla.patterns2.adapter.bookclasifier.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianaAdapter extends MedianAdaptee implements Classifier {

    public MedianaAdapter(Statistics statistics) {
        super(statistics);
    }

    @Override
    public int publicationYearMedian(final Set<Book> bookSet) {

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        bookSet.forEach(b -> books.put(createBookSignatureForLibraryB(b), createBookLibraryBType(b)));
        return medianPublicationYear(books);
    }

    private com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book createBookLibraryBType(Book book) {
        return  new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                book.getAuthor(), book.getTitle(), book.getPublicationYear());
    }

    private BookSignature createBookSignatureForLibraryB(Book book) {
        return new BookSignature(book.getSignature());
    }

}
